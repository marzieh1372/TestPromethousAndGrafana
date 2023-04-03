package com.example.testgrafana;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class PersonController {

    @PostMapping("/t1")
    public ResponseEntity<String> test1(){
        System.out.println("Test .....");
        log.warn("First Test for Grafana and Prometheus");
        return ResponseEntity.ok().body("All Ok");
    }

}
