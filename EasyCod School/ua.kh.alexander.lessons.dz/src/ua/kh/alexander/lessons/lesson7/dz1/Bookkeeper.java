package ua.kh.alexander.lessons.lesson7.dz1;

public class Bookkeeper extends Employee {
	private double salary;
	private double sum = 0;

	public Bookkeeper(String name, String specialty, double salary) {
		super(name, specialty);
		this.salary = salary;
	}

	@Override
	public double calculateSalary() {
		return salary;
	}

	public double calculateSalaryForEmployees(Employee[] employees) {
		for (Employee ex : employees) {
			sum += ex.calculateSalary();
		}
		System.out.println("total salary is " + sum);
		return salary;
	}

}
