package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

 public Product(Integer id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

private Integer id;

 private String name;

 private double price;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}


}
