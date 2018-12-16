package com.invillia.acme.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;
import java.util.List;

@Document(collection="order_items")
public class OrderItem {

@Id
private String id;
private String description;
private String unitPrice;
private String quantity;


public String getId() {
     return id;
}

public void setId(String id) {
     this.id = id;
}

 public String getDescription(){
     return description;
}

public void setDescription(String description) {
     this.description = description;
}

public String getUnitPrice() {
     return unitPrice;
}

public void setUnitPrice(String unitPrice) {
     this.unitPrice = unitPrice;
}

 public String getQuantity() {
     return quantity;
 }

 public void setQuantity(String quantity) {
     this.quantity = quantity;
 }


}



