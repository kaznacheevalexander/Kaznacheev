package ua.kh.bogdan.lessons.lesson2;

//В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n.
public class DZ3 {
	public static void main(String[] args) {
		int n = 125;
		System.out.println((n % 10) + ((n / 10) % 10) + (n / 100));
	}
}
