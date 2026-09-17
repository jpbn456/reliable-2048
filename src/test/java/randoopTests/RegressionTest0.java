package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = ar.edu.unrc.game2048.Board.DEFAULT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = ar.edu.unrc.game2048.Board.WINNING_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, 1)" + "'", str4, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board3.getCell(10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.movement.Direction direction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = board0.move(direction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        ar.edu.unrc.game2048.movement.Direction direction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = board0.move(direction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.movement.Direction direction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = board1.move(direction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board0.getCell((int) (byte) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 4) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.movement.Direction direction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = board0.move(direction2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        boolean boolean3 = board0.repOk();
        ar.edu.unrc.game2048.Cell cell6 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 1, (int) (short) 100, cell6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "1) test011(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell8 = null;
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((-1), (-1), cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, -1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = board1.getGrid();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board3.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            board1.setGrid(cellArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertNotNull(cellArray4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        ar.edu.unrc.game2048.movement.Direction direction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = board0.move(direction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "2) test015(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        int int6 = position2.row;
        int int7 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, 1)" + "'", str4, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        java.lang.String str4 = board1.toString();
        ar.edu.unrc.game2048.Cell cell7 = null;
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(4, 0, cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 0) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky "1) test017(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 100\n+-----+\n|    2|\n+-----+\n" + "'", str4, "Score: 100\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str4 = board0.toString();
        java.lang.Class<?> wildcardClass5 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "3) test018(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.String str1 = board0.toString();
        java.lang.Class<?> wildcardClass2 = board0.getClass();
// flaky "4) test019(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str1, "Score: 0\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str4 = board0.toString();
        board0.setScore(0);
        ar.edu.unrc.game2048.Cell cell9 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 10, (int) (byte) 0, cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "5) test020(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        ar.edu.unrc.game2048.Cell cell7 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(100, (int) (short) 1, cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell9 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(0, 0, cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        int int4 = board0.getSize();
        java.lang.Class<?> wildcardClass5 = board0.getClass();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "6) test024(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        int int6 = position2.row;
        int int7 = position2.row;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board9.setScore((int) (short) 100);
        int int12 = board9.getSize();
        int int13 = board9.getScore();
        boolean boolean14 = board9.isFull();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean16 = position2.equals((java.lang.Object) board9);
        java.lang.Class<?> wildcardClass17 = board9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, 1)" + "'", str4, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getSize();
        boolean boolean2 = board0.repOk();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board0.getCell((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board3.getCell((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        ar.edu.unrc.game2048.movement.Direction direction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = board0.move(direction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        board4.setScore((int) (short) 0);
        ar.edu.unrc.game2048.Cell cell9 = null;
        // The following exception was thrown during execution in test generation
        try {
            board4.setCell((-1), (int) (byte) 0, cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.movement.Direction direction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = board4.move(direction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str7 = position6.toString();
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        boolean boolean10 = position2.equals((java.lang.Object) int9);
        java.lang.String str11 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 0)" + "'", str3, "(1, 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(35, 1)" + "'", str7, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(35, 1)" + "'", str8, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, 0)" + "'", str11, "(1, 0)");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board1.getCell((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 52) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        int int4 = board0.getSize();
        board0.setScore(4);
        board0.setScore(4);
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "7) test034(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    4|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |    4|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Cell[][] cellArray8 = board0.getGrid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(cellArray8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.Cell[][] cellArray9 = board8.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            board0.setGrid(cellArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cellArray9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str4 = board0.toString();
        board0.setScore(0);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board8.setScore((int) (short) 100);
        boolean boolean11 = board8.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray12 = board8.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            board0.setGrid(cellArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "8) test037(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cellArray12);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        int int4 = board0.getSize();
        ar.edu.unrc.game2048.Cell[] cellArray5 = new ar.edu.unrc.game2048.Cell[] {};
        ar.edu.unrc.game2048.Cell[] cellArray6 = new ar.edu.unrc.game2048.Cell[] {};
        ar.edu.unrc.game2048.Cell[] cellArray7 = new ar.edu.unrc.game2048.Cell[] {};
        ar.edu.unrc.game2048.Cell[] cellArray8 = new ar.edu.unrc.game2048.Cell[] {};
        ar.edu.unrc.game2048.Cell[] cellArray9 = new ar.edu.unrc.game2048.Cell[] {};
        ar.edu.unrc.game2048.Cell[] cellArray10 = new ar.edu.unrc.game2048.Cell[] {};
        ar.edu.unrc.game2048.Cell[][] cellArray11 = new ar.edu.unrc.game2048.Cell[][] { cellArray5, cellArray6, cellArray7, cellArray8, cellArray9, cellArray10 };
        // The following exception was thrown during execution in test generation
        try {
            board0.setGrid(cellArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertArrayEquals(cellArray5, new ar.edu.unrc.game2048.Cell[] {});
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertArrayEquals(cellArray6, new ar.edu.unrc.game2048.Cell[] {});
        org.junit.Assert.assertNotNull(cellArray7);
        org.junit.Assert.assertArrayEquals(cellArray7, new ar.edu.unrc.game2048.Cell[] {});
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertArrayEquals(cellArray8, new ar.edu.unrc.game2048.Cell[] {});
        org.junit.Assert.assertNotNull(cellArray9);
        org.junit.Assert.assertArrayEquals(cellArray9, new ar.edu.unrc.game2048.Cell[] {});
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertArrayEquals(cellArray10, new ar.edu.unrc.game2048.Cell[] {});
        org.junit.Assert.assertNotNull(cellArray11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = position2.equals((java.lang.Object) board3);
        boolean boolean9 = board3.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board11.setScore((int) (short) 100);
        int int14 = board11.getSize();
        int int15 = board11.getScore();
        boolean boolean16 = board11.isFull();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Cell[][] cellArray18 = board11.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            board3.setGrid(cellArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cellArray18);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = board1.getGrid();
        boolean boolean6 = board1.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj8 = null;
        boolean boolean9 = board7.equals(obj8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board7);
        ar.edu.unrc.game2048.Cell[][] cellArray11 = board7.getGrid();
        boolean boolean12 = board7.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray13 = board7.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            board1.setGrid(cellArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cellArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cellArray13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        boolean boolean4 = board0.repOk();
        java.lang.Class<?> wildcardClass5 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean9 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj13 = null;
        boolean boolean14 = board12.equals(obj13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean17 = board16.hasEmptyCells();
        int int18 = board16.getScore();
        ar.edu.unrc.game2048.Cell cell21 = board16.getCell((int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 10, 0, cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(cell21);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        java.lang.Class<?> wildcardClass5 = positionSet4.getClass();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "9) test044(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        int int6 = position2.row;
        int int7 = position2.row;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board9.setScore((int) (short) 100);
        int int12 = board9.getSize();
        int int13 = board9.getScore();
        boolean boolean14 = board9.isFull();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean16 = position2.equals((java.lang.Object) board9);
        java.lang.String str17 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, 1)" + "'", str4, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(35, 1)" + "'", str17, "(35, 1)");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getSize();
        java.lang.Class<?> wildcardClass8 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.hasEmptyCells();
        int int6 = board4.getScore();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board8.setScore((int) (short) 100);
        boolean boolean11 = board8.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray12 = board8.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            board4.setGrid(cellArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cellArray12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        int int5 = board0.getSize();
        board0.setScore(1);
        int int8 = board0.getScore();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board10.setScore((int) (short) 100);
        boolean boolean13 = board10.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray14 = board10.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            board0.setGrid(cellArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cellArray14);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        board0.setScore((int) '#');
        boolean boolean6 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean14 = board13.hasEmptyCells();
        int int15 = board13.getScore();
        ar.edu.unrc.game2048.Cell cell18 = board13.getCell((int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) -1, 100, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(cell18);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getScore();
        boolean boolean6 = board1.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell[][] cellArray8 = board1.getGrid();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj12 = null;
        boolean boolean13 = board11.equals(obj12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean16 = board15.hasEmptyCells();
        int int17 = board15.getScore();
        ar.edu.unrc.game2048.Cell cell20 = board15.getCell((int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(100, (int) (short) 1, cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(cell20);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = board1.getGrid();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.movement.Direction direction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = board3.move(direction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        boolean boolean6 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        int int3 = board0.getSize();
        boolean boolean4 = board0.isLosingBoard();
        ar.edu.unrc.game2048.movement.Direction direction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = board0.move(direction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "10) test054(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board0.getCell(2048, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, 4) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 10);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj5 = null;
        boolean boolean6 = board4.equals(obj5);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean9 = board8.hasEmptyCells();
        int int10 = board8.getScore();
        ar.edu.unrc.game2048.Cell cell13 = board8.getCell((int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) '#', (int) '#', cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 35) is out of bounds for board size 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(cell13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) ' ');
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getSize();
        boolean boolean2 = board0.repOk();
        int int3 = board0.getSize();
        ar.edu.unrc.game2048.movement.Direction direction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = board0.move(direction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        int int8 = board0.getScore();
        boolean boolean9 = board0.isFull();
        int int10 = board0.getScore();
        boolean boolean11 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = position2.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean13 = board9.isFull();
        boolean boolean14 = board9.isLosingBoard();
        int int15 = board9.getSize();
        int int16 = board9.getSize();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean18 = position2.equals((java.lang.Object) board17);
        java.lang.String str19 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(35, 100)" + "'", str19, "(35, 100)");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        boolean boolean7 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj11 = null;
        boolean boolean12 = board10.equals(obj11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean15 = board14.hasEmptyCells();
        int int16 = board14.getScore();
        ar.edu.unrc.game2048.Cell cell19 = board14.getCell((int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (short) -1, (int) (byte) -1, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, -1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(cell19);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        boolean boolean5 = position2.equals((java.lang.Object) '#');
        int int6 = position2.col;
        int int7 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        board0.setScore((-1));
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board8.setScore((int) (short) 100);
        int int11 = board8.getSize();
        int int12 = board8.getScore();
        boolean boolean13 = board8.isFull();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell[][] cellArray15 = board8.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            board6.setGrid(cellArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "11) test064(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cellArray15);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str5 = board4.toString();
        ar.edu.unrc.game2048.movement.Direction direction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = board4.move(direction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "12) test065(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        int int8 = board0.getScore();
        boolean boolean9 = board0.isFull();
        int int10 = board0.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board0.getCell(100, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        boolean boolean5 = board0.hasEmptyCells();
        java.lang.Class<?> wildcardClass6 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        board0.setScore((int) '4');
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board13.setScore((int) (short) 100);
        boolean boolean16 = board13.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray17 = board13.getGrid();
        boolean boolean18 = position11.equals((java.lang.Object) cellArray17);
        // The following exception was thrown during execution in test generation
        try {
            board0.setGrid(cellArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cellArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        java.lang.String str8 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "13) test069(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 32\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 32\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 100);
        ar.edu.unrc.game2048.movement.Direction direction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = board1.move(direction2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        int int5 = board4.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj9 = null;
        boolean boolean10 = board8.equals(obj9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        int int12 = board8.getSize();
        boolean boolean13 = board8.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj18 = null;
        boolean boolean19 = board17.equals(obj18);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board17);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean22 = board21.hasEmptyCells();
        int int23 = board21.getScore();
        ar.edu.unrc.game2048.Cell cell26 = board21.getCell((int) (byte) 1, (int) (short) 1);
        board8.setCell((int) (byte) 0, (int) (short) 0, cell26);
        // The following exception was thrown during execution in test generation
        try {
            board4.setCell((int) (byte) 0, 10, cell26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(cell26);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        board4.setScore((int) (short) 0);
        ar.edu.unrc.game2048.movement.Direction direction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = board4.move(direction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', 10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        board0.setScore((int) '4');
        ar.edu.unrc.game2048.movement.Direction direction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = board0.move(direction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean10 = board0.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.movement.Direction direction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = board1.move(direction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj7 = null;
        boolean boolean8 = board6.equals(obj7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean10 = board6.isFull();
        boolean boolean11 = board6.isWinningBoard();
        boolean boolean12 = board6.isLosingBoard();
        int int13 = board6.getSize();
        boolean boolean14 = position2.equals((java.lang.Object) board6);
        ar.edu.unrc.game2048.movement.Direction direction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = board6.move(direction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, 1)" + "'", str4, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        boolean boolean6 = position2.equals((java.lang.Object) (short) 100);
        int int7 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        boolean boolean4 = board0.repOk();
        int int5 = board0.getScore();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj9 = null;
        boolean boolean10 = board8.equals(obj9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean13 = board12.hasEmptyCells();
        int int14 = board12.getScore();
        ar.edu.unrc.game2048.Cell cell17 = board12.getCell((int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(32, (-1), cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cell17);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        boolean boolean7 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray8 = board1.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = board1.getCell(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cellArray8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        boolean boolean7 = board0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board0.getCell((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board3.equals((java.lang.Object) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        java.lang.Class<?> wildcardClass8 = board7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board4.setScore((int) (short) 100);
        boolean boolean7 = board4.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray8 = board4.getGrid();
        boolean boolean9 = position2.equals((java.lang.Object) cellArray8);
        int int10 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        int int3 = position2.row;
        int int4 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board3.getCell((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board4.setScore((int) (short) 100);
        boolean boolean7 = board4.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray8 = board4.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            board0.setGrid(cellArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cellArray8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(100);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.movement.Direction direction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = board1.move(direction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        board0.setScore((-1));
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        int int7 = board6.getScore();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "14) test090(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        int int6 = board1.getSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        int int8 = board0.getScore();
        boolean boolean9 = board0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = board0.getCell((int) (byte) 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) '4');
        boolean boolean11 = board0.equals((java.lang.Object) position10);
        java.lang.Class<?> wildcardClass12 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', 2048);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.hasEmptyCells();
        boolean boolean9 = position2.equals((java.lang.Object) board6);
        int int10 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.movement.Direction direction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = board8.move(direction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board1.getCell((int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 97) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        board0.setScore((int) '4');
        ar.edu.unrc.game2048.movement.Direction direction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = board0.move(direction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cellArray6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(100);
        board1.setScore(10);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj5 = null;
        boolean boolean6 = board4.equals(obj5);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board4);
        int int8 = board4.getSize();
        boolean boolean9 = board4.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray10 = board4.getGrid();
        int int11 = board4.getScore();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        java.lang.String str14 = board12.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board12.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board12.getEmptyPositions();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray18 = board17.getGrid();
        board12.setGrid(cellArray18);
        board4.setGrid(cellArray18);
        // The following exception was thrown during execution in test generation
        try {
            board1.setGrid(cellArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(positionSet13);
// flaky "15) test098(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    4|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|    4|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cellArray18);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board1.getCell((-1), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 35) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, (int) (short) 0);
        int int3 = position2.row;
        int int4 = position2.col;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj6 = null;
        boolean boolean7 = board5.equals(obj6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean9 = board5.isFull();
        boolean boolean10 = board5.isLosingBoard();
        int int11 = board5.getSize();
        int int12 = board5.getSize();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean14 = board5.repOk();
        boolean boolean15 = position2.equals((java.lang.Object) boolean14);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj17 = null;
        boolean boolean18 = board16.equals(obj17);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean20 = board16.isFull();
        boolean boolean21 = board16.isLosingBoard();
        board16.setScore((int) ' ');
        board16.setScore((int) (short) 1);
        int int26 = board16.getScore();
        boolean boolean27 = position2.equals((java.lang.Object) board16);
        ar.edu.unrc.game2048.Cell[][] cellArray28 = board16.getGrid();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cellArray28);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str4 = board0.toString();
        board0.setScore(0);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        int int13 = board9.getSize();
        boolean boolean14 = board9.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board9.getEmptyPositions();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj19 = null;
        boolean boolean20 = board18.equals(obj19);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board18);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean23 = board22.hasEmptyCells();
        int int24 = board22.getScore();
        ar.edu.unrc.game2048.Cell cell27 = board22.getCell((int) (byte) 1, (int) (short) 1);
        board9.setCell((int) (byte) 0, (int) (short) 0, cell27);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 0, (int) (byte) 100, cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "16) test102(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(cell27);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', 2048);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.hasEmptyCells();
        boolean boolean9 = position2.equals((java.lang.Object) board6);
        java.lang.Class<?> wildcardClass10 = position2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.isFull();
        int int8 = board6.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray10 = board9.getGrid();
        board6.setGrid(cellArray10);
        boolean boolean12 = board6.isFull();
        ar.edu.unrc.game2048.Cell[][] cellArray13 = board6.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            board1.setGrid(cellArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cellArray13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        board0.setScore(100);
        boolean boolean11 = board0.equals((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = board0.getCell((int) ' ', 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        boolean boolean6 = board1.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board1.getCell((-1), 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 2048) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        ar.edu.unrc.game2048.movement.Direction direction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = board0.move(direction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        board0.setScore((int) '#');
        java.lang.Class<?> wildcardClass6 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        boolean boolean8 = board0.isWinningBoard();
        boolean boolean9 = board0.hasEmptyCells();
        board0.setScore((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = board0.getGrid();
        boolean boolean6 = board0.repOk();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board0.getCell((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(100);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        boolean boolean3 = board1.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        int int5 = position2.col;
        int int6 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        int int5 = board0.getSize();
        boolean boolean6 = board0.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board0.getCell((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) '#');
        int int3 = position2.col;
        int int4 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        board0.setScore(100);
        boolean boolean11 = board0.equals((java.lang.Object) true);
        boolean boolean12 = board0.repOk();
        boolean boolean13 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        int int2 = board0.getSize();
        board0.setScore((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board3.getGrid();
        board0.setGrid(cellArray4);
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Cell[][] cellArray7 = board0.getGrid();
        ar.edu.unrc.game2048.movement.Direction direction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = board0.move(direction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cellArray7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = position2.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board3);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board3.getEmptyPositions();
        int int11 = board3.getScore();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = board1.getGrid();
        int int3 = board1.getSize();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (short) -1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        board0.setScore(100);
        ar.edu.unrc.game2048.movement.Direction direction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = board0.move(direction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        board0.setScore((int) '#');
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        int int13 = board9.getSize();
        boolean boolean14 = board9.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board9.getEmptyPositions();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj19 = null;
        boolean boolean20 = board18.equals(obj19);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board18);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean23 = board22.hasEmptyCells();
        int int24 = board22.getScore();
        ar.edu.unrc.game2048.Cell cell27 = board22.getCell((int) (byte) 1, (int) (short) 1);
        board9.setCell((int) (byte) 0, (int) (short) 0, cell27);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(2048, 52, cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(cell27);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray1 = board0.getGrid();
        boolean boolean2 = board0.repOk();
        org.junit.Assert.assertNotNull(cellArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.movement.Direction direction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = board0.move(direction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "17) test125(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
// flaky "1) test125(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (byte) 0);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 0)" + "'", str3, "(35, 0)");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, (int) '4');
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getScore();
        boolean boolean6 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board1.getCell((int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', 2048);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(52, 2048)" + "'", str3, "(52, 2048)");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getScore();
        boolean boolean6 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        board1.setScore((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        java.lang.Object obj8 = null;
        boolean boolean9 = board0.equals(obj8);
        ar.edu.unrc.game2048.movement.Direction direction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = board0.move(direction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        board0.setScore((int) '#');
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj11 = null;
        boolean boolean12 = board10.equals(obj11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board10);
        int int14 = board10.getSize();
        boolean boolean15 = board10.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board10.getEmptyPositions();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj20 = null;
        boolean boolean21 = board19.equals(obj20);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board19);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean24 = board23.hasEmptyCells();
        int int25 = board23.getScore();
        ar.edu.unrc.game2048.Cell cell28 = board23.getCell((int) (byte) 1, (int) (short) 1);
        board10.setCell((int) (byte) 0, (int) (short) 0, cell28);
        // The following exception was thrown during execution in test generation
        try {
            board7.setCell((int) 'a', (int) (byte) -1, cell28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(cell28);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        int int6 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, 1)" + "'", str4, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        boolean boolean5 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        int int7 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        java.lang.String str9 = board7.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board7.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board7.getEmptyPositions();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray13 = board12.getGrid();
        board7.setGrid(cellArray13);
        // The following exception was thrown during execution in test generation
        try {
            board1.setGrid(cellArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet8);
// flaky "18) test136(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertNotNull(cellArray13);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray1 = board0.getGrid();
        java.lang.Class<?> wildcardClass2 = cellArray1.getClass();
        org.junit.Assert.assertNotNull(cellArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        int int7 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray1 = board0.getGrid();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board2.isFull();
        org.junit.Assert.assertNotNull(cellArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean5 = board1.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, (int) '4');
        boolean boolean11 = board0.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        java.lang.Class<?> wildcardClass6 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj9 = null;
        boolean boolean10 = board8.equals(obj9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        int int12 = board8.getSize();
        boolean boolean13 = board8.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj18 = null;
        boolean boolean19 = board17.equals(obj18);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board17);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean22 = board21.hasEmptyCells();
        int int23 = board21.getScore();
        ar.edu.unrc.game2048.Cell cell26 = board21.getCell((int) (byte) 1, (int) (short) 1);
        board8.setCell((int) (byte) 0, (int) (short) 0, cell26);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(52, (int) (short) 100, cell26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(cell26);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        board0.setScore((int) '#');
        boolean boolean6 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.movement.Direction direction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = board0.move(direction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        int int6 = position2.row;
        int int7 = position2.row;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board9.setScore((int) (short) 100);
        int int12 = board9.getSize();
        int int13 = board9.getScore();
        boolean boolean14 = board9.isFull();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean16 = position2.equals((java.lang.Object) board9);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board9);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell20 = board9.getCell(32, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, 1)" + "'", str4, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        int int8 = board0.getScore();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (byte) 100);
        boolean boolean11 = board10.repOk();
        boolean boolean12 = board0.equals((java.lang.Object) boolean11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        ar.edu.unrc.game2048.movement.Direction direction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = board1.move(direction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 100);
        boolean boolean2 = board1.isWinningBoard();
        java.lang.Class<?> wildcardClass3 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getSize();
        board1.setScore((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = board1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board3.equals((java.lang.Object) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board3.getEmptyPositions();
        boolean boolean7 = board3.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board3.getCell(52, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        board0.setScore((int) '4');
        board0.setScore((int) (short) 0);
        int int11 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        boolean boolean8 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray9 = board0.getGrid();
        boolean boolean10 = board0.isWinningBoard();
        board0.setScore((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cellArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        int int4 = board0.getSize();
        int int5 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        int int3 = position2.col;
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(1, 0)" + "'", str5, "(1, 0)");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = position2.equals((java.lang.Object) board3);
        boolean boolean9 = board3.isFull();
        board3.setScore(10);
        ar.edu.unrc.game2048.movement.Direction direction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = board3.move(direction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = board0.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board0.getCell((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getSize();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj6 = null;
        boolean boolean7 = board5.equals(obj6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board5);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board5);
        ar.edu.unrc.game2048.Cell[][] cellArray10 = board5.getGrid();
        ar.edu.unrc.game2048.Cell cell13 = board5.getCell((int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(0, 2048, cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 2048) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertNotNull(cell13);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getSize();
        boolean boolean2 = board0.repOk();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board0.getCell((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', 2048);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj7 = null;
        boolean boolean8 = board6.equals(obj7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        int int10 = board6.getSize();
        boolean boolean11 = board6.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board6.getEmptyPositions();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj16 = null;
        boolean boolean17 = board15.equals(obj16);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board15);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean20 = board19.hasEmptyCells();
        int int21 = board19.getScore();
        ar.edu.unrc.game2048.Cell cell24 = board19.getCell((int) (byte) 1, (int) (short) 1);
        board6.setCell((int) (byte) 0, (int) (short) 0, cell24);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(4, (int) ' ', cell24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(cell24);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj7 = null;
        boolean boolean8 = board6.equals(obj7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean10 = board6.isFull();
        boolean boolean11 = board6.isWinningBoard();
        boolean boolean12 = board6.isLosingBoard();
        int int13 = board6.getSize();
        boolean boolean14 = position2.equals((java.lang.Object) board6);
        boolean boolean15 = board6.isWinningBoard();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, 1)" + "'", str4, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = board0.getGrid();
        java.lang.String str6 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray5);
// flaky "19) test164(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 35);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        int int3 = position2.col;
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        int int7 = position6.col;
        boolean boolean8 = position2.equals((java.lang.Object) int7);
        int int9 = position2.row;
        int int10 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = position2.equals((java.lang.Object) board3);
        java.lang.String str9 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(35, 100)" + "'", str9, "(35, 100)");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = position2.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board10.setScore((int) (short) 100);
        boolean boolean13 = board3.equals((java.lang.Object) (short) 100);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj18 = null;
        boolean boolean19 = board17.equals(obj18);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board17);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board17);
        ar.edu.unrc.game2048.Cell[][] cellArray22 = board17.getGrid();
        ar.edu.unrc.game2048.Cell cell25 = board17.getCell((int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            board3.setCell(4, 4, cell25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 4) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cellArray22);
        org.junit.Assert.assertNotNull(cell25);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.movement.Direction direction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = board0.move(direction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        int int3 = position2.col;
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        int int7 = position6.col;
        boolean boolean8 = position2.equals((java.lang.Object) int7);
        int int9 = position2.row;
        java.lang.String str10 = position2.toString();
        int int11 = position2.row;
        java.lang.Class<?> wildcardClass12 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(1, 0)" + "'", str10, "(1, 0)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        board0.setScore((int) '#');
        boolean boolean6 = board0.isLosingBoard();
        ar.edu.unrc.game2048.movement.Direction direction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = board0.move(direction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        board0.setScore((int) '4');
        board0.setScore((int) (short) 0);
        board0.setScore(4);
        ar.edu.unrc.game2048.movement.Direction direction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = board0.move(direction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cellArray6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(100);
        boolean boolean5 = position2.equals((java.lang.Object) board4);
        int int6 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        boolean boolean2 = board0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board0.getCell((int) (byte) 1, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 35);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, (int) (byte) 10);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 10)" + "'", str3, "(100, 10)");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        boolean boolean10 = board9.isFull();
        int int11 = board9.getSize();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray13 = board12.getGrid();
        board9.setGrid(cellArray13);
        board0.setGrid(cellArray13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(cellArray13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        board0.setScore((int) '4');
        board0.setScore((-1));
        boolean boolean11 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(4);
        java.lang.String str2 = board1.toString();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        java.lang.String str5 = board3.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board3.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray9 = board8.getGrid();
        board3.setGrid(cellArray9);
        board1.setGrid(cellArray9);
        boolean boolean12 = board1.isFull();
// flaky "20) test179(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
// flaky "2) test179(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertNotNull(cellArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.String str5 = board4.toString();
        boolean boolean6 = board4.hasEmptyCells();
// flaky "1) test180(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 100\n+-----+\n|    2|\n+-----+\n" + "'", str5, "Score: 100\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        int int6 = position2.row;
        int int7 = position2.row;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board9.setScore((int) (short) 100);
        int int12 = board9.getSize();
        int int13 = board9.getScore();
        boolean boolean14 = board9.isFull();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean16 = position2.equals((java.lang.Object) board9);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj18 = null;
        boolean boolean19 = board17.equals(obj18);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean21 = board20.isLosingBoard();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj23 = null;
        boolean boolean24 = board22.equals(obj23);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board22);
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board22);
        int int27 = board22.getSize();
        board22.setScore(1);
        boolean boolean30 = board20.equals((java.lang.Object) 1);
        int int31 = board20.getScore();
        boolean boolean32 = position2.equals((java.lang.Object) int31);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, 1)" + "'", str4, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = board1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        board0.setScore((int) '#');
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean8 = board7.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray9 = board7.getGrid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cellArray9);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str4 = board0.toString();
        board0.setScore(0);
        boolean boolean7 = board0.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "21) test184(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = position2.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean13 = board9.isFull();
        boolean boolean14 = board9.isLosingBoard();
        int int15 = board9.getSize();
        int int16 = board9.getSize();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean18 = position2.equals((java.lang.Object) board17);
        int int19 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        java.lang.String str4 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        boolean boolean6 = board0.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "22) test186(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
// flaky "3) test186(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(35, (int) (short) 0);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        boolean boolean5 = board0.equals((java.lang.Object) (byte) -1);
        boolean boolean6 = board0.hasEmptyCells();
        int int7 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = board1.getGrid();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell[][] cellArray7 = board1.getGrid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertNotNull(cellArray7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', 2048);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.hasEmptyCells();
        boolean boolean9 = position2.equals((java.lang.Object) board6);
        boolean boolean11 = position2.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        java.lang.Class<?> wildcardClass12 = position2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getSize();
        boolean boolean2 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.hasEmptyCells();
        int int6 = board4.getScore();
        ar.edu.unrc.game2048.Cell cell9 = board4.getCell((int) (byte) 1, (int) (short) 1);
        boolean boolean10 = board4.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, (int) (short) 0);
        int int3 = position2.row;
        int int4 = position2.col;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj6 = null;
        boolean boolean7 = board5.equals(obj6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean9 = board5.isFull();
        boolean boolean10 = board5.isLosingBoard();
        int int11 = board5.getSize();
        int int12 = board5.getSize();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean14 = board5.repOk();
        boolean boolean15 = position2.equals((java.lang.Object) boolean14);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj17 = null;
        boolean boolean18 = board16.equals(obj17);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean20 = board16.isFull();
        boolean boolean21 = board16.isLosingBoard();
        board16.setScore((int) ' ');
        board16.setScore((int) (short) 1);
        int int26 = board16.getScore();
        boolean boolean27 = position2.equals((java.lang.Object) board16);
        board16.setScore((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        board0.setScore((int) '4');
        board0.setScore((-1));
        boolean boolean11 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.movement.Direction direction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = board0.move(direction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board3.equals((java.lang.Object) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board3.getEmptyPositions();
        java.lang.Class<?> wildcardClass7 = board3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board3.getEmptyPositions();
        java.lang.Class<?> wildcardClass6 = board3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getSize();
        ar.edu.unrc.game2048.Cell[][] cellArray8 = board1.getGrid();
        boolean boolean9 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        board0.setScore((-1));
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        int int13 = board9.getSize();
        boolean boolean14 = board9.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board9.getEmptyPositions();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj19 = null;
        boolean boolean20 = board18.equals(obj19);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board18);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean23 = board22.hasEmptyCells();
        int int24 = board22.getScore();
        ar.edu.unrc.game2048.Cell cell27 = board22.getCell((int) (byte) 1, (int) (short) 1);
        board9.setCell((int) (byte) 0, (int) (short) 0, cell27);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(4, 35, cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "23) test199(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(cell27);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj7 = null;
        boolean boolean8 = board6.equals(obj7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean10 = board6.isFull();
        boolean boolean11 = board6.isWinningBoard();
        boolean boolean12 = board6.isLosingBoard();
        int int13 = board6.getSize();
        boolean boolean14 = position2.equals((java.lang.Object) board6);
        java.lang.String str15 = position2.toString();
        int int16 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, 1)" + "'", str4, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(35, 1)" + "'", str15, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.hasEmptyCells();
        boolean boolean5 = board3.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 100);
        boolean boolean2 = board1.repOk();
        boolean boolean3 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            board1.setGrid(cellArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 1);
        boolean boolean2 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = board0.getCell((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(100);
        board1.setScore((int) (short) 100);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        java.lang.String str7 = board0.toString();
        boolean boolean8 = board0.isWinningBoard();
        board0.setScore((int) (byte) -1);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean12 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
// flaky "24) test206(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(10);
        java.lang.Class<?> wildcardClass2 = board1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        board4.setScore((int) '4');
        boolean boolean8 = position2.equals((java.lang.Object) '4');
        java.lang.String str9 = position2.toString();
        int int10 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 0)" + "'", str3, "(1, 0)");
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(1, 0)" + "'", str9, "(1, 0)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean6 = board0.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        boolean boolean7 = board0.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj9 = null;
        boolean boolean10 = board8.equals(obj9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell[][] cellArray12 = board8.getGrid();
        boolean boolean13 = board8.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray14 = board8.getGrid();
        boolean boolean15 = board0.equals((java.lang.Object) cellArray14);
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "25) test210(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cellArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cellArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        board0.setScore((int) (short) 1);
        int int10 = board0.getScore();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board11.getEmptyPositions();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getSize();
        boolean boolean15 = board11.isLosingBoard();
        java.lang.String str16 = board11.toString();
        boolean boolean17 = board11.isWinningBoard();
        boolean boolean18 = board0.equals((java.lang.Object) board11);
        boolean boolean19 = board11.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(positionSet12);
// flaky "26) test211(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "4) test211(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board3.equals((java.lang.Object) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = board3.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str8 = position7.toString();
        boolean boolean10 = position7.equals((java.lang.Object) 10.0d);
        java.lang.String str11 = position7.toString();
        boolean boolean12 = position2.equals((java.lang.Object) str11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(1, 0)" + "'", str4, "(1, 0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(35, 1)" + "'", str8, "(35, 1)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(35, 1)" + "'", str11, "(35, 1)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getScore();
        boolean boolean6 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        int int8 = board1.getSize();
        java.lang.Class<?> wildcardClass9 = board1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.movement.Direction direction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = board6.move(direction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 0);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 0)" + "'", str3, "(0, 0)");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        boolean boolean8 = board0.isWinningBoard();
        boolean boolean9 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board0.getEmptyPositions();
        boolean boolean11 = board0.isWinningBoard();
        boolean boolean12 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board5.getGrid();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean8 = board0.equals((java.lang.Object) board7);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = board7.getCell((int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(35, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = position2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = position2.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board3);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board3.getEmptyPositions();
        java.lang.Class<?> wildcardClass11 = positionSet10.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(100);
        boolean boolean5 = position2.equals((java.lang.Object) board4);
        boolean boolean6 = board4.repOk();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str10 = position9.toString();
        boolean boolean12 = position9.equals((java.lang.Object) 10.0d);
        java.lang.String str13 = position9.toString();
        boolean boolean14 = board1.equals((java.lang.Object) str13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(35, 1)" + "'", str10, "(35, 1)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(35, 1)" + "'", str13, "(35, 1)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board1.getCell(4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 0) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 100);
        boolean boolean2 = board1.isWinningBoard();
        boolean boolean3 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean5 = board4.repOk();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board3.getGrid();
        board0.setGrid(cellArray4);
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Cell[][] cellArray7 = board0.getGrid();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray9 = board0.getGrid();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cellArray7);
        org.junit.Assert.assertNotNull(cellArray9);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        int int8 = board0.getScore();
        boolean boolean9 = board0.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj9 = null;
        boolean boolean10 = board8.equals(obj9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean13 = position7.equals((java.lang.Object) board8);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board15.setScore((int) (short) 100);
        boolean boolean18 = board8.equals((java.lang.Object) (short) 100);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board8.getEmptyPositions();
        boolean boolean20 = board0.equals((java.lang.Object) board8);
        boolean boolean21 = board8.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "27) test229(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(2048, (int) (byte) 0, cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "28) test230(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        board0.setScore((-1));
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board0.getCell((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "29) test231(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.Class<?> wildcardClass5 = board4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board3.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj7 = null;
        boolean boolean8 = board6.equals(obj7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        int int10 = board6.getSize();
        boolean boolean11 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray12 = board6.getGrid();
        board3.setGrid(cellArray12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj15 = null;
        boolean boolean16 = board14.equals(obj15);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Cell[][] cellArray18 = board14.getGrid();
        board3.setGrid(cellArray18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cellArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cellArray18);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        java.lang.Object obj8 = null;
        boolean boolean9 = board0.equals(obj8);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        board1.setScore((int) (byte) 100);
        int int9 = board1.getSize();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 1, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 2048) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        board0.setScore((int) '#');
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean8 = board7.hasEmptyCells();
        boolean boolean9 = board7.isLosingBoard();
        boolean boolean10 = board7.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = board1.getGrid();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board1.isLosingBoard();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        boolean boolean5 = board0.equals((java.lang.Object) (byte) -1);
        boolean boolean6 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        boolean boolean7 = board1.hasEmptyCells();
        board1.setScore((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, (int) '4');
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board3.getGrid();
        boolean boolean5 = board3.isWinningBoard();
        boolean boolean6 = board3.isFull();
        board3.setScore(2048);
        board3.setScore((int) '#');
        boolean boolean11 = position2.equals((java.lang.Object) board3);
        boolean boolean12 = board3.hasEmptyCells();
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        boolean boolean5 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean14 = board13.hasEmptyCells();
        int int15 = board13.getScore();
        ar.edu.unrc.game2048.Cell cell18 = board13.getCell((int) (byte) 1, (int) (short) 1);
        board0.setCell((int) (byte) 0, (int) (short) 0, cell18);
        int int20 = board0.getScore();
        java.lang.String str21 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky "30) test244(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str21, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean9 = board0.repOk();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj13 = null;
        boolean boolean14 = board12.equals(obj13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Cell[][] cellArray17 = board12.getGrid();
        ar.edu.unrc.game2048.Cell cell20 = board12.getCell((int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) '#', (int) 'a', cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cellArray17);
        org.junit.Assert.assertNotNull(cell20);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean9 = board0.isLosingBoard();
        boolean boolean11 = board0.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(4);
        java.lang.String str2 = board1.toString();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        java.lang.String str5 = board3.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board3.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray9 = board8.getGrid();
        board3.setGrid(cellArray9);
        board1.setGrid(cellArray9);
        ar.edu.unrc.game2048.movement.Direction direction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = board1.move(direction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "31) test247(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
// flaky "5) test247(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertNotNull(cellArray9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        java.lang.Class<?> wildcardClass6 = positionSet5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.hasEmptyCells();
        int int6 = board4.getScore();
        int int7 = board4.getScore();
        boolean boolean8 = board4.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getScore();
        boolean boolean6 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.movement.Direction direction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = board1.move(direction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) '4');
        boolean boolean11 = board0.equals((java.lang.Object) position10);
        int int12 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board3.equals((java.lang.Object) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        boolean boolean12 = board9.isLosingBoard();
        board9.setScore((int) '#');
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean17 = board16.hasEmptyCells();
        boolean boolean18 = board16.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray19 = board16.getGrid();
        ar.edu.unrc.game2048.Cell cell22 = board16.getCell(0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            board3.setCell((int) (byte) 1, (int) (byte) 100, cell22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cellArray19);
        org.junit.Assert.assertNotNull(cell22);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        board0.setScore(100);
        int int10 = board0.getScore();
        boolean boolean11 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        boolean boolean8 = board0.isWinningBoard();
        int int9 = board0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = board0.getCell(0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 4) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        int int8 = board0.getScore();
        board0.setScore((int) (byte) 100);
        boolean boolean11 = board0.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', 2048);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        java.lang.String str6 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2048 + "'", int3 == 2048);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(52, 2048)" + "'", str4, "(52, 2048)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, 2048)" + "'", str5, "(52, 2048)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(52, 2048)" + "'", str6, "(52, 2048)");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board6.getEmptyPositions();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board12.setScore((int) (short) 100);
        boolean boolean15 = board12.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board12.getEmptyPositions();
        boolean boolean17 = board12.hasEmptyCells();
        int int18 = board12.getSize();
        ar.edu.unrc.game2048.Cell cell21 = board12.getCell((int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            board6.setCell((int) (short) 100, 2048, cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(cell21);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        java.lang.Object obj8 = null;
        boolean boolean9 = board0.equals(obj8);
        boolean boolean10 = board0.repOk();
        java.lang.Class<?> wildcardClass11 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        java.lang.String str7 = board0.toString();
        boolean boolean8 = board0.isWinningBoard();
        boolean boolean9 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
// flaky "32) test259(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.repOk();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board8.setScore((int) (short) 100);
        boolean boolean11 = board8.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board8.getEmptyPositions();
        boolean boolean13 = board8.hasEmptyCells();
        int int14 = board8.getSize();
        ar.edu.unrc.game2048.Cell cell17 = board8.getCell((int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            board3.setCell(4, (int) (short) 10, cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(cell17);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.hasEmptyCells();
        int int6 = board4.getScore();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        java.lang.String str9 = board7.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board7.getEmptyPositions();
        boolean boolean11 = board4.equals((java.lang.Object) board7);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board15.setScore((int) (short) 100);
        boolean boolean18 = board15.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board15.getEmptyPositions();
        boolean boolean20 = board15.hasEmptyCells();
        int int21 = board15.getSize();
        ar.edu.unrc.game2048.Cell cell24 = board15.getCell((int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            board7.setCell((int) (byte) -1, (int) (short) 100, cell24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(positionSet8);
// flaky "33) test261(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(cell24);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj9 = null;
        boolean boolean10 = board8.equals(obj9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        int int12 = board8.getSize();
        boolean boolean13 = board8.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj18 = null;
        boolean boolean19 = board17.equals(obj18);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board17);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean22 = board21.hasEmptyCells();
        int int23 = board21.getScore();
        ar.edu.unrc.game2048.Cell cell26 = board21.getCell((int) (byte) 1, (int) (short) 1);
        board8.setCell((int) (byte) 0, (int) (short) 0, cell26);
        // The following exception was thrown during execution in test generation
        try {
            board5.setCell(100, 0, cell26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(cell26);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.hasEmptyCells();
        ar.edu.unrc.game2048.movement.Direction direction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = board4.move(direction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "34) test263(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, (int) '4');
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board3.getGrid();
        boolean boolean5 = board3.isWinningBoard();
        boolean boolean6 = board3.isFull();
        board3.setScore(2048);
        board3.setScore((int) '#');
        boolean boolean11 = position2.equals((java.lang.Object) board3);
        java.lang.String str12 = position2.toString();
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(10, 52)" + "'", str12, "(10, 52)");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.hasEmptyCells();
        int int6 = board4.getScore();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        java.lang.String str9 = board7.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board7.getEmptyPositions();
        boolean boolean11 = board4.equals((java.lang.Object) board7);
        java.lang.String str12 = board7.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board7.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(positionSet8);
// flaky "35) test265(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "6) test265(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n" + "'", str12, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet13);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getSize();
        board1.setScore((int) (short) 1);
        int int5 = board1.getScore();
        boolean boolean6 = board1.isFull();
        boolean boolean7 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, (int) (short) 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board6.setScore((int) (short) 100);
        int int9 = board6.getSize();
        int int10 = board6.getScore();
        boolean boolean11 = board6.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board6.getEmptyPositions();
        boolean boolean13 = position2.equals((java.lang.Object) board6);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj15 = null;
        boolean boolean16 = board14.equals(obj15);
        boolean boolean17 = board14.isLosingBoard();
        board14.setScore((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray20 = board14.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            board6.setGrid(cellArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(1, 0)" + "'", str4, "(1, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cellArray20);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board0.getCell(4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "36) test268(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        board0.setScore((int) '#');
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.movement.Direction direction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = board0.move(direction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board5.getGrid();
        board0.setGrid(cellArray6);
        int int8 = board0.getScore();
        boolean boolean9 = board0.repOk();
        boolean boolean10 = board0.repOk();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "37) test270(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = board0.getGrid();
        java.lang.String str6 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
// flaky "38) test271(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.hasEmptyCells();
        java.lang.String str6 = board4.toString();
        java.lang.String str7 = board4.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "39) test272(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
// flaky "7) test272(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        board0.setScore((int) '4');
        java.lang.String str9 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cellArray6);
// flaky "40) test273(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 52\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 52\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board3.getGrid();
        board0.setGrid(cellArray4);
        boolean boolean6 = board0.isFull();
        boolean boolean7 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        boolean boolean5 = position2.equals((java.lang.Object) 10.0d);
        int int6 = position2.row;
        int int7 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = board1.getGrid();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj7 = null;
        boolean boolean8 = board6.equals(obj7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board6);
        ar.edu.unrc.game2048.Cell[][] cellArray11 = board6.getGrid();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj15 = null;
        boolean boolean16 = board14.equals(obj15);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Cell[][] cellArray19 = board14.getGrid();
        ar.edu.unrc.game2048.Cell cell22 = board14.getCell((int) (byte) 1, 0);
        board6.setCell((int) (byte) 0, (int) (short) 1, cell22);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (byte) 1, (int) (short) -1, cell22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, -1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cellArray11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cellArray19);
        org.junit.Assert.assertNotNull(cell22);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = board1.getGrid();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board3.isFull();
        boolean boolean5 = board3.isWinningBoard();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray1 = board0.getGrid();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.hasEmptyCells();
        int int4 = board0.getScore();
        org.junit.Assert.assertNotNull(cellArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 0);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        board0.setScore((int) '#');
        boolean boolean6 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        boolean boolean8 = board0.isLosingBoard();
        int int9 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "41) test282(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(cellArray4);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(1, 0)" + "'", str4, "(1, 0)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, (int) (short) 0);
        int int3 = position2.row;
        int int4 = position2.col;
        java.lang.Class<?> wildcardClass5 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getScore();
        boolean boolean6 = board1.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean10 = board8.equals((java.lang.Object) "Score: 100\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        java.lang.Class<?> wildcardClass5 = board1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getSize();
        ar.edu.unrc.game2048.Cell cell10 = board1.getCell((int) (byte) 0, (int) (byte) 0);
        boolean boolean11 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        java.lang.String str7 = board0.toString();
        boolean boolean8 = board0.hasEmptyCells();
        boolean boolean9 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
// flaky "42) test288(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        java.lang.String str4 = board1.toString();
        boolean boolean5 = board1.hasEmptyCells();
// flaky "43) test289(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 100\n+-----+\n|    4|\n+-----+\n" + "'", str4, "Score: 100\n+-----+\n|    4|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.movement.Direction direction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = board7.move(direction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        boolean boolean5 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean14 = board13.hasEmptyCells();
        int int15 = board13.getScore();
        ar.edu.unrc.game2048.Cell cell18 = board13.getCell((int) (byte) 1, (int) (short) 1);
        board0.setCell((int) (byte) 0, (int) (short) 0, cell18);
        int int20 = board0.getScore();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet22 = board21.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(positionSet22);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getScore();
        boolean boolean6 = board1.repOk();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) (short) -1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        int int3 = position2.col;
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        int int7 = position6.col;
        boolean boolean8 = position2.equals((java.lang.Object) int7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean13 = board9.isFull();
        boolean boolean14 = board9.repOk();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board9);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board15.getEmptyPositions();
        boolean boolean18 = position2.equals((java.lang.Object) board15);
        boolean boolean19 = board15.repOk();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 10);
        int int2 = board1.getScore();
        int int3 = board1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        boolean boolean3 = board0.repOk();
        boolean boolean4 = board0.isFull();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj6 = null;
        boolean boolean7 = board5.equals(obj6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean9 = board5.isFull();
        boolean boolean10 = board5.isLosingBoard();
        int int11 = board5.getSize();
        java.lang.String str12 = board5.toString();
        boolean boolean13 = board5.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray14 = board5.getGrid();
        board0.setGrid(cellArray14);
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "44) test296(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
// flaky "8) test296(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str12, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cellArray14);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getSize();
        board1.setScore((int) (short) 1);
        int int5 = board1.getScore();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board1.getGrid();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(cellArray6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, 2048);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        int int6 = position5.row;
        boolean boolean7 = position2.equals((java.lang.Object) int6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str5 = board4.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        board4.setScore(1);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "45) test299(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        boolean boolean7 = board0.isWinningBoard();
        boolean boolean8 = board0.repOk();
        int int9 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 4);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board5.getGrid();
        board0.setGrid(cellArray6);
        int int8 = board0.getScore();
        boolean boolean9 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray10 = board0.getGrid();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "46) test302(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cellArray10);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray7 = board6.getGrid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cellArray7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getSize();
        boolean boolean2 = board0.repOk();
        int int3 = board0.getSize();
        boolean boolean4 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        int int3 = board0.getSize();
        boolean boolean4 = board0.isLosingBoard();
        java.lang.String str5 = board0.toString();
        boolean boolean6 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj8 = null;
        boolean boolean9 = board7.equals(obj8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean11 = board7.isFull();
        boolean boolean12 = board7.isLosingBoard();
        int int13 = board7.getSize();
        int int14 = board7.getSize();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean16 = board7.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray17 = board7.getGrid();
        board0.setGrid(cellArray17);
        int int19 = board0.getSize();
        ar.edu.unrc.game2048.movement.Direction direction20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = board0.move(direction20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "47) test305(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "9) test305(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cellArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getScore();
        boolean boolean6 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        int int8 = board1.getSize();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj12 = null;
        boolean boolean13 = board11.equals(obj12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board11);
        int int15 = board11.getSize();
        boolean boolean16 = board11.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board11.getEmptyPositions();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj21 = null;
        boolean boolean22 = board20.equals(obj21);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board20);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean25 = board24.hasEmptyCells();
        int int26 = board24.getScore();
        ar.edu.unrc.game2048.Cell cell29 = board24.getCell((int) (byte) 1, (int) (short) 1);
        board11.setCell((int) (byte) 0, (int) (short) 0, cell29);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) 'a', 0, cell29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 0) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(cell29);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        java.lang.String str7 = board0.toString();
        boolean boolean8 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray9 = board0.getGrid();
        java.lang.Class<?> wildcardClass10 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
// flaky "48) test307(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cellArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, 2048);
        boolean boolean6 = position2.equals((java.lang.Object) position5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        java.lang.String str7 = board0.toString();
        boolean boolean8 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray9 = board0.getGrid();
        boolean boolean10 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
// flaky "49) test309(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cellArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        board1.setScore((int) (byte) 100);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board13.setScore((int) (short) 100);
        boolean boolean16 = board13.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board13.getEmptyPositions();
        boolean boolean18 = board13.hasEmptyCells();
        int int19 = board13.getSize();
        ar.edu.unrc.game2048.Cell cell22 = board13.getCell((int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (byte) 100, 4, cell22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 4) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(cell22);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        boolean boolean4 = board0.equals((java.lang.Object) 0);
        int int5 = board0.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "50) test311(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board5.getGrid();
        board0.setGrid(cellArray6);
        int int8 = board0.getScore();
        boolean boolean9 = board0.isFull();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "51) test312(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        java.lang.String str4 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        int int7 = board6.getSize();
        boolean boolean8 = board6.repOk();
        boolean boolean9 = board0.equals((java.lang.Object) boolean8);
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "52) test313(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
// flaky "10) test313(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.hasEmptyCells();
        int int6 = board4.getScore();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        java.lang.String str9 = board7.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board7.getEmptyPositions();
        boolean boolean11 = board4.equals((java.lang.Object) board7);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj13 = null;
        boolean boolean14 = board12.equals(obj13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board12);
        int int16 = board12.getSize();
        boolean boolean17 = board12.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray18 = board12.getGrid();
        ar.edu.unrc.game2048.Cell[][] cellArray19 = board12.getGrid();
        board7.setGrid(cellArray19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(positionSet8);
// flaky "53) test314(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cellArray18);
        org.junit.Assert.assertNotNull(cellArray19);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getSize();
        board0.setScore(35);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        board4.setScore((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board5.getGrid();
        board0.setGrid(cellArray6);
        int int8 = board0.getScore();
        boolean boolean9 = board0.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "54) test316(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray1 = board0.getGrid();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        org.junit.Assert.assertNotNull(cellArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean9 = board0.repOk();
        board0.setScore(2048);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray1 = board0.getGrid();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board6.setScore((int) (short) 100);
        boolean boolean9 = board6.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board6.getEmptyPositions();
        boolean boolean11 = board6.hasEmptyCells();
        int int12 = board6.getSize();
        ar.edu.unrc.game2048.Cell cell15 = board6.getCell((int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 100, (int) '4', cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(cell15);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board3.equals((java.lang.Object) '#');
        boolean boolean6 = board3.isLosingBoard();
        java.lang.String str7 = board3.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "55) test320(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(32);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 0) is out of bounds for board size 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(10);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        board1.setScore(35);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, (-1));
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(2048, -1)" + "'", str4, "(2048, -1)");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        boolean boolean6 = board1.isFull();
        boolean boolean7 = board1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (-1));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        board0.setScore((int) '4');
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        boolean boolean5 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean14 = board13.hasEmptyCells();
        int int15 = board13.getScore();
        ar.edu.unrc.game2048.Cell cell18 = board13.getCell((int) (byte) 1, (int) (short) 1);
        board0.setCell((int) (byte) 0, (int) (short) 0, cell18);
        int int20 = board0.getScore();
        ar.edu.unrc.game2048.Cell[][] cellArray21 = board0.getGrid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(cellArray21);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        board0.setScore((int) (byte) 0);
        ar.edu.unrc.game2048.movement.Direction direction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = board0.move(direction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str6 = position5.toString();
        boolean boolean8 = position5.equals((java.lang.Object) 10.0d);
        boolean boolean9 = position2.equals((java.lang.Object) 10.0d);
        int int10 = position2.row;
        java.lang.String str11 = position2.toString();
        java.lang.String str12 = position2.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(35, 1)" + "'", str6, "(35, 1)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(35, 1)" + "'", str11, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(35, 1)" + "'", str12, "(35, 1)");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 0)" + "'", str3, "(1, 0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(1, 0)" + "'", str5, "(1, 0)");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getSize();
        board1.setScore((int) (short) 1);
        int int5 = board1.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        int int7 = board1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        boolean boolean7 = board0.hasEmptyCells();
        boolean boolean8 = board0.repOk();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        boolean boolean10 = board9.isFull();
        int int11 = board9.getSize();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray13 = board12.getGrid();
        board9.setGrid(cellArray13);
        board0.setGrid(cellArray13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(cellArray13);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj8 = null;
        boolean boolean9 = board7.equals(obj8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board7);
        ar.edu.unrc.game2048.Cell[][] cellArray11 = board7.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            board1.setGrid(cellArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cellArray11);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board0.isLosingBoard();
        ar.edu.unrc.game2048.movement.Direction direction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = board0.move(direction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-1), 2048);
        boolean boolean4 = position2.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        board0.setScore((int) (short) 1);
        int int10 = board0.getScore();
        boolean boolean11 = board0.isFull();
        boolean boolean12 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        int int5 = board0.getSize();
        board0.setScore(1);
        boolean boolean8 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        board0.setScore((int) '#');
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        boolean boolean8 = board0.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj9 = null;
        boolean boolean10 = board8.equals(obj9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean13 = position7.equals((java.lang.Object) board8);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board15.setScore((int) (short) 100);
        boolean boolean18 = board8.equals((java.lang.Object) (short) 100);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board8.getEmptyPositions();
        boolean boolean20 = board0.equals((java.lang.Object) board8);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board0.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "56) test342(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(positionSet21);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = position2.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board10.setScore((int) (short) 100);
        boolean boolean13 = board3.equals((java.lang.Object) (short) 100);
        boolean boolean14 = board3.repOk();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        board0.setScore((-1));
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board0.getCell((int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "57) test344(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        int int6 = board0.getScore();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "58) test345(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|    2|\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = board1.getGrid();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.isWinningBoard();
        boolean boolean8 = board1.repOk();
        ar.edu.unrc.game2048.movement.Direction direction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = board1.move(direction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, (int) (short) 0);
        int int3 = position2.row;
        int int4 = position2.col;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj6 = null;
        boolean boolean7 = board5.equals(obj6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean9 = board5.isFull();
        boolean boolean10 = board5.isLosingBoard();
        int int11 = board5.getSize();
        int int12 = board5.getSize();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean14 = board5.repOk();
        boolean boolean15 = position2.equals((java.lang.Object) boolean14);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj17 = null;
        boolean boolean18 = board16.equals(obj17);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean20 = board16.isFull();
        boolean boolean21 = board16.isLosingBoard();
        board16.setScore((int) ' ');
        board16.setScore((int) (short) 1);
        int int26 = board16.getScore();
        boolean boolean27 = position2.equals((java.lang.Object) board16);
        int int28 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj9 = null;
        boolean boolean10 = board8.equals(obj9);
        boolean boolean11 = board8.isLosingBoard();
        board8.setScore((int) '#');
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean16 = board15.hasEmptyCells();
        boolean boolean17 = board15.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray18 = board15.getGrid();
        ar.edu.unrc.game2048.Cell cell21 = board15.getCell(0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) ' ', 2048, cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cellArray18);
        org.junit.Assert.assertNotNull(cell21);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray1 = board0.getGrid();
        boolean boolean2 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        org.junit.Assert.assertNotNull(cellArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        int int9 = board8.getSize();
        int int10 = board8.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        boolean boolean8 = board0.isWinningBoard();
        boolean boolean9 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj12 = null;
        boolean boolean13 = board11.equals(obj12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board11);
        int int15 = board11.getSize();
        boolean boolean16 = board11.hasEmptyCells();
        boolean boolean17 = board0.equals((java.lang.Object) board11);
        boolean boolean18 = board0.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky "1) test351(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(32, (int) (short) 1);
        int int3 = position2.col;
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj5 = null;
        boolean boolean6 = board4.equals(obj5);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Cell[][] cellArray8 = board4.getGrid();
        boolean boolean9 = board4.repOk();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean11 = board4.isWinningBoard();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean13 = position2.equals((java.lang.Object) board12);
        java.lang.String str14 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(32, 1)" + "'", str14, "(32, 1)");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = board1.getGrid();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board3.isFull();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = board3.getGrid();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cellArray5);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, 0);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean6 = board0.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        boolean boolean7 = board0.isFull();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj11 = null;
        boolean boolean12 = board10.equals(obj11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean15 = board14.hasEmptyCells();
        int int16 = board14.getScore();
        ar.edu.unrc.game2048.Cell cell19 = board14.getCell((int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(52, 4, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 4) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "59) test356(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(cell19);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        board0.setScore((-1));
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str7 = board6.toString();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "60) test357(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
// flaky "11) test357(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: -1\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: -1\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(4);
        java.lang.String str2 = board1.toString();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        java.lang.String str5 = board3.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board3.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray9 = board8.getGrid();
        board3.setGrid(cellArray9);
        board1.setGrid(cellArray9);
        java.lang.String str12 = board1.toString();
// flaky "61) test358(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet4);
// flaky "12) test358(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertNotNull(cellArray9);
// flaky "1) test358(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str12, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = board1.getGrid();
        boolean boolean6 = board1.isFull();
        boolean boolean7 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        boolean boolean8 = board0.isWinningBoard();
        boolean boolean9 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board0.getEmptyPositions();
        boolean boolean11 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        int int5 = board0.getSize();
        boolean boolean6 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board8.setScore((int) (short) 100);
        int int11 = board8.getSize();
        int int12 = board8.getSize();
        boolean boolean13 = board8.hasEmptyCells();
        boolean boolean14 = board8.isWinningBoard();
        java.lang.String str15 = board8.toString();
        boolean boolean16 = board0.equals((java.lang.Object) str15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "62) test363(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 100\n+-----+\n|    4|\n+-----+\n" + "'", str15, "Score: 100\n+-----+\n|    4|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        int int6 = position2.row;
        int int7 = position2.row;
        java.lang.String str8 = position2.toString();
        int int9 = position2.col;
        int int10 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, 1)" + "'", str4, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(35, 1)" + "'", str8, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean2 = board1.hasEmptyCells();
        board1.setScore(0);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = board1.getGrid();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean7 = board1.isWinningBoard();
        boolean boolean8 = board1.repOk();
        int int9 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        board0.setScore((int) '#');
        boolean boolean6 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        boolean boolean8 = board0.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = board0.getCell(52, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board4.setScore((int) (short) 100);
        boolean boolean7 = board4.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray8 = board4.getGrid();
        boolean boolean9 = position2.equals((java.lang.Object) cellArray8);
        int int10 = position2.col;
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board11.getEmptyPositions();
        java.lang.String str13 = board11.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board11.getEmptyPositions();
        java.lang.String str15 = board11.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board11.getEmptyPositions();
        boolean boolean17 = position2.equals((java.lang.Object) board11);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell20 = board11.getCell(35, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(positionSet12);
// flaky "63) test369(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet14);
// flaky "13) test369(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str15, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board4.getCell(52, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "64) test370(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        int int3 = board0.getSize();
        boolean boolean4 = board0.isLosingBoard();
        java.lang.String str5 = board0.toString();
        boolean boolean6 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str8 = board0.toString();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "65) test371(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "14) test371(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "2) test371(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board3.equals((java.lang.Object) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board3.getEmptyPositions();
        int int7 = board3.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getScore();
        boolean boolean6 = board1.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell[][] cellArray8 = board1.getGrid();
        int int9 = board1.getSize();
        boolean boolean10 = board1.repOk();
        boolean boolean11 = board1.isLosingBoard();
        int int12 = board1.getScore();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(52, (int) (short) -1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        java.lang.String str5 = board3.toString();
        boolean boolean7 = board3.equals((java.lang.Object) 0);
        int int8 = board3.getScore();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean10 = position2.equals((java.lang.Object) board3);
        org.junit.Assert.assertNotNull(positionSet4);
// flaky "66) test374(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getScore();
        int int8 = board1.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean10 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (byte) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean7 = board3.isFull();
        boolean boolean8 = board3.isLosingBoard();
        int int9 = board3.getSize();
        java.lang.String str10 = board3.toString();
        boolean boolean11 = board3.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray12 = board3.getGrid();
        ar.edu.unrc.game2048.Board.Position position15 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        int int16 = position15.col;
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board18.setScore((int) (short) 100);
        boolean boolean21 = board18.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray22 = board18.getGrid();
        boolean boolean23 = position15.equals((java.lang.Object) cellArray22);
        boolean boolean24 = board3.equals((java.lang.Object) position15);
        boolean boolean25 = position2.equals((java.lang.Object) boolean24);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
// flaky "67) test376(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cellArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cellArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        int int3 = board0.getSize();
        boolean boolean4 = board0.isLosingBoard();
        boolean boolean5 = board0.repOk();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "68) test377(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board6.getCell((int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        boolean boolean7 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board0.getEmptyPositions();
        boolean boolean9 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        boolean boolean8 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray9 = board0.getGrid();
        boolean boolean10 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cellArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        int int8 = board3.getSize();
        board3.setScore(1);
        boolean boolean11 = board0.equals((java.lang.Object) board3);
        int int12 = board0.getScore();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        boolean boolean6 = board0.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "69) test383(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = board0.getGrid();
        boolean boolean6 = board0.repOk();
        boolean boolean7 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = board1.getGrid();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board5.setScore((int) (short) 100);
        int int8 = board5.getSize();
        int int9 = board5.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board5.getEmptyPositions();
        board5.setScore((int) (byte) 100);
        int int13 = board5.getSize();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean15 = board1.equals((java.lang.Object) board14);
        ar.edu.unrc.game2048.Board.Position position18 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj20 = null;
        boolean boolean21 = board19.equals(obj20);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board19);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean24 = position18.equals((java.lang.Object) board19);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean26 = board19.hasEmptyCells();
        boolean boolean27 = board19.repOk();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board28.getEmptyPositions();
        java.lang.String str30 = board28.toString();
        int int31 = board28.getSize();
        boolean boolean32 = board28.isLosingBoard();
        java.lang.String str33 = board28.toString();
        boolean boolean34 = board28.isWinningBoard();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj36 = null;
        boolean boolean37 = board35.equals(obj36);
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(board35);
        boolean boolean39 = board35.isFull();
        boolean boolean40 = board35.isLosingBoard();
        int int41 = board35.getSize();
        int int42 = board35.getSize();
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board(board35);
        boolean boolean44 = board35.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray45 = board35.getGrid();
        board28.setGrid(cellArray45);
        board19.setGrid(cellArray45);
        ar.edu.unrc.game2048.Cell[][] cellArray48 = board19.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            board14.setGrid(cellArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(positionSet29);
// flaky "70) test385(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str30, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "15) test385(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str33, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cellArray45);
        org.junit.Assert.assertNotNull(cellArray48);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.hasEmptyCells();
        boolean boolean6 = board4.isWinningBoard();
        int int7 = board4.getScore();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "71) test386(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        boolean boolean6 = board1.hasEmptyCells();
        boolean boolean7 = board1.isWinningBoard();
        java.lang.String str8 = board1.toString();
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position(0, (int) (short) 10);
        int int12 = position11.col;
        boolean boolean13 = board1.equals((java.lang.Object) int12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "1) test387(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 100\n+-----+\n|    2|\n+-----+\n" + "'", str8, "Score: 100\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = position2.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board10.setScore((int) (short) 100);
        boolean boolean13 = board3.equals((java.lang.Object) (short) 100);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board3.getEmptyPositions();
        int int15 = board3.getScore();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean9 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray10 = board0.getGrid();
        java.lang.Class<?> wildcardClass11 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getSize();
        board1.setScore((int) (short) 1);
        int int5 = board1.getScore();
        ar.edu.unrc.game2048.movement.Direction direction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = board1.move(direction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        int int6 = position2.row;
        int int7 = position2.row;
        java.lang.String str8 = position2.toString();
        int int9 = position2.row;
        java.lang.String str10 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, 1)" + "'", str4, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(35, 1)" + "'", str8, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(35, 1)" + "'", str10, "(35, 1)");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(100);
        board1.setScore(10);
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str7 = position6.toString();
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        boolean boolean10 = board1.equals((java.lang.Object) int9);
        int int11 = board1.getSize();
        ar.edu.unrc.game2048.Cell[][] cellArray12 = board1.getGrid();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(35, 1)" + "'", str7, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(35, 1)" + "'", str8, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(cellArray12);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board3.equals((java.lang.Object) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board7.getCell((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        board1.setScore((int) (byte) 100);
        int int9 = board1.getSize();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean11 = board10.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = board10.getCell((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 100) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = board1.getGrid();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board7.setScore((int) (short) 100);
        boolean boolean10 = board7.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray11 = board7.getGrid();
        boolean boolean12 = position5.equals((java.lang.Object) cellArray11);
        board1.setGrid(cellArray11);
        boolean boolean14 = board1.isFull();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cellArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        board0.setScore((int) (short) 1);
        int int10 = board0.getScore();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board11.getEmptyPositions();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getSize();
        boolean boolean15 = board11.isLosingBoard();
        java.lang.String str16 = board11.toString();
        boolean boolean17 = board11.isWinningBoard();
        boolean boolean18 = board0.equals((java.lang.Object) board11);
        int int19 = board11.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(positionSet12);
// flaky "72) test396(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "16) test396(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(100);
        board1.setScore(10);
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str7 = position6.toString();
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        boolean boolean10 = board1.equals((java.lang.Object) int9);
        int int11 = board1.getSize();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj15 = null;
        boolean boolean16 = board14.equals(obj15);
        boolean boolean17 = board14.isLosingBoard();
        boolean boolean19 = board14.equals((java.lang.Object) (byte) -1);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj21 = null;
        boolean boolean22 = board20.equals(obj21);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean24 = board20.isFull();
        boolean boolean25 = board20.isLosingBoard();
        int int26 = board20.getSize();
        int int27 = board20.getSize();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean29 = board20.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray30 = board20.getGrid();
        board14.setGrid(cellArray30);
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean33 = board14.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell36 = board14.getCell((int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (byte) -1, (int) (short) 100, cell36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 100) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(35, 1)" + "'", str7, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(35, 1)" + "'", str8, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cellArray30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(cell36);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 10);
        int int2 = board1.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj6 = null;
        boolean boolean7 = board5.equals(obj6);
        boolean boolean8 = board5.isLosingBoard();
        boolean boolean10 = board5.equals((java.lang.Object) (byte) -1);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj12 = null;
        boolean boolean13 = board11.equals(obj12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean15 = board11.isFull();
        boolean boolean16 = board11.isLosingBoard();
        int int17 = board11.getSize();
        int int18 = board11.getSize();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean20 = board11.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray21 = board11.getGrid();
        board5.setGrid(cellArray21);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean24 = board5.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell27 = board5.getCell((int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(32, (int) (byte) 1, cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 1) is out of bounds for board size 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cellArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cell27);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj7 = null;
        boolean boolean8 = board6.equals(obj7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean10 = board6.isFull();
        boolean boolean11 = board6.isWinningBoard();
        boolean boolean12 = board6.isLosingBoard();
        int int13 = board6.getSize();
        boolean boolean14 = position2.equals((java.lang.Object) board6);
        boolean boolean15 = board6.repOk();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, 1)" + "'", str4, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getSize();
        board0.setScore(35);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position(0, 52);
        int int8 = position7.col;
        boolean boolean9 = board0.equals((java.lang.Object) position7);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        int int3 = board0.getSize();
        boolean boolean4 = board0.isLosingBoard();
        java.lang.String str5 = board0.toString();
        boolean boolean6 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj8 = null;
        boolean boolean9 = board7.equals(obj8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean11 = board7.isFull();
        boolean boolean12 = board7.isLosingBoard();
        int int13 = board7.getSize();
        int int14 = board7.getSize();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean16 = board7.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray17 = board7.getGrid();
        board0.setGrid(cellArray17);
        int int19 = board0.getSize();
        boolean boolean20 = board0.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "73) test401(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "17) test401(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cellArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        java.lang.Object obj8 = null;
        boolean boolean9 = board0.equals(obj8);
        java.lang.String str10 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "74) test402(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet11);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.hasEmptyCells();
        int int6 = board4.getScore();
        java.lang.String str7 = board4.toString();
        int int8 = board4.getSize();
        int int9 = board4.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "75) test403(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        int int8 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = board1.getGrid();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board5.setScore((int) (short) 100);
        int int8 = board5.getSize();
        int int9 = board5.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board5.getEmptyPositions();
        board5.setScore((int) (byte) 100);
        int int13 = board5.getSize();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean15 = board1.equals((java.lang.Object) board14);
        ar.edu.unrc.game2048.movement.Direction direction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = board1.move(direction16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        int int6 = position2.row;
        int int7 = position2.row;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board9.setScore((int) (short) 100);
        int int12 = board9.getSize();
        int int13 = board9.getScore();
        boolean boolean14 = board9.isFull();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean16 = position2.equals((java.lang.Object) board9);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board((int) '#');
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board25.setScore((int) (short) 100);
        boolean boolean28 = board25.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board25.getEmptyPositions();
        boolean boolean30 = board25.hasEmptyCells();
        int int31 = board25.getSize();
        ar.edu.unrc.game2048.Cell cell34 = board25.getCell((int) (byte) 0, (int) (byte) 0);
        board21.setCell(10, (int) (short) 10, cell34);
        // The following exception was thrown during execution in test generation
        try {
            board17.setCell(4, 1, cell34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, 1)" + "'", str4, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(positionSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(cell34);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        boolean boolean5 = board0.hasEmptyCells();
        boolean boolean6 = board0.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str7 = position6.toString();
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        boolean boolean10 = position2.equals((java.lang.Object) int9);
        int int11 = position2.row;
        int int12 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 0)" + "'", str3, "(1, 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(35, 1)" + "'", str7, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(35, 1)" + "'", str8, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getScore();
        boolean boolean6 = board1.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell[][] cellArray8 = board1.getGrid();
        int int9 = board1.getSize();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj13 = null;
        boolean boolean14 = board12.equals(obj13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Cell[][] cellArray17 = board12.getGrid();
        ar.edu.unrc.game2048.Cell cell20 = board12.getCell((int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(0, 100, cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 100) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cellArray17);
        org.junit.Assert.assertNotNull(cell20);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 1);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (byte) 100);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        java.lang.String str6 = position5.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        board7.setScore((int) '4');
        boolean boolean11 = position5.equals((java.lang.Object) '4');
        java.lang.String str12 = position5.toString();
        boolean boolean13 = position2.equals((java.lang.Object) position5);
        int int14 = position5.col;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, 0)" + "'", str6, "(1, 0)");
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(1, 0)" + "'", str12, "(1, 0)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = position2.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board10.setScore((int) (short) 100);
        boolean boolean13 = board3.equals((java.lang.Object) (short) 100);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(positionSet14);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getSize();
        ar.edu.unrc.game2048.Cell cell10 = board1.getCell((int) (byte) 0, (int) (byte) 0);
        boolean boolean11 = board1.isLosingBoard();
        board1.setScore(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        ar.edu.unrc.game2048.Cell[][] cellArray7 = board0.getGrid();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board9.setScore((int) (short) 100);
        boolean boolean12 = board9.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board9.getEmptyPositions();
        boolean boolean14 = board9.hasEmptyCells();
        int int15 = board9.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board9.getEmptyPositions();
        boolean boolean17 = board9.isLosingBoard();
        int int18 = board9.getScore();
        ar.edu.unrc.game2048.Cell[][] cellArray19 = board9.getGrid();
        // The following exception was thrown during execution in test generation
        try {
            board0.setGrid(cellArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertNotNull(cellArray7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(cellArray19);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        int int8 = board0.getScore();
        boolean boolean9 = board0.isFull();
        int int10 = board0.getScore();
        boolean boolean11 = board0.repOk();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj15 = null;
        boolean boolean16 = board14.equals(obj15);
        boolean boolean17 = board14.isLosingBoard();
        board14.setScore((int) '#');
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean22 = board21.hasEmptyCells();
        boolean boolean23 = board21.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray24 = board21.getGrid();
        ar.edu.unrc.game2048.Cell cell27 = board21.getCell(0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) -1, (int) (byte) 1, cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cellArray24);
        org.junit.Assert.assertNotNull(cell27);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(32, 32);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = position2.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board3);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board11.getEmptyPositions();
        java.lang.String str13 = board11.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board11.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board11.getEmptyPositions();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray17 = board16.getGrid();
        board11.setGrid(cellArray17);
        int int19 = board11.getScore();
        ar.edu.unrc.game2048.Cell[][] cellArray20 = board11.getGrid();
        board3.setGrid(cellArray20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertNotNull(positionSet12);
// flaky "76) test417(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|    2|\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertNotNull(cellArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(cellArray20);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean9 = board0.isLosingBoard();
        boolean boolean10 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        int int3 = position2.col;
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        int int7 = position6.col;
        boolean boolean8 = position2.equals((java.lang.Object) int7);
        java.lang.String str9 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(1, 0)" + "'", str9, "(1, 0)");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        java.lang.Object obj7 = null;
        boolean boolean8 = board0.equals(obj7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        int int3 = position2.row;
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        int int7 = position6.col;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board9.setScore((int) (short) 100);
        boolean boolean12 = board9.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray13 = board9.getGrid();
        boolean boolean14 = position6.equals((java.lang.Object) cellArray13);
        boolean boolean15 = position2.equals((java.lang.Object) position6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cellArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        java.lang.String str7 = board0.toString();
        boolean boolean8 = board0.hasEmptyCells();
        int int9 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
// flaky "77) test422(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getSize();
        ar.edu.unrc.game2048.Cell cell10 = board1.getCell((int) (byte) 0, (int) (byte) 0);
        boolean boolean11 = board1.isLosingBoard();
        java.lang.String str12 = board1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "3) test423(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 100\n+-----+\n|    2|\n+-----+\n" + "'", str12, "Score: 100\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray1 = board0.getGrid();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.hasEmptyCells();
        boolean boolean4 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = board0.getGrid();
        int int6 = board0.getSize();
        org.junit.Assert.assertNotNull(cellArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        board1.setScore((int) (byte) 100);
        int int9 = board1.getSize();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.Class<?> wildcardClass11 = board10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(52, 10);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getSize();
        ar.edu.unrc.game2048.Cell cell10 = board1.getCell((int) (byte) 0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj15 = null;
        boolean boolean16 = board14.equals(obj15);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean19 = board18.hasEmptyCells();
        int int20 = board18.getScore();
        ar.edu.unrc.game2048.Cell cell23 = board18.getCell((int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell((int) (short) 100, 100, cell23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 100) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(cell23);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getSize();
        ar.edu.unrc.game2048.movement.Direction direction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = board1.move(direction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.hasEmptyCells();
        int int6 = board4.getScore();
        int int7 = board4.getScore();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        java.lang.String str10 = board8.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean13 = board4.equals((java.lang.Object) board12);
        java.lang.String str14 = board4.toString();
        boolean boolean15 = board4.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
// flaky "78) test429(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "18) test429(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getScore();
        boolean boolean6 = board1.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.String str8 = board7.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "4) test430(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 100\n+-----+\n|    2|\n+-----+\n" + "'", str8, "Score: 100\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        boolean boolean5 = board0.equals((java.lang.Object) (byte) -1);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj7 = null;
        boolean boolean8 = board6.equals(obj7);
        boolean boolean9 = board6.isLosingBoard();
        board6.setScore((int) '#');
        ar.edu.unrc.game2048.Cell[][] cellArray12 = board6.getGrid();
        boolean boolean13 = board0.equals((java.lang.Object) board6);
        ar.edu.unrc.game2048.Cell[][] cellArray14 = board6.getGrid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cellArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cellArray14);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        boolean boolean5 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean14 = board13.hasEmptyCells();
        int int15 = board13.getScore();
        ar.edu.unrc.game2048.Cell cell18 = board13.getCell((int) (byte) 1, (int) (short) 1);
        board0.setCell((int) (byte) 0, (int) (short) 0, cell18);
        int int20 = board0.getScore();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean22 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        boolean boolean8 = board0.isWinningBoard();
        boolean boolean9 = board0.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.Class<?> wildcardClass5 = board0.getClass();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "79) test434(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj8 = null;
        boolean boolean9 = board7.equals(obj8);
        boolean boolean10 = board7.isLosingBoard();
        board7.setScore((int) '#');
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board7);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board7.getEmptyPositions();
        boolean boolean15 = board1.equals((java.lang.Object) positionSet14);
        ar.edu.unrc.game2048.Cell[][] cellArray16 = board1.getGrid();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board1.getEmptyPositions();
        board1.setScore((int) (byte) 100);
        int int9 = board1.getSize();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board14.setScore((int) (short) 100);
        boolean boolean17 = board14.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray18 = board14.getGrid();
        boolean boolean19 = board14.isFull();
        ar.edu.unrc.game2048.Cell cell22 = board14.getCell(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            board10.setCell((-1), 4, cell22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 4) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cellArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cell22);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(52, (int) (short) -1);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getSize();
        board1.setScore((int) (short) 1);
        int int5 = board1.getScore();
        boolean boolean6 = board1.isFull();
        java.lang.String str7 = board1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "19) test438(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 1\n+-----+\n|    2|\n+-----+\n" + "'", str7, "Score: 1\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = position2.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean13 = board9.isFull();
        boolean boolean14 = board9.isLosingBoard();
        int int15 = board9.getSize();
        int int16 = board9.getSize();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean18 = position2.equals((java.lang.Object) board17);
        boolean boolean19 = board17.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        board0.setScore((int) '4');
        board0.setScore((-1));
        int int11 = board0.getSize();
        java.lang.String str12 = board0.toString();
        boolean boolean13 = board0.repOk();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        java.lang.String str16 = board14.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board14.getEmptyPositions();
        board14.setScore((-1));
        ar.edu.unrc.game2048.Board.Position position22 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str23 = position22.toString();
        java.lang.String str24 = position22.toString();
        int int25 = position22.col;
        int int26 = position22.row;
        int int27 = position22.row;
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board29.setScore((int) (short) 100);
        int int32 = board29.getSize();
        int int33 = board29.getScore();
        boolean boolean34 = board29.isFull();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board29);
        boolean boolean36 = position22.equals((java.lang.Object) board29);
        boolean boolean37 = board14.equals((java.lang.Object) board29);
        boolean boolean38 = board0.equals((java.lang.Object) board29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
// flaky "80) test440(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: -1\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str12, "Score: -1\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(positionSet15);
// flaky "20) test440(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(35, 1)" + "'", str23, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(35, 1)" + "'", str24, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj7 = null;
        boolean boolean8 = board6.equals(obj7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean10 = board6.isFull();
        boolean boolean11 = board6.isWinningBoard();
        boolean boolean12 = board6.isLosingBoard();
        int int13 = board6.getSize();
        boolean boolean14 = position2.equals((java.lang.Object) board6);
        int int15 = position2.row;
        int int16 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, 1)" + "'", str4, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getSize();
        int int8 = board1.getSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        board0.setScore((int) '4');
        board0.setScore((-1));
        ar.edu.unrc.game2048.Cell[][] cellArray11 = board0.getGrid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertNotNull(cellArray11);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        java.lang.String str8 = board0.toString();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj12 = null;
        boolean boolean13 = board11.equals(obj12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean15 = board11.isFull();
        boolean boolean16 = board11.isLosingBoard();
        board11.setScore((int) ' ');
        ar.edu.unrc.game2048.Board.Position position21 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) '4');
        boolean boolean22 = board11.equals((java.lang.Object) position21);
        ar.edu.unrc.game2048.Cell cell25 = board11.getCell((int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) ' ', 52, cell25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
// flaky "81) test444(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell25);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, (int) (short) 0);
        int int3 = position2.row;
        int int4 = position2.col;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj6 = null;
        boolean boolean7 = board5.equals(obj6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean9 = board5.isFull();
        boolean boolean10 = board5.isLosingBoard();
        int int11 = board5.getSize();
        int int12 = board5.getSize();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean14 = board5.repOk();
        boolean boolean15 = position2.equals((java.lang.Object) boolean14);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj17 = null;
        boolean boolean18 = board16.equals(obj17);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean20 = board16.isFull();
        boolean boolean21 = board16.isLosingBoard();
        board16.setScore((int) ' ');
        board16.setScore((int) (short) 1);
        int int26 = board16.getScore();
        boolean boolean27 = position2.equals((java.lang.Object) board16);
        java.lang.Class<?> wildcardClass28 = board16.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-1), 100);
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        int int5 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, 100)" + "'", str3, "(-1, 100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray1 = board0.getGrid();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj6 = null;
        boolean boolean7 = board5.equals(obj6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board5);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean10 = board9.hasEmptyCells();
        int int11 = board9.getScore();
        ar.edu.unrc.game2048.Cell cell14 = board9.getCell((int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(1, 100, cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(cell14);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray1 = board0.getGrid();
        boolean boolean2 = board0.hasEmptyCells();
        boolean boolean3 = board0.isFull();
        java.lang.String str4 = board0.toString();
        org.junit.Assert.assertNotNull(cellArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "82) test449(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "83) test450(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        boolean boolean5 = board0.equals((java.lang.Object) (byte) -1);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj7 = null;
        boolean boolean8 = board6.equals(obj7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean10 = board6.isFull();
        boolean boolean11 = board6.isLosingBoard();
        int int12 = board6.getSize();
        int int13 = board6.getSize();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean15 = board6.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray16 = board6.getGrid();
        board0.setGrid(cellArray16);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean19 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(positionSet20);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board5.getGrid();
        board0.setGrid(cellArray6);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board0.getEmptyPositions();
        int int9 = board0.getSize();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj13 = null;
        boolean boolean14 = board12.equals(obj13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Cell[][] cellArray17 = board12.getGrid();
        ar.edu.unrc.game2048.Cell cell20 = board12.getCell((int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(52, (int) (short) 0, cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "84) test452(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cellArray17);
        org.junit.Assert.assertNotNull(cell20);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        boolean boolean8 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray9 = board0.getGrid();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cellArray9);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, (int) '4');
        int int3 = position2.col;
        int int4 = position2.row;
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(10, 52)" + "'", str5, "(10, 52)");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        java.lang.String str8 = board0.toString();
        boolean boolean9 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
// flaky "85) test455(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        boolean boolean6 = board1.hasEmptyCells();
        boolean boolean7 = board1.isWinningBoard();
        java.lang.String str8 = board1.toString();
        boolean boolean9 = board1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "86) test456(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 100\n+-----+\n|    2|\n+-----+\n" + "'", str8, "Score: 100\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(32, (int) (short) 1);
        int int3 = position2.col;
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, 1)" + "'", str5, "(32, 1)");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board3.equals((java.lang.Object) '#');
        boolean boolean6 = board3.isWinningBoard();
        boolean boolean7 = board3.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(35);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = board1.getGrid();
        java.lang.Class<?> wildcardClass3 = board1.getClass();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getSize();
        java.lang.String str2 = board0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj6 = null;
        boolean boolean7 = board5.equals(obj6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board5);
        int int9 = board5.getSize();
        boolean boolean10 = board5.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board5.getEmptyPositions();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj15 = null;
        boolean boolean16 = board14.equals(obj15);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean19 = board18.hasEmptyCells();
        int int20 = board18.getScore();
        ar.edu.unrc.game2048.Cell cell23 = board18.getCell((int) (byte) 1, (int) (short) 1);
        board5.setCell((int) (byte) 0, (int) (short) 0, cell23);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) ' ', (int) (byte) -1, cell23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
// flaky "87) test460(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(cell23);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str5 = board4.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean7 = board6.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "88) test461(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.isWinningBoard();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore(2048);
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "89) test462(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getScore();
        boolean boolean6 = board1.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        int int8 = board7.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board7.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(positionSet9);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = board1.getGrid();
        boolean boolean6 = board1.isFull();
        boolean boolean7 = board1.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board1.getCell((int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 52) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.isLosingBoard();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board6.setScore((int) (short) 100);
        boolean boolean9 = board6.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray10 = board6.getGrid();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean12 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray13 = board6.getGrid();
        boolean boolean14 = board3.equals((java.lang.Object) board6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cellArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        boolean boolean4 = board0.isLosingBoard();
        java.lang.String str5 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "90) test466(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getSize();
        board1.setScore((int) (short) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board1);
        board1.setScore((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        java.lang.String str7 = board0.toString();
        boolean boolean8 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray9 = board0.getGrid();
        ar.edu.unrc.game2048.Board.Position position12 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        int int13 = position12.col;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board15.setScore((int) (short) 100);
        boolean boolean18 = board15.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray19 = board15.getGrid();
        boolean boolean20 = position12.equals((java.lang.Object) cellArray19);
        boolean boolean21 = board0.equals((java.lang.Object) position12);
        java.lang.String str22 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
// flaky "91) test468(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cellArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cellArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "21) test468(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str22, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean9 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray10 = board0.getGrid();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertNotNull(positionSet11);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = board6.equals((java.lang.Object) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board6.getEmptyPositions();
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = position2.equals((java.lang.Object) boolean10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = board1.getGrid();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        int int4 = board1.getSize();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        board0.setScore((int) '#');
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean13 = board9.isFull();
        boolean boolean14 = board9.isLosingBoard();
        board9.setScore((int) ' ');
        ar.edu.unrc.game2048.Board.Position position19 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) '4');
        boolean boolean20 = board9.equals((java.lang.Object) position19);
        ar.edu.unrc.game2048.Cell cell23 = board9.getCell((int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            board6.setCell((int) (short) 100, 0, cell23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        int int6 = position2.row;
        int int7 = position2.row;
        java.lang.String str8 = position2.toString();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.Cell[][] cellArray11 = board10.getGrid();
        ar.edu.unrc.game2048.Board.Position position14 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board16.setScore((int) (short) 100);
        boolean boolean19 = board16.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray20 = board16.getGrid();
        boolean boolean21 = position14.equals((java.lang.Object) cellArray20);
        board10.setGrid(cellArray20);
        boolean boolean23 = position2.equals((java.lang.Object) board10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, 1)" + "'", str4, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(35, 1)" + "'", str8, "(35, 1)");
        org.junit.Assert.assertNotNull(cellArray11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cellArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.hasEmptyCells();
        int int6 = board4.getScore();
        ar.edu.unrc.game2048.Cell cell9 = board4.getCell((int) (byte) 1, (int) (short) 1);
        boolean boolean11 = board4.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        boolean boolean6 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        board0.setScore((int) '4');
        board0.setScore((-1));
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.movement.Direction direction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = board0.move(direction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertNotNull(positionSet11);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        boolean boolean5 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean14 = board13.hasEmptyCells();
        int int15 = board13.getScore();
        ar.edu.unrc.game2048.Cell cell18 = board13.getCell((int) (byte) 1, (int) (short) 1);
        board0.setCell((int) (byte) 0, (int) (short) 0, cell18);
        int int20 = board0.getScore();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet23 = board22.getEmptyPositions();
        java.lang.String str24 = board22.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board22.getEmptyPositions();
        java.lang.String str26 = board22.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet27 = board22.getEmptyPositions();
        boolean boolean28 = board0.equals((java.lang.Object) positionSet27);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(positionSet23);
// flaky "92) test477(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str24, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet25);
// flaky "22) test477(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str26, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(positionSet29);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        boolean boolean8 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray10 = board9.getGrid();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        boolean boolean13 = board12.isFull();
        int int14 = board12.getSize();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray16 = board15.getGrid();
        board12.setGrid(cellArray16);
        boolean boolean18 = board11.equals((java.lang.Object) cellArray16);
        board0.setGrid(cellArray16);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board((int) '#');
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board28.setScore((int) (short) 100);
        boolean boolean31 = board28.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet32 = board28.getEmptyPositions();
        boolean boolean33 = board28.hasEmptyCells();
        int int34 = board28.getSize();
        ar.edu.unrc.game2048.Cell cell37 = board28.getCell((int) (byte) 0, (int) (byte) 0);
        board24.setCell(10, (int) (short) 10, cell37);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) -1, 100, cell37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(positionSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(cell37);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        board0.setScore((int) '4');
        board0.setScore((-1));
        int int11 = board0.getSize();
        java.lang.String str12 = board0.toString();
        boolean boolean13 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray14 = board0.getGrid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
// flaky "93) test479(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: -1\n+-----+-----+-----+-----+\n|     |     |    2|    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str12, "Score: -1\n+-----+-----+-----+-----+\n|     |     |    2|    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cellArray14);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        int int8 = board0.getScore();
        boolean boolean10 = board0.equals((java.lang.Object) "Score: 100\n+-----+\n|    2|\n+-----+\n");
        boolean boolean11 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getSize();
        board0.setScore(35);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj8 = null;
        boolean boolean9 = board7.equals(obj8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board7);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean12 = board11.hasEmptyCells();
        int int13 = board11.getScore();
        ar.edu.unrc.game2048.Cell cell16 = board11.getCell((int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(100, 1, cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(cell16);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        int int4 = board0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board0.getCell(32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "94) test482(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        boolean boolean5 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board8.setScore((int) (short) 100);
        boolean boolean11 = board8.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray12 = board8.getGrid();
        boolean boolean13 = board8.isFull();
        boolean boolean14 = board0.equals((java.lang.Object) boolean13);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board0.getEmptyPositions();
        boolean boolean16 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cellArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray1 = board0.getGrid();
        boolean boolean2 = board0.isWinningBoard();
        int int3 = board0.getScore();
        org.junit.Assert.assertNotNull(cellArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board7.setScore((int) (short) 100);
        int int10 = board7.getSize();
        int int11 = board7.getScore();
        boolean boolean12 = board7.isFull();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board7);
        ar.edu.unrc.game2048.Cell[][] cellArray14 = board7.getGrid();
        board1.setGrid(cellArray14);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell18 = board1.getCell((int) (byte) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 35) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cellArray14);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        board0.setScore((int) '4');
        board0.setScore((int) (short) 0);
        int int11 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        boolean boolean8 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray10 = board9.getGrid();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        boolean boolean13 = board12.isFull();
        int int14 = board12.getSize();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray16 = board15.getGrid();
        board12.setGrid(cellArray16);
        boolean boolean18 = board11.equals((java.lang.Object) cellArray16);
        board0.setGrid(cellArray16);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board0.getEmptyPositions();
        int int21 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cellArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(cellArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-1), 100);
        boolean boolean4 = position2.equals((java.lang.Object) "(100, 10)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, (int) (short) 0);
        int int10 = position9.row;
        int int11 = position9.col;
        boolean boolean12 = board0.equals((java.lang.Object) position9);
        java.lang.Object obj13 = null;
        boolean boolean14 = position9.equals(obj13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        boolean boolean5 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean14 = board13.hasEmptyCells();
        int int15 = board13.getScore();
        ar.edu.unrc.game2048.Cell cell18 = board13.getCell((int) (byte) 1, (int) (short) 1);
        board0.setCell((int) (byte) 0, (int) (short) 0, cell18);
        int int20 = board0.getScore();
        boolean boolean21 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.isWinningBoard();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.repOk();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "95) test492(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        boolean boolean4 = board0.hasEmptyCells();
        board0.setScore(0);
        ar.edu.unrc.game2048.movement.Direction direction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = board0.move(direction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        java.lang.String str4 = board0.toString();
        boolean boolean5 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "96) test494(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.hasEmptyCells();
        boolean boolean6 = board4.isWinningBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board8.setScore((int) (short) 100);
        int int11 = board8.getSize();
        int int12 = board8.getSize();
        boolean boolean13 = board8.isFull();
        boolean boolean14 = board4.equals((java.lang.Object) boolean13);
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "97) test495(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        boolean boolean4 = board0.repOk();
        int int5 = board0.getScore();
        board0.setScore((int) (byte) 0);
        ar.edu.unrc.game2048.Cell[][] cellArray8 = board0.getGrid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cellArray8);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) ' ');
        int int3 = position2.row;
        int int4 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        boolean boolean8 = board6.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        boolean boolean5 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean14 = board13.hasEmptyCells();
        int int15 = board13.getScore();
        ar.edu.unrc.game2048.Cell cell18 = board13.getCell((int) (byte) 1, (int) (short) 1);
        board0.setCell((int) (byte) 0, (int) (short) 0, cell18);
        int int20 = board0.getScore();
        boolean boolean21 = board0.isLosingBoard();
        boolean boolean22 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.isWinningBoard();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "98) test500(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cellArray6);
    }
}
