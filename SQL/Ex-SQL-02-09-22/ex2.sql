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
*/

SELECT * FROM tb_categoria;

