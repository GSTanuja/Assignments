package com.propertyapp.repository;

import java.util.List;

import com.propertyapp.model.Property;

public interface IPropertyRepository {

	void addProperty(Property property);
	void updateProperty(double rentAmount,Integer propertyId);
	void deleteProperty(Integer propertyId);
	
	List<Property> findByPropertyName(String propertyName);
	List<Property> findByType(String type);
	List<Property> findByCity(String city);
	List<Property> findByRentAmount(double rentAmount);
	List<Property> findAll();
	Property findByPropertyId(Integer propertyId);
	
			
}
