create table I_USER_COUPON (
    USER_ID bigint not null,
    SHOP_ID int not null,
    COUPON_TYPE int not null,
    COUPON_ID int not null,
    INS_DATETIME timestamp not null,
    UPD_DATETIME timestamp not null,
    LIMIT_DATETIME timestamp,
    COUPON_COUNT int not null,
    constraint I_USER_COUPON_PK primary key(USER_ID, SHOP_ID, COUPON_TYPE, COUPON_ID)
);
