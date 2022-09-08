/*
CREATE DATABASE db__cidade_das_carnes;
*/

USE db__cidade_das_carnes;
/*
CREATE TABLE tb_categoria(
	id_cat bigint auto_increment,
    
    primary key(id_cat)
);

ALTER TABLE tb_categoria ADD tipo_de_produto varchar(255);

CREATE TABLE tb_produto(
	id_prod bigint auto_increment,
    nome varchar(255),
    quantidade_kg decimal(10,2),
    validade date,
    preco_por_kg decimal(10,2),
    cat_id bigint,
    primary key(id_prod),
    foreign key(cat_id) references tb_categoria(id_cat)
);

INSERT INTO tb_categoria(tipo_de_produto)
VALUES("Carne Suina");

INSERT INTO tb_categoria(tipo_de_produto)
VALUES("Aperitivo");

INSERT INTO tb_categoria(tipo_de_produto)
VALUES("Espeto");

INSERT INTO tb_categoria(tipo_de_produto)
VALUES("Itens para Churrasco");


INSERT INTO tb_produto(nome, quantidade_kg, validade, preco_por_kg, cat_id)
VALUES("Espetinho Suíno", 1200.0, "2023-10-12", 24.90, 4);

INSERT INTO tb_produto(nome, quantidade_kg, validade, preco_por_kg, cat_id)
VALUES("Pão de alho", 500, "2023-01-27", 9.0, 3);

INSERT INTO tb_produto(nome, quantidade_kg, validade, preco_por_kg, cat_id)
VALUES("Bife de Alcatra", 9000.0, "2023-03-27", 46.96, 1);

INSERT INTO tb_produto(nome, quantidade_kg, validade, preco_por_kg, cat_id)
VALUES("Bife de Contra Filé", 7000.0, "2023-05-17", 44.96, 1);

INSERT INTO tb_produto(nome, quantidade_kg, validade, preco_por_kg, cat_id)
VALUES("Carvão", 1000, "2023-12-27", 25.96, 5);

INSERT INTO tb_produto(nome, quantidade_kg, validade, preco_por_kg, cat_id)
VALUES("Tapua de Madeira", 2000.0, "2023-03-27", 24.90, 5);

INSERT INTO tb_produto(nome, quantidade_kg, validade, preco_por_kg, cat_id)
VALUES("Picanha Suína Temperada", 2000.0, "2023-03-27", 54.90, 2);
*/

SELECT * FROM tb_produto WHERE preco_por_kg > 50.0;

SELECT * FROM tb_produto WHERE preco_por_kg BETWEEN 50.0 and 150.0;

SELECT * FROM tb_produto WHERE nome LIKE "%c%";

SELECT id_prod, nome, quantidade_kg, validade, preco_por_kg, cat_id, tb_categoria.tipo_de_produto
FROM tb_produto INNER JOIN tb_categoria
ON tb_produto.cat_id = tb_categoria.id_cat;

SELECT id_prod, nome, quantidade_kg, validade, preco_por_kg, cat_id, tb_categoria.tipo_de_produto
FROM tb_produto INNER JOIN tb_categoria
ON tb_produto.cat_id = tb_categoria.id_cat WHERE cat_id = 1;

SELECT * FROM tb_produto; 
SELECT * FROM tb_categoria; 