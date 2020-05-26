package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.model.AppUser;
import com.example.demo.model.Country;

import org.springframework.data.repository.query.Param;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long>{
	@Query("SELECT user FROM AppUser user where user.email = :email AND user.password = :password")
	List<AppUser> login(@Param("email") String email, @Param("password") String pass);
}


/*
 * 
 * check if email + pass is correct
	add fund
	subtract fund
	add deposit
	withdraw
*/
