create table M_LOGIN_BONUS (
    BONUS_TYPE int not null comment 'bonusTypeプロパティ',
    CONSECUTIVE_DAYS int not null comment 'consecutiveDaysプロパティ',
    POINT int not null comment 'pointプロパティ',
    constraint M_LOGIN_BONUS_PK primary key(BONUS_TYPE)
) comment = 'MLoginBonusエンティティクラス';
