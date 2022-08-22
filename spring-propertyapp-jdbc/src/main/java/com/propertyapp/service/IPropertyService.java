package com.propertyapp.service;

import java.util.List;

import com.propertyapp.model.Property;

public interface IPropertyService {

	void addProperty(Property property);
	void updateProperty(double rentAmount,Integer propertyId);
	void deleteProperty(Integer propertyId);
	
	List<Property> getByPropertyName(String propertyName);
	List<Property> getByType(String type);
	List<Property> getByCity(String city);
	List<Property> getByRentAmount(double rentAmount);
	List<Property> getAll();
	Property getByPropertyId(Integer propertyId);
	
}
