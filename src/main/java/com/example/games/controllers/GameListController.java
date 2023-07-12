package com.example.games.controllers;

import com.example.games.DTO.GameDto;
import com.example.games.DTO.GameListDto;
import com.example.games.DTO.GameMinDto;
import com.example.games.entities.GameList;
import com.example.games.services.GameListService;
import com.example.games.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDto> findAll() {
        return this.gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findByList(@PathVariable Long listId) {
        return this.gameService.findByList(listId);
    }
}
