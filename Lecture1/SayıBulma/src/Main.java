
public class Main {
 public static void main(String[] args) {
		
		int[] num = {1, 2, 5, 7, 9, 0};
		int target = 78;
		boolean isThere = false;
		
		for(int number : num) {
			if(number == target) {
				isThere = true;
				break;
			}
		}
		
		if(isThere) {
			System.out.println("Number is available.");
		} else {
			System.out.println("The number is not available.");
		}
	}
}
