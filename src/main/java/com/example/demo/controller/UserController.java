package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.http.HttpStatus;
import com.example.demo.model.AppUser;
import com.example.demo.repository.UserRepository;
import com.example.demo.exception.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.demo.cors.Cors;
@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserRepository userRep;
	
	@CrossOrigin(origins = Cors.host)
	@PostMapping("login")
	public List<AppUser> login(@RequestBody Map<String, Object> map) throws ResourceNotFoundException
	{
		
		String email = (String) map.get("email");
		String pass = (String) map.get("password");
		List<AppUser> users = userRep.login(email,  pass); 
		return users;
	}
	
	@CrossOrigin(origins = Cors.host)
	@PostMapping("check-valid-user")
	public Map<String, Boolean> checkUser(@RequestBody Map<String, Object> map) throws ResourceNotFoundException
	{
		
		String email = (String) map.get("email");
		List<AppUser> users = userRep.checkUser(email); 
		Map<String, Boolean> result = new HashMap<String, Boolean>();
		if (users == null || users.size() < 1)
			result.put("result", true);
		else
			result.put("result", false);
		return result;
	}
	
	@CrossOrigin(origins = Cors.host)
	@PostMapping(value = "register")
    public AppUser createUser(@RequestBody AppUser user)
    {
		return this.userRep.save(user);
    }

	@CrossOrigin(origins = Cors.host)
	@PutMapping("set-fund")
	public void setFund(@RequestBody Map<String, Object> map) throws ResourceNotFoundException
	{
		
		float fund = ((Float) map.get("fund")).floatValue();
		long id = ((Long) map.get("id")).longValue();
		userRep.setFun(fund, id);
	}
	
	
	
	

		
	
}
