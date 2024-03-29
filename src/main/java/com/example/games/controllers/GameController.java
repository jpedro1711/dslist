package com.example.games.controllers;

import com.example.games.DTO.GameDto;
import com.example.games.DTO.GameMinDto;
import com.example.games.entities.Game;
import com.example.games.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll() {
        return this.gameService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable(value = "id") Long id) {
        GameDto result =  this.gameService.findById(id);
        return result;
    }
}
