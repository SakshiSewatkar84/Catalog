package com.example.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalog.entity.CatalogEntity;
import com.example.catalog.service.CatalogService;

@RestController
@RequestMapping("/order")
public class CatalogController {
	@Autowired
	private CatalogService catalogService;
	
	@PostMapping("/create")
	public CatalogEntity create(@RequestBody CatalogEntity catalogEntity ){
		return catalogService.createOrder(catalogEntity);
	}
	
	@GetMapping("/getorder")
	public List<CatalogEntity> get(){
		return catalogService.getAllOrder();
	}
	
	@GetMapping("/{id}")
	public CatalogEntity find(@PathVariable String id) {
		return catalogService.getOrderById(id);
	}
	@DeleteMapping("/{id}")
	public String deleteId(@PathVariable String id) {
		return catalogService.deleteById(id);
	}
	
}
