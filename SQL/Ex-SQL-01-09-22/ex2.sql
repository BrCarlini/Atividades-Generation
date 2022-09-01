/*
CREATE DATABASE pro_ecommerce;
*/

USE pro_ecommerce;
/*

CREATE TABLE produto(
	id_prod bigint auto_increment,
	nome varchar(255) not null,
    quantidade int not null,
    categoria varchar(255) not null,
    preco decimal(5, 2) not null,
    descricao varchar(255),
    primary key(id_prod)
);


INSERT INTO produto(nome, quantidade, categoria, preco, descricao)
VALUES("Tenis Nike Speed Run", 5, "Artigo Esportivo", 250.0, "Tenis para Corredor Campeão");

INSERT INTO produto(nome, quantidade, categoria, preco, descricao)
VALUES("Tenis Nike Jordan", 2, "Casual", 999.90, "Tenis Casual, confortavel");

INSERT INTO produto(nome, quantidade, categoria, preco, descricao)
VALUES("Camisa Corinthians", 15, "Artigo Esportivo", 300.0, "Camisa antitranspirante, so pra quem tem Mundial");

INSERT INTO produto(nome, quantidade, categoria, preco, descricao)
VALUES("Jaqueta Adidas", 7, "Casual", 750.0, "Jaqueta top para chaviar no role");

INSERT INTO produto(nome, quantidade, categoria, preco, descricao)
VALUES("Jaqueta Nike", 4, "Casual", 750.0, "Jaqueta top para chaviar no role");

INSERT INTO produto(nome, quantidade, categoria, preco, descricao)
VALUES("Meia Adidas", 7, "Casual", 50.0, "Meia legal");

INSERT INTO produto(nome, quantidade, categoria, preco, descricao)
VALUES("Calça Moletom Puma", 9, "Artigo Esportivo", 100.0, "Calça reforçada para frio");

INSERT INTO produto(nome, quantidade, categoria, preco, descricao)
VALUES("Chuteira Penalty", 11, "Artigo Esportivo", 350.0, "Chuteira profissinal futsal");
*/

SELECT * FROM produto WHERE preco > 500.0;

SELECT * FROM produto WHERE preco < 500.0;

UPDATE produto
SET quantidade = 999
WHERE id_prod = 3;



SELECT * FROM produto;
