package com.poc.sb.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Date;

@RestController
@RequestMapping("/poc")
@Log4j2
public class DefaultController {

    @Autowired
    private GraphProperties graphProperties;
    @Autowired
    Environment environment;
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
                System.out.println(environment.containsProperty("hierarchy.graph.username"));
                System.out.println("Username: " + graphProperties.getUsername());
                System.out.println("Password: " + graphProperties.getPassword());
                System.out.println("Props from dev-config: " + environment.getProperty("hierarchy.graph.url"));
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

    }
}
