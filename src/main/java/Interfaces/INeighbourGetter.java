package Interfaces;

import Classes.Step;

import java.util.ArrayList;
import java.util.List;

/* Искать соседей у клетки можно различными методами.
 В шахматах, например, разные фигуры рассматривают соседние клетки по-разному.
 В данном задании можно было бы написать класс, который бы искал ещё и диагональные
 клетки*/

public interface INeighbourGetter {
    public List<Step> getNeighbors(IGrid grid, int x, int y);
    public List<Step> getNeighbors(IGrid grid, Step step);
}
