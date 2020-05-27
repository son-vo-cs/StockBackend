package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.model.Account;
import com.example.demo.model.Card;

import org.springframework.data.repository.query.Param;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	@Query("SELECT account FROM Account account where account.id = :id")
	List<Account> getStocks(@Param("id") Long id);
	
	@Modifying
	@Query("DELETE FROM Account account where account.id = :id AND account.symbol = :symbol")
	void remove(@Param("id") Long id, @Param("symbol") String symbol);
	
	
	@Modifying
	@Query("update Account account set account.shares = :shares where account.id = :id AND account.symbol = :symbol")
	void setShares(@Param("fund") float fund, @Param("id") Long id, @Param("symbol") String symbol);
	
}
