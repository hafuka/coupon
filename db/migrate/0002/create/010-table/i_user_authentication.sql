create table I_USER_AUTHENTICATION (
    USER_ID bigint not null,
    INS_DATETIME timestamp not null,
    UPD_DATETIME timestamp not null,
    REGIST_TOKEN varchar(32),
    PASSWORD varchar(128) not null,
    EMAIL varchar(128) not null,
    constraint I_USER_AUTHENTICATION_PK primary key(USER_ID)
);
