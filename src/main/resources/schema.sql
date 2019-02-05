drop table if exists blogger;
create table blogger(
id bigint NOT NULL,
name varchar(100),
age int,
PRIMARY KEY (id)
);

drop table if exists story;
create table story(
id bigint NOT NULL,
title varchar(100),
content varchar(400),
posted date,
blogger_id int,
primary key (id)
);