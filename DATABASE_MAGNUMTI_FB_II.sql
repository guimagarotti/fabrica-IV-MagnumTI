DROP DATABASE IF EXISTS db_magnumti;
CREATE DATABASE db_magnumti;
USE db_magnumti;

DROP TABLE IF EXISTS tb_cadastro;
CREATE TABLE tb_cadastro (
	id 		int 	primary key 	auto_increment,
    nome 			varchar(70)		not null,
    email			varchar(70)		not null,    
    senha			varchar(20)		not null,
    pet				varchar(40)		not null
);

DROP TABLE IF EXISTS carrinho;
CREATE TABLE carrinho (
	id 		int 	primary key 	auto_increment,
    nome 			varchar(100)	not null,
    preco			double			not null,    
    quantidade		int				not null	unique
);