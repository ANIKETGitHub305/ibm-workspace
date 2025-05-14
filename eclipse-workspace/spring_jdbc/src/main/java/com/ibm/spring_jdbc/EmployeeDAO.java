package com.ibm.spring_jdbc;

import java.util.List;

import javax.sql.DataSource;

public interface EmployeeDAO {
		   
		   public void setDataSource(DataSource ds);
		   
		   
		   public void create(String FIRSTNAME,String LASTNAME, Integer SALARY);
		   
		   
		   public Employee getEmployee(Integer id);
		   
		   
		   public List<Employee> listEmployee();
		   
		   
		   public void delete(Integer id);
		   
		   
		   public void update(Integer id, String FIRSTNAME , String LASTNAME);
		}

}
