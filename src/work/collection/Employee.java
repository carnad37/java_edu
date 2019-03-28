package work.collection;

public class Employee {

	private String name;
	private int salary;
	private int tax;
	private int nationalPension;
	
	public Employee(String name, int salary, int tax, int nationalPension) {
		this.name = name;
		this.salary = salary;
		this.tax = tax;
		this.nationalPension = nationalPension;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public int getTax() {
		return tax;
	}

	public int getNationalPension() {
		return nationalPension;
	}
	
	public int getPreSarlay() {
		return tax + salary;
	}
	
	public int getfullTax()
	{
		return tax + nationalPension;
	}
	
	
}
