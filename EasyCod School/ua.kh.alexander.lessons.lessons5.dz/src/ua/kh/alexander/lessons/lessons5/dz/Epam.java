package ua.kh.alexander.lessons.lessons5.dz;

public class Epam {

	// Написать программу, которая находит наибольший общий делитель двух целых
	// положительных чисел.
	// int res = Epam.nod1(100, 20);

	{

		// System.out.println(res);
	}

	public static int nod1(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	// Написать программу, которая находит сумму цифр произвольного целого
	// числа.
	public static int sum(int a) {
		int result_sum = 0;
		while (a != 0) {
			result_sum += a % 10;
			a /= 10;
		}
		return result_sum;
	}

	/// Написать программу проверки того, что заданное число Х – простое (т.е.
	/// не делится без остатка ни на какие числа, кроме себя и 1). Число X
	/// задавать в коде программы.

	public static boolean Simple3(int a) {
		boolean result_s = true;
		for (int i = a / 2; i < Math.sqrt(a); i--) {
			if (a % i == 0) {
				result_s = false;
				break;
			}
		}
		return result_s;
	}

	// факториал
	public static int fact4(int x) {
		return (x < 1) ? 1 : x * fact4(x - 1);
	}

	public static int epam5() {
		// Подсчитать, сколько шестизначных цифр имеют равную сумму трех первых
		// и трех последних цифр.
		int count = 0;
		for (int i = 100_000; i < 999_999; i++) {
			int right = i % 1000;
			int rightSum = Epam.sum(right);
			if (Epam.sum(i / 1000) == rightSum) {
				count++;
			}
		}
		return count;
	}

	// Разместить в памяти массив из 20 элементов и заполнить его рядом
	// Фиббоначчи: 1, 1, 2, 3, 5, 8, 13, 21, … В этом ряду каждое следующее
	// число является суммой двух предыдущих.
	public static int[] epam6() {
		int mas[] = new int[20];
		mas[0] = 1;
		mas[1] = 1;
		for (int i = 2; i < mas.length; i++) {
			mas[i] = mas[i - 1] + mas[i - 2];
		}
		return mas;
	}
	// Создать целый массив из 100 элементов и заполнить его простыми числами:
	// 2, 3, 5, 7, 11, 13, 17, …

	static int[] arrayPrimeNumbers = new int[100];

	public static boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int lastPrime = 2;
		for (int i = 0; i < arrayPrimeNumbers.length; i++) {

			while (!isPrime(lastPrime)) {
				lastPrime++;
			}
			arrayPrimeNumbers[i] = lastPrime;
			System.out.println(arrayPrimeNumbers[i]);
			lastPrime++;
		}
	}

	//// Создать двумерный массив символов и заполнить его буквами 'Ч' и 'Б' в
	//// шахматном порядке.
	public static int[] arr() {
		int M = 8;
		int N = 8;
		char[][] arr = new char[M][N];
		for (int i = 0; i < M; i++) {

			for (int j = 0; j < N; j++) {
				if ((i + j) % 2 == 0)
					arr[i][j] = 'ч';
				else
					arr[i][j] = 'б';
			}
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		return arrayPrimeNumbers;

	}

	// Создать целый шестимерный массив с двумя значениями в каждом измерении.
	// Заполнить массив числами из начала натурального ряда: 1, 2, 3, … Сказать,
	// сколько потребуется чисел ?
	public static int[] epam9() {
		int result = 0;
		int[][][][][][] array = new int[2][2][2][2][2][2];

		for (int i = 0; i < array.length; i++) {
			int[][][][][] iseseseses = array[i];
			for (int j = 0; j < iseseseses.length; j++) {
				int[][][][] iseseses = iseseseses[j];
				for (int k = 0; k < iseseses.length; k++) {
					int[][][] iseses = iseseses[k];
					for (int l = 0; l < iseses.length; l++) {
						int[][] ises = iseses[l];
						for (int m = 0; m < ises.length; m++) {
							int[] is = ises[m];
							for (int n = 0; n < is.length; n++) {
								is[n] = result;
								result++;
							}
						}
					}
				}
			}
		}
		return arrayPrimeNumbers;
	}

	public static void main() {
		int result = Epam.nod1(2, 5);
		System.out.println(result);
	}

	public static void main1() {
		int result_sum = Epam.sum(2288);
		System.out.println(result_sum);
	}

	public static void main2() {
		boolean result_s = Epam.Simple3(25);
		System.out.println(result_s);
	}

	public static void main3() {
		int fact4 = Epam.fact4(27);
		System.out.println(fact4);
	}

	public static void main4() {
		int count = Epam.epam5();
		System.out.println(count);
	}

	public static void main5() {
		int[] mas = Epam.epam6();
		System.out.println(mas);
	}

	public static void main6() {
		boolean number = Epam.isPrime(100);
		System.out.println(number);
	}

	public static void main7() {
		int[] arr = Epam.arr();
		System.out.println(arrayPrimeNumbers);
	}

	public static void main8() {
		int[] array = Epam.epam9();
		System.out.println(arrayPrimeNumbers);

	}
}
