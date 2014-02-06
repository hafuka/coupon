create table I_USER_AUTHENTICATION (
    USER_ID bigint not null comment 'userIdプロパティ',
    INS_DATETIME timestamp not null comment 'insDatetimeプロパティ',
    UPD_DATETIME timestamp not null comment 'updDatetimeプロパティ',
    REGIST_TOKEN varchar(32) comment 'registTokenプロパティ',
    PASSWORD varchar(128) not null comment 'passwordプロパティ',
    EMAIL varchar(128) not null comment 'emailプロパティ',
    constraint I_USER_AUTHENTICATION_PK primary key(USER_ID)
) comment = 'IUserAuthenticationエンティティクラス';
