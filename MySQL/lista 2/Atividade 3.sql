create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria (
id bigint auto_increment,
categoria varchar (50) not null,
promocao boolean not null,
desconto_convenio boolean not null,
primary key (id)
);

create table tb_produto (
id bigint auto_increment,
generico boolean,
nome varchar (50) not null,
descricao varchar (255) not null,
valor decimal (10, 2) not null,
frete decimal (10, 2) not null,
categoria_id bigint not null,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_categoria (categoria, promocao, desconto_convenio) values ("Medicamentos", false, true);
insert tb_categoria (categoria, promocao, desconto_convenio) values ("Dermocosméticos", true, false);
insert tb_categoria (categoria, promocao, desconto_convenio) values ("Nutrição", true, true);
insert tb_categoria (categoria, promocao, desconto_convenio) values ("Beleza", true, false);

insert into tb_produto (genérico, nome, descrição, valor, frete, categoria_id) 
	values (true, "Alprazolam", "Ansiedade", 10.99, 2.99, 1);
insert tb_produto (genérico, nome, descrição, valor, frete, categoria_id) 
	values (false, "Fluoxetina", "Anti depressivo", 19.99, 2.99, 1);
insert tb_produto (genérico, nome, descrição, valor, frete, categoria_id) 
	values (true, "Koleston", "Cabelo", 18.99, 2.99, 2);
insert tb_produto (genérico, nome, descrição, valor, frete, categoria_id) 
	values (false, "Vitamina D3", "Vitamina D" , 15.99, 2.99 , 3);
insert tb_produto (genérico, nome, descrição, valor, frete, categoria_id) 
	values (true, "Cora", "Beleza", 19.99, 2.99, 4);
insert tb_produto (genérico, nome, descrição, valor, frete, categoria_id) 
	values (false, "Whey", "Proteina", 57.99, 2.99, 3);









    