create table I_USER_COUPON (
    USER_ID bigint not null comment 'userIdプロパティ',
    SHOP_ID int not null comment 'shopIdプロパティ',
    COUPON_TYPE int not null comment 'couponTypeプロパティ',
    COUPON_ID int not null comment 'couponIdプロパティ',
    INS_DATETIME timestamp not null comment 'insDatetimeプロパティ',
    UPD_DATETIME timestamp not null comment 'updDatetimeプロパティ',
    LIMIT_DATETIME timestamp comment 'limitDatetimeプロパティ',
    COUPON_COUNT int not null comment 'couponCountプロパティ',
    constraint I_USER_COUPON_PK primary key(USER_ID, SHOP_ID, COUPON_TYPE, COUPON_ID)
) comment = 'IUserCouponエンティティクラス';
