package com.cydeo.client;

import com.cydeo.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

                            /** HOW WE CONSUME (REST) APIs USING OpenFeign **/

@FeignClient(url = "https://jsonplaceholder.typicode.com" , name = "USER-CLIENT")
// @FeignClient annotate w/ REST endpoint (API source)

public interface UserClient {

    @GetMapping("/users")
    List<User> getUsers();


}
