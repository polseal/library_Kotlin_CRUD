create table IF NOT EXISTS book
(
    id        bigint       not null
        primary key,
    title     varchar(255) not null,
    author    varchar(255) not null,
    year      integer      not null,
    publisher integer      not null,
    available boolean      not null
);

alter table book
    owner to guest;

create table IF NOT EXISTS client
(
    id    bigint       not null
        primary key,
    name  varchar(255) not null,
    email varchar(255) not null
);

alter table client
    owner to guest;

create table IF NOT EXISTS library
(
    index     bigint not null
        constraint table_name_pkey
            primary key,
    book_id   bigint
        constraint table_name_book_id_fkey
            references book,
    client_id bigint
        constraint table_name_client_id_fkey
            references client,
    timestamp timestamp,
    status    boolean
);

alter table library
    owner to guest;