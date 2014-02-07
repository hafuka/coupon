create table M_SHOP_COUPON (
    SHOP_ID int not null comment 'shopIdプロパティ',
    COUPON_TYPE int not null comment 'couponTypeプロパティ',
    COUPON_ID int not null comment 'couponIdプロパティ',
    RARITY int not null comment 'rarityプロパティ',
    LIMIT_DAYS int comment 'limitDaysプロパティ',
    PROBABILITY int not null comment 'probabilityプロパティ',
    DESCRIPTION varchar(255) comment 'descriptionプロパティ',
    COUPON_NAME varchar(128) not null comment 'couponNameプロパティ',
    constraint M_SHOP_COUPON_PK primary key(SHOP_ID, COUPON_TYPE, COUPON_ID)
) comment = 'MShopCouponエンティティクラス';
