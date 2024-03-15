package org.howard.edu.lsp.midterm.question2;

public class RangeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testing range
		IntegerRange range1 = new IntegerRange(1, 10);
    	IntegerRange range2 = new IntegerRange(5, 15);
        IntegerRange range3 = new IntegerRange(11, 20);
//contains
        System.out.println("Range1 contains 5: " + range1.contains(5));//true
        System.out.println("Range2 contains 10: " + range2.contains(10));//true
//overlaps
        System.out.println("Range1 overlaps Range2: " + range1.overlaps(range2));//true
        System.out.println("Range1 overlaps Range3: " + range1.overlaps(range3));//false
//size
        System.out.println("Size of Range1: " + range1.size());//10
        System.out.println("Size of Range3: " + range3.size());//10
//equals
        IntegerRange range4 = new IntegerRange(1, 10);
        System.out.println("Range1 equals Range4: " + range1.equals(range4));//true

	}

}
