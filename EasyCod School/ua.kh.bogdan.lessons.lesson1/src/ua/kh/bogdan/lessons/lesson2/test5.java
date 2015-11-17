package ua.kh.bogdan.lessons.lesson2;

public class test5 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 260; i++) {
			String str = String.valueOf(i);
			if (str.contains("5")) {
				count++;
				System.out.println(str);
			}
		}
		System.out.println(count);
	}
}
