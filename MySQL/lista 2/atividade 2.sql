create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categotia (
id bigint auto_increment,
nome varchar (100) not null,
valor bigint,
tipo varchar (100) not null,
primary key (id)
);

insert tb_categoria (nome, valor, tipo) values ("Mussarela", 45.00, "salgada");
insert tb_categoria (nome, valor, tipo) values ("Portuguesa", 60.00, "salgada");
insert tb_categoria (nome, valor, tipo) values ("Romeu e Julieta", 54.00, "doce");
insert tb_categoria (nome, valor, tipo) values ("M&M's", 50.00, "doce");

select * from tb_categoria;

create table tb_pizza (
id bigint auto_increment,
nome varchar (255) not null,
pedido bigint not null,
ativo boolean not null,
tb_categoria bigint,
primary key (id),
foreign key (tb_categoria) references tb_categoria (id)
);

select * from tb_pizza;

insert into tb_pizza (nome, pedido, ativo) values ("Pedro", 1, true);
insert into tb_pizza (nome, pedido, ativo) values ("Manu", 2, true);
insert into tb_pizza (nome, pedido, ativo) values ("Bruna", 3, true);
insert into tb_pizza (nome, pedido, ativo) values ("Leonardo", 4, true);

select * from tb_pizza;
