package Activity2;

public class Customer extends Person {

	private int customerId;
	private String accountNumber;
	private double balance;
	
	public static void main(String[] args) {
		
		Customer customer = new Customer(1,"gsy3s",6554, "ramu","male");
		Employee employee = new Employee("ramesh","legato","ravi","male");
		Student student = new Student(1, "a", "rajesh", "male");
		Person person = new Person("rakhi","male");
		System.out.println("employee");
		customer.print(employee);
		System.out.println("student");
		customer.print(student);
		System.out.println("person");
		customer.print(person);
		System.out.println("customer");
		customer.print(customer);
	
	}
	
	public void print(Person person) {
		person.display();
	}
	
	public Customer() {}
	public Customer(int customerId, String accountNumber, double balance, String name,String gender) {
		super(name,gender);
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getCustomerId() {
		return customerId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void display() {
		
		super.display();
		System.out.println("customerId is:"+customerId+"Account Number :"+accountNumber+" Balance :"+balance);
	}
	

}