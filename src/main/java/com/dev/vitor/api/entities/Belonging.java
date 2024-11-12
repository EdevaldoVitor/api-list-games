package com.dev.vitor.api.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id;
    private Integer position;

    public Belonging(){

    }

    public Belonging (Game game, GameList list, Integer position){
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }

}
