package org.javier.redis.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jgabriele on 5/10/2017.
 */
@RestController
@Configuration
public class RedisPOCController {

    @RequestMapping("/")
    public String hello() {
        return "Greetings from Spring Boot!";
    }
}
