package ar.edu.unrc.game2048.movement;

import ar.edu.unrc.game2048.Board;
import ar.edu.unrc.game2048.Cell;

import java.util.ArrayList;
import java.util.List;

public class DownMovement extends MovementStrategy {
    public DownMovement(Board board) {
        super(board);
    }

    @Override
    public boolean move(Board board) {
        // For each column, slide up
        for (int col = 0; col < size; col++) {
            // Create a list of cells from bottom to top (reverse order)
            List<Cell> column = new ArrayList<>();
            for (int row = size - 1; row > 0; row--) {
                column.add(grid[row][col]);
            }
            // Remove empty cells
            List<Cell> nonEmpty = removeEmptyCells(column);

            // Merge adjacent equal cells
            List<Cell> merged = createMerged(nonEmpty);

            // Pad with empty cells
            merged = mergedCells(merged);

            // Put back into the column (reverse back to original order)
            for (int row = size - 1; row >= 0; row--) {
                grid[row][col] = merged.get(size - 1 - row);
            }
        }
        return setGridAndScore(board);
    }

}
