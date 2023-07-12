package com.example.games.services;
import com.example.games.DTO.GameMinDto;
import com.example.games.entities.Game;
import com.example.games.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        List<Game> result = this.gameRepository.findAll();
        // Para cada item x da sequencia de dados, transforma em GameMinDto
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
        return dto;
    }
}
