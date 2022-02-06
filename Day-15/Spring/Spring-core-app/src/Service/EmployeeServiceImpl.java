package Service;

import Dao.EmployeeDao;

public class EmployeeServiceImpl {
	private EmployeeDao dao;
	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl is created");
	}
	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}
	public void save() {
		System.out.println("Save inside the EmployeeService");
		dao.store();
	}
	public void remove() {
		System.out.println("Remove inside the EmployeeSerice");
		dao.delete();
	}
	
	}
	


