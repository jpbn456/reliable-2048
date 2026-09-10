package ar.edu.unrc.game2048;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int NEG = -1;
    private static final int THREE = 3;
    private static final int TWO = 2;

    @Test
    void beginZeroCellTest() {
        Cell cell = new Cell(ZERO);
        boolean cellZero = cell.getValue() == ZERO;
        assertTrue(cellZero);
    }

    @Test
    void beginPositiveCellTest() {
        Cell cell = new Cell(ONE);
        boolean cellOne = cell.getValue() == ONE;
        assertTrue(cellOne);
    }

    @Test
    void beginNonPowerOfTwoCellTest() {
        assertThrows(IllegalArgumentException.class, () -> new Cell(THREE));
    }

    @Test
    void beginNegativeCellTest() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Cell(NEG)
        );
    }

    @Test
    void isEmptyCellTest() {
        Cell cell = new Cell(ZERO);
        boolean isEmpty = cell.isEmpty();
        assertTrue(isEmpty);
    }

    @Test
    void isNotEmptyCellTest() {
        Cell cell = new Cell(ONE);
        boolean isEmpty = cell.isEmpty();
        assertFalse(isEmpty);
    }

    @Test
    void getCellValueTest() {
        Random random = new Random(42L);
        int expectedNumber = 1 << random.nextInt(100);
        Cell cell = new Cell(expectedNumber);
        int result = cell.getValue();
        assertEquals(expectedNumber, result);
    }

    @Test
    void canMergeWithNonEmptyCellTest() {
        Cell cell1 = new Cell(TWO);
        Cell cell2 = new Cell(TWO);
        boolean cell1canMerge = cell1.canMergeWith(cell2);
        boolean cell2canMerge = cell2.canMergeWith(cell1);
        assertTrue(cell1canMerge);
        assertTrue(cell2canMerge);
    }

    @Test
    void canNotMergeEmptyCellsTest() {
        Cell cell1 = new Cell(ZERO);
        Cell cell2 = new Cell(ZERO);
        boolean emptyCellCanNotMerge = cell1.canMergeWith(cell2);
        assertFalse(emptyCellCanNotMerge);
    }

    @Test
    void canNotMergeWithNonEmptyCellTest() {
        Cell cell1 = new Cell(TWO);
        Cell cell2 = new Cell(ONE);
        boolean cell1CanNotMerge = cell1.canMergeWith(cell2);
        boolean cell2CanNotMerge = cell2.canMergeWith(cell1);
        assertFalse(cell1CanNotMerge);
        assertFalse(cell2CanNotMerge);
    }

    @Test
    void canNotMergeWithEmptyCellTest() {
        Cell cell1 = new Cell(ZERO);
        Cell cell2 = new Cell(ONE);
        boolean cell1CanNotMerge = cell1.canMergeWith(cell2);
        boolean cell2CanNotMerge = cell2.canMergeWith(cell1);
        assertFalse(cell1CanNotMerge);
        assertFalse(cell2CanNotMerge);
    }

    @Test
    void mergeWithTest() {
        Cell cell1 = new Cell(TWO);
        Cell cell2 = new Cell(TWO);
        Cell cell3 = cell1.mergeWith(cell2);
        boolean isMerged = cell3.getValue() == cell1.getValue() * 2;
        assertTrue(cell1.canMergeWith(cell2));
        assertTrue(isMerged);
        cell3 = cell2.mergeWith(cell1);
        isMerged = cell3.getValue() == cell2.getValue() * 2;
        assertTrue(cell2.canMergeWith(cell1));
        assertTrue(isMerged);
    }

    @Test
    void noMergeWithTest() {
        Cell cell1 = new Cell(ONE);
        Cell cell2 = new Cell(TWO);
        assertFalse(cell1.canMergeWith(cell2));
        assertThrows(
                IllegalArgumentException.class,
                () -> cell1.mergeWith(cell2)
        );
    }

    @Test
    void noMergeWithEmptyCellTest() {
        Cell cell1 = new Cell(ZERO);
        Cell cell2 = new Cell(ONE);
        assertFalse(cell1.canMergeWith(cell2));
        assertThrows(
                IllegalArgumentException.class,
                () -> cell1.mergeWith(cell2)
        );
    }

    @Test
    void noMergeWithItselfCellTest() {
        Cell cell = new Cell(TWO);
        assertThrows(
                IllegalArgumentException.class,
                () -> cell.canMergeWith(cell)
        );
    }

    @Test
    void equalsSelfTest() {
        Cell cell = new Cell(TWO);
        boolean equals = cell.equals(cell);
        assertTrue(equals);
    }

    @Test
    void equalsTest() {
        Cell cell1 = new Cell(TWO);
        Cell cell2 = new Cell(TWO);
        boolean equals = cell1.equals(cell2);
        assertTrue(equals);
    }

    @Test
    void nonEqualsTest() {
        Cell cell1 = new Cell(ONE);
        Cell cell2 = new Cell(TWO);
        boolean equals = cell1.equals(cell2);
        assertFalse(equals);
    }

    @Test
    void noClassEqualsTest() {
        Cell cell = new Cell(ONE);
        boolean equals = cell.equals(THREE);
        assertFalse(equals);
    }

    @Test
    void nullEqualsTest() {
        Cell cell = new Cell(ONE);
        boolean equals = cell.equals(null);
        assertFalse(equals);
    }

    @Test
    void toStringTest() {
        Cell cell = new Cell(ONE);
        String expected = String.valueOf(ONE);
        String actual = cell.toString();
        assertEquals(expected,actual);
    }

    @Test
    void toStringZeroTest() {
        Cell cell = new Cell(ZERO);
        String expected = ".";
        String actual = cell.toString();
        assertEquals(expected,actual);
    }
    
}
