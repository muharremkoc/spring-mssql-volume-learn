package com.example.springmssqlvolumelearn.service;

import com.example.springmssqlvolumelearn.domain.User;
import com.example.springmssqlvolumelearn.model.UserRequestDto;

import java.util.List;

public interface UserService {

    User create(UserRequestDto userRequestDto);
    User update(int id,UserRequestDto userRequestDto) throws Exception;

    User get(int id) throws Exception;

    void delete(int id) throws Exception;

    List<User> getUsers();
}
