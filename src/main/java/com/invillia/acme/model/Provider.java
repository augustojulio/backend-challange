package com.invillia.acme.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="providers")
public class Provider {

@Id
 private String id;
 private String name;
 private String address;

 public String getId() {
     return id;
 }

 public void setId(String id) {
     this.id = id;
 }

 public String getName(){
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getAddress() {
     return address;
 }

 public void setAddress(String address) {
     this.address = address;
 }

}

