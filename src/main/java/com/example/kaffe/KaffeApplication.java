package com.example.kaffe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@SpringBootApplication
public class KaffeApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaffeApplication.class, args);
    }

    @PostMapping(path="/order")
    public String lavKaffe (@RequestBody Map<String, String> numbers) {
        String name = numbers.get("espresso");
        String size = numbers.get("size");
        return "Du har bestilt" + name + size ;
    }

}
