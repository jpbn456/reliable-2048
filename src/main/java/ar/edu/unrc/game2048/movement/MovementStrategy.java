package ar.edu.unrc.game2048.movement;

import ar.edu.unrc.game2048.Board;
import ar.edu.unrc.game2048.Cell;

import java.util.ArrayList;
import java.util.List;

public abstract class MovementStrategy {

    protected final Board previous;
    protected final int size;
    protected int score;
    protected Cell[][] grid;

    public MovementStrategy(Board board) {
        this.previous = new Board(board);
        this.size = previous.getSize();
        this.score = previous.getScore();
        this.grid = previous.getGrid();
    }

    public abstract boolean move(Board board);

    protected List<Cell> removeEmptyCells(List<Cell> column) {
        return column.stream().filter(cell -> !cell.isEmpty()).toList();
    }

    protected List<Cell> mergedCells(List<Cell> merged) {
        while (merged.size() < size) {
            merged.add(Cell.EMPTY);
        }
        return merged;
    }

    protected List<Cell> createMerged(List<Cell> nonEmpty) {
        List<Cell> merged = new ArrayList<>();
        int i = 0;
        while (i < nonEmpty.size()) {
            if (i + 1 < nonEmpty.size() &&
                    nonEmpty.get(i).canMergeWith(nonEmpty.get(i + 1))) {
                Cell mergedCell = nonEmpty.get(i).mergeWith(nonEmpty.get(i + 1));
                merged.add(mergedCell);
                score += mergedCell.getValue();
                i += 2;
            } else {
                merged.add(nonEmpty.get(i));
                i++;
            }
        }
        return merged;
    }

    protected boolean setGridAndScore(Board board) {
        board.setGrid(grid);
        board.setScore(score);
        return !board.equals(previous);
    }
}
