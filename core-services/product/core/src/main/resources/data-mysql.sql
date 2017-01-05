INSERT INTO product_type(id,uuid,name,icon,cover,parent_id,location,status,sortnum,inittime) values(10000,uuid(),'手机/运营商/数码','','',0,'0',1,10000,now());
INSERT INTO product_type(id,uuid,name,icon,cover,parent_id,location,status,sortnum,inittime) values(10001,uuid(),'手机通讯','','',10000,'0/10000',1,10001,now());
INSERT INTO product_type(id,uuid,name,icon,cover,parent_id,location,status,sortnum,inittime) values(10002,uuid(),'手机','','',10001,'0/10000/10001',1,10002,now());
INSERT INTO product_type(id,uuid,name,icon,cover,parent_id,location,status,sortnum,inittime) values(10003,uuid(),'对讲机','','',10001,'0/10000/10001',1,10003,now());
INSERT INTO product_type(id,uuid,name,icon,cover,parent_id,location,status,sortnum,inittime) values(10004,uuid(),'手机配件','','',10000,'0/10000',1,10004,now());
INSERT INTO product_type(id,uuid,name,icon,cover,parent_id,location,status,sortnum,inittime) values(10005,uuid(),'手机壳','','',10004,'0/10004',1,10005,now());
INSERT INTO product_type(id,uuid,name,icon,cover,parent_id,location,status,sortnum,inittime) values(10006,uuid(),'贴膜','','',10004,'0/10004',1,10006,now());
INSERT INTO product_type(id,uuid,name,icon,cover,parent_id,location,status,sortnum,inittime) values(10007,uuid(),'手机存储卡','','',10004,'0/10004',1,10007,now());

INSERT INTO brand_info(id,uuid,pro_type_id,cn_name,en_name,desc_info,logo,website,story,inittime) values(10000,uuid(),10002,'苹果','iphone','苹果手机','','http://www.apple.com','苹果手机',now());
INSERT INTO brand_info(id,uuid,pro_type_id,cn_name,en_name,desc_info,logo,website,story,inittime) values(10001,uuid(),10002,'三星','SAMSUNG','三星手机','','http://www.samsung.com','三星手机',now());

INSERT INTO product_info(id,uuid,brand_id,title,rang_price,pro_type_id,b_userid,status,inittime) VALUES (10000,uuid(),10000,'苹果iphone7手机','6000-9000元',10002,1,1,now());


INSERT INTO property_info(id,uuid,name,pro_type_id,is_allow_alias,is_color,is_enum,is_input,is_key_prop,is_sales,is_search,is_necessary,is_multi,status,sortnum,inittime) VALUES (10000,uuid(),'颜色',10002,1,1,1,1,1,1,1,1,1,1,10000,now());
INSERT INTO property_info(id,uuid,name,pro_type_id,is_allow_alias,is_color,is_enum,is_input,is_key_prop,is_sales,is_search,is_necessary,is_multi,status,sortnum,inittime) VALUES (10001,uuid(),'容量',10002,1,1,1,1,1,1,1,1,1,1,10001,now());

INSERT INTO property_info_value(id,uuid,prop_value,prop_id,status,pro_type_id,sortnum,inittime) VALUES (10000,uuid(),'金色',10000,1,10002,10000,now());
INSERT INTO property_info_value(id,uuid,prop_value,prop_id,status,pro_type_id,sortnum,inittime) VALUES (10001,uuid(),'玫瑰金色',10000,1,10002,10001,now());
INSERT INTO property_info_value(id,uuid,prop_value,prop_id,status,pro_type_id,sortnum,inittime) VALUES (10002,uuid(),'银色',10000,1,10002,10002,now());
INSERT INTO property_info_value(id,uuid,prop_value,prop_id,status,pro_type_id,sortnum,inittime) VALUES (10003,uuid(),'灰色',10000,1,10002,10003,now());
INSERT INTO property_info_value(id,uuid,prop_value,prop_id,status,pro_type_id,sortnum,inittime) VALUES (10004,uuid(),'黑色',10000,1,10002,10004,now());
INSERT INTO property_info_value(id,uuid,prop_value,prop_id,status,pro_type_id,sortnum,inittime) VALUES (10005,uuid(),'亮黑色',10000,1,10002,10005,now());
INSERT INTO property_info_value(id,uuid,prop_value,prop_id,status,pro_type_id,sortnum,inittime) VALUES (10006,uuid(),'16G',10001,1,10002,10006,now());
INSERT INTO property_info_value(id,uuid,prop_value,prop_id,status,pro_type_id,sortnum,inittime) VALUES (10007,uuid(),'32G',10001,1,10002,10007,now());
INSERT INTO property_info_value(id,uuid,prop_value,prop_id,status,pro_type_id,sortnum,inittime) VALUES (10008,uuid(),'64G',10001,1,10002,10008,now());
INSERT INTO property_info_value(id,uuid,prop_value,prop_id,status,pro_type_id,sortnum,inittime) VALUES (10009,uuid(),'128G',10001,1,10002,10009,now());
INSERT INTO property_info_value(id,uuid,prop_value,prop_id,status,pro_type_id,sortnum,inittime) VALUES (10010,uuid(),'256G',10001,1,10002,10010,now());

INSERT INTO product_base_property(id,uuid,product_id,property_info_id,property_info_value_id,is_sku,skuid,inittime) VALUES (10000,uuid(),10000,10000,10000,0,0,now());

INSERT INTO product_sku_info(id,uuid,product_id,stock_num,price,external_code,status,title,property_ids,bar_code,product_code,inittime) values(10000,uuid(),10000,99999,688800,13092,1,'iphone7 plus 128G 亮黑色','10000:10009','scxzsq1211','qasdwq1213',now());