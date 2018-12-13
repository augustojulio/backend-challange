package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Provider;
import service.ProviderService;

@RestController@RequestMapping("/providers")
public class ProviderServiceController {

@Autowired
 private ProviderService providerService;

@RequestMapping(method = RequestMethod.POST)
 public Provider createProvider(@RequestBody Provider provider) {

return providerService.createProvider(provider);
}

@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
 public Provider updateProvider(@PathVariable String id, @RequestBody Provider provider) {
  return providerService.updateProvider(id, provider);
 }

@RequestMapping(method = RequestMethod.GET)
 public List < Provider > listProviders() {
  return providerService.listProviders();
}

@RequestMapping(value = "/{id}", method = RequestMethod.GET)
 public Provider getProvider(@PathVariable String id) {
  return providerService.getProvider(id);
}

@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
 public Provider deleteProvider(@PathVariable String id) {
  return providerService.deleteProvider(id);
 }
}