package com.auth0.example.controllers;

import com.auth0.example.security.Auth0Client;
import com.auth0.spring.security.auth0.Auth0JWTToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@Component
@RestController
public class ApiController {

    @Autowired
    private Auth0Client auth0Client;

    @RequestMapping("/secured/get")
    public String exampleGetRequest(Principal principal) {
        //for need of an example - look up som stuff via the Auth0 client that we have wired up separate from the Spring Security implementation
        return auth0Client.getUsername((Auth0JWTToken) principal);
    }

    @RequestMapping(value = "/secured/post", method = RequestMethod.POST)
    public void saveNewPost(Principal principal, @RequestBody Map<String, Object> payload) {
        //In this example we receive a JSON string, and Spring will pass it to us as a Map
        //Do something more interesting here...
        payload.forEach((key, value) -> System.out.print("key:" + key + ", value:" + value.toString()));
    }

}
