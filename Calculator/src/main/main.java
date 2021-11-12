package main;
import java.util.Scanner;
import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			// Get input 
			System.out.println("Enter operator (+,-,*,/), then the numbers, separated by space:");
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
			
			// Convert String numbers to float array 
			float[] floatNums = new float[stringNums.length];
			for (int i=0; i<stringNums.length; i++) {
				floatNums[i] = Float.parseFloat(stringNums[i]);
			}
			
			System.out.println(calculator.calculate(op, floatNums));
		}
	}
}
