package com.emp.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.assertj.core.api.Assertions.*;

import com.emp.entity.Address;
import com.emp.entity.Employee;
import com.emp.exception.GlobalException;

@TestMethodOrder(value = OrderAnnotation.class)
class EmployeeServiceTest
{
	EmployeeService employeeService;
	static List<Employee> emplist;
	
	
	@BeforeAll
	static void init()
	{
		emplist = new ArrayList<Employee>();
	}
	
	@BeforeEach
	void setUp() throws Exception
	{
		employeeService = new EmployeeService();
	}

	@AfterEach
	void tearDown() throws Exception
	{
		employeeService=null;
		System.out.println("object is garbage collected");
	}
	
	@Test
	@DisplayName("testing add emplyee method")
	@Order(1)
	public void testAddEmployee()
	{
		//1st way
		employeeService.addEmployee(101, "Islam", 30000, "Dhanbad", "India");
		employeeService.addEmployee(102, "Suraj", 20000, "Dhanbad", "India");
		//assertEquals(2, employeeService.lengthOfList());
		int length =employeeService.lengthOfList();
		assertThat(length>0).isTrue();
	
							
		//2nd way with using builder
		Address add=Address.builder().city("kolkata").country("India").build();			
		Employee emp=Employee.builder().empId(101).empName("chandan").empSal(30000).address(add).build();
			
		employeeService.addEmp(emp);
		int length1 =employeeService.lengthOfList();
		assertThat(length1>0).isTrue();
		}
	
	@Test
	@DisplayName("test case for display ")
	@Order(2)
	public void testDisplayEmpById() throws GlobalException
	{
		Address add=Address.builder().city("Delhi").country("India").build();			
		Employee emp=Employee.builder().empId(102).empName("Sunny").empSal(50000).address(add).build();
		employeeService.addEmp(emp);
		
	Employee e = employeeService.displayEmpById(102);
	//assertEquals("Sunny", e.getEmpName());
	assertThat(e.getEmpSal()).isEqualTo(50000.00);
	}
	
	@Test
	@DisplayName("test case for calculate appraisal")
	@Order(value = 4)
	public void testCalculateAppraisal()
	{
		employeeService.addEmployee(101, "Islam", 200000, "Dhanbad", "India");
		double appraisal = employeeService.calculateAppraisalById(101);
		//assertEquals(2000, appraisal);
		assertThat(appraisal).isEqualTo(2000);
	}
	
	@Test
	@DisplayName("test case for calculate yearly salary")
	@Order(6)
	public void testcalculateYearlySalary()
	{
		employeeService.addEmployee(101, "Islam", 200000, "Dhanbad", "India");
		double salary = employeeService.calculateYearlySalary(0);
		//assertEquals(0, salary);
		assertThat(salary).isEqualTo(0.0);
		
	}
	
	@Test
	@DisplayName("test case for delete employees")
	@Order(5)
	public void testdeleteAllEmployee() 
	{
		String msg = employeeService.deleteAllEmployee();
		assertEquals("All employees deleted successfully", employeeService.deleteAllEmployee());
	}
	
	
	@Test
	@DisplayName("test case for update employee")
	@Order(value=3)
	public void testUpdateEmp() throws GlobalException
	{
		employeeService.addEmployee(101, "Islam", 200000, "Dhanbad", "India");
		Employee emp = employeeService.findId(101);
		emp.setEmpName("Islam");
		
		Employee updateEmp = employeeService.updateEmployee(0, emp);
		assertEquals("Islam", updateEmp.getEmpName());
		assertThat(updateEmp.getEmpName()).isEqualTo("Islam");
	}
}

