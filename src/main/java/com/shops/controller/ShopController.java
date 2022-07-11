package com.shops.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shops.dto.Card;
import com.shops.dto.Shop;
import com.shops.repository.CardRepository;
import com.shops.repository.ShopRepository;

@Component
@RestController
@RequestMapping(value = "/shopapp")
@CrossOrigin(origins = "http://localhost:4200")
public class ShopController {
	
	@Autowired
	private ShopRepository shopRepo;
	
	@Autowired
	private CardRepository cardRepo;
		
	@GetMapping(value = "/shoplist")
	public ResponseEntity<List<Shop>> getAllShops(){
		List<Shop> returnList = new ArrayList<>();
		returnList = shopRepo.findAll();
		
		if(!returnList.isEmpty()) {
			return new ResponseEntity<List<Shop>>(returnList,HttpStatus.OK);
		}
		else {
			System.out.println("Error in returnList");
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value = "/cardlist")
	public ResponseEntity<List<Card>> getAllCards(){
		List<Card> returnList = new ArrayList<>();
		returnList = cardRepo.findAll();
		
		if(!returnList.isEmpty()) {
			return new ResponseEntity<List<Card>>(returnList,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
	}
	
}
