package Interfaces;

import Classes.Step;

import java.util.ArrayList;
import java.util.List;

public interface INeighbourGetter {
    public List<Step> getNeighbors(IGrid grid, int x, int y);
    public List<Step> getNeighbors(IGrid grid, Step step);
}
