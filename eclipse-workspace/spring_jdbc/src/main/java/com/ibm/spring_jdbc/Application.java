package com.ibm.spring_jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
	public static void main( String[] args )
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc.xml");
		
		EmployeeJDBCTemplate employeeJDBCTemplate = (EmployeeJDBCTemplate) context.getBean("employeeJDBCTemplate");
		
		System.out.println("------------Records Creations-----------");
//		employeeJDBCTemplate.create("Aniket", "Sahoo", 34859);
//		employeeJDBCTemplate.create("Rishek", "kumar", 33000);
//		employeeJDBCTemplate.create("Abhishek", "Dutt", 20859);
//		employeeJDBCTemplate.create("Payal", "kapgate", 30000);
		
//		System.out.println("-------Listing Myltipule Records------");
//		List<Employee> employees = employeeJDBCTemplate.listEmployee();
//		
//		for (Employee employee : employees) {
//		System.out.println("Get Employee ID");
//		Employee employee = employeeJDBCTemplate.getEmployee(2);
//		System.out.print("ID : " + employee.getId() );
//			
//		System.out.print(", First Name : " + employee.getFirstName() );
//			
//		System.out.print(", Last Name : " + employee.getLastName() );
//			
//		System.out.println(", Salary : " + employee.getSalary() );
//		//}

//		System.out.println("Delete Employee by ID");
//		employeeJDBCTemplate.delete(2);

        System.out.println("Update Employee by ID");
        employeeJDBCTemplate.update(1, "Amrit", "Kumar");
	}
}