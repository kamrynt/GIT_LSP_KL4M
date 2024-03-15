package org.howard.edu.lsp.midterm.question2;

import java.util.ArrayList;
import java.util.List;


// Implementing the Range interface without explicit lower and upper bounds
public class IntegerRange implements Range {
    private List<Integer> values = new ArrayList<>(); 
    // List to store all integers within the range

    public IntegerRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            values.add(i);
            // Checks if a given value is contained within the range.
        }
    }

    @Override
    public boolean contains(int value) {
    	//Checks if there is any overlap between this range and another range.
        return values.contains(value);
    }

    @Override
    public boolean overlaps(Range other) {
        if (!(other instanceof IntegerRange)) return false;
        IntegerRange otherRange = (IntegerRange) other;
        return otherRange.values.stream().anyMatch(this::contains);
       // Calculates the size of the range, i.e., the number of integers it contains.
    }

    @Override
    public int size() {
        return values.size();
        //Checks if this range is equal to another object.
        // Two ranges are considered equal if they contain the same integers.
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof IntegerRange)) return false;
        IntegerRange other = (IntegerRange) obj;
        return this.values.equals(other.values);
        //Generates a hash code for this range.
    }

    @Override
    public int hashCode() {
        return values.hashCode();
    }
}

