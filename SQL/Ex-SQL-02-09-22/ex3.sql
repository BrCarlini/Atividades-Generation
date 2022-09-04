/*
CREATE DATABASE db_farmacia_bem_estar;
*/

USE db_farmacia_bem_estar;

/*
CREATE TABLE tb_categoria(
	id_cat bigint auto_increment,
    categoria varchar(255) not null,
    primary key(id_cat)
);

CREATE TABLE tb_produto(
	id_prod bigint auto_increment,
    nome varchar(255) not null,
    quantidade int not null,
    preco decimal(5, 2),
    descricao varchar(255),
    cat_id bigint,
    primary key(id_prod),
    foreign key(cat_id) references tb_categoria(id_cat)
);

INSERT INTO tb_categoria(categoria)
VALUES("Medicamento");

INSERT INTO tb_categoria(categoria)
VALUES("Higiene");

INSERT INTO tb_categoria(categoria)
VALUES("Beleza");

INSERT INTO tb_categoria(categoria)
VALUES("Suplementos");

INSERT INTO tb_categoria(categoria)
VALUES("Alimento");

INSERT INTO tb_produto(nome, quantidade, preco, descricao, cat_id)
VALUES("Dipirona", 77, 15.90, "Para dor e febre", 1);

INSERT INTO tb_produto(nome, quantidade, preco, descricao, cat_id)
VALUES("DorFlex", 43, 10.90, "Para dores musculares", 1);

INSERT INTO tb_produto(nome, quantidade, preco, descricao, cat_id)
VALUES("Sertralina", 103, 54.90, "Anti-depressivo", 1);

INSERT INTO tb_produto(nome, quantidade, preco, descricao, cat_id)
VALUES("Nutri Whey Protein", 50, 82.94, "Suplemento", 4);

INSERT INTO tb_produto(nome, quantidade, preco, descricao, cat_id)
VALUES("Barra de Cereal", 99, 7.90, "Barra energetica", 5);

INSERT INTO tb_produto(nome, quantidade, preco, descricao, cat_id)
VALUES("Absorvente", 199, 24.90, "Proteção para mulheres", 2);

INSERT INTO tb_produto(nome, quantidade, preco, descricao, cat_id)
VALUES("Batom", 88, 7.90, "Vermelho Brilhante", 3);

INSERT INTO tb_produto(nome, quantidade, preco, descricao, cat_id)
VALUES("Escova de dente Eletronica", 99, 114.90, "Anti Bacteria e Tartaros", 2);
*/


SELECT * FROM tb_produto WHERE preco > 50.0;

SELECT * FROM tb_produto WHERE preco BETWEEN 5.0 AND 60.0;

SELECT * FROM tb_produto WHERE nome LIKE "%c%";

SELECT id_prod, nome, quantidade, preco, descricao, cat_id, tb_categoria.categoria
FROM tb_produto INNER JOIN tb_categoria
ON tb_produto.cat_id = tb_categoria.id_cat;

SELECT id_prod, nome, quantidade, preco, descricao, cat_id, tb_categoria.categoria
FROM tb_produto INNER JOIN tb_categoria
ON tb_produto.cat_id = tb_categoria.id_cat WHERE cat_id = 2;

SELECT * FROM tb_categoria;

SELECT * FROM tb_produto;
