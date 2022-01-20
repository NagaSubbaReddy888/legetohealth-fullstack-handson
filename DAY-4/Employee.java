package collections;

public class Employee {

	
	private int id;
	private String name;
	private double salary;
	
public Employee() {
	
	super();
}
public Employee(int id, String name, double salary) {
	
	super();
	
	this.id = id;
	this.name = name;
	this.salary = salary;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public int hashCode() {
	
	final int num = 88;
	int result = 1;
	result = num * result + id;
	result = num * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(salary);
	result = num * result + (int) (temp ^ (temp >>> 49));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
		return false;
	return true;
}
@Override
public String toString() {
	
	System.out.println(" Generate   setters & getters  and toString()\n");
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
}
