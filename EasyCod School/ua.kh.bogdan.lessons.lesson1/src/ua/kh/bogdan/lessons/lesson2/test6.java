package ua.kh.bogdan.lessons.lesson2;

public class test6 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 1250; i++) {
			String str = String.valueOf(i);
			if (str.contains("7") || str.contains("9")) {
				count++;
				// System.out.println(str);
			}
		}
		System.out.println(count);
	}
}
