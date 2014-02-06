create table M_BUSINESS (
    BUSINESS_ID int not null comment 'businessIdプロパティ',
    NAME varchar(128) not null comment 'nameプロパティ',
    constraint M_BUSINESS_PK primary key(BUSINESS_ID)
) comment = 'MBusinessエンティティクラス';
