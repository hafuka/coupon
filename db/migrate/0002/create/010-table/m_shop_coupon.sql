create table M_SHOP_COUPON (
    SHOP_ID int not null,
    COUPON_ID int not null,
    RARITY int not null,
    LIMIT_DAYS int,
    PROBABILITY int not null,
    DESCRIPTION varchar(255),
    COUPON_NAME varchar(128) not null,
    constraint M_SHOP_COUPON_PK primary key(SHOP_ID, COUPON_ID)
);
