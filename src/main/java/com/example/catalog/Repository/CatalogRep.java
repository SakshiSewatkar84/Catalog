package com.example.catalog.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.catalog.entity.CatalogEntity;
@Repository
public interface CatalogRep extends MongoRepository<CatalogEntity, String> {

}
