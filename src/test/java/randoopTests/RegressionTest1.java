package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str3 = position2.toString();
        boolean boolean5 = position2.equals((java.lang.Object) '#');
        int int6 = position2.col;
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj8 = null;
        boolean boolean9 = board7.equals(obj8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board7);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board7);
        int int12 = board7.getSize();
        board7.setScore(1);
        boolean boolean15 = position2.equals((java.lang.Object) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 1)" + "'", str3, "(35, 1)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        int int3 = board0.getSize();
        boolean boolean4 = board0.isLosingBoard();
        java.lang.String str5 = board0.toString();
        boolean boolean6 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean8 = board0.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "1) test502(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "1) test502(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 100);
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
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getScore();
        boolean boolean6 = board1.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell[][] cellArray8 = board1.getGrid();
        int int9 = board1.getSize();
        boolean boolean10 = board1.repOk();
        boolean boolean11 = board1.isFull();
        ar.edu.unrc.game2048.movement.Direction direction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = board1.move(direction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cellArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(32, 35);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        java.lang.String str16 = board0.toString();
        boolean boolean17 = board0.isFull();
        ar.edu.unrc.game2048.Cell[][] cellArray18 = board0.getGrid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cellArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(positionSet15);
// flaky "2) test506(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cellArray18);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = position2.equals((java.lang.Object) board3);
        boolean boolean9 = board3.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board3.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        boolean boolean4 = board0.hasEmptyCells();
        boolean boolean5 = board0.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-1), 100);
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = board5.isFull();
        int int7 = board5.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray9 = board8.getGrid();
        board5.setGrid(cellArray9);
        boolean boolean11 = board5.isFull();
        ar.edu.unrc.game2048.Cell[][] cellArray12 = board5.getGrid();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean14 = board5.isFull();
        boolean boolean15 = position2.equals((java.lang.Object) boolean14);
        int int16 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, 100)" + "'", str3, "(-1, 100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(cellArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cellArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        board0.setScore((int) ' ');
        int int8 = board0.getScore();
        boolean boolean10 = board0.equals((java.lang.Object) "Score: 100\n+-----+\n|    2|\n+-----+\n");
        int int11 = board0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = board0.getCell(4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
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
        board4.setScore((int) 'a');
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board4);
        board4.setScore((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
// flaky "3) test511(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "2) test511(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getSize();
        board1.setScore((int) (short) 1);
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.repOk();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
        ar.edu.unrc.game2048.Cell[][] cellArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            board0.setGrid(cellArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean2 = board1.hasEmptyCells();
        board1.setScore(0);
        int int5 = board1.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        int int2 = board0.getSize();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board3.getGrid();
        board0.setGrid(cellArray4);
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Cell[][] cellArray7 = board0.getGrid();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean9 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cellArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
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
        boolean boolean22 = board0.equals((java.lang.Object) cellArray21);
        int int23 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
// flaky "4) test516(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cellArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 10);
        boolean boolean2 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        java.lang.String str3 = board0.toString();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "5) test518(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getSize();
        boolean boolean2 = board0.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        boolean boolean4 = board0.repOk();
        boolean boolean5 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        java.lang.String str6 = board4.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board4.getEmptyPositions();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean10 = board4.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        boolean boolean11 = board0.equals((java.lang.Object) board4);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board4.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet5);
// flaky "6) test520(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |    2|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet12);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean7 = board3.isFull();
        boolean boolean8 = board3.isLosingBoard();
        int int9 = board3.getSize();
        int int10 = board3.getSize();
        boolean boolean11 = board3.isLosingBoard();
        boolean boolean12 = position2.equals((java.lang.Object) boolean11);
        boolean boolean14 = position2.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getSize();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        int int7 = board0.getScore();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        java.lang.String str10 = board8.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board8.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray14 = board13.getGrid();
        board8.setGrid(cellArray14);
        board0.setGrid(cellArray14);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj20 = null;
        boolean boolean21 = board19.equals(obj20);
        boolean boolean22 = board19.isLosingBoard();
        boolean boolean24 = board19.equals((java.lang.Object) (byte) -1);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj26 = null;
        boolean boolean27 = board25.equals(obj26);
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board25);
        boolean boolean29 = board25.isFull();
        boolean boolean30 = board25.isLosingBoard();
        int int31 = board25.getSize();
        int int32 = board25.getSize();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board25);
        boolean boolean34 = board25.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray35 = board25.getGrid();
        board19.setGrid(cellArray35);
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj40 = null;
        boolean boolean41 = board39.equals(obj40);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(board39);
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board(board39);
        ar.edu.unrc.game2048.Cell[][] cellArray44 = board39.getGrid();
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj48 = null;
        boolean boolean49 = board47.equals(obj48);
        ar.edu.unrc.game2048.Board board50 = new ar.edu.unrc.game2048.Board(board47);
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board(board47);
        ar.edu.unrc.game2048.Cell[][] cellArray52 = board47.getGrid();
        ar.edu.unrc.game2048.Cell cell55 = board47.getCell((int) (byte) 1, 0);
        board39.setCell((int) (byte) 0, (int) (short) 1, cell55);
        board19.setCell((int) (short) 0, (int) (short) 0, cell55);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) '#', 10, cell55);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
