package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.model.Country;
import org.springframework.data.repository.query.Param;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{
	@Query("SELECT coun.countryName, coun.population FROM Country coun where coun.countryName = :name "
			+ "AND coun.population = :population" )
	Country findCountryByNameVal(@Param("name") String name, @Param("population") Long population);

}
