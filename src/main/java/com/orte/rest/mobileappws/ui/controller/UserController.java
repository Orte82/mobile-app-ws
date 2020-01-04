package com.orte.rest.mobileappws.ui.controller;


import com.orte.rest.mobileappws.ui.model.request.UserDetailsRequestModel;
import com.orte.rest.mobileappws.ui.model.response.UserREST;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {

    @GetMapping
    public String getUser() {
        return "get user was called";
    }

    @PostMapping
    public UserREST createUser(@RequestBody UserDetailsRequestModel userDetails ) {
        return null;
    }

    @PutMapping
    public String updateUser() {
        return "Update user was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete user was called";
    }
}
