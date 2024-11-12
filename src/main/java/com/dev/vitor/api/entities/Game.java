package com.dev.vitor.api.entities;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "tb_game")
public class Game {

        public Game (){

        }
        public Game(long id, String longDescription, String imgUrl, String shortDescription, Double score, String platform, String genre, Integer game_year, String title) {
                this.id = id;
                this.longDescription = longDescription;
                this.imgUrl = imgUrl;
                this.shortDescription = shortDescription;
                this.score = score;
                this.platform = platform;
                this.genre = genre;
                this.game_year = game_year;
                this.title = title;
        }
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;
        String title;
        Integer game_year;
        String genre;
        String platform;
        Double score;
        String imgUrl;
        String shortDescription;
        String longDescription;

}
