create table I_USER_COUPON (
    USER_COUPON_ID varchar(255) not null,
    INS_DATETIME timestamp not null,
    UPD_DATETIME timestamp not null,
    DESCRIPTION varchar(255),
    NAME varchar(255) not null,
    LIMIT_DATETIME timestamp,
    COUPON_ID int not null,
    SHOP_ID int not null,
    USER_ID bigint not null,
    constraint I_USER_COUPON_PK primary key(USER_COUPON_ID)
);
