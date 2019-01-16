use task;

drop table if exists record;

create table if not exists record (

  id              int(11) auto_increment, primary key(id),
  date            date not null,
  task            int (12) not null unique,
  client          varchar (40) not null,
  address         varchar (80) not null,
  
  utp             int (4),
  category        int (2),
  sum             int (7),
  description     varchar (160)

) default character set utf8;