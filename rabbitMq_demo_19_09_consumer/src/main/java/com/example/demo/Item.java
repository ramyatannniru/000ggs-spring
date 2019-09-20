package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,property = "@id",scope = Item.class)
@Data
@ToString
@NoArgsConstructor
public class Item {
    private String itemName;
    private String category;
    private String description;
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", category=" + category + ", description=" + description + "]";
	}
	public Item(String itemName, String category, String description) {
		super();
		this.itemName = itemName;
		this.category = category;
		this.description = description;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
}