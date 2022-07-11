package com.shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shops.dto.User;

public interface UserRepository extends JpaRepository<User, Long>{

//	public void save(User user) {};
	
}
