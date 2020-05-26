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
import com.example.demo.repository.CountryRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.exception.*;

@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserRepository userRep;
	
	

}
