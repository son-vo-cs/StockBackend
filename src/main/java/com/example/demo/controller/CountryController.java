package com.example.demo.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.http.HttpStatus;
import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import com.example.demo.exception.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api/v1/")
public class CountryController {
	
	@Autowired
	private CountryRepository countryRep;
	
	@CrossOrigin(origins = "http://localhost:8080/api/v1")
	@GetMapping("/countries")
	public List<Country> getAllCountries()
	{
		
		List<Country> result = countryRep.findAll();
		System.out.println(result.size());
		return result;
	}
	
	@GetMapping("/country/{id}")
	public ResponseEntity<Country> getCountriesById(@PathVariable(value = "id") long countryId) throws ResourceNotFoundException
	{
		Country country = countryRep.findById(countryId).orElseThrow(
				() -> new ResourceNotFoundException("Not found id"));
//		Country country = countryRep.findCountryByNameVal(5L); 
		return ResponseEntity.ok().body(country);
	}
	
	@PostMapping("/countryTest")
	public List<Country> testCountry(@RequestBody Map<String, Object> map) throws ResourceNotFoundException
	{
//		Country country = countryRep.findById(countryId).orElseThrow(
//				() -> new ResourceNotFoundException("Not found id"));
		
		long population = ((Integer) map.get("population")).longValue();
		
		List<Country> country = countryRep.findCountryByNameVal(population); 
		return country;
	}
	
	
	
//	@GetMapping("/country/specific")
//	public ResponseEntity<Country> getCountriesByNameVal(String name, Long population) throws ResourceNotFoundException
//	{
//		List<Country >country = countryRep.findCountryByNameVal(population); 
//		return ResponseEntity.ok().body(country);
////		return ResponseEntity.ok().body(new Country());
//	}
	
	
//	@PostMapping(value = "countries", consumes = {"application/xml", "application/json"})
//	@RequestMapping(value = "countries", method = RequestMethod.POST,
//			consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
//			produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
//	@ResponseStatus(HttpStatus.OK)
//    public @ResponseBody Country createCountry(@RequestBody Country country)
////	public Country createCountry(@RequestBody Country country)
//	{
//		return this.countryRep.save(country);
//	}
	
	@PostMapping(value = "/countries")
    public Country createCountry(@RequestBody Country country)
    {
		return this.countryRep.save(country);
    }
	
	@PutMapping("countries/{id}")
	public ResponseEntity<Country> updateCountry(@PathVariable(value = "id") long countryId,
			@RequestBody Country countryDetail) throws ResourceNotFoundException
	{
		Country country = countryRep.findById(countryId).orElseThrow(
				() -> new ResourceNotFoundException("Not found id"));
		country.setCountryName(countryDetail.getCountryName());
		country.setPopulation(countryDetail.getPopulation());
		return ResponseEntity.ok(this.countryRep.save(country));
	}
	
	@DeleteMapping("countries/{id}")
	public Map<String, Boolean> deleteCountry(@PathVariable(value = "id") long countryId) throws ResourceNotFoundException
	{
		Country country = countryRep.findById(countryId).orElseThrow(
				() -> new ResourceNotFoundException("Not found id"));
		this.countryRep.delete(country);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	

}
