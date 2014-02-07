create table I_USER_COIN (
    USER_ID bigint not null comment 'userIdプロパティ',
    INS_DATETIME timestamp not null comment 'insDatetimeプロパティ',
    UPD_DATETIME timestamp not null comment 'updDatetimeプロパティ',
    COIN int not null comment '',
    constraint I_USER_COIN_PK primary key(USER_ID)
) comment = 'IUserCoinエンティティクラス';
