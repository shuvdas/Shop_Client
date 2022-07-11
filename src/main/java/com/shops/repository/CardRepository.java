package com.shops.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shops.dto.Card;

public interface CardRepository extends JpaRepository<Card, Long>{
	
	public List<Card> findAll();
	
}
