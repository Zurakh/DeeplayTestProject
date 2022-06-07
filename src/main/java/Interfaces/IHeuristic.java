package Interfaces;

import Classes.Step;

/* Интерфейс, который поисывает классы-эвристики, нужные для A* */
public interface IHeuristic {
    public double solve(int sx, int sy, int tx, int ty);
    public double solve(Step start, Step target);
}
