#Spring Cloud微服务架构
##1.启动注册中心
    启动register-server中的RegisterApplication
##2.启动配置中心
    修改config-server/src/main/resources/mshop-*.properties中的数据库配置。
    启动config-server中的ConfigApplication
##3.启动用户服务
    启动core-services/user/core中的UserApplication
##4.启动product产品服务
    启动core-services/product/core中的ProductApplication
##访问product服务:[http://localhost:8082/findAllProductsNested](http://localhost:8082/findAllProductsNested)

#也可以通过自建Docker开发运维环境启动（ubuntu环境）
##mysql

    docker run --name zhmmysql -v /store/docker_v/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=1q2w3e4r -d mysql:5.6.34 --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci --character_set_client=utf8mb4

##gogs  git

    docker run --name=gogs -p 10022:22 -p 10080:3000 --link zhmmysql:zhmmysql -v /store/docker_v/gogs:/data gogs/gogs

    #提交代码
    cd /store/workspace/javaworks/mshop
    git init
    git remote add origin http://localhost:10080/87tu/mshop
    git add .
    git commit
    git push origin master

##jenkins

    docker run --name zhmjenkins -p 9999:8080 -p 50000:50000 --link gogs:gogs -v /store/docker_v/jenkins:/var/jenkins_home  -v /usr/apache-maven-3.3.9:/usr/local/maven -v /usr/jdk1.8.0_91:/usr/local/jdk -v /var/run/docker.sock:/var/run/docker.sock -v /usr/bin/docker:/usr/bin/docker zhmjenkins

访问[jenkins](http://localhost:9999),并新建pipe工程，添加如下配置

    node {
    	    stage 'checkout'
    	    git credentialsId: '212ab4dc-291a-46d4-ba04-4cab4fb7a943', url: 'http://gogs:3000/87tu/mshop.git'
    	    stage 'package'
    	    def mvnHome = tool 'M3'
    	    env.PATH = "${mvnHome}/bin:${env.PATH}"
    	    sh "mvn clean install"
    	    stage 'mshop-register docker run'
    	    sh "sudo docker stop mshop-register||true"
    	    sh "sudo docker rm mshop-register||true"
    	    sh "sudo docker run --name mshop-register -d -p 8765:8765 --link zhmmysql:zhmmysql -h mshop-register -v /store/docker_v/jenkins/workspace/mshop2:/var/mshop2 -w /var/mshop2/register-server/target/ java:8u111-jdk-alpine java -Xmx128m -Xss256k -jar register-server-0.0.1-SNAPSHOT.jar"
    	    sh "sudo sleep 30s"
    	    stage 'mshop-config docker run'
    	    sh "sudo docker stop mshop-config||true"
    	    sh "sudo docker rm mshop-config||true"
    	    sh "sudo docker run --name mshop-config -d -p 7788:7788 -h mshop-config --link zhmmysql:zhmmysql --link mshop-register:mshop-register -v /store/docker_v/jenkins/workspace/mshop2:/var/mshop2 -w /var/mshop2/config-server/target/ java:8u111-jdk-alpine java -Xmx128m -Xss256k -jar -Deureka.client.serviceUrl.defaultZone=http://mshop-register:8765/eureka/ config-server-0.0.1-SNAPSHOT.jar"
    	    sh "sudo sleep 1m"
    	    stage 'mshop-user docker run'
    	    sh "sudo docker stop mshop-user||true"
    	    sh "sudo docker rm mshop-user||true"
    	    sh "sudo docker run --name mshop-user -d -p 8080:8080 -h mshop-user --link zhmmysql:zhmmysql --link mshop-config:mshop-config --link mshop-register:mshop-register -v /store/docker_v/jenkins/workspace/mshop2:/var/mshop2 -w /var/mshop2/core-services/user/core/target/ java:8u111-jdk-alpine java -Xmx128m -Xss256k -jar -Deureka.client.serviceUrl.defaultZone=http://mshop-register:8765/eureka/ -Dconfig.profile=rel user-core-0.0.1-SNAPSHOT.jar"
    	    stage 'mshop-product docker run'
    	    sh "sudo docker stop mshop-product||true"
    	    sh "sudo docker rm mshop-product||true"
    	    sh "sudo docker run --name mshop-product -d -p 8082:8082 -h mshop-product --link zhmmysql:zhmmysql --link mshop-config:mshop-config --link mshop-register:mshop-register -v /store/docker_v/jenkins/workspace/mshop2:/var/mshop2 -w /var/mshop2/core-services/product/core/target/ java:8u111-jdk-alpine java -Xmx128m -Xss256k -jar -Deureka.client.serviceUrl.defaultZone=http://mshop-register:8765/eureka/ -Dconfig.profile=rel product-core-0.0.1-SNAPSHOT.jar"

    	}

##在jenkins构建即可。


