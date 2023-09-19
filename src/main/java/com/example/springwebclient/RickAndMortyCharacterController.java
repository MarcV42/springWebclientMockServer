package com.example.springwebclient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/characters")
@RequiredArgsConstructor
public class RickAndMortyCharacterController {


    private final RickAndMortyCharacterService rickAndMortyCharacterService;

    @GetMapping
    List<RickAndMortyCharacter> getCharacters() {
        return rickAndMortyCharacterService.getCharacters();
    }

    @GetMapping("{id}")
    RickAndMortyCharacter getCharacterById(@PathVariable String id) {
        return rickAndMortyCharacterService.getCharacterById(id);
    }

    @GetMapping("/status")
    List<RickAndMortyCharacter> getCharactersByStatus(@RequestParam String status) {
        return rickAndMortyCharacterService.getCharactersByStatus(status);
    }

    @GetMapping("species-statistic")
    int getStatisticForSpecies(@RequestParam String status, @RequestParam String species) {
        return rickAndMortyCharacterService.getStatisticForSpecies(status, species);
    }
}
