
public class Test {
	public static void main(String[] args) {
		int[] temper = new int[10];
		int sum = 0;
		int[] t2 = { 40, 30, 35, 29, 39, 27, 41, 28, 38, 30 };
		for (int i = 0; i < 10; i++) {
			int n = (int) (Math.random() * 10 + 1);
			temper[i] = n;
			sum += n;
			//System.out.println(t2[i]);
			// System.out.println(temper[i]);
		}
		System.out.println(sum);
	}
}
