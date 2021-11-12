package main;

public class Calculator {
	public int calculate(String op, int... nums) {
		switch (op) {
			case "+":
				return this.add(nums);
			case "-":
				return this.sub(nums);
			case "*":
				return this.mul(nums);
			case "/":
				return this.div(nums);
		}
		return 0;
	}
	private int add(int[] nums) {
		int res = 0;
		for (int i : nums) {
			res += i;
		}
		return res;
	}
	private int sub(int[] nums) {
		int res = nums[0];
		for (int i=1; i<nums.length; i++) {
			res -= nums[i];
		}
		return res;
	}
	private int mul(int[] nums) {
		int res = 1;
		for (int i : nums) {
			res *= i;
			System.out.println(i);
		}
		return res;
	}
	private int div(int[] nums) {
		int res = nums[0];
		for (int i=1; i<nums.length; i++) {
			res /= nums[i];
		}
		return res;
	}
}
