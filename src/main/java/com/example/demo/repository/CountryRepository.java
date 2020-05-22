package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.model.Country;
import org.springframework.data.repository.query.Param;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{
	@Query("SELECT coun FROM Country coun where coun.population = :population")
	Country findCountryByNameVal(@Param("population") Long population);

}
