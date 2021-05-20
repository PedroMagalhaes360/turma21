create database db_escola;
use db_escola;

create table tb_alunos (
id bigint auto_increment,
matricula bigint not null,
nome varchar (255) not null,
nota int,
presente boolean not null,
turma int,
primary key (id)
);

insert tb_alunos (matricula, nome, nota, Presente, Turma) values (0001, "Math", 9, false, 2);
insert tb_alunos (matricula, nome, nota, Presente, Turma) values (0011, "Julia", 10, false, 4);
insert tb_alunos (matricula, nome, nota, Presente, Turma) values (0111, "Maicon", 7, true, 1);
insert tb_alunos (matricula, nome, nota, Presente, Turma) values (1111, "Leticia", 10, true, 3);

select * from tb_alunos where nota > 7;
select * from tb_alunos where nota < 7;
