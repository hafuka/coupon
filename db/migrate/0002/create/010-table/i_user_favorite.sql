create table I_USER_FAVORITE (
    USER_ID bigint not null,
    SHOP_ID int not null,
    INS_DATETIME timestamp not null,
    constraint I_USER_FAVORITE_PK primary key(USER_ID, SHOP_ID)
);
