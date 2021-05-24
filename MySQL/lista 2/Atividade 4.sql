create database db_cidade_das_frutas;

use db_cidade_das_frutas;
create table tb_categoria (
id bigint auto_increment,
nome varchar (20) not null,
tipo varchar (20) not null,
valor bigint,
primary key (id)
);

select * from tb_categoria;

insert tb_categoria (nome, tipo, valor) values ("Jaca", "fruta", 5);
insert tb_categoria (nome, tipo, valor) values ("Maça", "fruta", 8);
insert tb_categoria (nome, tipo, valor) values ("Pera", "fruta", 10);
insert tb_categoria (nome, tipo, valor) values ("Frambuesa", "fruta", 15);
insert tb_categoria (nome, tipo, valor) values ("Caqui", "fruta", 10);
insert tb_categoria (nome, tipo, valor) values ("Uva", "fruta", 7);

select * from tb_categoria;

create table tb_produtos (
id bigint auto_increment,
nome varchar (255) not null,
pedido bigint not null,
ativo boolean not null,
tb_categoria bigint,
primary key (id),
foreign key (tb_categoria) references tb_categoria (id)
);

insert tb_produtos (nome, pedido, ativo, tb_categoria) values ("Jose", 0005, true, 1);
insert tb_produtos (nome, pedido, ativo, tb_categoria) values ("João", 0001, true, 3);
insert tb_produtos (nome, pedido, ativo, tb_categoria) values ("Maria", 0003, true, 4);
insert tb_produtos (nome, pedido, ativo, tb_categoria) values ("Filomena", 0006, true, 2);
insert tb_produtos (nome, pedido, ativo, tb_categoria) values ("Adolfo", 0008, true, 5);

select * from tb_produtos;

select * from tb_categoria where valor > 50;
select * from tb_categoria where valor between 3 and 60;
select * from tb_categoria where nome like "%c%";
select * from tb_categoria inner join tb_produtos on  tb_produtos.id  =  tb_produtos.tb_categoria;
