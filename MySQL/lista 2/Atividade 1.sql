create database db_generation_game_online;

use db_generation_game_online;
create table tb_classe (
id bigint auto_increment,
nomeClasse varchar (100) not null,
armadura boolean not null,
espada boolean not null,
primary key (id)
);

create table tb_personagem (
id bigint auto_increment,
classe_id bigint not null,
nome varchar (20),
vida bigint not null,
ataque bigint not null,
defese bigint not null,
poder_ativo boolean not null,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_classe (nomeClasse, armadura, arma) values ("Guerreiro", true, false);
insert into tb_classe (nomeClasse, armadura, arma) values ("Mago", true, true);
insert into tb_classe (nomeClasse, armadura, arma) values ("Elfo", false, false);
insert into tb_classe (nomeClasse, armadura, arma) values ("Golen", false, true);
insert into tb_classe (nomeClasse, armadura, arma) values ("Cavaleiro", true, true);

select * from tb_classe;

insert into tb_personagem (nome, vida, ataque, defesa, poder_ativo, classe_id)
		values ("AksneS1506", 100000, 100000, 100000, true, 2);

insert into tb_personagem (nome, vida, ataque, defesa, poder_ativo, classe_id)
		values ("Warrior1996", 10000, 10000, 10000, true, 1);

insert into tb_personagem (nome, vida, ataque, defesa, poder_ativo, classe_id)
		values ("Monark", 10000, 100, 100, true, 3);

insert into tb_personagem (nome, vida, ataque, defesa, poder_ativo, classe_id)
		values ("Meliodas", 1000, 1000, 1000, true, 5);

insert into tb_personagem (nome, vida, ataque, defesa, poder_ativo, classe_id)
		values ("Doguison", 100000, 100000, 100000, true, 4);
        
select * from tb_personagem where ataque > 2000;


