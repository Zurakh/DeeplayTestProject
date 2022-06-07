package Heuristics;

import Classes.Step;
import Interfaces.IHeuristic;

public class EmptyHeu implements IHeuristic {
    @Override
    public double solve(int sx, int sy, int tx, int ty) {
        return 0;
    }

    @Override
    public double solve(Step start, Step target) {
        return 0;
    }
}
