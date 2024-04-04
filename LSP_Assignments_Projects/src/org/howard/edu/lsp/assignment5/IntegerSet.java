package org.howard.edu.lsp.assignment5;

import java.util.*;

/**
 * 
 */
public class IntegerSet {

    // Use List to maintain the collection of integers. Consider switching to Set<Integer> for efficiency and to avoid duplicates inherently.
    private List<Integer> integerSet;

    /**
     * Constructor initializes the list to hold the unique integers.
     *starting with an ArrayList because it's simple and familiar
     */
    public IntegerSet() {
        integerSet = new ArrayList<>();
    }

    /**
     * Custom exception class for IntegerSet-specific errors.
     * By defining this inside IntegerSet
     */
    @SuppressWarnings("serial")
    public class IntegerSetException extends Exception {
        public IntegerSetException(String error) {
            super(error);
        }
    }

    /**
     * Retrieves the current set of integers.
     * @return A copy of the current set to avoid direct manipulation.
     */
    public List<Integer> getSet() {
        return new ArrayList<>(integerSet);
    }

    /**
     * Updates the set with a new collection of integers.
     * @param newSet The new collection of integers to replace the current set.
     */
    public void setSet(List<Integer> newSet) {
        this.integerSet = new ArrayList<>(newSet);
    }

    /**
     * Clears all elements from the set, making it empty.
     */
    public void clear() {
        integerSet.clear();
    }

    /**
     * Calculates the current number of elements in the set.
     * @return The size of the set.
     */
    public int length() {
        return integerSet.size();
    }

    /**
     * Checks if this set is identical to another set.
     * @param anotherSet The set to compare with.
     * @return true if the sets are equal, false otherwise.
     */
    public boolean equals(IntegerSet anotherSet) {
        return integerSet.size() == anotherSet.length() && integerSet.containsAll(anotherSet.integerSet);
    }

    /**
     * Checks if a specific value is present in the set.
     * @param value The value to look for.
     * @return true if the value is in the set, false otherwise.
     */
    public boolean contains(int value) {
        return integerSet.contains(value);
    }

    /**
     * Finds and returns the largest element in the set.
     * @return The largest number in the set.
     * @throws IntegerSetException If the set is empty.
     */
    public int largest() throws IntegerSetException {
        if (integerSet.isEmpty()) {
            throw new IntegerSetException("The set is empty.");
        }

        return Collections.max(integerSet);
    }

    /**
     * Finds and returns the smallest element in the set.
     * @return The smallest number in the set.
     * @throws IntegerSetException If the set is empty.
     */
    public int smallest() throws IntegerSetException {
        if (integerSet.isEmpty()) {
            throw new IntegerSetException("The set is empty.");
        }

        return Collections.min(integerSet);
    }

    /**
     * Adds a new element to the set, if it's not already present.
     * @param value The integer to be added.
     */
    public void add(int value) {
        if (!integerSet.contains(value)) {
            integerSet.add(value);
        }
    }

    /**
     * Removes an element from the set, if it exists.
     * @param value The integer to be removed.
     */
    public void remove(int value) {
        integerSet.remove(Integer.valueOf(value));
    }

    /**
     * Performs a union operation with another set, resulting in a set that contains all unique elements from both sets.
     * @param anotherSet The set to be united with.
     */
    public void union(IntegerSet anotherSet) {
        for (int value : anotherSet.integerSet) {
            if (!integerSet.contains(value)) {
                integerSet.add(value);
            }
        }
    }

    /**
     * Finds the intersection with another set, modifying this set to contain only elements present in both sets.
     * @param anotherSet The set to intersect with.
     */
    public void intersect(IntegerSet anotherSet) {
        integerSet.retainAll(anotherSet.integerSet);
    }

    /**
     * Computes the difference with another set, removing elements from this set that are present in the other set.
     * @param anotherSet The set to compare with for the difference.
     */
    public void diff(IntegerSet anotherSet) {
        integerSet.removeAll(anotherSet.integerSet);
    }

    /**
     * Checks if the set is empty.
     * @return true if the set has no elements, false otherwise.
     */
    public boolean isEmpty() {
        return integerSet.isEmpty();
    }

    /**
     * Provides a string representation of the set, listing elements separated by commas.
     * @return A string listing all the elements in the set.
     */
    @Override
    public String toString() {
        return String.join(", ", integerSet.stream().map(String::valueOf).toArray(String[]::new));
    }

	
}
