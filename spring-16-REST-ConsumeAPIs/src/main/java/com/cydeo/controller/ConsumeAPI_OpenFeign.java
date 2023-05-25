package com.cydeo.controller;

import com.cydeo.client.UserClient;
import com.cydeo.dto.ResponseWrapper;
import com.cydeo.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumeAPI_OpenFeign {

    private final UserClient userClient;

    public ConsumeAPI_OpenFeign(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("/api/v1/users")
    public ResponseEntity<ResponseWrapper> getUsers(){

        return ResponseEntity.ok(new ResponseWrapper("User List Accessed" , userClient.getUsers()));

    }

}
