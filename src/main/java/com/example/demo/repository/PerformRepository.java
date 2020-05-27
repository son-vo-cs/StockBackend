package com.example.demo.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Perform;
import org.springframework.data.repository.query.Param;

@Repository
public interface PerformRepository extends JpaRepository<Perform, Long>{
	@Query("SELECT perform FROM Perform perform where perform.id = :id ORDER BY perform.date ASC")
	List<Perform> getPerform(@Param("id") Long id);
	
	
	
}
