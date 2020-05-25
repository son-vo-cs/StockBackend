package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.model.AppUser;
import org.springframework.data.repository.query.Param;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long>{
	
}
