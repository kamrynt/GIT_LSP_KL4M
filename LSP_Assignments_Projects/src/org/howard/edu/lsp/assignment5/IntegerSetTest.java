package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;

public class IntegerSetTest {

    IntegerSet setUnderTest;

    @BeforeEach
    void setUp() throws Exception {
        setUnderTest = new IntegerSet();
    }

    @AfterEach
    void tearDown() throws Exception {
        setUnderTest = null;
    }

    @Test
    @DisplayName("Test case for clear")
    void testClear() {
        setUnderTest.add(1);
        setUnderTest.clear();
        assertTrue(setUnderTest.isEmpty(), "Clear should empty the set.");
    }

    @Test
    @DisplayName("Test case for length")
    void testLength() {
        setUnderTest.add(5);
        setUnderTest.add(10);
        assertEquals(2, setUnderTest.length(), "Length should return the correct number of items.");
    }

    @Test
    @DisplayName("Test case for equals")
    void testEquals() {
        IntegerSet anotherSet = new IntegerSet();
        anotherSet.add(1);
        setUnderTest.add(1);
        assertTrue(setUnderTest.equals(anotherSet), "Equals should confirm both sets are identical.");
    }

    @Test
    @DisplayName("Test case for contains")
    void testContains() {
        setUnderTest.add(35);
        assertTrue(setUnderTest.contains(35), "Contains should return true for an existing item.");
    }

    @Test
    @DisplayName("Test case for add")
    void testAdd() {
        setUnderTest.add(20);
        assertTrue(setUnderTest.contains(20), "Add should insert a new item.");
    }

    @Test
    @DisplayName("Test case for remove")
    void testRemove() {
        setUnderTest.add(10);
        setUnderTest.remove(10);
        assertFalse(setUnderTest.contains(10), "Remove should successfully delete an item.");
    }

    @Test
    @DisplayName("Test case for union")
    void testUnion() {
        IntegerSet anotherSet = new IntegerSet();
        setUnderTest.add(1);
        anotherSet.add(2);
        setUnderTest.union(anotherSet);
        assertTrue(setUnderTest.contains(1) && setUnderTest.contains(2), "Union should contain elements from both sets.");
    }

    @Test
    @DisplayName("Test case for intersect")
    void testIntersect() {
        IntegerSet anotherSet = new IntegerSet();
        setUnderTest.add(1);
        setUnderTest.add(2);
        anotherSet.add(2);
        setUnderTest.intersect(anotherSet);
        assertTrue(setUnderTest.contains(2) && setUnderTest.length() == 1, "Intersect should only contain common elements.");
    }

    @Test
    @DisplayName("Test case for diff")
    void testDiff() {
        IntegerSet anotherSet = new IntegerSet();
        setUnderTest.add(1);
        setUnderTest.add(2);
        anotherSet.add(2);
        setUnderTest.diff(anotherSet);
        assertTrue(setUnderTest.contains(1) && !setUnderTest.contains(2), "Diff should remove elements present in another set.");
    }

    @Test
    @DisplayName("Test case for isEmpty")
    void testIsEmpty() {
        assertTrue(setUnderTest.isEmpty(), "IsEmpty should return true for a new set.");
    }

    @Test
    @DisplayName("Test case for largest and smallest with exceptions")
    void testLargestAndSmallestWithExceptions() {
        Exception exception = assertThrows(IntegerSet.IntegerSetException.class, () -> {
            setUnderTest.largest();
        });
        assertEquals("The set is empty", exception.getMessage());

        exception = assertThrows(IntegerSet.IntegerSetException.class, () -> {
            setUnderTest.smallest();
        });
        assertEquals("The set is empty", exception.getMessage());
    }

    @Test
    @DisplayName("Test case for toString")
    void testToString() {
        setUnderTest.add(1);
        assertEquals("1", setUnderTest.toString().trim(), "ToString should correctly represent the set.");
    }
}
