DROP TABLE IF EXISTS user_info;
create table user_info(
   id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
   username VARCHAR(10) NOT NULL,
   email VARCHAR(255) NOT NULL ,
   password VARCHAR(32) NOT NULL,
   mobile VARCHAR(15) NOT NULL,
   inittime TIMESTAMP NOT NULL,
   lastlogin TIMESTAMP NOT NULL,
   status TINYINT NOT NULL,
   type TINYINT NOT NULL,
   PRIMARY KEY ( id )
)engine=innodb default charset=utf8mb4 auto_increment=1;