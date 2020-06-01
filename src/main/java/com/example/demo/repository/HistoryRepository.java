package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Account;
import com.example.demo.model.History;
import org.springframework.data.repository.query.Param;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long>{
	
	@Modifying
	@Query("DELETE FROM History his where his.id = :id AND his.symbol = :symbol")
	void remove(@Param("id") Long id, @Param("symbol") String symbol);
	
	
}
