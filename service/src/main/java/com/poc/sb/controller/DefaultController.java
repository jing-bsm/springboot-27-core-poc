package com.poc.sb.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Date;

@RestController
@RequestMapping("/poc")
@Log4j2
public class DefaultController {

    @GetMapping("/g")
    public String get() {
//        for (var v : System.getenv().entrySet()) {
//            System.out.println(v);
//        }
        return "world hello";
    }

    @PostConstruct
    void postConstruct() {
        new Thread(() -> {
            while (true) {
                log.info("Yo {}", get());
                System.out.println(new Date());
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

    }
}
