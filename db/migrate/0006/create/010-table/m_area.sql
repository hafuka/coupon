create table M_AREA (
    AREA_ID int not null comment 'areaIdプロパティ',
    AREA_NAME varchar(16) not null comment 'areaNameプロパティ',
    constraint M_AREA_PK primary key(AREA_ID)
) comment = 'MAreaエンティティクラス';
