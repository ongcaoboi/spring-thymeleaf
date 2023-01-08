package com.sbst.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbst.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User getByUsername(String username);
}
