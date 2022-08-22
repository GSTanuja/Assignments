package com.propertyapp.model;

public class Property {
	private String type;
	private String propertyName;
	private String city;
	private Integer propertyId;
	private double rentAmount;
	
	
	public Property() {
		super();
	}
	public Property(String type, String propertyName, String city, Integer propertyId, double rentAmount) {
		super();
		this.type = type;
		this.propertyName = propertyName;
		this.city = city;
		this.propertyId = propertyId;
		this.rentAmount = rentAmount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}
	public double getRentAmount() {
		return rentAmount;
	}
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	@Override
	public String toString() {
		return "Property [type=" + type + ", propertyName=" + propertyName + ", city=" + city + ", propertyId="
				+ propertyId + ", rentAmount=" + rentAmount + "]";
	}
	
	

}
