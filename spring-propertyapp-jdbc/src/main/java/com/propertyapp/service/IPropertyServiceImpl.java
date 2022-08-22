package com.propertyapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.propertyapp.model.Property;
import com.propertyapp.repository.IPropertyRepository;

@Service
public class IPropertyServiceImpl implements IPropertyService{
	private IPropertyRepository propertyRepository;
	
	@Autowired
	 public void setPropertyRepository(IPropertyRepository propertyRepository) {
		 this.propertyRepository=propertyRepository;
	 }
	 

	@Override
	public void addProperty(Property property) {
		propertyRepository.addProperty(property);
	}

	@Override
	public void updateProperty(double rentAmount,Integer propertyId) {
		propertyRepository.updateProperty(rentAmount, propertyId);
	}

	@Override
	public void deleteProperty(Integer propertyId) {
		propertyRepository.deleteProperty(propertyId);
	}

	@Override
	public List<Property> getByPropertyName(String propertyName) {
		return propertyRepository.findByPropertyName(propertyName);
	}

	@Override
	public List<Property> getByType(String type) {
		return propertyRepository.findByType(type);
	}

	@Override
	public List<Property> getByCity(String city) {
		return propertyRepository.findByCity(city);
	}

	@Override
	public List<Property> getByRentAmount(double rentAmount) {
		return propertyRepository.findByRentAmount(rentAmount);
	}

	@Override
	public List<Property> getAll() {
		return propertyRepository.findAll();
	}

	@Override
	public Property getByPropertyId(Integer propertyId) {
		return propertyRepository.findByPropertyId(propertyId);
	}

}
