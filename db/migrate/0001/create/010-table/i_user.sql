create table I_USER (
    USER_ID bigint not null,
    INS_DATETIME timestamp not null,
    UPD_DATETIME timestamp not null,
    CUSTOMER_ID varchar(32) not null,
    NORMAL_ROULETTE_DATETIME timestamp,
    CONSECUTIVE_DAYS bigint,
    LOGIN_BONUS_DATETIME timestamp,
    LOGIN_DATETIME timestamp,
    POINT bigint,
    NAME varchar(128) not null,
    EMAIL varchar(128) not null,
    constraint I_USER_PK primary key(USER_ID)
);
