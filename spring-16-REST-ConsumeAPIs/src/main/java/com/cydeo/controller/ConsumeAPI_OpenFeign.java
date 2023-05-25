package com.cydeo.controller;

import com.cydeo.client.EmployeeClient;
import com.cydeo.client.UserClient;
import com.cydeo.dto.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumeAPI_OpenFeign {

    private final UserClient userClient;
    private final EmployeeClient employeeClient;

    public ConsumeAPI_OpenFeign(UserClient userClient, EmployeeClient employeeClient) {
        this.userClient = userClient;
        this.employeeClient = employeeClient;
    }

    @GetMapping("/api/v1/users")
    public ResponseEntity<ResponseWrapper> getUsers(){

        return ResponseEntity.ok(new ResponseWrapper("User List Accessed" , userClient.getUsers()));

    }
    @GetMapping("/api/v1/employee")
    public ResponseEntity<ResponseWrapper> getEmp(){
//        Consuming APIs with Security (app-id :: header)                                                              vvv- app-id (passPhrase)
        return ResponseEntity.ok(new ResponseWrapper("Employee Retrieved", employeeClient.getEmp("6298ebfecd0551211fce37a6")));

    }

}
