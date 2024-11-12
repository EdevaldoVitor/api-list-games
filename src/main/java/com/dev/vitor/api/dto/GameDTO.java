package com.dev.vitor.api.dto;

import com.dev.vitor.api.entities.Game;
import lombok.Getter;

@Getter
public class GameDTO {

    long id;
    String title;
    Integer game_year;
    String imgUrl;
    String shortDescription;

    public GameDTO (){

    }
    public GameDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        game_year = entity.getGame_year();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }
}
