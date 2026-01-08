package com.piyush.spotify_event_system.controller;

import com.piyush.spotify_event_system.dto.SpotifyEvent;
import com.piyush.spotify_event_system.service.SpotifyEventProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class EventController {
//    @GetMapping("/api/test/{id}")
//    public String getString(@PathVariable String id) {
//        return "hello !" + id;
//    }
//
//    @PostMapping("/api/setProfile")
//    public void receive(@RequestBody String name) {
//        System.out.println("welcome: " + name);
//    }

    private final SpotifyEventProducer producer;
    @PostMapping("/api/event")
    public ResponseEntity<String> simulateEvent(@RequestBody SpotifyEvent event) {
        producer.sendEvent(event);
        return ResponseEntity.accepted().body("event queued for processing");
    }
}

