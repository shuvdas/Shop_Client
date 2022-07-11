package com.shops.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shops.dto.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long>{

	List<Shop> findAll();
	
}
