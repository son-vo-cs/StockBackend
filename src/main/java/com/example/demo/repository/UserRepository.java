package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.model.AppUser;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Modifying;
@Repository
public interface UserRepository extends JpaRepository<AppUser, Long>{
	@Query("SELECT user FROM AppUser user where user.email = :email AND user.password = :password")
	List<AppUser> login(@Param("email") String email, @Param("password") String pass);
	
	@Modifying
	@Query("update AppUser u set u.fund = :fund where u.id = :id")
	void setFun(@Param("fund") float fund, @Param("id") long id);
	
	
	
	
	
}


/*
 * 
 * check if email + pass is correct.. 
	add fund........
	subtract fund......
	add deposit
	withdraw........
*/
