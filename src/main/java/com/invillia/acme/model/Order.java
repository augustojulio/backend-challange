package com.invillia.acme.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;
import java.util.List;

@Document(collection="orders")
public class Order {

@Id
private String id;
private String address;
private String confirmationDate;
private String status;

private List<OrderItem> items = new ArrayList<OrderItem>();

public String getId() {
     return id;
}

public void setId(String id) {
     this.id = id;
}

 public String getAddress(){
     return address;
}

public void setAddress(String address) {
     this.address = address;
}

public String getConfirmationDate() {
     return confirmationDate;
}

public void setConfirmationDate(String confirmationDate) {
     this.confirmationDate = confirmationDate;
}

 public String getStatus() {
     return status;
 }

 public void setStatus(String status) {
     this.status = status;
 }

 public List<OrderItem> getItems() {
    return items;
 }

public void setItems(List<OrderItem> items) {
    this.items = items;
 }

}



