package JavaBasicPrograms;

class Employee {
	private String name;
	private int id;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {

		this.salary = salary;
	}
}

public class POJOExample {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setName("Arjun");
		emp1.setId(100);
		emp1.setSalary(10000);

		Employee emp2 = new Employee();
		emp2.setName("Shubhangi");
		emp2.setId(101);
		emp2.setSalary(20000);

		Employee emp3 = new Employee();
		emp3.setName("Arav");
		emp3.setId(102);
		emp3.setSalary(200000);

		System.out.println(
				"Name :" + emp1.getName() + "||" + "ID :" + emp1.getId() + "||" + "Salary :" + emp1.getSalary());
		System.out.println(
				"Name :" + emp2.getName() + "||" + "ID :" + emp2.getId() + "||" + "Salary :" + emp2.getSalary());
		System.out.println(
				"Name :" + emp3.getName() + "||" + "ID :" + emp3.getId() + "||" + "Salary :" + emp3.getSalary());
	}

}
