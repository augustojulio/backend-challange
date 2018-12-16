
package com.invillia.acme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.invillia.acme.model.Provider;

import com.invillia.acme.repository.ProviderRepository;

//implementing the business rules

@Service
public class ProviderServiceImpl implements ProviderService {

@Autowired
 private ProviderRepository providerRepository;

@SuppressWarnings("finally")
 private Provider findOne(String Id) {

 Provider instance = null;
  try {
   List < Provider > providerList = providerRepository.findAll();
   for (Provider provider: providerList) {
    if (provider.getId().equals(Id)) {
     instance = provider;
     break;
    }
   }
  } catch(Exception e) {
   e.printStackTrace();
  } finally {
   return instance;
  }
 }

@Override
 public Provider createProvider(Provider provider) {
  return providerRepository.save(provider);
 }

@Override
 public List < Provider > listProviders() {
  return providerRepository.findAll();
 }

@Override
 public Provider updateProvider(String id, Provider provider) {
  Provider updateInstance = this.findOne(id);
  updateInstance.setName(provider.getName());
  updateInstance.setName(provider.getAddress());
  return providerRepository.save(updateInstance);
}

@Override
 public Provider deleteProvider(String id) {
  Provider instance = findOne(id);
  providerRepository.delete(instance);
  return instance;
}
@Override
 public Provider getProvider(String id) {

//return providerRepository.findById(id).get();
  return this.findOne(id);
 }
 
}