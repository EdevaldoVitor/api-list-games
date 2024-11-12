package com.dev.vitor.api.services;

import com.dev.vitor.api.dto.GameDTO;
import com.dev.vitor.api.entities.Game;
import com.dev.vitor.api.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public List<GameDTO> findAll(){
        List <Game> result =  gameRepository.findAll();
        return result.stream().map(x -> new GameDTO(x)).toList();

    }
}
