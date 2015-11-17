
public class Colculator {
	public static int plus(int a, int b) {
		int sum_plus = a + b;
		return sum_plus;
	}

	public static int minus(int a, int b) {
		int sum_minus = a - b;
		return sum_minus;
	}

	public static int multiplication(int a, int b) {
		int sum_multiplication = a * b;
		return sum_multiplication;
	}

	public static double division(int a, int b) {
		double sum_division = (double)a / b;
		return sum_division;
	}

	public static void main(String[] args) {
		int result = Colculator.plus(2, 5);
		int result_minus = Colculator.minus(2, 5);
		int result_multiplication = Colculator.multiplication(2, 5);
		double result_division = Colculator.division(2, 5);
		System.out.println(result);
		System.out.println(result_minus);
		System.out.println(result_multiplication);
		System.out.println(result_division);
	}
}
