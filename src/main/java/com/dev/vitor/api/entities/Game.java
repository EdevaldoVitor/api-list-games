package com.dev.vitor.api.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tb_game")
public class Game {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;
        String title;
        Integer game_year;
        String genre;
        String platforms;
        Double score;
        String imgUrl;
        String shortDescription;
        String longDescription;

}
