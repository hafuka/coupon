SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Indexes */

DROP INDEX IDX_EMAIL ON I_USER;
DROP INDEX IDX_SHOP_NAME ON M_SHOP;
DROP INDEX IDX_AREA_ID_CLOSE_FLG ON M_SHOP;
DROP INDEX IDX_USER_ID ON I_USER_COUPON;
DROP INDEX IDX_EMAIL_PASSWORD ON I_USER_AUTHENTICATION;
DROP INDEX IDX_REGIST_TOKEN ON I_USER_AUTHENTICATION;



/* Drop Tables */

DROP TABLE M_LOGIN_BONUS;
DROP TABLE M_BUSINESS;
DROP TABLE M_SHOP_COUPON;
DROP TABLE I_USER_COIN;
DROP TABLE M_COIN;
DROP TABLE M_CONFIG;
DROP TABLE M_AREA;
DROP TABLE M_AREA_DETAIL;
DROP TABLE I_USER_FAVORITE;
DROP TABLE I_USER_LOGIN;
DROP TABLE I_USER;
DROP TABLE M_SHOP;
DROP TABLE I_ADMIN_AUTHENTICATION;
DROP TABLE I_USER_COUPON;
DROP TABLE I_USER_AUTHENTICATION;




/* Create Tables */

CREATE TABLE M_LOGIN_BONUS
(
	bonus_type int NOT NULL,
	point int NOT NULL,
	consecutive_days int NOT NULL,
	PRIMARY KEY (bonus_type)
);


CREATE TABLE M_BUSINESS
(
	business_id int NOT NULL,
	name varchar(128) NOT NULL,
	PRIMARY KEY (business_id)
);


CREATE TABLE M_SHOP_COUPON
(
	shop_id int NOT NULL,
	coupon_id int NOT NULL,
	coupon_name varchar(128) NOT NULL,
	description varchar(255),
	probability int NOT NULL,
	limit_days int,
	rarity int NOT NULL,
	PRIMARY KEY (shop_id, coupon_id)
);


CREATE TABLE I_USER_COIN
(
	user_id bigint NOT NULL,
	id int NOT NULL,
	coin int NOT NULL,
	limit_datetime datetime NOT NULL,
	upd_datetime datetime NOT NULL,
	ins_datetime datetime NOT NULL,
	PRIMARY KEY (user_id, id)
);


CREATE TABLE M_COIN
(
	id int NOT NULL,
	coin int NOT NULL,
	yen int NOT NULL,
	paypal_item_id varchar(16) NOT NULL,
	start_datetime datetime,
	end_datetime datetime,
	PRIMARY KEY (id)
);


CREATE TABLE M_CONFIG
(
	name varchar(128) NOT NULL,
	value varchar(255) NOT NULL,
	start_datetime datetime,
	end_datetime datetime,
	PRIMARY KEY (name)
);


CREATE TABLE M_AREA
(
	area_id int NOT NULL,
	area_name varchar(16) NOT NULL,
	PRIMARY KEY (area_id)
);


CREATE TABLE M_AREA_DETAIL
(
	area_id int NOT NULL,
	area_detail_id int NOT NULL,
	detail_name varchar(128) NOT NULL,
	PRIMARY KEY (area_id, area_detail_id)
);


CREATE TABLE I_USER_FAVORITE
(
	user_id bigint NOT NULL,
	shop_id int NOT NULL,
	ins_datetime datetime NOT NULL,
	PRIMARY KEY (user_id, shop_id)
);


CREATE TABLE I_USER_LOGIN
(
	cookie_value varchar(255) NOT NULL,
	user_id bigint NOT NULL,
	ins_datetime datetime NOT NULL,
	PRIMARY KEY (cookie_value)
);


CREATE TABLE I_USER
(
	user_id bigint NOT NULL,
	email varchar(128) NOT NULL,
	name varchar(128) NOT NULL,
	point bigint DEFAULT 0,
	login_datetime datetime,
	login_bonus_datetime datetime,
	consecutive_days bigint,
	normal_roulette_datetime datetime,
	customer_id varchar(32),
	save_card_flg int DEFAULT 0 NOT NULL,
	age int,
	sex int,
	upd_datetime datetime NOT NULL,
	ins_datetime datetime NOT NULL,
	PRIMARY KEY (user_id)
);


CREATE TABLE M_SHOP
(
	shop_id int NOT NULL,
	business_id int NOT NULL,
	shop_name varchar(255) NOT NULL,
	description varchar(255),
	url varchar(255),
	tell varchar(16),
	address varchar(255),
	map_url varchar(255),
	area_id int NOT NULL,
	area_detail_id int NOT NULL,
	station varchar(32) NOT NULL,
	premium_flg int DEFAULT 0 NOT NULL,
	img_path varchar(255),
	coupon_limit_days int NOT NULL,
	close_flg int,
	PRIMARY KEY (shop_id)
);


CREATE TABLE I_ADMIN_AUTHENTICATION
(
	shop_id int NOT NULL,
	password varchar(128) NOT NULL,
	email varchar(128) NOT NULL,
	upd_datetime datetime NOT NULL,
	ins_datetime datetime NOT NULL,
	PRIMARY KEY (shop_id)
);


CREATE TABLE I_USER_COUPON
(
	user_coupon_id varchar(255) NOT NULL,
	user_id bigint NOT NULL,
	shop_id int NOT NULL,
	coupon_id int NOT NULL,
	limit_datetime datetime,
	name varchar(128) NOT NULL,
	description varchar(255),
	rarity int,
	status int NOT NULL,
	upd_datetime datetime NOT NULL,
	ins_datetime datetime NOT NULL,
	PRIMARY KEY (user_coupon_id)
);


CREATE TABLE I_USER_AUTHENTICATION
(
	user_id bigint NOT NULL,
	email varchar(128) NOT NULL,
	password varchar(128) NOT NULL,
	regist_token varchar(32),
	upd_datetime datetime NOT NULL,
	ins_datetime datetime NOT NULL,
	PRIMARY KEY (user_id)
);



/* Create Indexes */

CREATE INDEX IDX_EMAIL USING BTREE ON I_USER (email ASC);
CREATE INDEX IDX_SHOP_NAME USING BTREE ON M_SHOP (shop_name ASC);
CREATE INDEX IDX_AREA_ID_CLOSE_FLG USING BTREE ON M_SHOP (area_id ASC, close_flg ASC);
CREATE INDEX IDX_USER_ID USING BTREE ON I_USER_COUPON (user_id ASC);
CREATE INDEX IDX_EMAIL_PASSWORD USING BTREE ON I_USER_AUTHENTICATION (email ASC, password ASC);
CREATE INDEX IDX_REGIST_TOKEN USING BTREE ON I_USER_AUTHENTICATION (regist_token ASC);



