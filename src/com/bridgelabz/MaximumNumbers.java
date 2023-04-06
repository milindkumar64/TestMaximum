package com.bridgelabz;

class MaximumNumber<M extends Comparable<M>> {

	private M a;
	private M b;
	private M c;

	public MaximumNumber(M a, M b, M c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	public <M extends Comparable<M>> M testMaximum(M a, M b, M c) {
		M max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;

		return max;
	}

	public static void main(String[] args) {

		MaximumNumber<Integer> obj1 = new MaximumNumber<Integer>(10, 20, 30);
		MaximumNumber<Float> obj2 = new MaximumNumber<Float>(10.3f, 20.3f, 30.4f);
		MaximumNumber<String> obj3 = new MaximumNumber<String>("Apple", "Peach", "Banana");

		System.out.println(obj1.testMaximum(obj1.a, obj1.b, obj1.c));
		System.out.println(obj2.testMaximum(obj2.a, obj2.b, obj2.c));
		System.out.println(obj3.testMaximum(obj3.a, obj3.b, obj3.c));
	}

}
