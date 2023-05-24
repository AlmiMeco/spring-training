package com.cydeo.controller;

import com.cydeo.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/cydeo/apiv1")
public class ConsumeAPI_RestTemp {

//    URL (REST END-POINT) being CONSUMED
    private final String URL = "https://jsonplaceholder.typicode.com/users";
    private final RestTemplate restTemplate;


    public ConsumeAPI_RestTemp(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /* CONSUMING (JSON-PlaceHolder url (API) -> WE ARE NOW USING THIS API {localhost:8080/cydeo/apiv1} )*/

    @GetMapping
    public ResponseEntity<User[]> listAllUsers(){

        return restTemplate.getForEntity(URL, User[].class);

    }

    @GetMapping("{id}")
    public Object listSingleUserViaID(@PathVariable("id") Integer id){

        String url = URL + "/{id}"; // this will make our NEW url -> www.jsonpl..../{id}

        return restTemplate.getForObject(url, Object.class, id);

    }



}
