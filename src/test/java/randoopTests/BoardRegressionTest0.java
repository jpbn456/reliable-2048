package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BoardRegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test001");
        int int0 = ar.edu.unrc.game2048.Board.DEFAULT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test002");
        int int0 = ar.edu.unrc.game2048.Board.WINNING_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test003");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.Cell cell5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((int) (byte) 1, (int) (short) 0, cell5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test004");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Class<?> wildcardClass3 = deterministicBoard1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test005");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        java.lang.Class<?> wildcardClass2 = deterministicBoard1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test006");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell cell7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell(1, (int) ' ', cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test007");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.Cell[] cellArray3 = new ar.edu.unrc.game2048.Cell[] {};
        ar.edu.unrc.game2048.Cell[] cellArray4 = new ar.edu.unrc.game2048.Cell[] {};
        ar.edu.unrc.game2048.Cell[] cellArray5 = new ar.edu.unrc.game2048.Cell[] {};
        ar.edu.unrc.game2048.Cell[][] cellArray6 = new ar.edu.unrc.game2048.Cell[][] { cellArray3, cellArray4, cellArray5 };
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setGrid(cellArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(cellArray3);
        org.junit.Assert.assertArrayEquals(cellArray3, new ar.edu.unrc.game2048.Cell[] {});
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertArrayEquals(cellArray4, new ar.edu.unrc.game2048.Cell[] {});
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertArrayEquals(cellArray5, new ar.edu.unrc.game2048.Cell[] {});
        org.junit.Assert.assertNotNull(cellArray6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test008");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        java.lang.Class<?> wildcardClass3 = deterministicBoard1.getClass();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test011");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = deterministicBoard1.getCell(10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 52) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test012");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        java.lang.Class<?> wildcardClass9 = deterministicBoard1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test013");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = deterministicBoard1.getCell((int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, -1) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test014");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        java.lang.Class<?> wildcardClass5 = deterministicBoard1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test015");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        boolean boolean6 = deterministicBoard1.repOk();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = deterministicBoard1.getCell(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test016");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard10 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray11 = deterministicBoard10.getGrid();
        int int12 = deterministicBoard10.getScore();
        ar.edu.unrc.game2048.Cell cell15 = deterministicBoard10.getCell((int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell(2048, (int) 'a', cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, 97) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cellArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(cell15);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test017");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        deterministicBoard1.setScore((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test018");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        int int9 = deterministicBoard1.getSize();
        boolean boolean10 = deterministicBoard1.isWinningBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int15 = deterministicBoard14.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = deterministicBoard14.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray21 = deterministicBoard20.getGrid();
        int int22 = deterministicBoard20.getScore();
        ar.edu.unrc.game2048.Cell cell25 = deterministicBoard20.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard14.setCell((int) (byte) 10, (int) (byte) 10, cell25);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((int) (short) -1, 10, cell25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 10) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cellArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(cell25);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test020");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getSize();
        boolean boolean8 = deterministicBoard1.isFull();
        ar.edu.unrc.game2048.movement.Direction direction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = deterministicBoard1.move(direction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test021");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getSize();
        boolean boolean8 = deterministicBoard1.isFull();
        java.lang.Class<?> wildcardClass9 = deterministicBoard1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test022");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard2 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int3 = deterministicBoard2.getSize();
        java.lang.Object obj4 = null;
        boolean boolean5 = deterministicBoard2.equals(obj4);
        ar.edu.unrc.game2048.Cell[][] cellArray6 = deterministicBoard2.getGrid();
        boolean boolean7 = deterministicBoard2.isLosingBoard();
        int int8 = deterministicBoard2.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard10 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean11 = deterministicBoard2.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard13 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int14 = deterministicBoard13.getSize();
        java.lang.Object obj15 = null;
        boolean boolean16 = deterministicBoard13.equals(obj15);
        ar.edu.unrc.game2048.Cell[][] cellArray17 = deterministicBoard13.getGrid();
        boolean boolean18 = deterministicBoard13.isLosingBoard();
        int int19 = deterministicBoard13.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard21 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int22 = deterministicBoard21.getSize();
        java.lang.Object obj23 = null;
        boolean boolean24 = deterministicBoard21.equals(obj23);
        ar.edu.unrc.game2048.Cell[][] cellArray25 = deterministicBoard21.getGrid();
        deterministicBoard13.setGrid(cellArray25);
        deterministicBoard2.setGrid(cellArray25);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard0.setGrid(cellArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cellArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cellArray25);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test023");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        boolean boolean27 = deterministicBoard1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test024");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        int int9 = deterministicBoard1.getSize();
        deterministicBoard1.setScore((int) (short) 10);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = deterministicBoard1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(positionSet12);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test025");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        int int4 = deterministicBoard1.getSize();
        int int5 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int10 = deterministicBoard9.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int15 = deterministicBoard14.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = deterministicBoard14.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray21 = deterministicBoard20.getGrid();
        int int22 = deterministicBoard20.getScore();
        ar.edu.unrc.game2048.Cell cell25 = deterministicBoard20.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard14.setCell((int) (byte) 10, (int) (byte) 10, cell25);
        deterministicBoard9.setCell((int) (byte) 10, (int) (byte) 1, cell25);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((int) (byte) 1, 100, cell25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cellArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(cell25);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test026");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test027");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        ar.edu.unrc.game2048.movement.Direction direction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = deterministicBoard0.move(direction2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test028");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard6 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray7 = deterministicBoard6.getGrid();
        int int8 = deterministicBoard6.getScore();
        ar.edu.unrc.game2048.Cell cell11 = deterministicBoard6.getCell((int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell(100, (-1), cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, -1) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertNotNull(cellArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(cell11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test029");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        ar.edu.unrc.game2048.movement.Direction direction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = deterministicBoard1.move(direction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test030");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test031");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = deterministicBoard1.getCell(35, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, -1) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test032");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        java.lang.Class<?> wildcardClass4 = deterministicBoard1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test034");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        boolean boolean6 = deterministicBoard1.repOk();
        boolean boolean7 = deterministicBoard1.repOk();
        ar.edu.unrc.game2048.movement.Direction direction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = deterministicBoard1.move(direction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test035");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        boolean boolean3 = deterministicBoard1.isLosingBoard();
        int int4 = deterministicBoard1.getScore();
        java.lang.Class<?> wildcardClass5 = deterministicBoard1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test036");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        int int5 = deterministicBoard1.getScore();
        boolean boolean6 = deterministicBoard1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test037");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard3 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray4 = deterministicBoard3.getGrid();
        deterministicBoard1.setGrid(cellArray4);
        org.junit.Assert.assertNotNull(cellArray4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test038");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        deterministicBoard1.setScore((int) (short) 0);
        boolean boolean8 = deterministicBoard1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test039");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        int int4 = deterministicBoard1.getSize();
        int int5 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = deterministicBoard1.getEmptyPositions();
        boolean boolean7 = deterministicBoard1.isWinningBoard();
        int int8 = deterministicBoard1.getSize();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test040");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.movement.Direction direction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = deterministicBoard1.move(direction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test041");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        int int27 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.movement.Direction direction28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = deterministicBoard1.move(direction28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test042");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        int int4 = deterministicBoard1.getSize();
        int int5 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = deterministicBoard1.getEmptyPositions();
        boolean boolean7 = deterministicBoard1.isFull();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int10 = deterministicBoard9.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int15 = deterministicBoard14.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = deterministicBoard14.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray21 = deterministicBoard20.getGrid();
        int int22 = deterministicBoard20.getScore();
        ar.edu.unrc.game2048.Cell cell25 = deterministicBoard20.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard14.setCell((int) (byte) 10, (int) (byte) 10, cell25);
        deterministicBoard9.setCell((int) (byte) 10, (int) (byte) 1, cell25);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard29 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int30 = deterministicBoard29.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard34 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int35 = deterministicBoard34.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet36 = deterministicBoard34.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard40 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray41 = deterministicBoard40.getGrid();
        int int42 = deterministicBoard40.getScore();
        ar.edu.unrc.game2048.Cell cell45 = deterministicBoard40.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard34.setCell((int) (byte) 10, (int) (byte) 10, cell45);
        deterministicBoard29.setCell((int) (byte) 10, (int) (byte) 1, cell45);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard49 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray50 = deterministicBoard49.getGrid();
        int int51 = deterministicBoard49.getScore();
        ar.edu.unrc.game2048.Cell cell54 = deterministicBoard49.getCell((int) (byte) 10, (int) ' ');
        ar.edu.unrc.game2048.Cell[] cellArray55 = new ar.edu.unrc.game2048.Cell[] { cell25, cell45, cell54 };
        ar.edu.unrc.game2048.Cell[][] cellArray56 = new ar.edu.unrc.game2048.Cell[][] { cellArray55 };
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setGrid(cellArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cellArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertNotNull(positionSet36);
        org.junit.Assert.assertNotNull(cellArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertNotNull(cellArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(cell54);
        org.junit.Assert.assertNotNull(cellArray55);
        org.junit.Assert.assertNotNull(cellArray56);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test043");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        int int9 = deterministicBoard1.getSize();
        boolean boolean10 = deterministicBoard1.isWinningBoard();
        ar.edu.unrc.game2048.movement.Direction direction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = deterministicBoard1.move(direction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test044");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        boolean boolean6 = deterministicBoard1.repOk();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard11 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int12 = deterministicBoard11.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard16 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int17 = deterministicBoard16.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = deterministicBoard16.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard22 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray23 = deterministicBoard22.getGrid();
        int int24 = deterministicBoard22.getScore();
        ar.edu.unrc.game2048.Cell cell27 = deterministicBoard22.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard16.setCell((int) (byte) 10, (int) (byte) 10, cell27);
        deterministicBoard11.setCell((int) (byte) 10, (int) (byte) 1, cell27);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell(100, (int) (short) 10, cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 10) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertNotNull(cellArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(cell27);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test045");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        boolean boolean3 = deterministicBoard1.isLosingBoard();
        int int4 = deterministicBoard1.getScore();
        boolean boolean5 = deterministicBoard1.repOk();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test046");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        int int9 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard11 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int12 = deterministicBoard11.getSize();
        boolean boolean13 = deterministicBoard1.equals((java.lang.Object) deterministicBoard11);
        java.lang.Class<?> wildcardClass14 = deterministicBoard11.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test047");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        int int9 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.movement.Direction direction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = deterministicBoard1.move(direction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test048");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard6 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int7 = deterministicBoard6.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = deterministicBoard6.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray13 = deterministicBoard12.getGrid();
        int int14 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.Cell cell17 = deterministicBoard12.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard6.setCell((int) (byte) 10, (int) (byte) 10, cell17);
        deterministicBoard1.setCell((int) (byte) 10, (int) (byte) 1, cell17);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard23 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int24 = deterministicBoard23.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = deterministicBoard23.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard29 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray30 = deterministicBoard29.getGrid();
        int int31 = deterministicBoard29.getScore();
        ar.edu.unrc.game2048.Cell cell34 = deterministicBoard29.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard23.setCell((int) (byte) 10, (int) (byte) 10, cell34);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((-1), 100, cell34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 100) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(cellArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertNotNull(cellArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(cell34);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test049");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray8 = deterministicBoard7.getGrid();
        int int9 = deterministicBoard7.getScore();
        ar.edu.unrc.game2048.Cell cell12 = deterministicBoard7.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard1.setCell((int) (byte) 10, (int) (byte) 10, cell12);
        int int14 = deterministicBoard1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test050");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int10 = deterministicBoard9.getSize();
        java.lang.Object obj11 = null;
        boolean boolean12 = deterministicBoard9.equals(obj11);
        ar.edu.unrc.game2048.Cell[][] cellArray13 = deterministicBoard9.getGrid();
        deterministicBoard1.setGrid(cellArray13);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = deterministicBoard1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cellArray13);
        org.junit.Assert.assertNotNull(positionSet15);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test051");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        boolean boolean6 = deterministicBoard1.repOk();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        boolean boolean8 = deterministicBoard1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test052");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        int int2 = deterministicBoard0.getScore();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test053");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard3 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int4 = deterministicBoard3.getSize();
        java.lang.Object obj5 = null;
        boolean boolean6 = deterministicBoard3.equals(obj5);
        ar.edu.unrc.game2048.Cell[][] cellArray7 = deterministicBoard3.getGrid();
        boolean boolean8 = deterministicBoard3.isLosingBoard();
        int int9 = deterministicBoard3.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = deterministicBoard3.getEmptyPositions();
        boolean boolean11 = deterministicBoard0.equals((java.lang.Object) deterministicBoard3);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = deterministicBoard0.getCell((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cellArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test054");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        int int4 = deterministicBoard1.getSize();
        int int5 = deterministicBoard1.getSize();
        boolean boolean6 = deterministicBoard1.repOk();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test055");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = deterministicBoard1.getEmptyPositions();
        deterministicBoard1.setScore((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test056");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard(100);
        boolean boolean2 = deterministicBoard1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test057");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = deterministicBoard1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test058");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = deterministicBoard1.getCell((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, -1) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test059");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        deterministicBoard1.setScore(4);
        java.lang.Class<?> wildcardClass5 = deterministicBoard1.getClass();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test060");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        boolean boolean3 = deterministicBoard0.hasEmptyCells();
        deterministicBoard0.setScore(0);
        boolean boolean6 = deterministicBoard0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test061");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        boolean boolean3 = deterministicBoard1.isLosingBoard();
        int int4 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int8 = deterministicBoard7.getSize();
        java.lang.Object obj9 = null;
        boolean boolean10 = deterministicBoard7.equals(obj9);
        ar.edu.unrc.game2048.Cell[][] cellArray11 = deterministicBoard7.getGrid();
        boolean boolean12 = deterministicBoard7.isLosingBoard();
        int int13 = deterministicBoard7.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard15 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean16 = deterministicBoard7.equals((java.lang.Object) '#');
        boolean boolean17 = deterministicBoard1.equals((java.lang.Object) boolean16);
        ar.edu.unrc.game2048.movement.Direction direction18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = deterministicBoard1.move(direction18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cellArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test062");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        boolean boolean3 = deterministicBoard1.isLosingBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard4 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean5 = deterministicBoard4.repOk();
        boolean boolean6 = deterministicBoard4.repOk();
        deterministicBoard4.setScore((-1));
        ar.edu.unrc.game2048.Cell[][] cellArray9 = deterministicBoard4.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setGrid(cellArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cellArray9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test063");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        boolean boolean11 = deterministicBoard1.isFull();
        ar.edu.unrc.game2048.movement.Direction direction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = deterministicBoard1.move(direction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test064");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) ' ');
        int int2 = deterministicBoard1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test065");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        int int9 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard13 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray14 = deterministicBoard13.getGrid();
        int int15 = deterministicBoard13.getScore();
        ar.edu.unrc.game2048.Cell cell18 = deterministicBoard13.getCell((int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((int) '4', (int) (short) 10, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 10) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(cellArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(cell18);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test066");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        boolean boolean7 = deterministicBoard1.repOk();
        boolean boolean8 = deterministicBoard1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test067");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) (byte) 100);
        ar.edu.unrc.game2048.movement.Direction direction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = deterministicBoard1.move(direction2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test068");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        deterministicBoard1.setScore(4);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard6 = new ar.edu.unrc.game2048.DeterministicBoard((int) (byte) 100);
        ar.edu.unrc.game2048.Cell[][] cellArray7 = deterministicBoard6.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setGrid(cellArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertNotNull(cellArray7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test069");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.isLosingBoard();
        boolean boolean5 = deterministicBoard1.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = deterministicBoard1.getEmptyPositions();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test070");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard3 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int4 = deterministicBoard3.getSize();
        java.lang.Object obj5 = null;
        boolean boolean6 = deterministicBoard3.equals(obj5);
        ar.edu.unrc.game2048.Cell[][] cellArray7 = deterministicBoard3.getGrid();
        boolean boolean8 = deterministicBoard3.isLosingBoard();
        int int9 = deterministicBoard3.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = deterministicBoard3.getEmptyPositions();
        boolean boolean11 = deterministicBoard0.equals((java.lang.Object) deterministicBoard3);
        int int12 = deterministicBoard3.getScore();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cellArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test071");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        deterministicBoard1.setScore((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test072");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        boolean boolean27 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.movement.Direction direction28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = deterministicBoard1.move(direction28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test073");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        int int1 = deterministicBoard0.getScore();
        ar.edu.unrc.game2048.movement.Direction direction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = deterministicBoard0.move(direction2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test074");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard6 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int7 = deterministicBoard6.getSize();
        java.lang.Object obj8 = null;
        boolean boolean9 = deterministicBoard6.equals(obj8);
        ar.edu.unrc.game2048.Cell[][] cellArray10 = deterministicBoard6.getGrid();
        boolean boolean11 = deterministicBoard6.isLosingBoard();
        int int12 = deterministicBoard6.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean15 = deterministicBoard6.equals((java.lang.Object) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = deterministicBoard6.getEmptyPositions();
        boolean boolean17 = deterministicBoard1.equals((java.lang.Object) deterministicBoard6);
        ar.edu.unrc.game2048.Cell[][] cellArray18 = deterministicBoard1.getGrid();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cellArray18);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test075");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.isLosingBoard();
        deterministicBoard1.setScore((int) ' ');
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test076");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.movement.Direction direction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = deterministicBoard1.move(direction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test077");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray8 = deterministicBoard7.getGrid();
        int int9 = deterministicBoard7.getScore();
        ar.edu.unrc.game2048.Cell cell12 = deterministicBoard7.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard1.setCell((int) (byte) 10, (int) (byte) 10, cell12);
        boolean boolean14 = deterministicBoard1.isFull();
        int int15 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.movement.Direction direction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = deterministicBoard1.move(direction16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test078");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard6 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int7 = deterministicBoard6.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = deterministicBoard6.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray13 = deterministicBoard12.getGrid();
        int int14 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.Cell cell17 = deterministicBoard12.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard6.setCell((int) (byte) 10, (int) (byte) 10, cell17);
        deterministicBoard1.setCell((int) (byte) 10, (int) (byte) 1, cell17);
        boolean boolean20 = deterministicBoard1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(cellArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test079");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        boolean boolean11 = deterministicBoard1.isFull();
        boolean boolean12 = deterministicBoard1.hasEmptyCells();
        boolean boolean13 = deterministicBoard1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test080");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard(100);
        boolean boolean2 = deterministicBoard1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test081");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        boolean boolean9 = deterministicBoard1.repOk();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test082");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        boolean boolean7 = deterministicBoard1.repOk();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard11 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int12 = deterministicBoard11.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard16 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int17 = deterministicBoard16.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = deterministicBoard16.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard22 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray23 = deterministicBoard22.getGrid();
        int int24 = deterministicBoard22.getScore();
        ar.edu.unrc.game2048.Cell cell27 = deterministicBoard22.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard16.setCell((int) (byte) 10, (int) (byte) 10, cell27);
        deterministicBoard11.setCell((int) (byte) 10, (int) (byte) 1, cell27);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((int) '#', (int) ' ', cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 32) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertNotNull(cellArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(cell27);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test083");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray8 = deterministicBoard7.getGrid();
        int int9 = deterministicBoard7.getScore();
        ar.edu.unrc.game2048.Cell cell12 = deterministicBoard7.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard1.setCell((int) (byte) 10, (int) (byte) 10, cell12);
        int int14 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard16 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int17 = deterministicBoard16.getSize();
        java.lang.Object obj18 = null;
        boolean boolean19 = deterministicBoard16.equals(obj18);
        ar.edu.unrc.game2048.Cell[][] cellArray20 = deterministicBoard16.getGrid();
        boolean boolean21 = deterministicBoard16.isLosingBoard();
        int int22 = deterministicBoard16.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard24 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean25 = deterministicBoard16.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard27 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int28 = deterministicBoard27.getSize();
        java.lang.Object obj29 = null;
        boolean boolean30 = deterministicBoard27.equals(obj29);
        ar.edu.unrc.game2048.Cell[][] cellArray31 = deterministicBoard27.getGrid();
        boolean boolean32 = deterministicBoard27.isLosingBoard();
        int int33 = deterministicBoard27.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard35 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int36 = deterministicBoard35.getSize();
        java.lang.Object obj37 = null;
        boolean boolean38 = deterministicBoard35.equals(obj37);
        ar.edu.unrc.game2048.Cell[][] cellArray39 = deterministicBoard35.getGrid();
        deterministicBoard27.setGrid(cellArray39);
        deterministicBoard16.setGrid(cellArray39);
        deterministicBoard1.setGrid(cellArray39);
        boolean boolean43 = deterministicBoard1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cellArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cellArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cellArray39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test084");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard6 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int7 = deterministicBoard6.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = deterministicBoard6.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray13 = deterministicBoard12.getGrid();
        int int14 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.Cell cell17 = deterministicBoard12.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard6.setCell((int) (byte) 10, (int) (byte) 10, cell17);
        deterministicBoard1.setCell((int) (byte) 10, (int) (byte) 1, cell17);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = deterministicBoard1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(cellArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(positionSet20);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test085");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        boolean boolean11 = deterministicBoard1.isFull();
        boolean boolean12 = deterministicBoard1.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray13 = deterministicBoard1.getGrid();
        boolean boolean14 = deterministicBoard1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = deterministicBoard1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cellArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(positionSet15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test086");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard6 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int7 = deterministicBoard6.getSize();
        java.lang.Object obj8 = null;
        boolean boolean9 = deterministicBoard6.equals(obj8);
        ar.edu.unrc.game2048.Cell[][] cellArray10 = deterministicBoard6.getGrid();
        boolean boolean11 = deterministicBoard6.isLosingBoard();
        int int12 = deterministicBoard6.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean15 = deterministicBoard6.equals((java.lang.Object) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = deterministicBoard6.getEmptyPositions();
        boolean boolean17 = deterministicBoard1.equals((java.lang.Object) deterministicBoard6);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = deterministicBoard6.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell21 = deterministicBoard6.getCell((int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 1) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(positionSet18);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test087");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        int int4 = deterministicBoard1.getSize();
        int int5 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = deterministicBoard1.getEmptyPositions();
        deterministicBoard1.setScore((int) (byte) 100);
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test088");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.hasEmptyCells();
        int int5 = deterministicBoard1.getScore();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test089");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        boolean boolean3 = deterministicBoard1.hasEmptyCells();
        boolean boolean4 = deterministicBoard1.isWinningBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard8 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray9 = deterministicBoard8.getGrid();
        int int10 = deterministicBoard8.getScore();
        ar.edu.unrc.game2048.Cell cell13 = deterministicBoard8.getCell((int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((int) (byte) -1, (int) 'a', cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 97) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(cell13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test090");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        boolean boolean27 = deterministicBoard1.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray28 = deterministicBoard1.getGrid();
        int int29 = deterministicBoard1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cellArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test091");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        boolean boolean3 = deterministicBoard0.hasEmptyCells();
        java.lang.String str4 = deterministicBoard0.toString();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard0.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = deterministicBoard0.getCell((-1), 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(cellArray5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test092");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        boolean boolean3 = deterministicBoard0.hasEmptyCells();
        java.lang.String str4 = deterministicBoard0.toString();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard0.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = deterministicBoard0.getCell((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(cellArray5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test093");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean2 = deterministicBoard1.isLosingBoard();
        boolean boolean3 = deterministicBoard1.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test094");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        boolean boolean9 = deterministicBoard1.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass10 = deterministicBoard1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test095");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard3 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int4 = deterministicBoard3.getSize();
        java.lang.Object obj5 = null;
        boolean boolean6 = deterministicBoard3.equals(obj5);
        ar.edu.unrc.game2048.Cell[][] cellArray7 = deterministicBoard3.getGrid();
        boolean boolean8 = deterministicBoard3.isLosingBoard();
        int int9 = deterministicBoard3.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = deterministicBoard3.getEmptyPositions();
        boolean boolean11 = deterministicBoard0.equals((java.lang.Object) deterministicBoard3);
        int int12 = deterministicBoard3.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cellArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test096");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        boolean boolean3 = deterministicBoard0.hasEmptyCells();
        java.lang.String str4 = deterministicBoard0.toString();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard0.getGrid();
        ar.edu.unrc.game2048.movement.Direction direction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = deterministicBoard0.move(direction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(cellArray5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test097");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        int int11 = deterministicBoard1.getScore();
        boolean boolean12 = deterministicBoard1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test098");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        deterministicBoard1.setScore((int) (short) 0);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int10 = deterministicBoard9.getSize();
        boolean boolean11 = deterministicBoard9.isLosingBoard();
        int int12 = deterministicBoard9.getScore();
        ar.edu.unrc.game2048.Cell[][] cellArray13 = deterministicBoard9.getGrid();
        deterministicBoard1.setGrid(cellArray13);
        boolean boolean15 = deterministicBoard1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(cellArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test099");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) (byte) 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test100");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = deterministicBoard1.getEmptyPositions();
        boolean boolean9 = deterministicBoard1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test101");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        boolean boolean3 = deterministicBoard0.hasEmptyCells();
        deterministicBoard0.setScore(0);
        boolean boolean6 = deterministicBoard0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test102");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        java.lang.String str1 = deterministicBoard0.toString();
        java.lang.String str2 = deterministicBoard0.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = deterministicBoard0.getCell((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str1, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test103");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        boolean boolean6 = deterministicBoard1.repOk();
        boolean boolean7 = deterministicBoard1.repOk();
        deterministicBoard1.setScore((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test104");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        int int27 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard29 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray30 = deterministicBoard29.getGrid();
        int int31 = deterministicBoard29.getScore();
        int int32 = deterministicBoard29.getSize();
        int int33 = deterministicBoard29.getSize();
        boolean boolean34 = deterministicBoard1.equals((java.lang.Object) deterministicBoard29);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard36 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int37 = deterministicBoard36.getSize();
        java.lang.Object obj38 = null;
        boolean boolean39 = deterministicBoard36.equals(obj38);
        ar.edu.unrc.game2048.Cell[][] cellArray40 = deterministicBoard36.getGrid();
        boolean boolean41 = deterministicBoard36.isLosingBoard();
        int int42 = deterministicBoard36.getScore();
        int int43 = deterministicBoard36.getSize();
        ar.edu.unrc.game2048.Cell[][] cellArray44 = deterministicBoard36.getGrid();
        boolean boolean45 = deterministicBoard29.equals((java.lang.Object) deterministicBoard36);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard47 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int48 = deterministicBoard47.getSize();
        java.lang.Object obj49 = null;
        boolean boolean50 = deterministicBoard47.equals(obj49);
        ar.edu.unrc.game2048.Cell[][] cellArray51 = deterministicBoard47.getGrid();
        boolean boolean52 = deterministicBoard47.hasEmptyCells();
        int int53 = deterministicBoard47.getSize();
        boolean boolean54 = deterministicBoard29.equals((java.lang.Object) deterministicBoard47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(cellArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cellArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertNotNull(cellArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cellArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test105");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        int int27 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.Cell[][] cellArray28 = deterministicBoard1.getGrid();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(cellArray28);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test106");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard(2048);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard3 = new ar.edu.unrc.game2048.DeterministicBoard((int) (byte) 100);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = deterministicBoard3.getGrid();
        boolean boolean5 = deterministicBoard1.equals((java.lang.Object) cellArray4);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int8 = deterministicBoard7.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = deterministicBoard7.getEmptyPositions();
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) deterministicBoard7);
        boolean boolean11 = deterministicBoard1.hasEmptyCells();
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test107");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getSize();
        boolean boolean8 = deterministicBoard1.isFull();
        int int9 = deterministicBoard1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test108");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard6 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int7 = deterministicBoard6.getSize();
        java.lang.Object obj8 = null;
        boolean boolean9 = deterministicBoard6.equals(obj8);
        ar.edu.unrc.game2048.Cell[][] cellArray10 = deterministicBoard6.getGrid();
        boolean boolean11 = deterministicBoard6.isLosingBoard();
        int int12 = deterministicBoard6.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean15 = deterministicBoard6.equals((java.lang.Object) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = deterministicBoard6.getEmptyPositions();
        boolean boolean17 = deterministicBoard1.equals((java.lang.Object) deterministicBoard6);
        boolean boolean19 = deterministicBoard1.equals((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test109");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard3 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int4 = deterministicBoard3.getSize();
        java.lang.Object obj5 = null;
        boolean boolean6 = deterministicBoard3.equals(obj5);
        ar.edu.unrc.game2048.Cell[][] cellArray7 = deterministicBoard3.getGrid();
        boolean boolean8 = deterministicBoard3.isLosingBoard();
        int int9 = deterministicBoard3.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = deterministicBoard3.getEmptyPositions();
        boolean boolean11 = deterministicBoard0.equals((java.lang.Object) deterministicBoard3);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard13 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int14 = deterministicBoard13.getSize();
        java.lang.Object obj15 = null;
        boolean boolean16 = deterministicBoard13.equals(obj15);
        int int17 = deterministicBoard13.getScore();
        ar.edu.unrc.game2048.Cell[][] cellArray18 = deterministicBoard13.getGrid();
        deterministicBoard3.setGrid(cellArray18);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cellArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(cellArray18);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test110");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        boolean boolean27 = deterministicBoard1.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray28 = deterministicBoard1.getGrid();
        int int29 = deterministicBoard1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cellArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test111");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard(2048);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard3 = new ar.edu.unrc.game2048.DeterministicBoard((int) (byte) 100);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = deterministicBoard3.getGrid();
        boolean boolean5 = deterministicBoard1.equals((java.lang.Object) cellArray4);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int8 = deterministicBoard7.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = deterministicBoard7.getEmptyPositions();
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) deterministicBoard7);
        boolean boolean11 = deterministicBoard1.repOk();
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test112");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test113");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard(35);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test114");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        boolean boolean4 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard8 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int9 = deterministicBoard8.getSize();
        java.lang.Object obj10 = null;
        boolean boolean11 = deterministicBoard8.equals(obj10);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard15 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int16 = deterministicBoard15.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet22 = deterministicBoard20.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard26 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray27 = deterministicBoard26.getGrid();
        int int28 = deterministicBoard26.getScore();
        ar.edu.unrc.game2048.Cell cell31 = deterministicBoard26.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard20.setCell((int) (byte) 10, (int) (byte) 10, cell31);
        deterministicBoard15.setCell((int) (byte) 10, (int) (byte) 1, cell31);
        deterministicBoard8.setCell((int) (short) 10, (int) (byte) 10, cell31);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((-1), (int) (byte) 0, cell31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 0) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(positionSet22);
        org.junit.Assert.assertNotNull(cellArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(cell31);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test115");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray8 = deterministicBoard7.getGrid();
        int int9 = deterministicBoard7.getScore();
        ar.edu.unrc.game2048.Cell cell12 = deterministicBoard7.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard1.setCell((int) (byte) 10, (int) (byte) 10, cell12);
        boolean boolean14 = deterministicBoard1.isFull();
        int int15 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard19 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int20 = deterministicBoard19.getSize();
        java.lang.Object obj21 = null;
        boolean boolean22 = deterministicBoard19.equals(obj21);
        boolean boolean23 = deterministicBoard19.isWinningBoard();
        deterministicBoard19.setScore((int) (short) 0);
        ar.edu.unrc.game2048.Cell cell28 = deterministicBoard19.getCell(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((int) (short) 1, 100, cell28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell28);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test116");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isWinningBoard();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test117");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        int int27 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard29 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray30 = deterministicBoard29.getGrid();
        int int31 = deterministicBoard29.getScore();
        int int32 = deterministicBoard29.getSize();
        int int33 = deterministicBoard29.getSize();
        boolean boolean34 = deterministicBoard1.equals((java.lang.Object) deterministicBoard29);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard36 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int37 = deterministicBoard36.getSize();
        java.lang.Object obj38 = null;
        boolean boolean39 = deterministicBoard36.equals(obj38);
        ar.edu.unrc.game2048.Cell[][] cellArray40 = deterministicBoard36.getGrid();
        boolean boolean41 = deterministicBoard36.isLosingBoard();
        int int42 = deterministicBoard36.getScore();
        int int43 = deterministicBoard36.getSize();
        ar.edu.unrc.game2048.Cell[][] cellArray44 = deterministicBoard36.getGrid();
        boolean boolean45 = deterministicBoard29.equals((java.lang.Object) deterministicBoard36);
        deterministicBoard29.setScore((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(cellArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cellArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertNotNull(cellArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test118");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        boolean boolean3 = deterministicBoard1.isWinningBoard();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test119");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard(100);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard3 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int4 = deterministicBoard3.getSize();
        java.lang.Object obj5 = null;
        boolean boolean6 = deterministicBoard3.equals(obj5);
        ar.edu.unrc.game2048.Cell[][] cellArray7 = deterministicBoard3.getGrid();
        boolean boolean8 = deterministicBoard3.isLosingBoard();
        int int9 = deterministicBoard3.getScore();
        int int10 = deterministicBoard3.getSize();
        int int11 = deterministicBoard3.getSize();
        boolean boolean12 = deterministicBoard3.isWinningBoard();
        boolean boolean13 = deterministicBoard3.repOk();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard15 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int16 = deterministicBoard15.getSize();
        java.lang.Object obj17 = null;
        boolean boolean18 = deterministicBoard15.equals(obj17);
        ar.edu.unrc.game2048.Cell[][] cellArray19 = deterministicBoard15.getGrid();
        boolean boolean20 = deterministicBoard15.isLosingBoard();
        int int21 = deterministicBoard15.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard23 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int24 = deterministicBoard23.getSize();
        java.lang.Object obj25 = null;
        boolean boolean26 = deterministicBoard23.equals(obj25);
        ar.edu.unrc.game2048.Cell[][] cellArray27 = deterministicBoard23.getGrid();
        deterministicBoard15.setGrid(cellArray27);
        deterministicBoard3.setGrid(cellArray27);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setGrid(cellArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cellArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cellArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cellArray27);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test120");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        int int27 = deterministicBoard1.getSize();
        boolean boolean28 = deterministicBoard1.isWinningBoard();
        boolean boolean29 = deterministicBoard1.repOk();
        int int30 = deterministicBoard1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test121");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean2 = deterministicBoard1.isLosingBoard();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test122");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        boolean boolean4 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard8 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int9 = deterministicBoard8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = deterministicBoard8.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray15 = deterministicBoard14.getGrid();
        int int16 = deterministicBoard14.getScore();
        ar.edu.unrc.game2048.Cell cell19 = deterministicBoard14.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard8.setCell((int) (byte) 10, (int) (byte) 10, cell19);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((int) (byte) 0, (int) (short) 100, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 100) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertNotNull(cellArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(cell19);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test123");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        int int4 = deterministicBoard1.getSize();
        boolean boolean5 = deterministicBoard1.hasEmptyCells();
        boolean boolean6 = deterministicBoard1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test124");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        boolean boolean11 = deterministicBoard1.isFull();
        ar.edu.unrc.game2048.Cell[][] cellArray12 = deterministicBoard1.getGrid();
        boolean boolean13 = deterministicBoard1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cellArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test125");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        deterministicBoard1.setScore((int) (short) 0);
        boolean boolean9 = deterministicBoard1.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        ar.edu.unrc.game2048.Cell cell12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((int) '#', (-1), cell12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, -1) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test126");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray8 = deterministicBoard7.getGrid();
        int int9 = deterministicBoard7.getScore();
        ar.edu.unrc.game2048.Cell cell12 = deterministicBoard7.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard1.setCell((int) (byte) 10, (int) (byte) 10, cell12);
        int int14 = deterministicBoard1.getScore();
        boolean boolean15 = deterministicBoard1.isWinningBoard();
        int int16 = deterministicBoard1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test127");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray8 = deterministicBoard7.getGrid();
        int int9 = deterministicBoard7.getScore();
        ar.edu.unrc.game2048.Cell cell12 = deterministicBoard7.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard1.setCell((int) (byte) 10, (int) (byte) 10, cell12);
        int int14 = deterministicBoard1.getScore();
        boolean boolean15 = deterministicBoard1.isLosingBoard();
        ar.edu.unrc.game2048.movement.Direction direction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = deterministicBoard1.move(direction16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test128");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        boolean boolean6 = deterministicBoard1.repOk();
        ar.edu.unrc.game2048.Cell cell9 = deterministicBoard1.getCell((int) ' ', (int) (byte) 1);
        boolean boolean10 = deterministicBoard1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test129");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        boolean boolean27 = deterministicBoard1.hasEmptyCells();
        boolean boolean28 = deterministicBoard1.hasEmptyCells();
        deterministicBoard1.setScore((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test130");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray8 = deterministicBoard7.getGrid();
        int int9 = deterministicBoard7.getScore();
        ar.edu.unrc.game2048.Cell cell12 = deterministicBoard7.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard1.setCell((int) (byte) 10, (int) (byte) 10, cell12);
        boolean boolean14 = deterministicBoard1.isFull();
        int int15 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = deterministicBoard1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(positionSet16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test131");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.hasEmptyCells();
        boolean boolean5 = deterministicBoard1.isLosingBoard();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test132");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        int int27 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard29 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray30 = deterministicBoard29.getGrid();
        int int31 = deterministicBoard29.getScore();
        int int32 = deterministicBoard29.getSize();
        int int33 = deterministicBoard29.getSize();
        boolean boolean34 = deterministicBoard1.equals((java.lang.Object) deterministicBoard29);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard36 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int37 = deterministicBoard36.getSize();
        java.lang.Object obj38 = null;
        boolean boolean39 = deterministicBoard36.equals(obj38);
        ar.edu.unrc.game2048.Cell[][] cellArray40 = deterministicBoard36.getGrid();
        boolean boolean41 = deterministicBoard36.isLosingBoard();
        int int42 = deterministicBoard36.getScore();
        int int43 = deterministicBoard36.getSize();
        ar.edu.unrc.game2048.Cell[][] cellArray44 = deterministicBoard36.getGrid();
        boolean boolean45 = deterministicBoard29.equals((java.lang.Object) deterministicBoard36);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard47 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray48 = deterministicBoard47.getGrid();
        int int49 = deterministicBoard47.getScore();
        boolean boolean50 = deterministicBoard47.isLosingBoard();
        boolean boolean51 = deterministicBoard29.equals((java.lang.Object) deterministicBoard47);
        java.lang.Class<?> wildcardClass52 = deterministicBoard47.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(cellArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cellArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertNotNull(cellArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cellArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test133");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean2 = deterministicBoard1.isLosingBoard();
        boolean boolean3 = deterministicBoard1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test134");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.isLosingBoard();
        int int5 = deterministicBoard1.getScore();
        int int6 = deterministicBoard1.getSize();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test135");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.hasEmptyCells();
        boolean boolean7 = deterministicBoard1.repOk();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test136");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        boolean boolean4 = deterministicBoard1.hasEmptyCells();
        int int5 = deterministicBoard1.getScore();
        boolean boolean6 = deterministicBoard1.repOk();
        ar.edu.unrc.game2048.Cell cell9 = deterministicBoard1.getCell((int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = deterministicBoard1.getCell((int) '4', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 35) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test137");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        boolean boolean3 = deterministicBoard0.hasEmptyCells();
        int int4 = deterministicBoard0.getSize();
        boolean boolean5 = deterministicBoard0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test138");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        int int4 = deterministicBoard1.getSize();
        int int5 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = deterministicBoard1.getEmptyPositions();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.movement.Direction direction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = deterministicBoard1.move(direction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test139");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        boolean boolean3 = deterministicBoard1.isLosingBoard();
        java.lang.Class<?> wildcardClass4 = deterministicBoard1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test140");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        deterministicBoard0.setScore((-1));
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard0.getGrid();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int10 = deterministicBoard9.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int15 = deterministicBoard14.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = deterministicBoard14.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray21 = deterministicBoard20.getGrid();
        int int22 = deterministicBoard20.getScore();
        ar.edu.unrc.game2048.Cell cell25 = deterministicBoard20.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard14.setCell((int) (byte) 10, (int) (byte) 10, cell25);
        deterministicBoard9.setCell((int) (byte) 10, (int) (byte) 1, cell25);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard0.setCell((int) (byte) 100, (int) (byte) 0, cell25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cellArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(cell25);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test141");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = deterministicBoard1.getEmptyPositions();
        deterministicBoard1.setScore((int) (byte) -1);
        ar.edu.unrc.game2048.movement.Direction direction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = deterministicBoard1.move(direction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test142");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getSize();
        boolean boolean8 = deterministicBoard1.isFull();
        boolean boolean9 = deterministicBoard1.repOk();
        boolean boolean10 = deterministicBoard1.hasEmptyCells();
        boolean boolean11 = deterministicBoard1.isLosingBoard();
        boolean boolean12 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard16 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray17 = deterministicBoard16.getGrid();
        int int18 = deterministicBoard16.getScore();
        ar.edu.unrc.game2048.Cell cell21 = deterministicBoard16.getCell((int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((int) ' ', (-1), cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, -1) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cellArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(cell21);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test143");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        boolean boolean3 = deterministicBoard0.hasEmptyCells();
        int int4 = deterministicBoard0.getSize();
        int int5 = deterministicBoard0.getSize();
        java.lang.String str6 = deterministicBoard0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test144");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getSize();
        boolean boolean8 = deterministicBoard1.isFull();
        boolean boolean9 = deterministicBoard1.repOk();
        boolean boolean10 = deterministicBoard1.hasEmptyCells();
        boolean boolean11 = deterministicBoard1.isLosingBoard();
        boolean boolean12 = deterministicBoard1.hasEmptyCells();
        int int13 = deterministicBoard1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test145");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.hasEmptyCells();
        boolean boolean5 = deterministicBoard1.repOk();
        boolean boolean6 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard8 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int9 = deterministicBoard8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = deterministicBoard8.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray15 = deterministicBoard14.getGrid();
        int int16 = deterministicBoard14.getScore();
        ar.edu.unrc.game2048.Cell cell19 = deterministicBoard14.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard8.setCell((int) (byte) 10, (int) (byte) 10, cell19);
        int int21 = deterministicBoard8.getScore();
        boolean boolean22 = deterministicBoard8.isLosingBoard();
        boolean boolean23 = deterministicBoard1.equals((java.lang.Object) boolean22);
        int int24 = deterministicBoard1.getSize();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertNotNull(cellArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test146");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        int int9 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard11 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int12 = deterministicBoard11.getSize();
        boolean boolean13 = deterministicBoard1.equals((java.lang.Object) deterministicBoard11);
        ar.edu.unrc.game2048.Cell[][] cellArray14 = deterministicBoard1.getGrid();
        int int15 = deterministicBoard1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cellArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test147");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getSize();
        int int8 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean21 = deterministicBoard12.equals((java.lang.Object) '#');
        boolean boolean22 = deterministicBoard12.isFull();
        boolean boolean23 = deterministicBoard12.isWinningBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard25 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int26 = deterministicBoard25.getSize();
        java.lang.Object obj27 = null;
        boolean boolean28 = deterministicBoard25.equals(obj27);
        ar.edu.unrc.game2048.Cell[][] cellArray29 = deterministicBoard25.getGrid();
        boolean boolean30 = deterministicBoard25.isLosingBoard();
        int int31 = deterministicBoard25.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard33 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int34 = deterministicBoard33.getSize();
        java.lang.Object obj35 = null;
        boolean boolean36 = deterministicBoard33.equals(obj35);
        ar.edu.unrc.game2048.Cell[][] cellArray37 = deterministicBoard33.getGrid();
        deterministicBoard25.setGrid(cellArray37);
        deterministicBoard12.setGrid(cellArray37);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard43 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int44 = deterministicBoard43.getSize();
        java.lang.Object obj45 = null;
        boolean boolean46 = deterministicBoard43.equals(obj45);
        boolean boolean47 = deterministicBoard43.isWinningBoard();
        deterministicBoard43.setScore((int) (short) 0);
        ar.edu.unrc.game2048.Cell cell52 = deterministicBoard43.getCell(0, 0);
        deterministicBoard12.setCell((int) (byte) 10, (int) (byte) 1, cell52);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell(0, (int) (byte) 100, cell52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 100) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cellArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cellArray37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell52);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test148");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        boolean boolean8 = deterministicBoard1.isLosingBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean21 = deterministicBoard12.equals((java.lang.Object) '#');
        boolean boolean22 = deterministicBoard12.isFull();
        boolean boolean23 = deterministicBoard12.isWinningBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard25 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int26 = deterministicBoard25.getSize();
        java.lang.Object obj27 = null;
        boolean boolean28 = deterministicBoard25.equals(obj27);
        ar.edu.unrc.game2048.Cell[][] cellArray29 = deterministicBoard25.getGrid();
        boolean boolean30 = deterministicBoard25.isLosingBoard();
        int int31 = deterministicBoard25.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard33 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int34 = deterministicBoard33.getSize();
        java.lang.Object obj35 = null;
        boolean boolean36 = deterministicBoard33.equals(obj35);
        ar.edu.unrc.game2048.Cell[][] cellArray37 = deterministicBoard33.getGrid();
        deterministicBoard25.setGrid(cellArray37);
        deterministicBoard12.setGrid(cellArray37);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard43 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int44 = deterministicBoard43.getSize();
        java.lang.Object obj45 = null;
        boolean boolean46 = deterministicBoard43.equals(obj45);
        boolean boolean47 = deterministicBoard43.isWinningBoard();
        deterministicBoard43.setScore((int) (short) 0);
        ar.edu.unrc.game2048.Cell cell52 = deterministicBoard43.getCell(0, 0);
        deterministicBoard12.setCell((int) (byte) 10, (int) (byte) 1, cell52);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell(2048, (int) (short) 100, cell52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, 100) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cellArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cellArray37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell52);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test149");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        deterministicBoard1.setScore(4);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = deterministicBoard1.getCell((int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 35) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test150");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        boolean boolean3 = deterministicBoard1.hasEmptyCells();
        boolean boolean4 = deterministicBoard1.isWinningBoard();
        int int5 = deterministicBoard1.getScore();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test151");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        boolean boolean11 = deterministicBoard1.isFull();
        boolean boolean12 = deterministicBoard1.isWinningBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int15 = deterministicBoard14.getSize();
        java.lang.Object obj16 = null;
        boolean boolean17 = deterministicBoard14.equals(obj16);
        ar.edu.unrc.game2048.Cell[][] cellArray18 = deterministicBoard14.getGrid();
        boolean boolean19 = deterministicBoard14.isLosingBoard();
        int int20 = deterministicBoard14.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard22 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int23 = deterministicBoard22.getSize();
        java.lang.Object obj24 = null;
        boolean boolean25 = deterministicBoard22.equals(obj24);
        ar.edu.unrc.game2048.Cell[][] cellArray26 = deterministicBoard22.getGrid();
        deterministicBoard14.setGrid(cellArray26);
        deterministicBoard1.setGrid(cellArray26);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard32 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int33 = deterministicBoard32.getSize();
        java.lang.Object obj34 = null;
        boolean boolean35 = deterministicBoard32.equals(obj34);
        boolean boolean36 = deterministicBoard32.isWinningBoard();
        deterministicBoard32.setScore((int) (short) 0);
        ar.edu.unrc.game2048.Cell cell41 = deterministicBoard32.getCell(0, 0);
        deterministicBoard1.setCell((int) (byte) 10, (int) (byte) 1, cell41);
        int int43 = deterministicBoard1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cellArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cellArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test152");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) ' ');
        boolean boolean2 = deterministicBoard1.isLosingBoard();
        boolean boolean3 = deterministicBoard1.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test153");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard(10);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        deterministicBoard1.setScore(2048);
        org.junit.Assert.assertNotNull(cellArray2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test154");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = deterministicBoard1.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = deterministicBoard1.getCell(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test155");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        int int5 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = deterministicBoard1.getGrid();
        boolean boolean7 = deterministicBoard1.repOk();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = deterministicBoard1.getCell(35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 100) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test156");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        deterministicBoard1.setScore(0);
        boolean boolean10 = deterministicBoard1.isWinningBoard();
        boolean boolean11 = deterministicBoard1.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = deterministicBoard1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet12);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test157");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = deterministicBoard1.getEmptyPositions();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test158");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard(10);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard3 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray4 = deterministicBoard3.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setGrid(cellArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray4);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test159");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        boolean boolean11 = deterministicBoard1.isFull();
        boolean boolean12 = deterministicBoard1.isWinningBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int15 = deterministicBoard14.getSize();
        java.lang.Object obj16 = null;
        boolean boolean17 = deterministicBoard14.equals(obj16);
        ar.edu.unrc.game2048.Cell[][] cellArray18 = deterministicBoard14.getGrid();
        boolean boolean19 = deterministicBoard14.isLosingBoard();
        int int20 = deterministicBoard14.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard22 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int23 = deterministicBoard22.getSize();
        java.lang.Object obj24 = null;
        boolean boolean25 = deterministicBoard22.equals(obj24);
        ar.edu.unrc.game2048.Cell[][] cellArray26 = deterministicBoard22.getGrid();
        deterministicBoard14.setGrid(cellArray26);
        deterministicBoard1.setGrid(cellArray26);
        boolean boolean29 = deterministicBoard1.hasEmptyCells();
        boolean boolean30 = deterministicBoard1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cellArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cellArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test160");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        ar.edu.unrc.game2048.movement.Direction direction27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = deterministicBoard1.move(direction27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test161");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int10 = deterministicBoard9.getSize();
        java.lang.Object obj11 = null;
        boolean boolean12 = deterministicBoard9.equals(obj11);
        ar.edu.unrc.game2048.Cell[][] cellArray13 = deterministicBoard9.getGrid();
        deterministicBoard1.setGrid(cellArray13);
        int int15 = deterministicBoard1.getSize();
        int int16 = deterministicBoard1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cellArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test162");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.Cell[][] cellArray9 = deterministicBoard1.getGrid();
        boolean boolean11 = deterministicBoard1.equals((java.lang.Object) false);
        ar.edu.unrc.game2048.Cell[][] cellArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setGrid(cellArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(cellArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test163");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.Cell[][] cellArray9 = deterministicBoard1.getGrid();
        boolean boolean10 = deterministicBoard1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(cellArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test164");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        boolean boolean11 = deterministicBoard1.isFull();
        boolean boolean12 = deterministicBoard1.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray13 = deterministicBoard1.getGrid();
        boolean boolean14 = deterministicBoard1.hasEmptyCells();
        boolean boolean15 = deterministicBoard1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cellArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test165");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        boolean boolean3 = deterministicBoard0.hasEmptyCells();
        java.lang.String str4 = deterministicBoard0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = deterministicBoard0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test166");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = deterministicBoard1.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean21 = deterministicBoard12.equals((java.lang.Object) '#');
        boolean boolean22 = deterministicBoard12.isFull();
        boolean boolean23 = deterministicBoard12.isWinningBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard25 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int26 = deterministicBoard25.getSize();
        java.lang.Object obj27 = null;
        boolean boolean28 = deterministicBoard25.equals(obj27);
        ar.edu.unrc.game2048.Cell[][] cellArray29 = deterministicBoard25.getGrid();
        boolean boolean30 = deterministicBoard25.isLosingBoard();
        int int31 = deterministicBoard25.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard33 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int34 = deterministicBoard33.getSize();
        java.lang.Object obj35 = null;
        boolean boolean36 = deterministicBoard33.equals(obj35);
        ar.edu.unrc.game2048.Cell[][] cellArray37 = deterministicBoard33.getGrid();
        deterministicBoard25.setGrid(cellArray37);
        deterministicBoard12.setGrid(cellArray37);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard43 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int44 = deterministicBoard43.getSize();
        java.lang.Object obj45 = null;
        boolean boolean46 = deterministicBoard43.equals(obj45);
        boolean boolean47 = deterministicBoard43.isWinningBoard();
        deterministicBoard43.setScore((int) (short) 0);
        ar.edu.unrc.game2048.Cell cell52 = deterministicBoard43.getCell(0, 0);
        deterministicBoard12.setCell((int) (byte) 10, (int) (byte) 1, cell52);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell(0, (int) (byte) 100, cell52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 100) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cellArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cellArray37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell52);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test167");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        int int6 = deterministicBoard1.getScore();
        boolean boolean7 = deterministicBoard1.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray8 = deterministicBoard1.getGrid();
        boolean boolean9 = deterministicBoard1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test168");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        int int4 = deterministicBoard1.getSize();
        int int5 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = deterministicBoard1.getEmptyPositions();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        boolean boolean8 = deterministicBoard1.isLosingBoard();
        boolean boolean9 = deterministicBoard1.hasEmptyCells();
        java.lang.Class<?> wildcardClass10 = deterministicBoard1.getClass();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test169");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = deterministicBoard1.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int8 = deterministicBoard7.getSize();
        boolean boolean9 = deterministicBoard7.isLosingBoard();
        int int10 = deterministicBoard7.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard7.setGrid(cellArray24);
        ar.edu.unrc.game2048.Cell[][] cellArray27 = deterministicBoard7.getGrid();
        deterministicBoard1.setGrid(cellArray27);
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertNotNull(cellArray27);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test170");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard3 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int4 = deterministicBoard3.getSize();
        java.lang.Object obj5 = null;
        boolean boolean6 = deterministicBoard3.equals(obj5);
        ar.edu.unrc.game2048.Cell[][] cellArray7 = deterministicBoard3.getGrid();
        boolean boolean8 = deterministicBoard3.isLosingBoard();
        int int9 = deterministicBoard3.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = deterministicBoard3.getEmptyPositions();
        boolean boolean11 = deterministicBoard0.equals((java.lang.Object) deterministicBoard3);
        boolean boolean12 = deterministicBoard0.isLosingBoard();
        deterministicBoard0.setScore((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cellArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test171");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        boolean boolean3 = deterministicBoard0.hasEmptyCells();
        int int4 = deterministicBoard0.getSize();
        int int5 = deterministicBoard0.getSize();
        int int6 = deterministicBoard0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test172");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        deterministicBoard0.setScore((-1));
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard0.getGrid();
        ar.edu.unrc.game2048.Cell cell8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard0.setCell((int) ' ', (int) '#', cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cellArray5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test173");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        boolean boolean4 = deterministicBoard1.isFull();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard6 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int7 = deterministicBoard6.getSize();
        java.lang.Object obj8 = null;
        boolean boolean9 = deterministicBoard6.equals(obj8);
        int int10 = deterministicBoard6.getScore();
        ar.edu.unrc.game2048.Cell[][] cellArray11 = deterministicBoard6.getGrid();
        deterministicBoard1.setGrid(cellArray11);
        ar.edu.unrc.game2048.movement.Direction direction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = deterministicBoard1.move(direction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(cellArray11);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test174");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        int int1 = deterministicBoard0.getScore();
        boolean boolean2 = deterministicBoard0.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = deterministicBoard0.getCell(2048, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test175");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        int int6 = deterministicBoard1.getScore();
        int int7 = deterministicBoard1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test176");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        int int5 = deterministicBoard1.getScore();
        int int6 = deterministicBoard1.getSize();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getScore();
        deterministicBoard1.setScore(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test177");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        int int2 = deterministicBoard0.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard0.getEmptyPositions();
        java.lang.Object obj4 = null;
        boolean boolean5 = deterministicBoard0.equals(obj4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test178");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        deterministicBoard0.setScore((-1));
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard0.getGrid();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int8 = deterministicBoard7.getSize();
        boolean boolean9 = deterministicBoard7.isLosingBoard();
        int int10 = deterministicBoard7.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard7.setGrid(cellArray24);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard0.setGrid(cellArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test179");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.isLosingBoard();
        int int5 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int8 = deterministicBoard7.getSize();
        java.lang.Object obj9 = null;
        boolean boolean10 = deterministicBoard7.equals(obj9);
        ar.edu.unrc.game2048.Cell[][] cellArray11 = deterministicBoard7.getGrid();
        boolean boolean12 = deterministicBoard7.isLosingBoard();
        int int13 = deterministicBoard7.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard15 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean16 = deterministicBoard7.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard18 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int19 = deterministicBoard18.getSize();
        java.lang.Object obj20 = null;
        boolean boolean21 = deterministicBoard18.equals(obj20);
        ar.edu.unrc.game2048.Cell[][] cellArray22 = deterministicBoard18.getGrid();
        boolean boolean23 = deterministicBoard18.isLosingBoard();
        int int24 = deterministicBoard18.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard26 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int27 = deterministicBoard26.getSize();
        java.lang.Object obj28 = null;
        boolean boolean29 = deterministicBoard26.equals(obj28);
        ar.edu.unrc.game2048.Cell[][] cellArray30 = deterministicBoard26.getGrid();
        deterministicBoard18.setGrid(cellArray30);
        deterministicBoard7.setGrid(cellArray30);
        boolean boolean33 = deterministicBoard7.isWinningBoard();
        boolean boolean34 = deterministicBoard1.equals((java.lang.Object) deterministicBoard7);
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cellArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cellArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cellArray30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test180");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        boolean boolean6 = deterministicBoard1.repOk();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = deterministicBoard1.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard10 = new ar.edu.unrc.game2048.DeterministicBoard((int) (byte) 100);
        ar.edu.unrc.game2048.Cell[][] cellArray11 = deterministicBoard10.getGrid();
        boolean boolean12 = deterministicBoard1.equals((java.lang.Object) cellArray11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(cellArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test181");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        boolean boolean11 = deterministicBoard1.isFull();
        ar.edu.unrc.game2048.Cell[][] cellArray12 = deterministicBoard1.getGrid();
        ar.edu.unrc.game2048.Cell cell15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((int) (short) 1, (-1), cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, -1) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cellArray12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test182");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.Cell cell6 = deterministicBoard1.getCell((int) (byte) 10, (int) ' ');
        boolean boolean8 = deterministicBoard1.equals((java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test183");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        boolean boolean11 = deterministicBoard1.isFull();
        ar.edu.unrc.game2048.Cell[][] cellArray12 = deterministicBoard1.getGrid();
        boolean boolean13 = deterministicBoard1.hasEmptyCells();
        deterministicBoard1.setScore((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cellArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test184");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard(2048);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard3 = new ar.edu.unrc.game2048.DeterministicBoard((int) (byte) 100);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = deterministicBoard3.getGrid();
        boolean boolean5 = deterministicBoard1.equals((java.lang.Object) cellArray4);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray8 = deterministicBoard7.getGrid();
        int int9 = deterministicBoard7.getScore();
        boolean boolean10 = deterministicBoard7.isLosingBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        int int19 = deterministicBoard12.getSize();
        ar.edu.unrc.game2048.Cell[][] cellArray20 = deterministicBoard12.getGrid();
        deterministicBoard7.setGrid(cellArray20);
        boolean boolean22 = deterministicBoard1.equals((java.lang.Object) cellArray20);
        java.lang.Class<?> wildcardClass23 = cellArray20.getClass();
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(cellArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test185");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        int int9 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard11 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int12 = deterministicBoard11.getSize();
        boolean boolean13 = deterministicBoard1.equals((java.lang.Object) deterministicBoard11);
        int int14 = deterministicBoard1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test186");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        boolean boolean6 = deterministicBoard1.repOk();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        boolean boolean8 = deterministicBoard1.hasEmptyCells();
        boolean boolean9 = deterministicBoard1.hasEmptyCells();
        boolean boolean10 = deterministicBoard1.hasEmptyCells();
        java.lang.Class<?> wildcardClass11 = deterministicBoard1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test187");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        int int27 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard29 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray30 = deterministicBoard29.getGrid();
        int int31 = deterministicBoard29.getScore();
        int int32 = deterministicBoard29.getSize();
        int int33 = deterministicBoard29.getSize();
        boolean boolean34 = deterministicBoard1.equals((java.lang.Object) deterministicBoard29);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard36 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int37 = deterministicBoard36.getSize();
        java.lang.Object obj38 = null;
        boolean boolean39 = deterministicBoard36.equals(obj38);
        ar.edu.unrc.game2048.Cell[][] cellArray40 = deterministicBoard36.getGrid();
        boolean boolean41 = deterministicBoard36.isLosingBoard();
        int int42 = deterministicBoard36.getScore();
        int int43 = deterministicBoard36.getSize();
        ar.edu.unrc.game2048.Cell[][] cellArray44 = deterministicBoard36.getGrid();
        boolean boolean45 = deterministicBoard29.equals((java.lang.Object) deterministicBoard36);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard47 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray48 = deterministicBoard47.getGrid();
        int int49 = deterministicBoard47.getScore();
        boolean boolean50 = deterministicBoard47.isLosingBoard();
        boolean boolean51 = deterministicBoard29.equals((java.lang.Object) deterministicBoard47);
        int int52 = deterministicBoard29.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard56 = new ar.edu.unrc.game2048.DeterministicBoard(2048);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard58 = new ar.edu.unrc.game2048.DeterministicBoard((int) (byte) 100);
        ar.edu.unrc.game2048.Cell[][] cellArray59 = deterministicBoard58.getGrid();
        boolean boolean60 = deterministicBoard56.equals((java.lang.Object) cellArray59);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet61 = deterministicBoard56.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard65 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int66 = deterministicBoard65.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet67 = deterministicBoard65.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard71 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray72 = deterministicBoard71.getGrid();
        int int73 = deterministicBoard71.getScore();
        ar.edu.unrc.game2048.Cell cell76 = deterministicBoard71.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard65.setCell((int) (byte) 10, (int) (byte) 10, cell76);
        deterministicBoard56.setCell((int) (byte) 1, (int) (short) 100, cell76);
        deterministicBoard29.setCell((int) (short) 0, (int) (byte) 0, cell76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(cellArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cellArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertNotNull(cellArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cellArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
        org.junit.Assert.assertNotNull(cellArray59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(positionSet61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 35 + "'", int66 == 35);
        org.junit.Assert.assertNotNull(positionSet67);
        org.junit.Assert.assertNotNull(cellArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(cell76);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test188");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        int int27 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard29 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int30 = deterministicBoard29.getSize();
        java.lang.Object obj31 = null;
        boolean boolean32 = deterministicBoard29.equals(obj31);
        ar.edu.unrc.game2048.Cell[][] cellArray33 = deterministicBoard29.getGrid();
        deterministicBoard1.setGrid(cellArray33);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet35 = deterministicBoard1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cellArray33);
        org.junit.Assert.assertNotNull(positionSet35);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test189");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        int int11 = deterministicBoard1.getScore();
        boolean boolean12 = deterministicBoard1.isWinningBoard();
        boolean boolean13 = deterministicBoard1.repOk();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test190");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        int int9 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.Cell[][] cellArray10 = deterministicBoard1.getGrid();
        int int11 = deterministicBoard1.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = deterministicBoard1.getCell(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 52) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test191");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard3 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int4 = deterministicBoard3.getSize();
        java.lang.Object obj5 = null;
        boolean boolean6 = deterministicBoard3.equals(obj5);
        ar.edu.unrc.game2048.Cell[][] cellArray7 = deterministicBoard3.getGrid();
        boolean boolean8 = deterministicBoard3.isLosingBoard();
        int int9 = deterministicBoard3.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = deterministicBoard3.getEmptyPositions();
        boolean boolean11 = deterministicBoard0.equals((java.lang.Object) deterministicBoard3);
        boolean boolean12 = deterministicBoard0.isFull();
        boolean boolean13 = deterministicBoard0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cellArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test192");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        boolean boolean6 = deterministicBoard1.repOk();
        boolean boolean7 = deterministicBoard1.repOk();
        int int8 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard10 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray11 = deterministicBoard10.getGrid();
        int int12 = deterministicBoard10.getScore();
        boolean boolean13 = deterministicBoard10.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray14 = deterministicBoard10.getGrid();
        deterministicBoard1.setGrid(cellArray14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(cellArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cellArray14);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test193");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = deterministicBoard1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test194");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard6 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int7 = deterministicBoard6.getSize();
        java.lang.Object obj8 = null;
        boolean boolean9 = deterministicBoard6.equals(obj8);
        ar.edu.unrc.game2048.Cell[][] cellArray10 = deterministicBoard6.getGrid();
        boolean boolean11 = deterministicBoard6.isLosingBoard();
        int int12 = deterministicBoard6.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean15 = deterministicBoard6.equals((java.lang.Object) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = deterministicBoard6.getEmptyPositions();
        boolean boolean17 = deterministicBoard1.equals((java.lang.Object) deterministicBoard6);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell20 = deterministicBoard1.getCell((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 35) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test195");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        boolean boolean11 = deterministicBoard1.isFull();
        boolean boolean12 = deterministicBoard1.isWinningBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int15 = deterministicBoard14.getSize();
        java.lang.Object obj16 = null;
        boolean boolean17 = deterministicBoard14.equals(obj16);
        ar.edu.unrc.game2048.Cell[][] cellArray18 = deterministicBoard14.getGrid();
        boolean boolean19 = deterministicBoard14.isLosingBoard();
        int int20 = deterministicBoard14.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard22 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int23 = deterministicBoard22.getSize();
        java.lang.Object obj24 = null;
        boolean boolean25 = deterministicBoard22.equals(obj24);
        ar.edu.unrc.game2048.Cell[][] cellArray26 = deterministicBoard22.getGrid();
        deterministicBoard14.setGrid(cellArray26);
        deterministicBoard1.setGrid(cellArray26);
        int int29 = deterministicBoard1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cellArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cellArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test196");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        deterministicBoard0.setScore((-1));
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard0.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = deterministicBoard0.getCell((int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cellArray5);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test197");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        boolean boolean6 = deterministicBoard1.repOk();
        ar.edu.unrc.game2048.Cell cell9 = deterministicBoard1.getCell((int) ' ', (int) (byte) 1);
        deterministicBoard1.setScore(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test198");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        boolean boolean9 = deterministicBoard1.equals((java.lang.Object) (-1));
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard13 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray14 = deterministicBoard13.getGrid();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = deterministicBoard13.getEmptyPositions();
        boolean boolean16 = deterministicBoard13.hasEmptyCells();
        int int17 = deterministicBoard13.getScore();
        boolean boolean18 = deterministicBoard13.repOk();
        ar.edu.unrc.game2048.Cell cell21 = deterministicBoard13.getCell((int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((int) '#', (int) (byte) 10, cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 10) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cellArray14);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell21);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test199");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        int int2 = deterministicBoard0.getSize();
        boolean boolean3 = deterministicBoard0.isLosingBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard5 = new ar.edu.unrc.game2048.DeterministicBoard(10);
        boolean boolean6 = deterministicBoard5.hasEmptyCells();
        boolean boolean7 = deterministicBoard0.equals((java.lang.Object) boolean6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test200");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        deterministicBoard0.setScore((-1));
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard0.getGrid();
        boolean boolean6 = deterministicBoard0.isWinningBoard();
        int int7 = deterministicBoard0.getScore();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test201");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        int int5 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = deterministicBoard1.getGrid();
        boolean boolean7 = deterministicBoard1.isWinningBoard();
        boolean boolean8 = deterministicBoard1.repOk();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test202");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        int int27 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard29 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int30 = deterministicBoard29.getSize();
        java.lang.Object obj31 = null;
        boolean boolean32 = deterministicBoard29.equals(obj31);
        ar.edu.unrc.game2048.Cell[][] cellArray33 = deterministicBoard29.getGrid();
        deterministicBoard1.setGrid(cellArray33);
        boolean boolean35 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard39 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray40 = deterministicBoard39.getGrid();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet41 = deterministicBoard39.getEmptyPositions();
        boolean boolean42 = deterministicBoard39.hasEmptyCells();
        int int43 = deterministicBoard39.getScore();
        boolean boolean44 = deterministicBoard39.repOk();
        ar.edu.unrc.game2048.Cell cell47 = deterministicBoard39.getCell((int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((int) (byte) 10, (int) (short) 100, cell47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cellArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(cellArray40);
        org.junit.Assert.assertNotNull(positionSet41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(cell47);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test203");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        deterministicBoard1.setScore((int) '4');
        ar.edu.unrc.game2048.Cell[][] cellArray10 = deterministicBoard1.getGrid();
        int int11 = deterministicBoard1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test204");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        int int1 = deterministicBoard0.getScore();
        boolean boolean2 = deterministicBoard0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test205");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        int int6 = deterministicBoard1.getScore();
        int int7 = deterministicBoard1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test206");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        int int4 = deterministicBoard1.getSize();
        int int5 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = deterministicBoard1.getEmptyPositions();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int10 = deterministicBoard9.getSize();
        java.lang.Object obj11 = null;
        boolean boolean12 = deterministicBoard9.equals(obj11);
        boolean boolean13 = deterministicBoard9.isWinningBoard();
        boolean boolean14 = deterministicBoard9.repOk();
        boolean boolean15 = deterministicBoard9.repOk();
        int int16 = deterministicBoard9.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard18 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int19 = deterministicBoard18.getSize();
        java.lang.Object obj20 = null;
        boolean boolean21 = deterministicBoard18.equals(obj20);
        boolean boolean22 = deterministicBoard18.isWinningBoard();
        deterministicBoard18.setScore((int) (short) 0);
        boolean boolean26 = deterministicBoard18.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard28 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int29 = deterministicBoard28.getSize();
        java.lang.Object obj30 = null;
        boolean boolean31 = deterministicBoard28.equals(obj30);
        ar.edu.unrc.game2048.Cell[][] cellArray32 = deterministicBoard28.getGrid();
        boolean boolean33 = deterministicBoard28.isLosingBoard();
        int int34 = deterministicBoard28.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard36 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean37 = deterministicBoard28.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard39 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int40 = deterministicBoard39.getSize();
        java.lang.Object obj41 = null;
        boolean boolean42 = deterministicBoard39.equals(obj41);
        ar.edu.unrc.game2048.Cell[][] cellArray43 = deterministicBoard39.getGrid();
        boolean boolean44 = deterministicBoard39.isLosingBoard();
        int int45 = deterministicBoard39.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard47 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int48 = deterministicBoard47.getSize();
        java.lang.Object obj49 = null;
        boolean boolean50 = deterministicBoard47.equals(obj49);
        ar.edu.unrc.game2048.Cell[][] cellArray51 = deterministicBoard47.getGrid();
        deterministicBoard39.setGrid(cellArray51);
        deterministicBoard28.setGrid(cellArray51);
        deterministicBoard18.setGrid(cellArray51);
        deterministicBoard9.setGrid(cellArray51);
        deterministicBoard1.setGrid(cellArray51);
        boolean boolean57 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard59 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int60 = deterministicBoard59.getSize();
        java.lang.Object obj61 = null;
        boolean boolean62 = deterministicBoard59.equals(obj61);
        ar.edu.unrc.game2048.Cell[][] cellArray63 = deterministicBoard59.getGrid();
        boolean boolean64 = deterministicBoard59.isLosingBoard();
        boolean boolean65 = deterministicBoard59.hasEmptyCells();
        deterministicBoard59.setScore((int) '4');
        ar.edu.unrc.game2048.Cell[][] cellArray68 = deterministicBoard59.getGrid();
        boolean boolean69 = deterministicBoard1.equals((java.lang.Object) deterministicBoard59);
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cellArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cellArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cellArray51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 35 + "'", int60 == 35);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(cellArray63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(cellArray68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test207");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray8 = deterministicBoard7.getGrid();
        int int9 = deterministicBoard7.getScore();
        ar.edu.unrc.game2048.Cell cell12 = deterministicBoard7.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard1.setCell((int) (byte) 10, (int) (byte) 10, cell12);
        boolean boolean14 = deterministicBoard1.isFull();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard18 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int19 = deterministicBoard18.getSize();
        java.lang.Object obj20 = null;
        boolean boolean21 = deterministicBoard18.equals(obj20);
        boolean boolean22 = deterministicBoard18.isWinningBoard();
        deterministicBoard18.setScore((int) (short) 0);
        ar.edu.unrc.game2048.Cell cell27 = deterministicBoard18.getCell(0, 0);
        deterministicBoard1.setCell((int) ' ', (int) (short) 1, cell27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell27);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test208");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getSize();
        boolean boolean8 = deterministicBoard1.isFull();
        boolean boolean9 = deterministicBoard1.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = deterministicBoard1.getEmptyPositions();
        boolean boolean11 = deterministicBoard1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = deterministicBoard1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet12);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test209");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        int int9 = deterministicBoard1.getSize();
        boolean boolean10 = deterministicBoard1.isWinningBoard();
        boolean boolean11 = deterministicBoard1.repOk();
        deterministicBoard1.setScore((int) '4');
        deterministicBoard1.setScore(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test210");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) (byte) 100);
        ar.edu.unrc.game2048.Cell[][] cellArray10 = deterministicBoard9.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setGrid(cellArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cellArray10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test211");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) ' ');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard3 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int4 = deterministicBoard3.getSize();
        boolean boolean5 = deterministicBoard3.isLosingBoard();
        int int6 = deterministicBoard3.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard8 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int9 = deterministicBoard8.getSize();
        java.lang.Object obj10 = null;
        boolean boolean11 = deterministicBoard8.equals(obj10);
        ar.edu.unrc.game2048.Cell[][] cellArray12 = deterministicBoard8.getGrid();
        boolean boolean13 = deterministicBoard8.isLosingBoard();
        int int14 = deterministicBoard8.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard16 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int17 = deterministicBoard16.getSize();
        java.lang.Object obj18 = null;
        boolean boolean19 = deterministicBoard16.equals(obj18);
        ar.edu.unrc.game2048.Cell[][] cellArray20 = deterministicBoard16.getGrid();
        deterministicBoard8.setGrid(cellArray20);
        deterministicBoard3.setGrid(cellArray20);
        ar.edu.unrc.game2048.Cell[][] cellArray23 = deterministicBoard3.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setGrid(cellArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cellArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cellArray20);
        org.junit.Assert.assertNotNull(cellArray23);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test212");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray8 = deterministicBoard7.getGrid();
        int int9 = deterministicBoard7.getScore();
        ar.edu.unrc.game2048.Cell cell12 = deterministicBoard7.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard1.setCell((int) (byte) 10, (int) (byte) 10, cell12);
        int int14 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard16 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int17 = deterministicBoard16.getSize();
        java.lang.Object obj18 = null;
        boolean boolean19 = deterministicBoard16.equals(obj18);
        ar.edu.unrc.game2048.Cell[][] cellArray20 = deterministicBoard16.getGrid();
        boolean boolean21 = deterministicBoard16.isLosingBoard();
        int int22 = deterministicBoard16.getScore();
        int int23 = deterministicBoard16.getSize();
        int int24 = deterministicBoard16.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard26 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int27 = deterministicBoard26.getSize();
        boolean boolean28 = deterministicBoard16.equals((java.lang.Object) deterministicBoard26);
        ar.edu.unrc.game2048.Cell[][] cellArray29 = deterministicBoard16.getGrid();
        deterministicBoard1.setGrid(cellArray29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cellArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(cellArray29);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test213");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        boolean boolean6 = deterministicBoard1.repOk();
        int int7 = deterministicBoard1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test214");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        deterministicBoard0.setScore((-1));
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard0.getGrid();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = deterministicBoard0.getEmptyPositions();
        boolean boolean7 = deterministicBoard0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test215");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.movement.Direction direction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = deterministicBoard1.move(direction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test216");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        boolean boolean8 = deterministicBoard1.hasEmptyCells();
        deterministicBoard1.setScore(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test217");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        int int27 = deterministicBoard1.getSize();
        boolean boolean28 = deterministicBoard1.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = deterministicBoard1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(positionSet29);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test218");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        boolean boolean6 = deterministicBoard1.repOk();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        boolean boolean8 = deterministicBoard1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test219");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        int int4 = deterministicBoard1.getSize();
        int int5 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = deterministicBoard1.getEmptyPositions();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        boolean boolean8 = deterministicBoard1.isLosingBoard();
        boolean boolean9 = deterministicBoard1.isWinningBoard();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test220");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean2 = deterministicBoard1.isLosingBoard();
        deterministicBoard1.setScore((int) (byte) 1);
        deterministicBoard1.setScore((int) (byte) 0);
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test221");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        deterministicBoard1.setScore((int) (short) 0);
        boolean boolean9 = deterministicBoard1.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        boolean boolean10 = deterministicBoard1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test222");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = deterministicBoard1.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard8 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray9 = deterministicBoard8.getGrid();
        int int10 = deterministicBoard8.getScore();
        ar.edu.unrc.game2048.Cell cell13 = deterministicBoard8.getCell((int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((int) (short) 1, (int) '#', cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 35) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cellArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(cell13);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test223");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) (byte) 10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test224");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) (short) 1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test225");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        int int4 = deterministicBoard1.getSize();
        int int5 = deterministicBoard1.getSize();
        int int6 = deterministicBoard1.getSize();
        boolean boolean7 = deterministicBoard1.isLosingBoard();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test226");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        deterministicBoard1.setScore((int) (short) 0);
        boolean boolean9 = deterministicBoard1.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard11 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int12 = deterministicBoard11.getSize();
        java.lang.Object obj13 = null;
        boolean boolean14 = deterministicBoard11.equals(obj13);
        ar.edu.unrc.game2048.Cell[][] cellArray15 = deterministicBoard11.getGrid();
        boolean boolean16 = deterministicBoard11.isLosingBoard();
        int int17 = deterministicBoard11.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard19 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean20 = deterministicBoard11.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard22 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int23 = deterministicBoard22.getSize();
        java.lang.Object obj24 = null;
        boolean boolean25 = deterministicBoard22.equals(obj24);
        ar.edu.unrc.game2048.Cell[][] cellArray26 = deterministicBoard22.getGrid();
        boolean boolean27 = deterministicBoard22.isLosingBoard();
        int int28 = deterministicBoard22.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard30 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int31 = deterministicBoard30.getSize();
        java.lang.Object obj32 = null;
        boolean boolean33 = deterministicBoard30.equals(obj32);
        ar.edu.unrc.game2048.Cell[][] cellArray34 = deterministicBoard30.getGrid();
        deterministicBoard22.setGrid(cellArray34);
        deterministicBoard11.setGrid(cellArray34);
        deterministicBoard1.setGrid(cellArray34);
        boolean boolean38 = deterministicBoard1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cellArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cellArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cellArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test227");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        boolean boolean11 = deterministicBoard1.isFull();
        boolean boolean12 = deterministicBoard1.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray13 = deterministicBoard1.getGrid();
        boolean boolean14 = deterministicBoard1.hasEmptyCells();
        boolean boolean15 = deterministicBoard1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cellArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test228");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard0.getEmptyPositions();
        ar.edu.unrc.game2048.movement.Direction direction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = deterministicBoard0.move(direction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test229");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean2 = deterministicBoard1.isLosingBoard();
        deterministicBoard1.setScore((int) (byte) 1);
        int int5 = deterministicBoard1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test230");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        boolean boolean11 = deterministicBoard1.isFull();
        boolean boolean12 = deterministicBoard1.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray13 = deterministicBoard1.getGrid();
        boolean boolean14 = deterministicBoard1.hasEmptyCells();
        int int15 = deterministicBoard1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cellArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test231");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard8 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int9 = deterministicBoard8.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard13 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int14 = deterministicBoard13.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = deterministicBoard13.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard19 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray20 = deterministicBoard19.getGrid();
        int int21 = deterministicBoard19.getScore();
        ar.edu.unrc.game2048.Cell cell24 = deterministicBoard19.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard13.setCell((int) (byte) 10, (int) (byte) 10, cell24);
        deterministicBoard8.setCell((int) (byte) 10, (int) (byte) 1, cell24);
        deterministicBoard1.setCell((int) (short) 10, (int) (byte) 10, cell24);
        deterministicBoard1.setScore(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertNotNull(cellArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(cell24);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test232");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        boolean boolean3 = deterministicBoard0.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = deterministicBoard0.getCell(2048, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test233");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        int int4 = deterministicBoard1.getSize();
        int int5 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = deterministicBoard1.getEmptyPositions();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        boolean boolean8 = deterministicBoard1.isLosingBoard();
        boolean boolean9 = deterministicBoard1.isLosingBoard();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test234");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        java.lang.String str1 = deterministicBoard0.toString();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard5 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int6 = deterministicBoard5.getSize();
        java.lang.Object obj7 = null;
        boolean boolean8 = deterministicBoard5.equals(obj7);
        boolean boolean9 = deterministicBoard5.isWinningBoard();
        boolean boolean10 = deterministicBoard5.repOk();
        ar.edu.unrc.game2048.Cell cell13 = deterministicBoard5.getCell((int) ' ', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard0.setCell((int) (byte) 10, 100, cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str1, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cell13);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test235");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        int int4 = deterministicBoard1.getSize();
        int int5 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = deterministicBoard1.getEmptyPositions();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        boolean boolean8 = deterministicBoard1.hasEmptyCells();
        boolean boolean9 = deterministicBoard1.isLosingBoard();
        int int10 = deterministicBoard1.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = deterministicBoard1.getCell((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 10) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test236");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard5 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int6 = deterministicBoard5.getSize();
        java.lang.Object obj7 = null;
        boolean boolean8 = deterministicBoard5.equals(obj7);
        ar.edu.unrc.game2048.Cell[][] cellArray9 = deterministicBoard5.getGrid();
        boolean boolean10 = deterministicBoard5.isLosingBoard();
        int int11 = deterministicBoard5.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard13 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean14 = deterministicBoard5.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard16 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int17 = deterministicBoard16.getSize();
        java.lang.Object obj18 = null;
        boolean boolean19 = deterministicBoard16.equals(obj18);
        ar.edu.unrc.game2048.Cell[][] cellArray20 = deterministicBoard16.getGrid();
        boolean boolean21 = deterministicBoard16.isLosingBoard();
        int int22 = deterministicBoard16.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard24 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int25 = deterministicBoard24.getSize();
        java.lang.Object obj26 = null;
        boolean boolean27 = deterministicBoard24.equals(obj26);
        ar.edu.unrc.game2048.Cell[][] cellArray28 = deterministicBoard24.getGrid();
        deterministicBoard16.setGrid(cellArray28);
        deterministicBoard5.setGrid(cellArray28);
        boolean boolean31 = deterministicBoard5.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray32 = deterministicBoard5.getGrid();
        deterministicBoard1.setGrid(cellArray32);
        boolean boolean34 = deterministicBoard1.repOk();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cellArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cellArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cellArray28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cellArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test237");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        deterministicBoard1.setScore((int) (short) 0);
        boolean boolean8 = deterministicBoard1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test238");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        boolean boolean4 = deterministicBoard1.isFull();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard6 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray7 = deterministicBoard6.getGrid();
        int int8 = deterministicBoard6.getScore();
        int int9 = deterministicBoard6.getSize();
        int int10 = deterministicBoard6.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = deterministicBoard6.getEmptyPositions();
        boolean boolean12 = deterministicBoard6.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int15 = deterministicBoard14.getSize();
        java.lang.Object obj16 = null;
        boolean boolean17 = deterministicBoard14.equals(obj16);
        boolean boolean18 = deterministicBoard14.isWinningBoard();
        boolean boolean19 = deterministicBoard14.repOk();
        boolean boolean20 = deterministicBoard14.repOk();
        int int21 = deterministicBoard14.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard23 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int24 = deterministicBoard23.getSize();
        java.lang.Object obj25 = null;
        boolean boolean26 = deterministicBoard23.equals(obj25);
        boolean boolean27 = deterministicBoard23.isWinningBoard();
        deterministicBoard23.setScore((int) (short) 0);
        boolean boolean31 = deterministicBoard23.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard33 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int34 = deterministicBoard33.getSize();
        java.lang.Object obj35 = null;
        boolean boolean36 = deterministicBoard33.equals(obj35);
        ar.edu.unrc.game2048.Cell[][] cellArray37 = deterministicBoard33.getGrid();
        boolean boolean38 = deterministicBoard33.isLosingBoard();
        int int39 = deterministicBoard33.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard41 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean42 = deterministicBoard33.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard44 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int45 = deterministicBoard44.getSize();
        java.lang.Object obj46 = null;
        boolean boolean47 = deterministicBoard44.equals(obj46);
        ar.edu.unrc.game2048.Cell[][] cellArray48 = deterministicBoard44.getGrid();
        boolean boolean49 = deterministicBoard44.isLosingBoard();
        int int50 = deterministicBoard44.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard52 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int53 = deterministicBoard52.getSize();
        java.lang.Object obj54 = null;
        boolean boolean55 = deterministicBoard52.equals(obj54);
        ar.edu.unrc.game2048.Cell[][] cellArray56 = deterministicBoard52.getGrid();
        deterministicBoard44.setGrid(cellArray56);
        deterministicBoard33.setGrid(cellArray56);
        deterministicBoard23.setGrid(cellArray56);
        deterministicBoard14.setGrid(cellArray56);
        deterministicBoard6.setGrid(cellArray56);
        boolean boolean62 = deterministicBoard6.isLosingBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard64 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray65 = deterministicBoard64.getGrid();
        int int66 = deterministicBoard64.getScore();
        boolean boolean67 = deterministicBoard64.isLosingBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard69 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int70 = deterministicBoard69.getSize();
        java.lang.Object obj71 = null;
        boolean boolean72 = deterministicBoard69.equals(obj71);
        ar.edu.unrc.game2048.Cell[][] cellArray73 = deterministicBoard69.getGrid();
        boolean boolean74 = deterministicBoard69.isLosingBoard();
        int int75 = deterministicBoard69.getScore();
        int int76 = deterministicBoard69.getSize();
        ar.edu.unrc.game2048.Cell[][] cellArray77 = deterministicBoard69.getGrid();
        deterministicBoard64.setGrid(cellArray77);
        deterministicBoard6.setGrid(cellArray77);
        deterministicBoard1.setGrid(cellArray77);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cellArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cellArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(cellArray56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(cellArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 35 + "'", int70 == 35);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(cellArray73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 35 + "'", int76 == 35);
        org.junit.Assert.assertNotNull(cellArray77);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test239");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard(10);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard4 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int5 = deterministicBoard4.getSize();
        java.lang.Object obj6 = null;
        boolean boolean7 = deterministicBoard4.equals(obj6);
        boolean boolean8 = deterministicBoard4.isWinningBoard();
        boolean boolean9 = deterministicBoard4.repOk();
        boolean boolean10 = deterministicBoard4.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = deterministicBoard4.getEmptyPositions();
        boolean boolean12 = deterministicBoard4.isLosingBoard();
        boolean boolean13 = deterministicBoard4.isWinningBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard15 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard15.getGrid();
        int int17 = deterministicBoard15.getScore();
        boolean boolean18 = deterministicBoard15.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray19 = deterministicBoard15.getGrid();
        deterministicBoard4.setGrid(cellArray19);
        boolean boolean21 = deterministicBoard1.equals((java.lang.Object) cellArray19);
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cellArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test240");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        int int27 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard29 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray30 = deterministicBoard29.getGrid();
        int int31 = deterministicBoard29.getScore();
        int int32 = deterministicBoard29.getSize();
        int int33 = deterministicBoard29.getSize();
        boolean boolean34 = deterministicBoard1.equals((java.lang.Object) deterministicBoard29);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard36 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int37 = deterministicBoard36.getSize();
        java.lang.Object obj38 = null;
        boolean boolean39 = deterministicBoard36.equals(obj38);
        ar.edu.unrc.game2048.Cell[][] cellArray40 = deterministicBoard36.getGrid();
        boolean boolean41 = deterministicBoard36.isLosingBoard();
        int int42 = deterministicBoard36.getScore();
        int int43 = deterministicBoard36.getSize();
        ar.edu.unrc.game2048.Cell[][] cellArray44 = deterministicBoard36.getGrid();
        boolean boolean45 = deterministicBoard29.equals((java.lang.Object) deterministicBoard36);
        ar.edu.unrc.game2048.Cell cell48 = deterministicBoard29.getCell((int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(cellArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cellArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertNotNull(cellArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cell48);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test241");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        boolean boolean3 = deterministicBoard1.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = deterministicBoard1.getEmptyPositions();
        boolean boolean5 = deterministicBoard1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test242");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        int int9 = deterministicBoard1.getSize();
        boolean boolean10 = deterministicBoard1.isWinningBoard();
        boolean boolean11 = deterministicBoard1.repOk();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard13 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int14 = deterministicBoard13.getSize();
        java.lang.Object obj15 = null;
        boolean boolean16 = deterministicBoard13.equals(obj15);
        ar.edu.unrc.game2048.Cell[][] cellArray17 = deterministicBoard13.getGrid();
        boolean boolean18 = deterministicBoard13.isLosingBoard();
        int int19 = deterministicBoard13.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard21 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int22 = deterministicBoard21.getSize();
        java.lang.Object obj23 = null;
        boolean boolean24 = deterministicBoard21.equals(obj23);
        ar.edu.unrc.game2048.Cell[][] cellArray25 = deterministicBoard21.getGrid();
        deterministicBoard13.setGrid(cellArray25);
        deterministicBoard1.setGrid(cellArray25);
        int int28 = deterministicBoard1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cellArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cellArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test243");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray8 = deterministicBoard7.getGrid();
        int int9 = deterministicBoard7.getScore();
        ar.edu.unrc.game2048.Cell cell12 = deterministicBoard7.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard1.setCell((int) (byte) 10, (int) (byte) 10, cell12);
        boolean boolean14 = deterministicBoard1.repOk();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test244");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        int int5 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = deterministicBoard1.getGrid();
        boolean boolean7 = deterministicBoard1.isWinningBoard();
        int int8 = deterministicBoard1.getScore();
        deterministicBoard1.setScore((int) (byte) -1);
        int int11 = deterministicBoard1.getSize();
        boolean boolean12 = deterministicBoard1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test245");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        int int4 = deterministicBoard1.getSize();
        int int5 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = deterministicBoard1.getEmptyPositions();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int10 = deterministicBoard9.getSize();
        java.lang.Object obj11 = null;
        boolean boolean12 = deterministicBoard9.equals(obj11);
        boolean boolean13 = deterministicBoard9.isWinningBoard();
        boolean boolean14 = deterministicBoard9.repOk();
        boolean boolean15 = deterministicBoard9.repOk();
        int int16 = deterministicBoard9.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard18 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int19 = deterministicBoard18.getSize();
        java.lang.Object obj20 = null;
        boolean boolean21 = deterministicBoard18.equals(obj20);
        boolean boolean22 = deterministicBoard18.isWinningBoard();
        deterministicBoard18.setScore((int) (short) 0);
        boolean boolean26 = deterministicBoard18.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard28 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int29 = deterministicBoard28.getSize();
        java.lang.Object obj30 = null;
        boolean boolean31 = deterministicBoard28.equals(obj30);
        ar.edu.unrc.game2048.Cell[][] cellArray32 = deterministicBoard28.getGrid();
        boolean boolean33 = deterministicBoard28.isLosingBoard();
        int int34 = deterministicBoard28.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard36 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean37 = deterministicBoard28.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard39 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int40 = deterministicBoard39.getSize();
        java.lang.Object obj41 = null;
        boolean boolean42 = deterministicBoard39.equals(obj41);
        ar.edu.unrc.game2048.Cell[][] cellArray43 = deterministicBoard39.getGrid();
        boolean boolean44 = deterministicBoard39.isLosingBoard();
        int int45 = deterministicBoard39.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard47 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int48 = deterministicBoard47.getSize();
        java.lang.Object obj49 = null;
        boolean boolean50 = deterministicBoard47.equals(obj49);
        ar.edu.unrc.game2048.Cell[][] cellArray51 = deterministicBoard47.getGrid();
        deterministicBoard39.setGrid(cellArray51);
        deterministicBoard28.setGrid(cellArray51);
        deterministicBoard18.setGrid(cellArray51);
        deterministicBoard9.setGrid(cellArray51);
        deterministicBoard1.setGrid(cellArray51);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell59 = deterministicBoard1.getCell((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, -1) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cellArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cellArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cellArray51);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test246");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        boolean boolean11 = deterministicBoard1.isFull();
        boolean boolean12 = deterministicBoard1.isWinningBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int15 = deterministicBoard14.getSize();
        java.lang.Object obj16 = null;
        boolean boolean17 = deterministicBoard14.equals(obj16);
        ar.edu.unrc.game2048.Cell[][] cellArray18 = deterministicBoard14.getGrid();
        boolean boolean19 = deterministicBoard14.isLosingBoard();
        int int20 = deterministicBoard14.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard22 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int23 = deterministicBoard22.getSize();
        java.lang.Object obj24 = null;
        boolean boolean25 = deterministicBoard22.equals(obj24);
        ar.edu.unrc.game2048.Cell[][] cellArray26 = deterministicBoard22.getGrid();
        deterministicBoard14.setGrid(cellArray26);
        deterministicBoard1.setGrid(cellArray26);
        boolean boolean29 = deterministicBoard1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet30 = deterministicBoard1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet31 = deterministicBoard1.getEmptyPositions();
        deterministicBoard1.setScore(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cellArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cellArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertNotNull(positionSet31);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test247");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        deterministicBoard1.setScore((int) '4');
        int int10 = deterministicBoard1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test248");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        boolean boolean27 = deterministicBoard1.hasEmptyCells();
        boolean boolean28 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard32 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray33 = deterministicBoard32.getGrid();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet34 = deterministicBoard32.getEmptyPositions();
        boolean boolean35 = deterministicBoard32.hasEmptyCells();
        int int36 = deterministicBoard32.getScore();
        boolean boolean37 = deterministicBoard32.repOk();
        ar.edu.unrc.game2048.Cell cell40 = deterministicBoard32.getCell((int) (short) 0, 10);
        deterministicBoard1.setCell(1, 0, cell40);
        int int42 = deterministicBoard1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(cellArray33);
        org.junit.Assert.assertNotNull(positionSet34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test249");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.hasEmptyCells();
        boolean boolean5 = deterministicBoard1.repOk();
        java.lang.Class<?> wildcardClass6 = deterministicBoard1.getClass();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test250");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        boolean boolean6 = deterministicBoard1.repOk();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        boolean boolean8 = deterministicBoard1.hasEmptyCells();
        boolean boolean9 = deterministicBoard1.hasEmptyCells();
        boolean boolean10 = deterministicBoard1.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean13 = deterministicBoard12.isLosingBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard15 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int16 = deterministicBoard15.getSize();
        boolean boolean17 = deterministicBoard15.isLosingBoard();
        int int18 = deterministicBoard15.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        boolean boolean25 = deterministicBoard20.isLosingBoard();
        int int26 = deterministicBoard20.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard28 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int29 = deterministicBoard28.getSize();
        java.lang.Object obj30 = null;
        boolean boolean31 = deterministicBoard28.equals(obj30);
        ar.edu.unrc.game2048.Cell[][] cellArray32 = deterministicBoard28.getGrid();
        deterministicBoard20.setGrid(cellArray32);
        deterministicBoard15.setGrid(cellArray32);
        deterministicBoard12.setGrid(cellArray32);
        deterministicBoard1.setGrid(cellArray32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cellArray32);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test251");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        boolean boolean7 = deterministicBoard1.isFull();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int10 = deterministicBoard9.getSize();
        java.lang.Object obj11 = null;
        boolean boolean12 = deterministicBoard9.equals(obj11);
        ar.edu.unrc.game2048.Cell[][] cellArray13 = deterministicBoard9.getGrid();
        boolean boolean14 = deterministicBoard9.isLosingBoard();
        int int15 = deterministicBoard9.getScore();
        int int16 = deterministicBoard9.getSize();
        ar.edu.unrc.game2048.Cell[][] cellArray17 = deterministicBoard9.getGrid();
        deterministicBoard1.setGrid(cellArray17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cellArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(cellArray17);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test252");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        boolean boolean3 = deterministicBoard1.isLosingBoard();
        int int4 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int8 = deterministicBoard7.getSize();
        java.lang.Object obj9 = null;
        boolean boolean10 = deterministicBoard7.equals(obj9);
        ar.edu.unrc.game2048.Cell[][] cellArray11 = deterministicBoard7.getGrid();
        boolean boolean12 = deterministicBoard7.isLosingBoard();
        int int13 = deterministicBoard7.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard15 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean16 = deterministicBoard7.equals((java.lang.Object) '#');
        boolean boolean17 = deterministicBoard1.equals((java.lang.Object) boolean16);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard19 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int20 = deterministicBoard19.getSize();
        java.lang.Object obj21 = null;
        boolean boolean22 = deterministicBoard19.equals(obj21);
        boolean boolean23 = deterministicBoard19.isWinningBoard();
        boolean boolean24 = deterministicBoard19.repOk();
        boolean boolean25 = deterministicBoard19.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet26 = deterministicBoard19.getEmptyPositions();
        boolean boolean27 = deterministicBoard1.equals((java.lang.Object) positionSet26);
        ar.edu.unrc.game2048.Cell[][] cellArray28 = deterministicBoard1.getGrid();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cellArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(positionSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cellArray28);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test253");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        int int4 = deterministicBoard1.getSize();
        int int5 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = deterministicBoard1.getEmptyPositions();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        boolean boolean8 = deterministicBoard1.hasEmptyCells();
        boolean boolean9 = deterministicBoard1.isLosingBoard();
        int int10 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int15 = deterministicBoard14.getSize();
        java.lang.Object obj16 = null;
        boolean boolean17 = deterministicBoard14.equals(obj16);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard21 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int22 = deterministicBoard21.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard26 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int27 = deterministicBoard26.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = deterministicBoard26.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard32 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray33 = deterministicBoard32.getGrid();
        int int34 = deterministicBoard32.getScore();
        ar.edu.unrc.game2048.Cell cell37 = deterministicBoard32.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard26.setCell((int) (byte) 10, (int) (byte) 10, cell37);
        deterministicBoard21.setCell((int) (byte) 10, (int) (byte) 1, cell37);
        deterministicBoard14.setCell((int) (short) 10, (int) (byte) 10, cell37);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell(0, (int) (short) -1, cell37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(positionSet28);
        org.junit.Assert.assertNotNull(cellArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(cell37);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test254");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = deterministicBoard1.getEmptyPositions();
        boolean boolean12 = deterministicBoard1.repOk();
        boolean boolean13 = deterministicBoard1.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray14 = deterministicBoard1.getGrid();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cellArray14);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test255");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        deterministicBoard1.setScore((int) '4');
        ar.edu.unrc.game2048.Cell[][] cellArray10 = deterministicBoard1.getGrid();
        boolean boolean11 = deterministicBoard1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test256");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        boolean boolean11 = deterministicBoard1.isFull();
        boolean boolean12 = deterministicBoard1.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray13 = deterministicBoard1.getGrid();
        boolean boolean14 = deterministicBoard1.isFull();
        int int15 = deterministicBoard1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cellArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test257");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        int int8 = deterministicBoard1.getSize();
        int int9 = deterministicBoard1.getSize();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard11 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int12 = deterministicBoard11.getSize();
        boolean boolean13 = deterministicBoard1.equals((java.lang.Object) deterministicBoard11);
        ar.edu.unrc.game2048.Cell[][] cellArray14 = deterministicBoard1.getGrid();
        boolean boolean15 = deterministicBoard1.hasEmptyCells();
        boolean boolean16 = deterministicBoard1.hasEmptyCells();
        java.lang.Class<?> wildcardClass17 = deterministicBoard1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cellArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test258");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        int int3 = deterministicBoard1.getScore();
        boolean boolean4 = deterministicBoard1.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        int int6 = deterministicBoard1.getSize();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test259");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard0 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean1 = deterministicBoard0.repOk();
        boolean boolean2 = deterministicBoard0.repOk();
        boolean boolean3 = deterministicBoard0.hasEmptyCells();
        int int4 = deterministicBoard0.getSize();
        int int5 = deterministicBoard0.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray10 = deterministicBoard9.getGrid();
        int int11 = deterministicBoard9.getScore();
        ar.edu.unrc.game2048.Cell cell14 = deterministicBoard9.getCell((int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard0.setCell((int) (short) 100, (int) (short) 1, cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(cell14);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test260");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        int int7 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard9 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        boolean boolean10 = deterministicBoard1.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard12 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int13 = deterministicBoard12.getSize();
        java.lang.Object obj14 = null;
        boolean boolean15 = deterministicBoard12.equals(obj14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard12.getGrid();
        boolean boolean17 = deterministicBoard12.isLosingBoard();
        int int18 = deterministicBoard12.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard20 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int21 = deterministicBoard20.getSize();
        java.lang.Object obj22 = null;
        boolean boolean23 = deterministicBoard20.equals(obj22);
        ar.edu.unrc.game2048.Cell[][] cellArray24 = deterministicBoard20.getGrid();
        deterministicBoard12.setGrid(cellArray24);
        deterministicBoard1.setGrid(cellArray24);
        boolean boolean27 = deterministicBoard1.hasEmptyCells();
        boolean boolean28 = deterministicBoard1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = deterministicBoard1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(positionSet29);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test261");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        boolean boolean6 = deterministicBoard1.repOk();
        boolean boolean7 = deterministicBoard1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = deterministicBoard1.getEmptyPositions();
        boolean boolean9 = deterministicBoard1.isLosingBoard();
        boolean boolean10 = deterministicBoard1.isWinningBoard();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard11 = new ar.edu.unrc.game2048.DeterministicBoard();
        boolean boolean12 = deterministicBoard11.repOk();
        boolean boolean13 = deterministicBoard11.repOk();
        boolean boolean14 = deterministicBoard11.hasEmptyCells();
        java.lang.String str15 = deterministicBoard11.toString();
        ar.edu.unrc.game2048.Cell[][] cellArray16 = deterministicBoard11.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setGrid(cellArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str15, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(cellArray16);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test262");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray2 = deterministicBoard1.getGrid();
        boolean boolean3 = deterministicBoard1.hasEmptyCells();
        boolean boolean4 = deterministicBoard1.isWinningBoard();
        deterministicBoard1.setScore((int) (byte) 10);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard10 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray11 = deterministicBoard10.getGrid();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = deterministicBoard10.getEmptyPositions();
        boolean boolean13 = deterministicBoard10.hasEmptyCells();
        int int14 = deterministicBoard10.getScore();
        boolean boolean15 = deterministicBoard10.repOk();
        ar.edu.unrc.game2048.Cell cell18 = deterministicBoard10.getCell((int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            deterministicBoard1.setCell((int) (short) -1, (int) '4', cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 52) is out of bounds for board size 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray11);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cell18);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test263");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        int int5 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = deterministicBoard1.getGrid();
        boolean boolean7 = deterministicBoard1.isWinningBoard();
        int int8 = deterministicBoard1.getScore();
        deterministicBoard1.setScore((int) (byte) -1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = deterministicBoard1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet11);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test264");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = deterministicBoard1.getEmptyPositions();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard7 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray8 = deterministicBoard7.getGrid();
        int int9 = deterministicBoard7.getScore();
        ar.edu.unrc.game2048.Cell cell12 = deterministicBoard7.getCell((int) (byte) 10, (int) ' ');
        deterministicBoard1.setCell((int) (byte) 10, (int) (byte) 10, cell12);
        int int14 = deterministicBoard1.getScore();
        boolean boolean15 = deterministicBoard1.isWinningBoard();
        boolean boolean16 = deterministicBoard1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test265");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        boolean boolean5 = deterministicBoard1.isWinningBoard();
        boolean boolean6 = deterministicBoard1.repOk();
        ar.edu.unrc.game2048.Cell cell9 = deterministicBoard1.getCell((int) ' ', (int) (byte) 1);
        ar.edu.unrc.game2048.movement.Direction direction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = deterministicBoard1.move(direction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell9);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test266");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        java.lang.Object obj3 = null;
        boolean boolean4 = deterministicBoard1.equals(obj3);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = deterministicBoard1.getGrid();
        boolean boolean6 = deterministicBoard1.isLosingBoard();
        deterministicBoard1.setScore((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test267");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int2 = deterministicBoard1.getSize();
        boolean boolean3 = deterministicBoard1.isLosingBoard();
        int int4 = deterministicBoard1.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard6 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int7 = deterministicBoard6.getSize();
        java.lang.Object obj8 = null;
        boolean boolean9 = deterministicBoard6.equals(obj8);
        ar.edu.unrc.game2048.Cell[][] cellArray10 = deterministicBoard6.getGrid();
        boolean boolean11 = deterministicBoard6.isLosingBoard();
        int int12 = deterministicBoard6.getScore();
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard14 = new ar.edu.unrc.game2048.DeterministicBoard((int) '#');
        int int15 = deterministicBoard14.getSize();
        java.lang.Object obj16 = null;
        boolean boolean17 = deterministicBoard14.equals(obj16);
        ar.edu.unrc.game2048.Cell[][] cellArray18 = deterministicBoard14.getGrid();
        deterministicBoard6.setGrid(cellArray18);
        deterministicBoard1.setGrid(cellArray18);
        boolean boolean21 = deterministicBoard1.isFull();
        boolean boolean22 = deterministicBoard1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cellArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BoardRegressionTest0.test268");
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard1 = new ar.edu.unrc.game2048.DeterministicBoard(2048);
        ar.edu.unrc.game2048.DeterministicBoard deterministicBoard3 = new ar.edu.unrc.game2048.DeterministicBoard((int) (byte) 100);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = deterministicBoard3.getGrid();
        boolean boolean5 = deterministicBoard1.equals((java.lang.Object) cellArray4);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = deterministicBoard1.getEmptyPositions();
        boolean boolean7 = deterministicBoard1.isLosingBoard();
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }
}

