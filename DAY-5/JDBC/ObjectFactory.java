package JDBC;

public class ObjectFactory {

		public static EmployeeDao getInstance() {
			return new EmployeeDaoImplements();
		}
}
