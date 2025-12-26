package com.piyush.spotify_event_system;

import lombok.Getter;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @GetMapping("/api/test/{id}")
    public String getString(@PathVariable String id) {
        return "hello !" + id;
    }

    @PostMapping("/api/setProfile")
    public void receive(@RequestBody Profile profile) {
        System.out.println("your name is: " + profile.getName());
        System.out.println("you live at: " + profile.getAddress());
    }
}

class Profile {

    private String name;
    private String address;

    public Profile() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}