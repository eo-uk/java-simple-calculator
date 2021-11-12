package main;
import java.util.Scanner;
import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			String[] input = scan.nextLine().split("\\s+");
			
			// Handle exit and absent numbers
			if (input.length == 1) {
				if (input[0].equals("exit")) {
					break;
				}
				continue;
			}
			
			// Get the operator
			String op = input[0];
			
			// Get all numbers as String array
			String[] stringNums = Arrays.copyOfRange(input, 1, input.length);
			
			// Convert String numbers to int array 
			int[] intNums = new int[stringNums.length];
			for (int i=0; i<stringNums.length; i++) {
				intNums[i] = Integer.parseInt(stringNums[i]);
			}
			
			System.out.println(calculator.calculate(op, intNums));
		}
	}
}
