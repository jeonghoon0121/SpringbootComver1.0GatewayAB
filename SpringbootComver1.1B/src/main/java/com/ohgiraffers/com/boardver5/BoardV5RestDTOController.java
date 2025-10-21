package com.ohgiraffers.com.boardver5;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@CrossOrigin(origins = "http://localhost:8001")
@RestController
@RequestMapping("/restful/boardv5dto")
public class BoardV5RestDTOController {
    // POST 방식으로 DTO 받기
    @PostMapping("/user")
    public ResponseEntity<Map<String, String>> receiveUser(@RequestBody UserDTO userDTO) {
        var name = userDTO.getName();
        Map<String, String> response = new HashMap<>();
        response.put("message", "DTO로 받은 이름: " + name);
        return ResponseEntity.ok(response);
    }
}

