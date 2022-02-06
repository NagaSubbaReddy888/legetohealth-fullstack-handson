package Dao;

public class EmployeeJdbcImpl implements EmployeeDao {

	public EmployeeJdbcImpl() {
		
		System.out.println("EmployeeJdbcImpl created");
	}
@Override
	public void store() {
		System.out.println("store method is called on EmployeeJdbcImpl");
	}
@Override
	public void delete() {
		System.out.println("Delete method is called on EmployeeJdbcImpl");
	}
}
