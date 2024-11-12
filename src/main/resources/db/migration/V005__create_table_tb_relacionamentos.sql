CREATE TABLE tb_belonging (
	position int,
    list_id bigint not null,
    game_id bigint not null,
    PRIMARY KEY (game_id, list_id));

CREATE TABLE tb_game_list (
	id bigint AUTO_INCREMENT,
    name varchar (800),
    PRIMARY KEY (id));

ALTER TABLE tb_belonging ADD CONSTRAINT FK_list FOREIGN KEY (list_id) REFERENCES tb_game_list(id);
ALTER TABLE tb_belonging ADD CONSTRAINT FK_game FOREIGN KEY (game_id) REFERENCES tb_game(id);