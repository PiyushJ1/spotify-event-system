package com.piyush.spotify_event_system;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @GetMapping("/api/test/{id}")
    public String getString(@PathVariable String id) {
        return "hello !" + id;
    }

    @PostMapping("/api/setProfile")
    public void receive(@RequestBody String name) {
        System.out.println("welcome: " + name);
    }
}

