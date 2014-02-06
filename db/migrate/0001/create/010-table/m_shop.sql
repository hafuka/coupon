create table M_SHOP (
    SHOP_ID int not null comment 'shopIdプロパティ',
    PREMIUM_FLG int not null comment 'premiumFlgプロパティ',
    STATION varchar(32) not null comment 'stationプロパティ',
    AREA_DETAIL_ID int not null comment 'areaDetailIdプロパティ',
    AREA_ID int not null comment 'areaIdプロパティ',
    MAP_URL varchar(255) comment 'mapUrlプロパティ',
    TELL varchar(16) comment 'tellプロパティ',
    URL varchar(255) comment 'urlプロパティ',
    DESCRIPTION varchar(255) comment 'descriptionプロパティ',
    SHOP_NAME varchar(255) not null comment 'shopNameプロパティ',
    BUSINESS_ID int not null comment 'businessIdプロパティ',
    constraint M_SHOP_PK primary key(SHOP_ID)
) comment = 'MShopエンティティクラス';
