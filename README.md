create table if not exists admin."user"
(
    customer_id   varchar(10)  not null
        primary key,
    customer_name varchar(100) not null,
    phone         varchar(10),
    password      varchar(100),
    created_date  timestamp,
    update_date   timestamp,
    status        varchar(10)
);

alter table admin."user"
    owner to postgres;