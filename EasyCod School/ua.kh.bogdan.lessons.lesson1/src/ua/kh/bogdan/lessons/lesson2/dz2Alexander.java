package ua.kh.bogdan.lessons.lesson2;
  ///Создайте программу, которая вычислит выражение 14/209+14ˣ(29-13²+14/3) и выведет результат на экран. При этом число 14 обязательно сохраните в отдельной переменной, выбрав для неё подходящий тип.
public class dz2Alexander {
public static void main(String[] args) {
	int  i = 14, e = 209, b = 29, t = 13, x = 3;
	System.out.println( i / e +i * ( b - (t + t) + i / x));
}
}