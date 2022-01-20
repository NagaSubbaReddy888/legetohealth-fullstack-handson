package JDBC;

import java.util.List;
import java.util.Scanner;

import collections.Employee;
import collections.EmployeeNotFoundException;

public class Controller {

	

	

		public static void main(String[] args) throws EmployeeNotFoundException {
			Scanner scan = new Scanner(System.in);
			int option = 0;
			EmployeeDao dao = ObjectFactory.getInstance();
			do {
				System.out.println("1: Store employee, 2: Fetch all employees");
				System.out.println("3: Fetch employee by id, 4: Delete employee by id");
				System.out.println("5: Update employee salary by id, -1: Exit");
				option = scan.nextInt();
				switch (option) {
				case 1:
					System.out.println("Enter name");
					String name = scan.next();
					System.out.println("Enter salary");
					double salary = scan.nextDouble();
					Employee employee = new Employee(0, name, salary); 
					int status = dao.store(employee);
					if (status == -1) {
						System.err.println("Employee failed to store");
					} else {
						System.out.println("Employee stored");
					}
					break;
				case 2:
					List<Employee> lstEmployee = dao.findAll();
					System.out.println("Employee details: " + lstEmployee);

					break;
				case 3:
					System.out.println("Enter id");
					int id = scan.nextInt();
					try {
						employee = dao.findById(id);
						System.out.println(employee);
					} catch (EmployeeNotFoundException e) {
						System.err.println("Error: " + e.getMessage());
					}
					break;
					
				case 4:
					System.out.println("Enter id");
					 int empId=scan.nextInt();
					 System.out.println("Enter salary ");
					 double salary1= scan.nextDouble();
					 
					 try {
						dao.update(empId, salary1);
					} catch (EmployeeNotFoundException e) {
					
						e.printStackTrace();
					}
				}

			} while (option != -1);

			scan.close();
		}

}
