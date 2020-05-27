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
import com.example.demo.repository.AccountRepository;
import com.example.demo.exception.*;

@RestController
@RequestMapping("/")
public class AccountController {
	@Autowired
	private AccountRepository accRep;
	
	@PostMapping(value = "get-stocks")
    public List<Account> getStock(@RequestBody Map<String,Object> map)
    {
		Long id = (Long) map.get("id");
		List<Account> accs = accRep.getStocks(id);
		return accs;
    }
	
	
	@DeleteMapping("remove-stock")
	public void deleteStock(@RequestBody Map<String,Object> map) throws ResourceNotFoundException
	{
		Long id = (Long) map.get("cid");
		String symbol = (String) map.get("symbol");
		accRep.remove(id, symbol);
		
	}
	
	@PutMapping("set-shares")
	public void setFund(@RequestBody Map<String, Object> map) throws ResourceNotFoundException
	{
		
		Integer shares = (Integer) map.get("fund");
		Long id = (Long) map.get("id");
		String symbol = (String) map.get("symbol");
		accRep.setShares(shares, id, symbol);
	}
}
