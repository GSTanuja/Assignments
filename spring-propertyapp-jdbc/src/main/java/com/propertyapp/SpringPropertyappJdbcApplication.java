package com.propertyapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.propertyapp.model.Property;
import com.propertyapp.service.IPropertyService;

@SpringBootApplication
public class SpringPropertyappJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringPropertyappJdbcApplication.class, args);
	}
	IPropertyService propertyService;
	
  @Autowired
	public void setPropertyService(IPropertyService propertyService) {
		this.propertyService = propertyService;
	}


	@Override
	public void run(String... args) throws Exception {
		Property property=new Property("unfurnished","Girls","Mumbai",5,45000);
		//propertyService.addProperty(property);
		propertyService.getAll().forEach(System.out::println);
		propertyService.getByPropertyName("Family").forEach(System.out::println);
		propertyService.getByType("fullyfurnished").forEach(System.out::println);
		propertyService.getByCity("Chennai").forEach(System.out::println);
		propertyService.getByPropertyId(4);
		
		propertyService.updateProperty(4,90000 );
		//propertyService.deleteProperty(5);
	}

}
