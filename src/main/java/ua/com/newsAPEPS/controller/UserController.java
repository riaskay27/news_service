package ua.com.newsAPEPS.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.newsAPEPS.entity.User;
import ua.com.newsAPEPS.service.UserService;

@RestController
@RequestMapping(value = "/app",
        produces = {MediaType.APPLICATION_JSON_VALUE})
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    private UserService service;

    public UserController(UserService userService) {
        this.service=userService;
    }

    @PostMapping()
    public ResponseEntity<Object> checkAdmin(@RequestBody User user){
        return new ResponseEntity<>(service.checkAdmin(user),HttpStatus.OK);
    }
}
