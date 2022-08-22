package com.propertyapp.util;

public class DBQueries {

	public static final String INSERTQUERY=
			"INSERT INTO PROPERTY(property_Type,property_Name,city,property_Id,rent_Amount) values(?,?,?,?,?)";
	public static final String UPDATEQUERY="UPDATE PROPERTY SET rent_Amount=? WHERE property_Id=?" ;
	public static final String DELETEQUERY="DELETE FROM PROPERTY  WHERE property_Id=?"; 
	
	public static final String SELECTQUERY="SELECT * FROM PROPERTY";
	public static final String SELECTBYTYPE="SELECT * FROM PROPERTY WHERE PROPERTY_TYPE=?";
	public static final String SELECTBYPROPERTYNAME="SELECT * FROM PROPERTY WHERE PROPERTY_NAME=?";
	public static final String SELECTBYCITY="SELECT * FROM PROPERTY WHERE CITY=?";
	public static final String SELECTBYPROPERTYID="SELECT * FROM PROPERTY WHERE PROPERTY_ID=? ";
	public static final String SELECTBYRENTAMOUNT="SELECT * FROM PROPERTY WHERE RENT_AMOUNT=? ";
	
	
}
