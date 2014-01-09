create table M_LOGIN_BONUS (
    BONUS_ID int not null,
    CONSECUTIVE_DAYS int not null,
    POINT int not null,
    BONUS_TYPE int not null,
    constraint M_LOGIN_BONUS_PK primary key(BONUS_ID)
);
