create table I_USER_TICKET (
    USER_ID bigint not null comment 'userIdプロパティ',
    TICKET_TYPE int not null comment 'ticketTypeプロパティ',
    INS_DATETIME timestamp not null comment 'insDatetimeプロパティ',
    UPD_DATETIME timestamp not null comment 'updDatetimeプロパティ',
    COUNT int comment 'countプロパティ',
    constraint I_USER_TICKET_PK primary key(USER_ID, TICKET_TYPE)
) comment = 'IUserTicketエンティティクラス';
