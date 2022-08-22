package com.propertyapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.propertyapp.model.Property;

public class PropertyMapper implements RowMapper<Property> {

	@Override
	public Property mapRow(ResultSet rs, int rowNum) throws SQLException {
		String type=rs.getString("property_Type");
		String propertyName=rs.getString("property_Name");
		String city=rs.getString("city");
		Integer propertyId=rs.getInt("property_Id");
		double rentAmount=rs.getDouble("rent_Amount");
		
		Property property=new Property();
		property.setPropertyName(propertyName);
		property.setType(type);
		property.setCity(city);
		property.setRentAmount(rentAmount);
		property.setPropertyId(propertyId);

		return property;
	}

}
