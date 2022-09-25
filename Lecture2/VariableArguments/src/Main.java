
public class Main {
	public static void main(String[] args) {
		int sum = addition(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(sum);

	}

	public static int addition (int... numbers) {
		int add = 0;
		for (int numbers1 : numbers) {
			add += numbers1;
		}
		return add;
	}
}
