SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Indexes */

DROP INDEX IDX_EMAIL_PASSWORD ON I_USER_AUTHENTICATION;



/* Drop Tables */

DROP TABLE I_USER;
DROP TABLE I_USER_AUTHENTICATION;
DROP TABLE I_USER_COUPON;
DROP TABLE M_CONFIG;
DROP TABLE M_LOGIN_BONUS;
DROP TABLE M_SHOP;
DROP TABLE M_SHOP_COUPON;




/* Create Tables */

CREATE TABLE I_USER
(
	user_id bigint NOT NULL,
	email varchar(128) NOT NULL,
	name varchar(128) NOT NULL,
	point bigint DEFAULT 0,
	login_datetime datetime,
	login_bonus_datetime datetime,
	consecutive_days bigint,
	upd_datetime datetime NOT NULL,
	ins_datetime datetime NOT NULL,
	PRIMARY KEY (user_id)
);


CREATE TABLE I_USER_AUTHENTICATION
(
	user_id bigint NOT NULL,
	email varchar(128) NOT NULL,
	password varchar(128) NOT NULL,
	upd_datetime datetime NOT NULL,
	ins_datetime datetime NOT NULL,
	PRIMARY KEY (user_id)
);


CREATE TABLE I_USER_COUPON
(
	user_id bigint NOT NULL,
	shop_id int NOT NULL,
	coupon_type int NOT NULL,
	coupon_id int NOT NULL,
	coupon_count int NOT NULL,
	limit_datetime datetime,
	upd_datetime datetime NOT NULL,
	ins_datetime datetime NOT NULL,
	PRIMARY KEY (user_id, shop_id, coupon_type, coupon_id)
);


CREATE TABLE M_CONFIG
(
	name varchar(128) NOT NULL,
	value varchar(255) NOT NULL,
	start_datetime datetime,
	end_datetime datetime,
	PRIMARY KEY (name)
);


CREATE TABLE M_LOGIN_BONUS
(
	bonus_id int NOT NULL,
	bonus_type int NOT NULL,
	point int NOT NULL,
	consecutive_days int NOT NULL,
	PRIMARY KEY (bonus_id)
);


CREATE TABLE M_SHOP
(
	shop_id int NOT NULL,
	shop_category int NOT NULL,
	shop_name varchar(255) NOT NULL,
	description varchar(255),
	url varchar(255),
	tell varchar(16),
	map_url varchar(255),
	PRIMARY KEY (shop_id)
);


CREATE TABLE M_SHOP_COUPON
(
	shop_id int NOT NULL,
	coupon_type int NOT NULL,
	coupon_id int NOT NULL,
	coupon_name varchar(128) NOT NULL,
	description varchar(255),
	probability int NOT NULL,
	limit_days int,
	PRIMARY KEY (shop_id, coupon_type, coupon_id)
);



/* Create Indexes */

CREATE INDEX IDX_EMAIL_PASSWORD USING BTREE ON I_USER_AUTHENTICATION (email ASC, password ASC);



