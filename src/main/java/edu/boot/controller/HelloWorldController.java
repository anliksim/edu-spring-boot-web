package edu.boot.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Simple controller serving a hello message on the default route.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String helloFriend(@RequestParam(name="name", required=false, defaultValue="Friend") String name) {
        return String.format("Hello %s!", name);
    }
}
