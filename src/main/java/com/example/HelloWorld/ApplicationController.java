package com.example.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {

    @Autowired
    private Randomizer randomizer;

    @GetMapping("/")
    public String getMainPage () {
        return "pixel";
    }

//    @GetMapping("/")
//    @ResponseBody
//    public String sayHello(@RequestParam(name = "fuckingName") String fuckingName) {
//        return "Hello, fucking " + fuckingName + "!";
//    }

//    @GetMapping("/testThatMotherfucker")
//    @ResponseBody
//    public String checkThatMotherfucker(@RequestParam(name = "name") String name) {
//        return randomizer.detectMotherfucker(name);
//    }
}
