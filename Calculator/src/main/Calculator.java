package main;

public class Calculator {
	public float calculate(String op, float... nums) {
		float res = nums[0];
		for (int i=1; i<nums.length; i++) {
			switch (op) {
				case "+":
					res += nums[i];
					break;
				case "-":
					res -= nums[i];
					break;
				case "*":
					res *= nums[i];
					break;
				case "/":
					res /= nums[i];
					break;
				default:
					res = 0;
					break;
			}
		}
		return res;
	}
}
