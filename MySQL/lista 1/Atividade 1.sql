create database db_rh;
use db_rh;
create table tb_funcionarios (
id bigint auto_increment,
nome varchar (255) not null,
idade int not null,
cargo varchar (50) not null,
genero varchar (1),
salario decimal (10, 2) not null, 
primary key (id)
);

insert into tb_funcionarios (nome, idade, cargo, genero, salario) values ("Aurora", 25, "Gerente", "F", 30.000);
insert into tb_funcionarios (nome, idade, cargo, genero, salario) values ("Chester", 41, "TI", "M", 25.000);
insert into tb_funcionarios (nome, idade, cargo, genero, salario) values ("Leonardo", 33, "BackEnd", "M", 15.000);
insert into tb_funcionarios (nome, idade, cargo, genero, salario) values ("Elizabeth", 35, "Frontend", "F", 15.500);
insert into tb_funcionarios (nome, idade, cargo, genero, salario) values ("Carlos", 20, "Java Junior", "M", 8.000);
