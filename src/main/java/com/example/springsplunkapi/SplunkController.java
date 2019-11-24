package com.example.springsplunkapi;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class SplunkController {

    @GetMapping
    public ResponseEntity<String> get() {
        log.info("Tá funcionando tudo certinho por aqui!!!");
        return ResponseEntity.ok("Deu bom!!!");
    }
}
