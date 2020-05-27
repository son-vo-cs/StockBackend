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

import com.example.demo.model.Country;
import com.example.demo.model.History;
import com.example.demo.repository.HistoryRepository;
import com.example.demo.exception.*;

@RestController
@RequestMapping("/")
public class HistoryController {
	@Autowired
	private HistoryRepository hisRep;
	
	@DeleteMapping("remove-history")
	public void deleteHistory(@RequestBody Map<String,Object> map) throws ResourceNotFoundException
	{
		Long id = (Long) map.get("cid");
		String symbol = (String) map.get("symbol");
		hisRep.remove(id, symbol);
		
	}
	
	
	@PostMapping(value = "add-history")
    public History addHistory(@RequestBody History his)
    {
		return this.hisRep.save(his);
    }
	
}
