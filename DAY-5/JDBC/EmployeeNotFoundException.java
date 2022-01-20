package JDBC;

	@SuppressWarnings("serial")

	public class EmployeeNotFoundException extends Exception {

			EmployeeNotFoundException(String message) {
				super(message);
			}
}
