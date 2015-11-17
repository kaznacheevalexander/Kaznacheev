package ua.kh.alexander.lessons;

public abstract class Officer {
	protected double Salary;
	protected double WorkHors;

	public double getSalary() {
		return this.Salary;
	}

	public void setSalary(double Salary) {
		this.Salary = Salary;
	}

	public int getWorkedHorse() {
		return (int) this.WorkHors;
	}

	public void WorkedHorse(int wh) {
		this.WorkHors = wh;
	}

	public Officer() {
	}
}