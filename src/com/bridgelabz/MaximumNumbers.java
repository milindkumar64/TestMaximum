package com.bridgelabz;

class MaximumNumber {

	public static float maximum(Float a, Float b, Float c) {
		float max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;

		return max;
	}

	public static void main(String[] args) {

		Float a = new Float(20.3);
		Float b = new Float(30.5);
		Float c = new Float(40.2);

		System.out.println(maximum(a, b, c));
	}
}