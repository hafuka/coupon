create table I_USER_COIN (
    USER_ID bigint not null,
    INS_DATETIME timestamp not null,
    UPD_DATETIME timestamp not null,
    COIN int not null,
    constraint I_USER_COIN_PK primary key(USER_ID)
);
