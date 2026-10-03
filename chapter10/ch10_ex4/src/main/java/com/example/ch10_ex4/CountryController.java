package com.example.ch10_ex4;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/france")
    public ResponseEntity<Country> france(){
        Country c = Country.of("France", 67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent","Europe")
                .header("capital", "france")
                .header("favourite_food", "cheese and wine")
                .body(c);
    }
    @GetMapping("/all")
    public List<Country> countries(){
        Country c1 = Country.of("France", 67);
        Country c2 = Country.of("Spain", 420);

        return List.of(c1,c2);
    }
}
