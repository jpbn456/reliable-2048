package ar.edu.unrc.game2048;

import java.util.Random;

public class DeterministicBoard extends Board{

    private static final long SEED = 209L;

    public DeterministicBoard() {
        super(DEFAULT_SIZE,new Random(SEED));
    }

    public DeterministicBoard(int size) {
        super(size,new Random(SEED));
    }
}
