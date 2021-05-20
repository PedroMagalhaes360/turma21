create database db_ecommerce;
use db_ecommerce;
create table tb_produtos (
id bigint auto_increment,
nome varchar (255) not null,
preco decimal (10, 2) not null,
categoria varchar (50),
quantidade bigint,
promocao boolean  not null,
primary key (id)
);

insert tb_produtos (nome, preco, categoria, quantidade, Promoção) values ("Mesa", 750.90, "Cozinha", 50, true);
insert tb_produtos (nome, preco, quantidade, Promoção) values ("Cama", 400.90, 200, false);
insert tb_produtos (nome, preco, Promoção) values ("Cortina", 18.90, true);
insert tb_produtos (nome, preco, categoria, Promoção) values ("Guarda roupa", 299.99, "Quarto", true);
