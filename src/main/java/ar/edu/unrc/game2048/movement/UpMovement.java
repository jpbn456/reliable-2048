package ar.edu.unrc.game2048.movement;

import ar.edu.unrc.game2048.Board;
import ar.edu.unrc.game2048.Cell;

import java.util.ArrayList;
import java.util.List;

public class UpMovement extends MovementStrategy {
    public UpMovement(Board board) {
        super(board);
    }

    @Override
    public boolean move(Board board) {
        // For each column, slide up
        for (int col = 0; col < size; col++) {
            List<Cell> column = new ArrayList<>();
            for (int row = 0; row < size; row++) {
                column.add(grid[row][col]);
            }

            // Remove empty cells (slide up)
            List<Cell> nonEmpty = removeEmptyCells(column);

            // Merge adjacent equal cells
            List<Cell> merged = createMerged(nonEmpty);

            // Pad with empty cells
            merged = mergedCells(merged);

            // Put back into the column
            for (int row = 0; row < size; row++) {
                grid[row][col] = merged.get(row);
            }
        }
        return setGridAndScore(board);
    }
}
