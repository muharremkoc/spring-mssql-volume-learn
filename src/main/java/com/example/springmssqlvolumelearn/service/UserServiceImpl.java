package com.example.springmssqlvolumelearn.service;

import com.example.springmssqlvolumelearn.domain.User;
import com.example.springmssqlvolumelearn.model.UserRequestDto;
import com.example.springmssqlvolumelearn.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(UserRequestDto userRequestDto) {
        User user=new User();
        user.setUsername(userRequestDto.getUsername());
        return userRepository.save(user);
    }

    @Override
    public User update(int id, UserRequestDto userRequestDto) throws Exception {
        User currentUser = userRepository.findById(id).get();
        if (currentUser == null) throw new Exception(" User Not Founded");
        currentUser.setUsername(userRequestDto.getUsername());
        return userRepository.save(currentUser);
    }

    @Override
    public User get(int id) throws Exception {
        User currentUser = userRepository.findById(id).get();
        if (currentUser == null) throw new Exception(" User Not Founded");
        return currentUser;
    }

    @Override
    public void delete(int id) throws Exception {
        User currentUser = userRepository.findById(id).get();
        if (currentUser == null) throw new Exception(" User Not Founded");
        userRepository.delete(currentUser);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
