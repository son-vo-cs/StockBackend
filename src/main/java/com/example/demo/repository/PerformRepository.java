package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Account;
import com.example.demo.model.Perform;
import org.springframework.data.repository.query.Param;

@Repository
public interface PerformRepository extends JpaRepository<Perform, Long>{
	@Query("SELECT perform FROM Perform perform where perform.id = :id")
	List<Account> getPerform(@Param("id") Long id);
}
