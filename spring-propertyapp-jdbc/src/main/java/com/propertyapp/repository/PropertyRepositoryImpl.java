package com.propertyapp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.propertyapp.model.Property;
import com.propertyapp.util.DBQueries;

@Repository
public class PropertyRepositoryImpl implements IPropertyRepository {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addProperty(Property property) {
		Object[] propertyArray= {property.getType(),property.getPropertyName(),property.getCity(),property.getPropertyId(),property.getRentAmount()};
		jdbcTemplate.update(DBQueries.INSERTQUERY,propertyArray);


	}

	@Override
	public void updateProperty( double rentAmount,Integer propertyId) {
		System.out.println("update query");
		String sql=DBQueries.UPDATEQUERY;
		jdbcTemplate.update(sql,propertyId,rentAmount);
	}
	

	@Override
	public void deleteProperty(Integer propertyId) {
		jdbcTemplate.update(DBQueries.DELETEQUERY,propertyId);
	}

	@Override
	public List<Property> findByPropertyName(String propertyName) {
		
		List<Property> properties=jdbcTemplate.query(DBQueries.SELECTBYPROPERTYNAME,
				( rs,rowNum)->{
					Property aproperty=new Property();
					aproperty.setPropertyName(rs.getString("property_Name"));
					aproperty.setType(rs.getString("property_Type"));
					aproperty.setCity(rs.getString("city"));
					aproperty.setRentAmount(rs.getDouble("rent_Amount"));
					aproperty.setPropertyId(rs.getInt("property_Id"));
					
						return aproperty;
				
				},propertyName);
		return properties;
		
	
	}

	@Override
	public List<Property> findByType(String type) {
		
		List<Property> properties=jdbcTemplate.query(DBQueries.SELECTBYTYPE,
				( rs,rowNum)->{
					Property nproperty=new Property();
					nproperty.setPropertyName(rs.getString("property_Name"));
					nproperty.setType(rs.getString("property_Type"));
					nproperty.setCity(rs.getString("city"));
					nproperty.setRentAmount(rs.getDouble("rent_Amount"));
					nproperty.setPropertyId(rs.getInt("property_Id"));
					
						return nproperty;
				
				},type);
		return properties;
		
	}

	@Override
	public List<Property> findByCity(String city) {
		
		List<Property> properties=jdbcTemplate.query(DBQueries.SELECTBYCITY,
				( rs,rowNum)->{
					Property mproperty=new Property();
					
					mproperty.setPropertyName(rs.getString("property_Name"));
					mproperty.setType(rs.getString("property_Type"));
					mproperty.setRentAmount(rs.getDouble("rent_Amount"));
					mproperty.setCity(rs.getString("city"));
					mproperty.setPropertyId(rs.getInt("property_Id"));

					return mproperty;
				
			}, city);
			return properties;
}
	

	@Override
	public List<Property> findByRentAmount(double rentAmount) {
		List<Property> properties=jdbcTemplate.query(DBQueries.SELECTBYRENTAMOUNT,
				( rs,rowNum)->{
					Property rproperty=new Property();
					
					rproperty.setPropertyName(rs.getString("property_Name"));
					rproperty.setType(rs.getString("property_Type"));
					rproperty.setRentAmount(rs.getDouble("rent_Amount"));
					rproperty.setCity(rs.getString("city"));
					rproperty.setPropertyId(rs.getInt("property_Id"));

					return rproperty;
				
			}, rentAmount);
			return properties;
		
	}

	@Override
	public List<Property> findAll() {
		RowMapper<Property> mapper=new PropertyMapper();
		List<Property> propertiess=jdbcTemplate.query(DBQueries.SELECTQUERY, mapper);
		return propertiess;
	}
		

	@Override
	public Property findByPropertyId(Integer propertyId) {
		
		Property property=jdbcTemplate.queryForObject(DBQueries.SELECTBYPROPERTYID,
				( rs,rowNum)->{
					Property pproperty=new Property();

					pproperty.setPropertyName(rs.getString("property_Name"));
					pproperty.setType(rs.getString("property_Type"));
					pproperty.setRentAmount(rs.getDouble("rent_Amount"));
					pproperty.setCity(rs.getString("city"));
					pproperty.setPropertyId(rs.getInt("property_Id"));

					return pproperty;
				},propertyId);
		
		return property;
	}
		
}
