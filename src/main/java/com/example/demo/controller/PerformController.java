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

import com.example.demo.model.Account;
import com.example.demo.model.Perform;
import com.example.demo.repository.PerformRepository;
import com.example.demo.exception.*;

@RestController
@RequestMapping("/")

public class PerformController {
	@Autowired
	private PerformRepository performRep;
	
	@PostMapping(value = "get-perform")
    public List<Perform> getStock(@RequestBody Map<String,Object> map)
    {
		Long id = (Long) map.get("id");
		List<Perform> pers = performRep.getPerform(id);
		return pers;
    }
}
