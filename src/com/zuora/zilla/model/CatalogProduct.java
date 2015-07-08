package com.zuora.zilla.model;

import java.util.ArrayList;

import org.codehaus.jackson.annotate.JsonProperty;

public class CatalogProduct {

	private String id;
	private String name = "";
	private String description = "";
	private ArrayList<CatalogRatePlan> ratePlans;
	private String category;
	private String productCategories__c;

	@JsonProperty("Id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("Description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("ratePlans")
	public ArrayList<CatalogRatePlan> getRatePlans() {
		return ratePlans;
	}

	public void setRatePlans(ArrayList<CatalogRatePlan> ratePlans) {
		this.ratePlans = ratePlans;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getCategory() {
		return this.category;
	}

	public void setProductCategories__c(String productCategories__c) {
		this.productCategories__c = productCategories__c;
	}
	
	public String getProductCategories__c() {
		return this.productCategories__c;
	}
}
