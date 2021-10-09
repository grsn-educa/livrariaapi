create table autores(
id bigint not null auto_increment,
nome varchar(255) not null,
email varchar(255) not null,
nascimento date Not null,
curriculo varchar(510),
primary key(id) 
);