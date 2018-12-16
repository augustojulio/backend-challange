package com.invillia.acme.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.invillia.acme.model.Provider;

@Repository
public interface ProviderRepository extends MongoRepository<Provider, String>{
}