package com.example.testgrafana.controller;


//import io.micrometer.core.annotation.Timed;
import io.micrometer.core.annotation.Timed;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class PersonController {

    @Timed(value = "testPerson1")
    @GetMapping("/t1")
    public ResponseEntity<String> test1() {
        System.out.println("Test .....");
        log.warn("First Test for Grafana and Prometheus");
       /* try {
            Thread.sleep(100000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("***************************");
        return ResponseEntity.ok().body("All Ok");
    }

}
