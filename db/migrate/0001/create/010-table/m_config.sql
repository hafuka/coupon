create table M_CONFIG (
    NAME varchar(128) not null,
    END_DATETIME timestamp,
    START_DATETIME timestamp,
    VALUE varchar(255) not null,
    constraint M_CONFIG_PK primary key(NAME)
);