// flaky "7) test522(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertNotNull(cellArray14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cellArray35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cellArray44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cellArray52);
        org.junit.Assert.assertNotNull(cell55);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = board9.getCell((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, -1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
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
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell20 = board11.getCell(0, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, (int) '4');
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board3.getGrid();
        boolean boolean5 = board3.isWinningBoard();
        boolean boolean6 = board3.isFull();
        board3.setScore(2048);
        board3.setScore((int) '#');
        boolean boolean11 = position2.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board13.setScore((int) (short) 100);
        boolean boolean16 = board13.hasEmptyCells();
        int int17 = board13.getScore();
        boolean boolean18 = position2.equals((java.lang.Object) int17);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
        boolean boolean16 = board14.hasEmptyCells();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        java.lang.Class<?> wildcardClass7 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = board0.getGrid();
        ar.edu.unrc.game2048.Cell cell8 = board0.getCell((int) (byte) 1, 0);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean10 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        int int5 = position2.col;
        int int6 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 0)" + "'", str3, "(1, 0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        java.lang.String str4 = board1.toString();
        ar.edu.unrc.game2048.movement.Direction direction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = board1.move(direction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 100\n+-----+\n|    2|\n+-----+\n" + "'", str4, "Score: 100\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        boolean boolean9 = board1.isLosingBoard();
        int int10 = board1.getScore();
        ar.edu.unrc.game2048.Cell[][] cellArray11 = board1.getGrid();
        int int12 = board1.getSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(cellArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (byte) 100);
        int int3 = position2.col;
        int int4 = position2.row;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj6 = null;
        boolean boolean7 = board5.equals(obj6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board5);
        java.lang.String str9 = board5.toString();
        board5.setScore(0);
        boolean boolean12 = board5.isLosingBoard();
        boolean boolean13 = position2.equals((java.lang.Object) boolean12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "8) test532(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board0.repOk();
        boolean boolean7 = board0.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        boolean boolean4 = board0.equals((java.lang.Object) 0);
        int int5 = board0.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board0.getCell(32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "9) test535(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(35);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = board1.getGrid();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        int int3 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board3.equals((java.lang.Object) '#');
        boolean boolean6 = board3.isWinningBoard();
        int int7 = board3.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, (int) '4');
        int int3 = position2.col;
        int int4 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "10) test540(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getSize();
        board0.setScore(35);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
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
        board0.setGrid(cellArray21);
        int int24 = board0.getSize();
        java.lang.String str25 = board0.toString();
        boolean boolean26 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
// flaky "11) test541(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Score: 35\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str25, "Score: 35\n+-----+-----+-----+-----+\n|     |     |    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(100);
        board1.setScore(10);
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 1);
        java.lang.String str7 = position6.toString();
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        boolean boolean10 = board1.equals((java.lang.Object) int9);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board1.getEmptyPositions();
        boolean boolean12 = board1.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = board1.getCell((int) (byte) 1, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 2048) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(35, 1)" + "'", str7, "(35, 1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(35, 1)" + "'", str8, "(35, 1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray4 = board0.getGrid();
        boolean boolean5 = board0.repOk();
        ar.edu.unrc.game2048.Cell[][] cellArray6 = board0.getGrid();
        board0.setScore((int) '4');
        board0.setScore((int) (short) 0);
        boolean boolean11 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cellArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(2048);
        int int2 = board1.getSize();
        boolean boolean3 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2048 + "'", int2 == 2048);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        int int4 = board0.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj7 = null;
        boolean boolean8 = board6.equals(obj7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        ar.edu.unrc.game2048.Cell[][] cellArray10 = board6.getGrid();
        board0.setGrid(cellArray10);
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "3) test546(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cellArray10);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getSize();
        int int8 = board1.getSize();
        board1.setScore((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getScore();
        boolean boolean6 = board1.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        int int8 = board7.getScore();
        board7.setScore((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        boolean boolean9 = board1.isLosingBoard();
        int int10 = board1.getScore();
        ar.edu.unrc.game2048.Cell[][] cellArray11 = board1.getGrid();
        ar.edu.unrc.game2048.Board.Position position14 = new ar.edu.unrc.game2048.Board.Position(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100);
        boolean boolean17 = position14.equals((java.lang.Object) board16);
        java.lang.String str18 = position14.toString();
        boolean boolean19 = board1.equals((java.lang.Object) str18);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(cellArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(0, 0)" + "'", str18, "(0, 0)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        boolean boolean5 = board1.isFull();
        boolean boolean6 = board1.isLosingBoard();
        boolean boolean8 = board1.equals((java.lang.Object) (byte) 100);
        int int9 = board1.getSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 32);
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
        boolean boolean25 = position2.equals((java.lang.Object) board3);
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
// flaky "12) test551(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n");
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
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getScore();
        boolean boolean6 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        int int4 = board0.getSize();
        ar.edu.unrc.game2048.Cell[][] cellArray5 = board0.getGrid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(cellArray5);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getSize();
        ar.edu.unrc.game2048.Cell cell10 = board1.getCell((int) (byte) 0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board1);
        board1.setScore(1);
        ar.edu.unrc.game2048.Cell[][] cellArray14 = board1.getGrid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cellArray14);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
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
        boolean boolean11 = board0.isWinningBoard();
        boolean boolean12 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getSize();
        ar.edu.unrc.game2048.movement.Direction direction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = board1.move(direction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        boolean boolean6 = board1.hasEmptyCells();
        boolean boolean7 = board1.isWinningBoard();
        java.lang.Class<?> wildcardClass8 = board1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj4 = null;
        boolean boolean5 = board3.equals(obj4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = position2.equals((java.lang.Object) board3);
        boolean boolean9 = board3.isFull();
        board3.setScore(10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isLosingBoard();
        int int7 = board0.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean9 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
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
        boolean boolean10 = board9.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board9.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet11);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = board1.getGrid();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 100);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board7.setScore((int) (short) 100);
        boolean boolean10 = board7.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray11 = board7.getGrid();
        boolean boolean12 = position5.equals((java.lang.Object) cellArray11);
        board1.setGrid(cellArray11);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        java.lang.String str16 = board14.toString();
        int int17 = board14.getSize();
        boolean boolean18 = board14.isLosingBoard();
        java.lang.String str19 = board14.toString();
        boolean boolean20 = board14.isWinningBoard();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj22 = null;
        boolean boolean23 = board21.equals(obj22);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean25 = board21.isFull();
        boolean boolean26 = board21.isLosingBoard();
        int int27 = board21.getSize();
        int int28 = board21.getSize();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean30 = board21.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray31 = board21.getGrid();
        board14.setGrid(cellArray31);
        // The following exception was thrown during execution in test generation
        try {
            board1.setGrid(cellArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cellArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet15);
// flaky "13) test561(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "4) test561(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str19, "Score: 0\n+-----+-----+-----+-----+\n|     |     |    4|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cellArray31);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
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
        java.lang.Class<?> wildcardClass16 = position2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        boolean boolean8 = board0.isFull();
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) '4', 2048);
        int int12 = position11.col;
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj14 = null;
        boolean boolean15 = board13.equals(obj14);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean17 = board13.isFull();
        boolean boolean18 = board13.isLosingBoard();
        int int19 = board13.getSize();
        board13.setScore((int) (byte) 0);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj23 = null;
        boolean boolean24 = board22.equals(obj23);
        boolean boolean25 = board22.isLosingBoard();
        boolean boolean27 = board22.equals((java.lang.Object) (byte) -1);
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj29 = null;
        boolean boolean30 = board28.equals(obj29);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean32 = board28.isFull();
        boolean boolean33 = board28.isLosingBoard();
        int int34 = board28.getSize();
        int int35 = board28.getSize();
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean37 = board28.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray38 = board28.getGrid();
        board22.setGrid(cellArray38);
        board13.setGrid(cellArray38);
        boolean boolean41 = position11.equals((java.lang.Object) board13);
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board43.setScore((int) (short) 100);
        boolean boolean46 = board43.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet47 = board43.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet48 = board43.getEmptyPositions();
        boolean boolean49 = board43.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray50 = board43.getGrid();
        boolean boolean51 = board13.equals((java.lang.Object) cellArray50);
        // The following exception was thrown during execution in test generation
        try {
            board0.setGrid(cellArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2048 + "'", int12 == 2048);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cellArray38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(positionSet47);
        org.junit.Assert.assertNotNull(positionSet48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cellArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.isFull();
        boolean boolean5 = board0.isLosingBoard();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        boolean boolean8 = board0.isFull();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj10 = null;
        boolean boolean11 = board9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean13 = board9.isFull();
        boolean boolean14 = board9.isLosingBoard();
        int int15 = board9.getSize();
        int int16 = board9.getSize();
        boolean boolean17 = board9.isLosingBoard();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray19 = board18.getGrid();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board18);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        boolean boolean22 = board21.isFull();
        int int23 = board21.getSize();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray25 = board24.getGrid();
        board21.setGrid(cellArray25);
        boolean boolean27 = board20.equals((java.lang.Object) cellArray25);
        board9.setGrid(cellArray25);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board9.getEmptyPositions();
        ar.edu.unrc.game2048.Cell[][] cellArray30 = board9.getGrid();
        board0.setGrid(cellArray30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cellArray19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(cellArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(positionSet29);
        org.junit.Assert.assertNotNull(cellArray30);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        int int4 = board1.getSize();
        int int5 = board1.getSize();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        int int2 = board1.getSize();
        board1.setScore((int) (short) 1);
        boolean boolean5 = board1.isFull();
        int int6 = board1.getScore();
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
            board1.setCell(0, (int) 'a', cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 97) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(cell18);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
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
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (byte) 0);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Cell[][] cellArray1 = board0.getGrid();
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        board0.setScore(2048);
        board0.setScore((int) '#');
        java.lang.String str8 = board0.toString();
        org.junit.Assert.assertNotNull(cellArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "14) test569(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 35\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 35\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        boolean boolean3 = board0.isLosingBoard();
        board0.setScore((int) '#');
        boolean boolean6 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj9 = null;
        boolean boolean10 = board8.equals(obj9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean12 = board8.isFull();
        boolean boolean13 = board8.isLosingBoard();
        int int14 = board8.getSize();
        int int15 = board8.getSize();
        boolean boolean16 = board8.isFull();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj18 = null;
        boolean boolean19 = board17.equals(obj18);
        boolean boolean20 = board17.isLosingBoard();
        board17.setScore((int) '#');
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board17);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean25 = board24.hasEmptyCells();
        boolean boolean26 = board24.isLosingBoard();
        ar.edu.unrc.game2048.Cell[][] cellArray27 = board24.getGrid();
        board8.setGrid(cellArray27);
        boolean boolean29 = board0.equals((java.lang.Object) board8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cellArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (byte) 100);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 0);
        java.lang.String str6 = position5.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        board7.setScore((int) '4');
        boolean boolean11 = position5.equals((java.lang.Object) '4');
        java.lang.String str12 = position5.toString();
        boolean boolean13 = position2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board15.setScore((int) (short) 100);
        boolean boolean18 = board15.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board15.getEmptyPositions();
        boolean boolean20 = board15.hasEmptyCells();
        int int21 = board15.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet22 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board15);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean25 = position5.equals((java.lang.Object) board23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, 0)" + "'", str6, "(1, 0)");
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(1, 0)" + "'", str12, "(1, 0)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(positionSet22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.Cell[][] cellArray2 = board1.getGrid();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board3.isFull();
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
        // The following exception was thrown during execution in test generation
        try {
            board3.setGrid(cellArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Grids should be of the same size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cellArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
// flaky "15) test572(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n" + "'", str12, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cellArray14);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell[][] cellArray5 = board0.getGrid();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj9 = null;
        boolean boolean10 = board8.equals(obj9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell[][] cellArray13 = board8.getGrid();
        ar.edu.unrc.game2048.Cell cell16 = board8.getCell((int) (byte) 1, 0);
        board0.setCell((int) (byte) 0, (int) (short) 1, cell16);
        board0.setScore(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cellArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cellArray13);
        org.junit.Assert.assertNotNull(cell16);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
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
        boolean boolean11 = board0.isWinningBoard();
        int int12 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(32, (int) (short) 10);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board1);
        board1.setScore(35);
        boolean boolean10 = board1.isLosingBoard();
        int int11 = board1.getSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet1 = board0.getEmptyPositions();
        java.lang.String str2 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.hasEmptyCells();
        boolean boolean6 = board4.isWinningBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board10.setScore((int) (short) 100);
        boolean boolean13 = board10.hasEmptyCells();
        ar.edu.unrc.game2048.Cell[][] cellArray14 = board10.getGrid();
        boolean boolean15 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell18 = board10.getCell(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            board4.setCell(4, 52, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet1);
// flaky "16) test577(randoopTests.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    4|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cellArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cell18);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        board1.setScore((int) (short) 100);
        boolean boolean4 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board1.getEmptyPositions();
        boolean boolean6 = board1.hasEmptyCells();
        int int7 = board1.getScore();
        int int8 = board1.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(35);
        ar.edu.unrc.game2048.Cell[][] cellArray14 = board13.getGrid();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell(1, 1);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (short) 1, 0, cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 0) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(cellArray14);
        org.junit.Assert.assertNotNull(cell17);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Object obj1 = null;
        boolean boolean2 = board0.equals(obj1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        int int5 = board0.getSize();
        board0.setScore(1);
        int int8 = board0.getScore();
        board0.setScore(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }
}
