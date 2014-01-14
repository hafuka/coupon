create table M_AREA_DETAIL (
    AREA_ID int not null,
    AREA_DETAIL_ID int not null,
    DETAIL_NAME varchar(128) not null,
    constraint M_AREA_DETAIL_PK primary key(AREA_ID, AREA_DETAIL_ID)
);
