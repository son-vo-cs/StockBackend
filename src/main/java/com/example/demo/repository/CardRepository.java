package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.AppUser;
import com.example.demo.model.Card;
import org.springframework.data.repository.query.Param;

@Repository
public interface CardRepository extends JpaRepository<Card, Long>{
	

}
