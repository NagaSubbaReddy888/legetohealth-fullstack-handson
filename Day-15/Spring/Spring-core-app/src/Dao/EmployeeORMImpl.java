package Dao;

public class EmployeeORMImpl implements EmployeeDao{
	
	public EmployeeORMImpl() {
		
		System.out.println("EmployeeORMImpl is created");
		
	}
	@Override
	public void store() {
		System.out.println("store method is created on EmployeeORMImpl");
	}
	@Override
	public void delete() {
		System.out.println("Delete method is created on EmployeeORMImpl");
	}

}
