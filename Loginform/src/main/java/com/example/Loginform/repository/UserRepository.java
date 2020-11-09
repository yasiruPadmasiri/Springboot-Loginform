package com.example.Loginform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Loginform.domain.User;

@Repository
public interface UserRepository  extends JpaRepository<User,Long>{

	User findByUsernameAndPassword(String username, String password);
	

}
