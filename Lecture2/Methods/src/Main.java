
public class Main {
	public static void main(String[] args) {
		findNumber();

	}

	public static void findNumber() {
		int[] numbers = new int[] { 2, 4, 7, 34, 77 };
		int searchNumber = 8;
		boolean y = false;
		for (int i = 0; i < numbers.length; i++) {
			if (searchNumber == numbers[i])
				y = true;
		}
		if (y == true) {
			System.out.println(mesaj(y));
		} else
			System.out.println("Number not found");
	}

	public static String mesaj(boolean k) {
		String a="Number found";
		return a;
	}
}
