package com.rishan.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rishan.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
