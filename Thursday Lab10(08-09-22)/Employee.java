package com.emp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Setter	 // if we require only setter()
//@Getter	 //if we require only getter()
@Data	//it will annotate getter(),setter(),toString(),equals(),hashCode() these are all included
@AllArgsConstructor	 //it will annotate all parameterized constructor
@NoArgsConstructor	//it will annotate default constructor
@Builder
public class Employee 
{
	private long empId;
	private String empName;
	private double empSal;	//month take home
	
	//entity reference
	Address address;	//HAS-A relationship/association
	
}

