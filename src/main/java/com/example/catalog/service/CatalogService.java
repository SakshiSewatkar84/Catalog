package com.example.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalog.Repository.CatalogRep;
import com.example.catalog.entity.CatalogEntity;
@Service
public class CatalogService {
	@Autowired
	private CatalogRep catalogRep;
	
	public CatalogEntity createOrder(CatalogEntity catalogEntity) {
		return catalogRep.save(catalogEntity);
		
	}
	public List<CatalogEntity> getAllOrder()
	{
		return catalogRep.findAll();
	}
	
	public CatalogEntity getOrderById(String id) {
		return catalogRep.findById(id).orElse(null);
	}
	
	public String deleteById(String id) {
		catalogRep.deleteById(id);
		return "ORDER IS DELETED : "+id;
	}

}
