package ar.edu.unrc.game2048.movement;

import ar.edu.unrc.game2048.Board;

import java.util.EnumMap;
import java.util.Map;

public class MovementSolver {
    private final Map<Direction, MovementStrategy> strategies;

    public MovementSolver(Board board) {
        strategies = new EnumMap<>(Direction.class);
        strategies.put(Direction.UP, new UpMovement(board));
        strategies.put(Direction.DOWN, new DownMovement(board));
        strategies.put(Direction.LEFT, new LeftMovement(board));
        strategies.put(Direction.RIGHT, new RightMovement(board));
    }


    public MovementStrategy resolve(Direction direction) {
        MovementStrategy strategy = strategies.get(direction);

        if (strategy == null) {
            throw new IllegalArgumentException(
                    "Unsupported direction: " + direction
            );
        }

        return strategy;
    }
}