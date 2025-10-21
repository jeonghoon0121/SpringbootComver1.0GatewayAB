package com.ohgiraffers.com.boardver5;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/restful/boardv5")
public class BoardV5RestController {

    // GET 방식 처리
    @GetMapping("/user")
    public ResponseEntity<Map<String, String>> getUser(@RequestParam String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "GET 방식으로 받은 이름: " + name);
        return ResponseEntity.ok(response);
    }

    // POST 방식 처리
    @PostMapping("/user")
    public ResponseEntity<Map<String, String>> postUser(@RequestParam String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "POST 방식으로 받은 이름: " + name);
        return ResponseEntity.ok(response);
    }
}

