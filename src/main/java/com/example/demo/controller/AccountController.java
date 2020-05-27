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
    public List<Account> getStock(@RequestBody Map<Account,Object> map)
    {
		Long id = (Long) map.get("id");
		List<Account> accs = accRep.getStocks(id);
		return accs;
    }
	
	
	@DeleteMapping("remove-card")
	public Map<String, Boolean> deleteCountry(@RequestBody Map<String,Object> map) throws ResourceNotFoundException
	{
		String id = (String) map.get("cid");
		List<Card> cards = cardRep.findCard(id);
		Map<String, Boolean> result = new HashMap<String,Boolean>();
		if (cards == null || cards.size() == 0)
			result.put("result", false);
		else
		{
			this.cardRep.delete(cards.get(0));
			result.put("result", true);
		}
		return result;
		
	}
}
