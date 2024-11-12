package com.dev.vitor.api.repositories;

import com.dev.vitor.api.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game, Long> {

}
