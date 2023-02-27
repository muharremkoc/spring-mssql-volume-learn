package com.example.springmssqlvolumelearn.repository;

import com.example.springmssqlvolumelearn.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
