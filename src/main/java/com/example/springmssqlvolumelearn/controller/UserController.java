package com.example.springmssqlvolumelearn.controller;

import com.example.springmssqlvolumelearn.domain.User;
import com.example.springmssqlvolumelearn.model.UserRequestDto;
import com.example.springmssqlvolumelearn.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/service/user")
public class UserController {

     final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("")
    public User create(@RequestBody UserRequestDto userRequestDto){
        return userService.create(userRequestDto);
    }
    @GetMapping("/{id}")
    public User get(@PathVariable("id") int id) throws Exception {
        return userService.get(id);
    }
    @PatchMapping("/{id}")
    public User update(@PathVariable("id") int id,@RequestBody UserRequestDto userRequestDto) throws Exception {
        return userService.update(id, userRequestDto);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) throws Exception {
        userService.delete(id);
    }
}
