create table M_CONFIG (
    NAME varchar(128) not null comment 'nameプロパティ',
    END_DATETIME timestamp comment 'endDatetimeプロパティ',
    START_DATETIME timestamp comment 'startDatetimeプロパティ',
    VALUE varchar(255) not null comment 'valueプロパティ',
    constraint M_CONFIG_PK primary key(NAME)
) comment = 'MConfigエンティティクラス';
