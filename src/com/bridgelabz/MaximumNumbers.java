package com.bridgelabz;

class MaximumNumber {

	public static int maximum(Integer a, Integer b, Integer c) {
		int max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;

		return max;
	}

	public static void main(String[] args) {

		Integer a = new Integer(20);
		Integer b = new Integer(30);
		Integer c = new Integer(40);

		System.out.println(maximum(a, b, c));

	}
}