create table I_USER (
    USER_ID bigint not null comment 'userIdプロパティ',
    INS_DATETIME timestamp not null comment 'insDatetimeプロパティ',
    UPD_DATETIME timestamp not null comment 'updDatetimeプロパティ',
    NORMAL_ROULETTE_DATETIME timestamp comment 'normalRouletteDatetimeプロパティ',
    CONSECUTIVE_DAYS bigint comment 'consecutiveDaysプロパティ',
    LOGIN_BONUS_DATETIME timestamp comment 'loginBonusDatetimeプロパティ',
    LOGIN_DATETIME timestamp comment 'loginDatetimeプロパティ',
    POINT bigint comment 'pointプロパティ',
    NAME varchar(128) not null comment 'nameプロパティ',
    EMAIL varchar(128) not null comment 'emailプロパティ',
    constraint I_USER_PK primary key(USER_ID)
) comment = 'IUserエンティティクラス';
