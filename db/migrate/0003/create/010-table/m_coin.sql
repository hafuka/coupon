create table M_COIN (
    ID int not null comment 'idプロパティ',
    END_DATETIME timestamp comment 'endDatetimeプロパティ',
    START_DATETIME timestamp comment 'startDatetimeプロパティ',
    YEN int not null comment 'yenプロパティ',
    COIN int not null comment 'coinプロパティ',
    constraint M_COIN_PK primary key(ID)
) comment = 'MConfigエンティティクラス';
