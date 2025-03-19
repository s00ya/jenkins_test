package com.example.demo05;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/ex")
    public ResponseEntity<String> ex() {
        return ResponseEntity.ok("test ex v2 call success");
    }
}
