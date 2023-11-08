package com.nikhilchavan.SpringbootAurSabkuch.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
public class HeathcheckController {

    @GetMapping
    public ResponseEntity<String> getHealthcheck(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
