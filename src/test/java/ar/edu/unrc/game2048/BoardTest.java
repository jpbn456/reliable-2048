package ar.edu.unrc.game2048;

import ar.edu.unrc.game2048.movement.Direction;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


public class BoardTest {

    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int TWO = 2;

    private static void fillBoard(Board board,Optional<Integer> cellValue) {
        int size = board.getSize();
        if (cellValue.isEmpty()) {
            Cell cell = new Cell(1);
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    board.setCell(i, j, cell);
                    cell = new Cell(cell.getValue() * 2);
                }
            }
        } else {
            int value = cellValue.get();
            Cell cell;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    cell = new Cell(value);
                    board.setCell(i, j, cell);
                }
            }
        }
    }

    private static void fillBoardWithJumps(Board board, Optional<Integer> cellValue) {
        int size = board.getSize();
        if (cellValue.isEmpty()) {
            Cell cell = new Cell(1);
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    board.setCell(i, j, cell);
                    cell = new Cell(cell.getValue() * 2);
                    j++;
                }
            }
        } else {
            int value = cellValue.get();
            Cell cell;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    cell = new Cell(value);
                    board.setCell(i, j, cell);
                    j++;
                }
            }
        }
    }

    @Test
    void initZeroBoardTest() {
        assertThrows(IllegalArgumentException.class, () -> new Board(ZERO));
    }

    @Test
    void initSizeBoardTest() {
        Board board = new Board(ONE);
        boolean noEmptyCells = board.isFull();
        assertTrue(noEmptyCells);
    }

    @Test
    void initSizeFourBoardTest() {
        Board board = new Board();
        boolean hasEmptyCells = board.hasEmptyCells();
        boolean isNotFull = !board.isFull();
        boolean isFourSized = board.getSize() == FOUR;
        boolean zeroScore = board.getScore() == ZERO;
        boolean isNotLosingBoard = !board.isLosingBoard();
        assertTrue(isFourSized);
        assertTrue(hasEmptyCells);
        assertTrue(zeroScore);
        assertTrue(isNotFull);
        assertTrue(isNotLosingBoard);
    }

    @Test
    void initCopyBoardTest() {
        Board board = new Board();
        Board copyBoard = new Board(board);
        boolean hasEmptyCells = copyBoard.hasEmptyCells();
        boolean isFourSized = copyBoard.getSize() == FOUR;
        boolean zeroScore = copyBoard.getScore() == ZERO;
        boolean sameBoard = board.equals(copyBoard);
        boolean isNotWinningBoard = board.isWinningBoard();
        assertTrue(isFourSized);
        assertTrue(hasEmptyCells);
        assertTrue(zeroScore);
        assertTrue(sameBoard);
        assertFalse(isNotWinningBoard);
    }

    @Test
    void setCellPosTest() {
        Board board = new Board();
        Cell cell = new Cell(FOUR);
        int row = 3;
        int col = 3;
        board.setCell(row, col, cell);
        Cell boardCell = board.getCell(row, col);
        int boardCellValue = boardCell.getValue();
        assertEquals(cell, boardCell);
        assertEquals(FOUR, boardCellValue);
    }

    @Test
    void setCellAtInvalidPosTest() {
        Board board = new Board();
        Cell cell = new Cell(FOUR);
        int row = 4;
        int col = 5;
        assertThrows(IndexOutOfBoundsException.class, () -> board.setCell(row, col, cell));
    }

    @Test
    void setCellAtInvalidPosTest2() {
        Board board = new Board();
        Cell cell = new Cell(FOUR);
        int row = -1;
        int col = 5;
        assertThrows(IndexOutOfBoundsException.class, () -> board.setCell(row, col, cell));
    }

    @Test
    void setCellAtInvalidPosTest3() {
        Board board = new Board();
        Cell cell = new Cell(FOUR);
        int row = -1;
        int col = -5;
        assertThrows(IndexOutOfBoundsException.class, () -> board.setCell(row, col, cell));
    }

    @Test
    void setCellAtInvalidPosTest4() {
        Board board = new Board();
        Cell cell = new Cell(FOUR);
        int row = 1;
        int col = -5;
        assertThrows(IndexOutOfBoundsException.class, () -> board.setCell(row, col, cell));
    }

    @Test
    void setCellAtInvalidPosTest5() {
        Board board = new Board();
        Cell cell = new Cell(FOUR);
        int row = -1;
        int col = 2;
        assertThrows(IndexOutOfBoundsException.class, () -> board.setCell(row, col, cell));
    }

    @Test
    void setNullCellTest() {
        Board board = new Board();
        Cell cell = null;
        int row = 3;
        int col = 3;
        assertThrows(IllegalArgumentException.class, () -> board.setCell(row, col, cell));
    }

    @Test
    void setWiningBoardTest() {
        Board board = new Board();
        Cell cell = new Cell(2048);
        int row = 3;
        int col = 3;
        board.setCell(row, col, cell);
        boolean winningBoard = board.isWinningBoard();
        assertTrue(winningBoard);
    }

    @Test
    void setLosingBoardTest() {
        Board board = new Board(THREE);
        fillBoard(board, Optional.empty());
        boolean isLosingBoard = board.isLosingBoard();
        assertTrue(isLosingBoard);
    }

    @Test
    void setRightNotLosingBoardTest() {
        Board board = new Board();
        fillBoard(board,Optional.empty());
        Cell cell = new Cell(1);
        board.setCell(0, 1, cell);
        boolean isNotLosingBoard = board.isLosingBoard();
        assertFalse(isNotLosingBoard);
    }

    @Test
    void setDownNotLosingBoardTest() {
        Board board = new Board();
        fillBoard(board,Optional.empty());
        Cell cell = new Cell(1);
        board.setCell(1, 0, cell);
        boolean isNotLosingBoard = board.isLosingBoard();
        assertFalse(isNotLosingBoard);
    }

    @Test
    void moveUpTest() {
        Board board = new Board();
        Optional<Integer> value = Optional.of(ONE);
        fillBoard(board, value);
        int previousScore = board.getScore();
        int previousEmptyPos = board.getEmptyPositions().size();
        board.move(Direction.UP);
        int actualEmptyPos = board.getEmptyPositions().size();
        boolean hasEmptyCells = board.hasEmptyCells();
        boolean notLosingBoard = !board.isLosingBoard();
        boolean scoreHasGrown = board.getScore() > previousScore;
        boolean correctAmtPos = previousEmptyPos == 0
                && actualEmptyPos == (((board.getSize() * board.getSize()) / 2) - 1);
        assertTrue(hasEmptyCells);
        assertTrue(notLosingBoard);
        assertTrue(scoreHasGrown);
        assertTrue(correctAmtPos);
    }

    @Test
    void moveUpNotFullBoardTest() {
        Board board = new Board();
        fillBoardWithJumps(board, Optional.of(ONE));
        int previousScore = board.getScore();
        int previousEmptyPos = board.getEmptyPositions().size();
        board.move(Direction.UP);
        int actualEmptyPos = board.getEmptyPositions().size();
        boolean hasEmptyCells = board.hasEmptyCells();
        boolean notLosingBoard = !board.isLosingBoard();
        boolean scoreHasGrown = board.getScore() > previousScore;
        boolean correctAmntPos = previousEmptyPos < actualEmptyPos;
        assertTrue(hasEmptyCells);
        assertTrue(notLosingBoard);
        assertTrue(scoreHasGrown);
        assertTrue(correctAmntPos);
    }

    @Test
    void moveDownTest() {
        Board board = new Board();
        Optional<Integer> value = Optional.of(ONE);
        fillBoard(board, value);
        int previousScore = board.getScore();
        int previousEmptyPos = board.getEmptyPositions().size();
        board.move(Direction.DOWN);
        int actualEmptyPos = board.getEmptyPositions().size();
        boolean hasEmptyCells = board.hasEmptyCells();
        boolean notLosingBoard = !board.isLosingBoard();
        boolean scoreHasGrown = board.getScore() > previousScore;
        boolean correctAmtPos = previousEmptyPos == 0
                && actualEmptyPos == (((board.getSize() * board.getSize()) / 2) - 1);
        assertTrue(hasEmptyCells);
        assertTrue(notLosingBoard);
        assertTrue(scoreHasGrown);
        assertTrue(correctAmtPos);
    }

    @Test
    void moveDownWithJumpsTest() {
        Board board = new Board();
        fillBoardWithJumps(board, Optional.of(ONE));
        int previousScore = board.getScore();
        int previousEmptyPos = board.getEmptyPositions().size();
        board.move(Direction.DOWN);
        int actualEmptyPos = board.getEmptyPositions().size();
        boolean hasEmptyCells = board.hasEmptyCells();
        boolean notLosingBoard = !board.isLosingBoard();
        boolean scoreHasGrown = board.getScore() > previousScore;
        boolean correctAmntPos = previousEmptyPos < actualEmptyPos;
        assertTrue(hasEmptyCells);
        assertTrue(notLosingBoard);
        assertTrue(scoreHasGrown);
        assertTrue(correctAmntPos);
    }

    @Test
    void moveLeftTest() {
        Board board = new Board();
        Optional<Integer> value = Optional.of(ONE);
        fillBoard(board, value);
        int previousScore = board.getScore();
        int previousEmptyPos = board.getEmptyPositions().size();
        board.move(Direction.LEFT);
        int actualEmptyPos = board.getEmptyPositions().size();
        boolean hasEmptyCells = board.hasEmptyCells();
        boolean notLosingBoard = !board.isLosingBoard();
        boolean scoreHasGrown = board.getScore() > previousScore;
        boolean correctAmtPos = previousEmptyPos == 0
                && actualEmptyPos == (((board.getSize() * board.getSize()) / 2) - 1);
        assertTrue(hasEmptyCells);
        assertTrue(notLosingBoard);
        assertTrue(scoreHasGrown);
        assertTrue(correctAmtPos);
    }

    @Test
    void moveLeftWithJumpsTest() {
        Board board = new Board();
        fillBoardWithJumps(board, Optional.of(TWO));
        int previousScore = board.getScore();
        int previousEmptyPos = board.getEmptyPositions().size();
        board.move(Direction.LEFT);
        int actualEmptyPos = board.getEmptyPositions().size();
        boolean hasEmptyCells = board.hasEmptyCells();
        boolean notLosingBoard = !board.isLosingBoard();
        boolean scoreHasGrown = board.getScore() > previousScore;
        boolean correctAmntPos = previousEmptyPos < actualEmptyPos;
        assertTrue(hasEmptyCells);
        assertTrue(notLosingBoard);
        assertTrue(scoreHasGrown);
        assertTrue(correctAmntPos);
    }

    @Test
    void moveRightTest() {
        Board board = new Board();
        Optional<Integer> value = Optional.of(ONE);
        fillBoard(board, value);
        int previousScore = board.getScore();
        int previousEmptyPos = board.getEmptyPositions().size();
        board.move(Direction.RIGHT);
        int actualEmptyPos = board.getEmptyPositions().size();
        boolean hasEmptyCells = board.hasEmptyCells();
        boolean notLosingBoard = !board.isLosingBoard();
        boolean scoreHasGrown = board.getScore() > previousScore;
        boolean correctAmtPos = previousEmptyPos == 0
                && actualEmptyPos == (((board.getSize() * board.getSize()) / 2) - 1);
        assertTrue(hasEmptyCells);
        assertTrue(notLosingBoard);
        assertTrue(scoreHasGrown);
        assertTrue(correctAmtPos);
    }

    @Test
    void moveRightWithJumpsTest() {
        Board board = new Board();
        fillBoardWithJumps(board, Optional.of(FOUR));
        int previousScore = board.getScore();
        int previousEmptyPos = board.getEmptyPositions().size();
        board.move(Direction.RIGHT);
        int actualEmptyPos = board.getEmptyPositions().size();
        boolean hasEmptyCells = board.hasEmptyCells();
        boolean notLosingBoard = !board.isLosingBoard();
        boolean scoreHasGrown = board.getScore() > previousScore;
        boolean correctAmntPos = previousEmptyPos < actualEmptyPos;
        assertTrue(hasEmptyCells);
        assertTrue(notLosingBoard);
        assertTrue(scoreHasGrown);
        assertTrue(correctAmntPos);
    }

    @Test
    void boardEqualsSelfTest() {
        Board board = new Board(THREE);
        boolean isEqual = board.equals(board);
        assertTrue(isEqual);
    }

    @Test
    void boardEqualsTest() {
        Board board1 = new Board(THREE);
        Board board2 = new Board(THREE);
        Optional<Integer> value = Optional.of(1);
        fillBoard(board1, value);
        fillBoard(board2, value);
        boolean isEqual = board1.equals(board2);
        assertTrue(isEqual);
    }

    @Test
    void boardNotEqualsTest() {
        Board board1 = new Board(THREE);
        Board board2 = new Board(THREE);
        Optional<Integer> value = Optional.of(1);
        fillBoard(board1, value);
        value = Optional.of(2);
        fillBoard(board2, value);
        boolean isNotEqual = !board1.equals(board2);
        assertTrue(isNotEqual);
    }

    @Test
    void boardNotEqualSizeTest() {
        Board board1 = new Board(THREE);
        Board board2 = new Board(TWO);
        boolean isNotEqual = !board1.equals(board2);
        assertTrue(isNotEqual);
    }

    @Test
    void boardNullEqualsTest() {
        Board board = new Board(THREE);
        boolean isNotEqual = !board.equals(null);
        assertTrue(isNotEqual);
    }

    @Test
    void boardClassNotEqualsTest() {
        Board board = new Board(THREE);
        boolean isNotEqual = !board.equals(THREE);
        assertTrue(isNotEqual);
    }

    @Test
    void toStringBoardTest() {
        Board board = new Board(TWO);
        Optional<Integer> value = Optional.of(1);
        fillBoard(board, value);
        StringBuilder resultString =
                new StringBuilder("Score: 0")
                        .append("\n")
                        .append("+-----+-----+")
                        .append("\n")
                        .append("|")
                        .append("    1")
                        .append("|")
                        .append("    1")
                        .append("|")
                        .append("\n")
                        .append("+-----+-----+")
                        .append("\n")
                        .append("|")
                        .append("    1")
                        .append("|")
                        .append("    1")
                        .append("|")
                        .append("\n")
                        .append("+-----+-----+")
                        .append("\n");
        String valueExpected = resultString.toString();
        String valueActual = board.toString();
        assertEquals(valueExpected, valueActual);
    }

    @Test
    void positionEqualSelfTest() {
        Board.Position position = new Board.Position(ONE, ONE);
        boolean isEqual = position.equals(position);
        assertTrue(isEqual);
    }

    @Test
    void positionEqualsTest() {
        Board.Position position1 = new Board.Position(ONE, ONE);
        Board.Position position2 = new Board.Position(ONE, ONE);
        boolean isEqual = position1.equals(position2);
        assertTrue(isEqual);
    }

    @Test
    void positionNotEqualsTest1() {
        Board.Position position1 = new Board.Position(ONE, ONE);
        Board.Position position2 = new Board.Position(ONE, TWO);
        boolean isNotEqual = !position1.equals(position2);
        assertTrue(isNotEqual);
    }

    @Test
    void positionNotEqualsTest2() {
        Board.Position position1 = new Board.Position(ONE, ONE);
        Board.Position position2 = new Board.Position(TWO, ONE);
        boolean isNotEqual = !position1.equals(position2);
        assertTrue(isNotEqual);
    }

    @Test
    void positionNullNotEqualsTest() {
        Board.Position position = new Board.Position(ONE, ONE);
        boolean isNotEqual = !position.equals(null);
        assertTrue(isNotEqual);
    }

    @Test
    void positionClassNotEqualsTest() {
        Board.Position position = new Board.Position(ONE, ONE);
        boolean isNotEqual = !position.equals(THREE);
        assertTrue(isNotEqual);
    }

    @Test
    void positionToStringTest() {
        Board.Position position = new Board.Position(ONE, FOUR);
        StringBuilder resultString =
                new StringBuilder("(")
                        .append(ONE)
                        .append(", ")
                        .append(FOUR)
                        .append(")");
        String valueExpected = resultString.toString();
        String valueActual = position.toString();
        assertEquals(valueExpected, valueActual);
    }

    @Test
    void setGridOutSizedTest(){
        Board board = new Board();
        int size = TWO;
        Cell[][] grid =  new Cell[size][size];
        assertThrows(IllegalArgumentException.class, ()-> board.setGrid(grid));
    }

    @Test
    void moveUpAndMakeNoMove(){
        Board board = new Board();
        fillBoard(board, Optional.empty());
        boolean move = board.move(Direction.UP);
        assertFalse(move);
    }

    @Test
    void notCreateRandomTileTest(){
        Board board = new Board();
        fillBoard(board, Optional.of(ONE));
        boolean move = board.move(Direction.UP);
        boolean maxValueTwoOrFour = false;
        int cellValue = 0;
        for (int i = 0; i < board.getSize() ; i++) {
            for (int j = 0; j < board.getSize() ; j++) {
                cellValue = board.getCell(i,j).getValue();
                if(cellValue == 2 || cellValue == 4) {
                    maxValueTwoOrFour = true;
                }
            }
        }
        assertTrue(move);
        assertTrue(maxValueTwoOrFour);
    }

    @Test
    void setCellThrowsColumnIsBoardSize() {
        Board board = new Board();
        Cell cell = new Cell(FOUR);
        int validRow = ONE;
        int invalidColumn = board.getSize();
        assertThrows(IndexOutOfBoundsException.class, () -> board.setCell(validRow, invalidColumn, cell)
        );
    }

    @Test
    void getCellThrowsExactExceptionForInvalidPosition() {
        Board board = new Board();
        assertThrowsExactly(IndexOutOfBoundsException.class, () -> board.getCell(-1, 0));
    }

    @Test
    void setCellThrowsExactExceptionForInvalidPosition() {
        Board board = new Board();
        assertThrowsExactly(IndexOutOfBoundsException.class,
                () -> board.setCell(-1, 0, new Cell(FOUR)));
    }

    @Test
    void setCellThrowsWhenRowEqualsBoardSize() {
        Board board = new Board();
        assertThrowsExactly(IndexOutOfBoundsException.class,
                () -> board.setCell(board.getSize(), 0, new Cell(FOUR)));
    }

    @Test
    void setCellThrowsWhenColumnEqualsBoardSize() {
        Board board = new Board();
        assertThrowsExactly(IndexOutOfBoundsException.class,
                () -> board.setCell(0, board.getSize(), new Cell(FOUR)));
    }

    @Test
    void boardIsNotLosingWhenLastTwoColumnsCanMerge() {
        Board board = new Board(TWO);
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(4));
        board.setCell(1, 0, new Cell(8));
        board.setCell(1, 1, new Cell(8));
        assertFalse(board.isLosingBoard());
    }
}
