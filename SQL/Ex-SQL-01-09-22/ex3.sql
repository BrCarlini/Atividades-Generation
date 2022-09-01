/*
CREATE DATABASE escola;
*/

USE escola;
/*
CREATE TABLE estudante(
	id_estud bigint auto_increment,
    nome varchar(255) not null,
    cpf varchar(15) not null,
    data_nasc date not null,
    turma varchar(255),
    media decimal,
    primary key(id_estud)
);

INSERT INTO estudante(nome, cpf, data_nasc, turma, media)
VALUES("Bruno", "111.111.111-11", "2007-11-11", "9°A", 7.70);

INSERT INTO estudante(nome, cpf, data_nasc, turma, media)
VALUES("Alessandra", "222.222.222-22", "2007-12-12", "9°A", 9.70);

INSERT INTO estudante(nome, cpf, data_nasc, turma, media)
VALUES("Beatriz", "333.333.333-33", "2005-03-13", "3°A", 8.70);

INSERT INTO estudante(nome, cpf, data_nasc, turma, media)
VALUES("Carlos", "444.444.444-44", "2007-08-14", "9°B", 8.50);

INSERT INTO estudante(nome, cpf, data_nasc, turma, media)
VALUES("Jose", "555.555.555-55", "2007-10-01", "9°B", 8.50);

INSERT INTO estudante(nome, cpf, data_nasc, turma, media)
VALUES("Balack", "666.666.666-66", "2005-08-11", "3°C", 6.50);

INSERT INTO estudante(nome, cpf, data_nasc, turma, media)
VALUES("Carlos", "777.777.777-77", "2005-11-11", "3°B", 8.50);

INSERT INTO estudante(nome, cpf, data_nasc, turma, media)
VALUES("Ana", "888.888.888-88", "2005-03-27", "3°A", 10.00);

ALTER TABLE estudante MODIFY media decimal(5,2);

INSERT INTO estudante(nome, cpf, data_nasc, turma, media)
VALUES("Igor", "999.999.999-99", "2007-04-30", "9°C", 5.65);

UPDATE estudante
SET media = 6.87
WHERE id_estud = 6;
*/



SELECT * FROM estudante WHERE media > 7.0;

SELECT * FROM estudante WHERE media < 7.0;


SELECT * FROM estudante;
