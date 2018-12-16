package com.invillia.acme.service;

import java.util.List;

import com.invillia.acme.model.Provider;

//defining all the methods that controller can access

public interface ProviderService {
 Provider createProvider(Provider provider);
 Provider updateProvider(String id, Provider provider);
 Provider deleteProvider(String id);
 Provider getProvider(String id);
 List<Provider> listProviders();
 
}