DROP TABLE IF EXISTS brand_info;
create table brand_info(
   id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
   uuid VARCHAR(255) NOT NULL,
   pro_type_id INT NOT NULL ,
   cn_name VARCHAR(255) NOT NULL,
   en_name VARCHAR(255) NOT NULL,
   desc_info VARCHAR(512) NOT NULL,
   logo VARCHAR(255) NOT NULL,
   website VARCHAR(255) NOT NULL,
   story MEDIUMTEXT NOT NULL,
   inittime TIMESTAMP NOT NULL,
   PRIMARY KEY ( id )
)engine=innodb default charset=utf8mb4 auto_increment=1;

DROP TABLE IF EXISTS product_base_property;
create table product_base_property(
   id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
   uuid VARCHAR(255) NOT NULL,
   product_id INTEGER UNSIGNED NOT NULL ,
   property_info_id INT NOT NULL,
   property_info_value_id INT NOT NULL,
   is_sku TINYINT NOT NULL,
   skuid INTEGER UNSIGNED NOT NULL,
   inittime TIMESTAMP NOT NULL,
   PRIMARY KEY ( id )
)engine=innodb default charset=utf8mb4 auto_increment=1;

DROP TABLE IF EXISTS product_image;
create table product_image(
   id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
   uuid VARCHAR(255) NOT NULL,
   product_id INTEGER UNSIGNED NOT NULL ,
   pic_position TINYINT NOT NULL,
   pic_plat TINYINT NOT NULL,
   pic_url VARCHAR(255) NOT NULL,
   is_main_pic TINYINT NOT NULL,
   inittime TIMESTAMP NOT NULL,
   PRIMARY KEY ( id )
)engine=innodb default charset=utf8mb4 auto_increment=1;

DROP TABLE IF EXISTS product_info;
create table product_info(
   id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
   uuid VARCHAR(255) NOT NULL,
   brand_id INTEGER UNSIGNED NOT NULL ,
   title VARCHAR(255) NOT NULL,
   rang_price VARCHAR(255) NOT NULL,
   pro_type_id INT NOT NULL,
   b_userid INTEGER UNSIGNED NOT NULL,
   status TINYINT NOT NULL,
   inittime TIMESTAMP NOT NULL,
   PRIMARY KEY ( id )
)engine=innodb default charset=utf8mb4 auto_increment=1;

DROP TABLE IF EXISTS product_sku_info;
create table product_sku_info(
   id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
   uuid VARCHAR(255) NOT NULL,
   product_id INTEGER UNSIGNED NOT NULL ,
   stock_num INT NOT NULL ,
   price INT NOT NULL,
   external_code VARCHAR(255) NOT NULL,
   status TINYINT NOT NULL,
   title VARCHAR(255) NOT NULL,
   property_ids VARCHAR(1024) NOT NULL,
   bar_code VARCHAR(255) NOT NULL,
   product_code VARCHAR(255) NOT NULL,
   inittime TIMESTAMP NOT NULL,
   PRIMARY KEY ( id )
)engine=innodb default charset=utf8mb4 auto_increment=1;

DROP TABLE IF EXISTS product_tag;
create table product_tag(
   id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
   uuid VARCHAR(255) NOT NULL,
   name VARCHAR(255) NOT NULL ,
   product_id INTEGER UNSIGNED NOT NULL ,
   inittime TIMESTAMP NOT NULL,
   PRIMARY KEY ( id )
)engine=innodb default charset=utf8mb4 auto_increment=1;


DROP TABLE IF EXISTS product_type;
create table product_type(
   id INT NOT NULL AUTO_INCREMENT,
   uuid VARCHAR(255) NOT NULL,
   name VARCHAR(255) NOT NULL ,
   icon VARCHAR(255) NOT NULL ,
   cover VARCHAR(255) NOT NULL,
   parent_id INT NOT NULL,
   location VARCHAR(1024) NOT NULL,
   status TINYINT NOT NULL,
   sortnum INT NOT NULL,
   inittime TIMESTAMP NOT NULL,
   PRIMARY KEY ( id )
)engine=innodb default charset=utf8mb4 auto_increment=1;

DROP TABLE IF EXISTS property_info;
create table property_info(
   id INT NOT NULL AUTO_INCREMENT,
   uuid VARCHAR(255) NOT NULL,
   name VARCHAR(255) NOT NULL ,
   pro_type_id INT NOT NULL ,
   is_allow_alias TINYINT NOT NULL,
   is_color TINYINT NOT NULL,
   is_enum TINYINT NOT NULL,
   is_input TINYINT NOT NULL,
   is_key_prop TINYINT NOT NULL,
   is_sales TINYINT NOT NULL,
   is_search TINYINT NOT NULL,
   is_necessary TINYINT NOT NULL,
   is_multi TINYINT NOT NULL,
   status TINYINT NOT NULL,
   sortnum INT NOT NULL,
   inittime TIMESTAMP NOT NULL,
   PRIMARY KEY ( id )
)engine=innodb default charset=utf8mb4 auto_increment=1;

DROP TABLE IF EXISTS property_info_value;
create table property_info_value(
   id INT NOT NULL AUTO_INCREMENT,
   uuid VARCHAR(255) NOT NULL,
   prop_value VARCHAR(255) NOT NULL ,
   prop_id INT NOT NULL,
   status TINYINT NOT NULL,
   pro_type_id INT NOT NULL ,
   sortnum INT NOT NULL,
   inittime TIMESTAMP NOT NULL,
   PRIMARY KEY ( id )
)engine=innodb default charset=utf8mb4 auto_increment=1;