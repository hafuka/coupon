create table M_AREA_DETAIL (
    AREA_ID int not null comment 'areaIdプロパティ',
    AREA_DETAIL_ID int not null comment 'areaDetailIdプロパティ',
    DETAIL_NAME varchar(128) not null comment 'detailNameプロパティ',
    constraint M_AREA_DETAIL_PK primary key(AREA_ID, AREA_DETAIL_ID)
) comment = 'MAreaDetailエンティティクラス';
