create table M_SHOP (
    SHOP_ID int not null,
    PREMIUM_FLG boolean,
    STATION varchar(32) not null,
    AREA_DETAIL_ID int not null,
    AREA_ID int not null,
    MAP_URL varchar(255),
    TELL varchar(16),
    URL varchar(255),
    DESCRIPTION varchar(255),
    SHOP_NAME varchar(255) not null,
    BUSINESS_ID int not null,
    constraint M_SHOP_PK primary key(SHOP_ID)
);
