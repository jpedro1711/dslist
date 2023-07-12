package com.example.games.services;
import com.example.games.DTO.GameDto;
import com.example.games.DTO.GameListDto;
import com.example.games.DTO.GameMinDto;
import com.example.games.entities.Game;
import com.example.games.entities.GameList;
import com.example.games.repositories.GameListRepository;
import com.example.games.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDto> findAll() {
        List<GameList> result = this.gameListRepository.findAll();
        // Para cada item x da sequencia de dados, transforma em GameMinDto
        List<GameListDto> dto = result.stream().map(x -> new GameListDto(x)).toList();
        return dto;
    }
}
