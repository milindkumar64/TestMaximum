package com.bridgelabz;

class MaximumNumber {

	public static String maximum(String a, String b, String c) {
		String max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;

		return max;
	}

	public static void main(String[] args) {

		String a = new String("Milind");
		String b = new String("Saras");
		String c = new String("Om");

		System.out.println(maximum(a, b, c));
	}
}