package ar.edu.unrc.game2048.movement;

import ar.edu.unrc.game2048.Board;
import ar.edu.unrc.game2048.Cell;

import java.util.ArrayList;
import java.util.List;

public class LeftMovement extends MovementStrategy {
    public LeftMovement(Board board) {
        super(board);
    }

    @Override
    public boolean move(Board board) {
        // For each column, slide up
        for (int row = 0; row < size; row++) {
            // Create a list of cells from left to right
            List<Cell> rowList = new ArrayList<>();
            for (int col = 0; col < size; col++) {
                rowList.add(grid[row][col]);
            }

            // Remove empty cells (slide up)
            List<Cell> nonEmpty = removeEmptyCells(rowList);

            // Merge adjacent equal cells
            List<Cell> merged = createMerged(nonEmpty);

            // Pad with empty cells
            merged = mergedCells(merged);

            // Put back into the row
            for (int col = 0; col < size; col++) {
                grid[row][col] = merged.get(col);
            }
        }
        return setGridAndScore(board);
    }
}
