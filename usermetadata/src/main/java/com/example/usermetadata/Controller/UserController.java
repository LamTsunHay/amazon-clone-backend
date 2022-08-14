package com.example.usermetadata.Controller;

import com.example.usermetadata.Entity.UserMetaData;
import com.example.usermetadata.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/amazon/users/")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("saveUserDetails")
    public UserMetaData saveUserDetails(@RequestBody UserMetaData userData){
        UserMetaData user =  userService.saveUserMetaDataToDB(userData);
        return user;
    }

    @GetMapping("getUserDetails/{userId}")
    public UserMetaData getUserDetails(@PathVariable UUID userId){
        UserMetaData user =  userService.getUserMetaDataToDB(userId);
        return user;
    }
}
