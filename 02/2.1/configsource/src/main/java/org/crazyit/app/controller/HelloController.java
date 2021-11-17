package org.crazyit.app.controller;

import org.fkit.app.Bird;
import org.fkit.app.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

@RestController
public class HelloController {
    @Autowired
    private Dog dog;

    @Autowired
    private Bird bird;

    @Autowired
    private DateFormat dateFormat;

    @GetMapping("/")
    public String test() {
        return "Hello, " + dog.bark() + ", " +
                bird.fly() + ", " +
                dateFormat.format(new Date());
    }
}
