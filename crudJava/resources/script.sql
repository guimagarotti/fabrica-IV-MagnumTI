DROP DATABASE IF EXISTS Agenda;
CREATE DATABASE Agenda;
USE Agenda;

CREATE TABLE contato (
	id		int		primary key		auto_increment,
    nome 	varchar(30),
    idade 	int,
    dataCadastro	date
);

