package ars.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(value = "/message")
    public String message(){
        return "the message";
    }

}
