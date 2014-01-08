SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE i_user;
DROP TABLE i_user_authentication;
DROP TABLE i_user_coupon;
DROP TABLE m_shop;
DROP TABLE m_shop_coupon;




/* Create Tables */

CREATE TABLE i_user
(
	user_id bigint NOT NULL,
	email varchar(128) NOT NULL,
	name varchar(128) NOT NULL,
	upd_datetime date NOT NULL,
	ins_datetime datetime NOT NULL,
	PRIMARY KEY (user_id)
);


CREATE TABLE i_user_authentication
(
	user_id bigint NOT NULL,
	email varchar(128) NOT NULL,
	password varchar(128) NOT NULL,
	upd_datetime datetime NOT NULL,
	ins_datetime datetime NOT NULL,
	PRIMARY KEY (user_id)
);


CREATE TABLE i_user_coupon
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


CREATE TABLE m_shop
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


CREATE TABLE m_shop_coupon
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



