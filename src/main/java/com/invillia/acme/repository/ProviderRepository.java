package repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import model.Provider;

@Repository
public interface ProviderRepository extends MongoRepository<Provider,String>{
}