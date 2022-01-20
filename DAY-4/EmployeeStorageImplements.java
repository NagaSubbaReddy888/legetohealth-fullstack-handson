package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeStorageImplements implements EmployeeStorage {

		ArrayList<Employee> list = new ArrayList<Employee>();

		@Override
		public int save(Employee e) {
			if(e.getId()==0 || e==null)
			{
				return 0;
			}else {
				list.add(e);
				return e.getId();
			}
			
		}

		@Override
		public Employee findEmployee(int id) throws EmployeeNotFoundException {
			for (Employee e : list) {
				if (e.getId() == id)
					return e;
			}
			throw new EmployeeNotFoundException("Employee not found");
		}

		@Override
		public Employee[] findEmployees() {
			Employee[] eList = new Employee[list.size()];
			if(!list.isEmpty()) 
				eList = list.toArray(eList);
				return eList;
			
		}

		@Override
		public void delete(int id) throws EmployeeNotFoundException {
			boolean empFound = false;
			Iterator<Employee> iterator = list.listIterator();
			
			while (iterator.hasNext()) {
				Employee e = iterator.next();
				int eId = e.getId();
				if (eId == id) {
					iterator.remove();
					System.out.println("Entered Emplyee id: " + id+" Successfully Deleted ");
					empFound = true;
				}
			}
			if (!empFound)
				throw new EmployeeNotFoundException("Employee not found");
		}
		

		public static int EnterUserData(Scanner sc) {
			
			int option = sc.nextInt();
			return option;
			
		}

		
	}
