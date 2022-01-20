package JDBC;

import java.util.List;

import collections.Employee;
import collections.EmployeeNotFoundException;

public interface EmployeeDao {

	    public int store(Employee emp);
		
		public Employee findById(int id) throws EmployeeNotFoundException;
		
		public List<Employee> findAll();
		
		public void update(int id, double salary)throws EmployeeNotFoundException;
}
