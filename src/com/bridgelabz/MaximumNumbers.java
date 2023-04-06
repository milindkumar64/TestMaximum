package com.bridgelabz;

class MaximumNumber<M extends Comparable<M>> {

	private M a;
	private M b;
	private M c;
	private M d;
	
	public MaximumNumber(M a, M b, M c,M d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;

	}

	public <M extends Comparable<M>> M testMaximum(M a, M b, M c, M d) {
		M max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		if(d.compareTo(max) > 0)
			max = d;

		return max;
	}

	public static void main(String[] args) {

		MaximumNumber<Integer> obj1 = new MaximumNumber<Integer>(10, 20, 30,40);
		MaximumNumber<Float> obj2 = new MaximumNumber<Float>(10.3f, 20.3f, 30.4f,40.8f);
		MaximumNumber<String> obj3 = new MaximumNumber<String>("Apple", "Peach", "Banana","Orange");

		System.out.println(obj1.testMaximum(obj1.a, obj1.b, obj1.c,obj1.d));
		System.out.println(obj2.testMaximum(obj2.a, obj2.b, obj2.c,obj2.d));
		System.out.println(obj3.testMaximum(obj3.a, obj3.b, obj3.c,obj3.d));
	}
}
