package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.model.History;
import org.springframework.data.repository.query.Param;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long>{

}
