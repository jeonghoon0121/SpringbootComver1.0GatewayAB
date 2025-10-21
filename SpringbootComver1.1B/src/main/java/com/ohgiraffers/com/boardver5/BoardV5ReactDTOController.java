package com.ohgiraffers.com.boardver5;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BoardV5ReactDTOController {

    @PostMapping("/upload")
    public ResponseEntity<String> receiveJson(@RequestBody UserDTO userDTO) {
        System.out.println("받은 이름: " + userDTO.getName());
        return ResponseEntity.ok("JSON 수신 완료: " + userDTO.getName());
    }

}
