import java.util.Scanner;

public class LoopFibonacciSequence {
	public static void main( String[] args ){
		Scanner kb = new Scanner(System.in);
		int oldNumber = 1;
		int currentNumber = 1;
		int nextNumber;

		System.out.print(currentNumber + " ");
		while (currentNumber < 500){
			System.out.print(currentNumber + " ");
			nextNumber = currentNumber + oldNumber;
			oldNumber = currentNumber;
			currentNumber = nextNumber;
		}

	}

}
