/*
CREATE DATABASE db_pizzaria_legal;
*/

USE db_pizzaria_legal;

/*
CREATE TABLE tb_categoria(
	id_cat bigint auto_increment,
    tipo varchar(255) not null,
    forma varchar(255) not null,
    primary key(id_cat)
);

CREATE TABLE tb_pizza(
	id_pizza bigint auto_increment,
    nome varchar(255),
    sabor varchar(255),
    descricao varchar(255),
    preco decimal(3, 2),
    cat_id bigint,
    primary key(id_pizza),
    foreign key(cat_id) references tb_categoria(id_cat)
);


INSERT INTO tb_categoria(tipo, forma)
VALUES("Doce", "Redonda");

INSERT INTO tb_categoria(tipo, forma)
VALUES("Salgada", "Redonda");

INSERT INTO tb_categoria(tipo, forma)
VALUES("Doce", "Quadrada");

INSERT INTO tb_categoria(tipo, forma)
VALUES("Doce", "Triangular");

INSERT INTO tb_categoria(tipo, forma)
VALUES("Salgada", "Triangular");

INSERT INTO tb_categoria(tipo, forma)
VALUES("Salgada", "Quadrada");

INSERT INTO tb_pizza(nome, sabor, descricao, preco, cat_id)
VALUES("Calamussa", "Calabresa com Mussarela", "Calabresa com Mussarela, oregano, cebola e tomate", 9.9, 2);

INSERT INTO tb_pizza(nome, sabor, descricao, preco, cat_id)
VALUES("Siciliana", "Mussarela e Bacon", "Mussarela, Champion, Bacon, Salsa Picada, Azeitona, Cebola", 4.9, 6);

INSERT INTO tb_pizza(nome, sabor, descricao, preco, cat_id)
VALUES("Sensação", "Chocolate", "Chocolate, Leite Condensado, Morango", 4.9, 3);

INSERT INTO tb_pizza(nome, sabor, descricao, preco, cat_id)
VALUES("Baiana", "Calabresa moida com pimenta", "Calabresa moida com Mussarela, oregano, cebola, tomate, pimenta do reino e ovo", 9.9, 6);

INSERT INTO tb_pizza(nome, sabor, descricao, preco, cat_id)
VALUES("Portuguesa", "Calabresa com Mussarala", "Calabresa com Mussarela, oregano, cebola e tomate", 9.9, 5);

INSERT INTO tb_pizza(nome, sabor, descricao, preco, cat_id)
VALUES("Abobrinha", "Abobrinha", "Abobrinha com queijo de bufula e molho de tomate", 4.9, 2);

INSERT INTO tb_pizza(nome, sabor, descricao, preco, cat_id)
VALUES("Prestigio", "Chocolate ao Leite e Coco", "Chocolate ao leite, coco, chocolate prestigio", 5.9, 1);

INSERT INTO tb_pizza(nome, sabor, descricao, preco, cat_id)
VALUES("Caviar", "Caviar Vermelho", "Caviar, com queijo de bufula", 9.9, 2);

SELECT * FROM tb_pizza WHERE preco > 45.0;
SELECT * FROM tb_pizza WHERE preco BETWEEN 50.0 AND 100.0;

SELECT * FROM tb_pizza WHERE nome LIKE "%m%";
*/


SELECT nome, sabor, descricao, preco, tb_categoria.forma
FROM tb_pizza INNER JOIN tb_categoria
ON tb_categoria.id_cat = tb_pizza.cat_id;

SELECT nome, sabor, descricao, preco, tb_categoria.forma
FROM tb_pizza INNER JOIN tb_categoria
ON tb_categoria.id_cat = tb_pizza.cat_id WHERE id_cat = 2;


SELECT * FROM tb_categoria;
SELECT * FROM tb_pizza;

