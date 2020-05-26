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
	@Query("SELECT coun FROM Country coun where coun.population >= :population")
	List<Country> findCountryByNameVal(@Param("population") Long population);
}


/*
 * 
 * check if email + pass is correct
	add fund
	subtract fund
	add deposit
	withdraw
*/
