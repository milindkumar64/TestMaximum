package com.bridgelabz;

public class MaximumNumbers {

	public static <M extends Comparable<M>> M maximum(M x, M y, M z) {
		M max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0)
			max = z;


		return max;
	}

	public static void main(String[] args) {

		System.out.println("Largest Integer : "+maximum(20,30,40));
		System.out.println("Largest Float : "+maximum(20.3,30.5,40.6));
		System.out.println("Largest String in lexicographically order : "+maximum("Apple", "Peach", "Banana"));

	}

}