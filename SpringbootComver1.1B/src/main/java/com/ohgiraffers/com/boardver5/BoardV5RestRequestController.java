package com.ohgiraffers.com.boardver5;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boardv5Rest")
public class BoardV5RestRequestController {

    // GET 방식 처리
    @GetMapping("/receive")
    public ResponseEntity<String> receiveGet(@RequestParam String username) {
        return ResponseEntity.ok("GET 방식으로 받은 이름: " + username);
    }

    // POST 방식 처리
    @PostMapping("/receive")
    public ResponseEntity<String> receivePost(@RequestParam String username) {
        return ResponseEntity.ok("POST 방식으로 받은 이름: " + username);
    }
}

