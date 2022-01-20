package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import collections.Employee;
import collections.EmployeeNotFoundException;


public class EmployeeDaoImplements implements EmployeeDao{

	

	public class EmployeeDaoImpl implements EmployeeDao {

		public int store(Employee emp) {
			int status = -1;
			try {
				Connection connection = DBUtil.getConnection();
				String query = "insert into employee(name, salary) values(?, ?)";
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setString(1, emp.getName()); 
				statement.setDouble(2, emp.getSalary());
				status = statement.executeUpdate(); 
				statement.close();
				connection.close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return status;

		}

		public Employee findById(int id) throws EmployeeNotFoundException {
			Employee employee = null;
			try {
				Connection connection = DBUtil.getConnection();
				String query = "select * from employee where id = ?";
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setInt(1, id);
				ResultSet result = statement.executeQuery();
				while (result.next()) {
					employee = new Employee(result.getInt(1), result.getString(2), result.getDouble(3));
				}
				result.close();
				statement.close();
				connection.close();
				if (employee == null) {
					throw new EmployeeNotFoundException("Sorry, " + id + " not found");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return employee;
		}

		public List<Employee> findAll() {
			Employee employee = null;
			List<Employee> lstEmployee = new ArrayList<Employee>();

			try {
				Connection connection = DBUtil.getConnection();
				String query = "select * from employee";
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery();

				while (result.next()) {
					employee = new Employee(result.getInt(1), result.getString(2), result.getDouble(3));
					lstEmployee.add(employee);
				}

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return lstEmployee;
		}

		public void update(int id, double salary) throws EmployeeNotFoundException {

			try {
				Connection connection = DBUtil.getConnection();
				String updateQuery = "update employee  salary=? where id=?";

				PreparedStatement statement = connection.prepareStatement(updateQuery);
				statement.setDouble(1, salary);
				statement.setInt(2, id);

				int executeUpdate = statement.executeUpdate();

				System.out.println("update query : " + executeUpdate);

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

}

	@Override
	public int store(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee findById(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int id, double salary) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		
	}
}