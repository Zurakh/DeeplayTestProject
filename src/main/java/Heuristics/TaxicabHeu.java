package Heuristics;

import Classes.Step;
import Interfaces.IHeuristic;
import org.example.Main;

public class TaxicabHeu implements IHeuristic {
    @Override
    public double solve(int sx, int sy, int tx, int ty) {
        return Math.abs(sx-tx) + Math.abs(sy-ty);
    }

    @Override
    public double solve(Step start, Step target) {
        return solve(start.getX(), start.getY(),
                target.getX(), target.getY());
    }
}
