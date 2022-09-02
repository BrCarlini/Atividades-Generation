/*
CREATE DATABASE db_generation_game_online;
*/
USE db_generation_game_online;
/*
CREATE TABLE tb_classe(
	id_classe bigint auto_increment,
    nome varchar(255) not null,
    caracteristica varchar(255) not null,
    primary key(id_classe)
);

CREATE TABLE tb_personagem(
	id_perso bigint auto_increment,
    nome varchar(255) not null,
    lvl int not null,
    forca decimal(10,2),
    defesa decimal(10,2),
    classe_id bigint,
    primary key(id_perso),
    foreign key(classe_id) references tb_classe(id_classe)
);


INSERT INTO tb_classe(nome, caracteristica)
VALUES("Fogo", "Absorve e atira fogo");

INSERT INTO tb_classe(nome, caracteristica)
VALUES("Agua", "Absorve e atira Agua");

INSERT INTO tb_classe(nome, caracteristica)
VALUES("Terra", "Absorve e atira Terra");

INSERT INTO tb_classe(nome, caracteristica)
VALUES("Ar", "Domina Fogo, Agua e Terra");

INSERT INTO tb_classe(nome, caracteristica)
VALUES("Lutador", "Mestre em Artes Marciais");

INSERT INTO tb_personagem(nome, lvl, forca, defesa, classe_id)
VALUES("aleh_matadora_de_porco", 77, 2444.0, 1400.0, 2);


INSERT INTO tb_personagem(nome, lvl, forca, defesa, classe_id)
VALUES("brcarlini_the_best", 34, 1444.0, 700.0, 5);

INSERT INTO tb_personagem(nome, lvl, forca, defesa, classe_id)
VALUES("apetite_pendente", 7, 444.0, 100.0, 1);

INSERT INTO tb_personagem(nome, lvl, forca, defesa, classe_id)
VALUES("alvo_da_cassada", 400, 10444.0, 4000.0, 3);

INSERT INTO tb_personagem(nome, lvl, forca, defesa, classe_id)
VALUES("nephist", 23, 2444.0, 1002.0, 4);

INSERT INTO tb_personagem(nome, lvl, forca, defesa, classe_id)
VALUES("kabal", 4, 144.0, 50.0, 5);

INSERT INTO tb_personagem(nome, lvl, forca, defesa, classe_id)
VALUES("swegger", 100, 1444.0, 700.0, 1);

INSERT INTO tb_personagem(nome, lvl, forca, defesa, classe_id)
VALUES("uva_do_mal", 334, 33444.0, 2000.0, 2);

UPDATE tb_personagem
SET nome="joao_pe_de_feijao", lvl = 17, forca = 100.0, defesa = 40.0, classe_id = 3
WHERE id_perso = 1;


SELECT * FROM tb_personagem WHERE forca > 2000.0;

SELECT * FROM tb_personagem WHERE defesa BETWEEN 1000.0 AND 2000.0;

SELECT * FROM tb_personagem WHERE nome LIKE "%c%";
*/



SELECT tb_personagem.nome, lvl, forca, defesa,tb_classe.caracteristica, tb_classe.id_classe
FROM tb_classe INNER JOIN tb_personagem
ON tb_classe.id_classe = tb_personagem.classe_id;

SELECT tb_personagem.nome, lvl, forca, defesa,tb_classe.caracteristica, tb_classe.id_classe
FROM tb_classe INNER JOIN tb_personagem
ON tb_classe.id_classe = tb_personagem.classe_id WHERE id_classe = 5;




-- SELECT * FROM tb_classe;
-- SELECT * FROM tb_personagem;