import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		firstNumber();
		secondNumber();
		String mesaj = "Hello Java";
	}
	
	public static void firstNumber ()
	{
		int a;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter firts number");
		a = input.nextInt();
		System.out.println("First number:" +a );
	}
	
	public static void secondNumber()
	{
		int b;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter second number");
		b = input.nextInt();
		System.out.println("Second number:" +b );
		
	}
	
	public static String string (String mesaj) {
		return mesaj;
	}
		
}


