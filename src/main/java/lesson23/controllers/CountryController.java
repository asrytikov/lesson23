package lesson23.controllers;

import lesson23.model.Country;
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
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .header("continent", "Europe")
                .header("capital", "Paris")
                .body(c);
    }


    @GetMapping("/all")
    public List<Country> all(){
        Country c = Country.of("France", 67);
        Country s = Country.of("Spain", 47);
        return List.of(c, s);
    }
}
