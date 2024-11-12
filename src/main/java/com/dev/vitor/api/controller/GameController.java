package com.dev.vitor.api.controller;

import com.dev.vitor.api.dto.GameDTO;
import com.dev.vitor.api.entities.Game;
import com.dev.vitor.api.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameDTO> findAll() {
        return gameService.findAll();
    }
}
