create table M_COIN (
    ID int not null,
    END_DATETIME timestamp,
    START_DATETIME timestamp,
    YEN int not null,
    COIN int not null,
    constraint M_COIN_PK primary key(ID)
);
