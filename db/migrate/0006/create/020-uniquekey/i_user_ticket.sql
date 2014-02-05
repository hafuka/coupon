alter table I_USER_TICKET add constraint I_USER_TICKET_UK1 unique (USER_ID);
alter table I_USER_TICKET add constraint I_USER_TICKET_UK2 unique (TICKET_TYPE);
alter table I_USER_TICKET add constraint I_USER_TICKET_UK3 unique (COUNT);
