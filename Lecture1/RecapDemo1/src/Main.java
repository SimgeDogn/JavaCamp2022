
public class Main {

	 public static void main(String[] args) {
		
		int num1 = 20, num2 = 25, num3 = 2, theBiggest = num1;
		
		if(theBiggest < num2) {
			theBiggest = num2;
		}
		
		if(theBiggest < num3) {
			theBiggest = num3;
		}
		
		System.out.println("The biggest number is : " + theBiggest);
	}
}
