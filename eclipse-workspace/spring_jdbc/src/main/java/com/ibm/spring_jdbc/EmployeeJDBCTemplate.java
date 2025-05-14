package com.ibm.spring_jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeJDBCTemplate implements EmployeeDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		// TODO Auto-generated method stub

	}

	@Override
	public void create(String FIRSTNAME, String LASTNAME, Integer SALARY) {
		// TODO Auto-generated method stub
		String SQL = "Insert into Employees (firstname , lastname , salary) values(?,?,?)";
		jdbcTemplateObject.update(SQL , FIRSTNAME , LASTNAME ,SALARY);
		System.out.println("Created REcord Name = " + FIRSTNAME + " Salary = " + SALARY);

	}

	@Override
	public Employee getEmployee(Integer id) {
	    String SQL = "SELECT * FROM Employees WHERE id = ?";
	    Employee employee = jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new EmployeeMapper());
	    return employee;
	}
	

	@Override
	public List<Employee> listEmployee() {
		String SQL = "select * from Employees";
		List<Employee> employees = jdbcTemplateObject.query(SQL, new EmployeeMapper());
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public void delete(Integer id) {
		String SQL = "delete from employees where id = ?";
        jdbcTemplateObject.update(SQL, id);
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Integer id, String FIRSTNAME, String LASTNAME) {
		String SQL = "update employees set firstName = ?, lastName = ? where id = ?";
        jdbcTemplateObject.update(SQL, FIRSTNAME, LASTNAME, id);
		// TODO Auto-generated method stub

	}

}
