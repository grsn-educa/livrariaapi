create table livros(
id bigint not null auto_increment,
titulo varchar(255) not null,
data_lancamento date not null,
numero_paginas int not null,
primary key(id) 
);