package Classes;

import Interfaces.IGrid;
import Interfaces.INeighbourGetter;
import Interfaces.INode;

import java.util.ArrayList;
import java.util.List;

public class SimpleNeighbors implements INeighbourGetter {

    @Override
    public List<Step> getNeighbors(IGrid grid, int x, int y) {
        List<Step> neighbors = new ArrayList<>();
        for(int dy = -1; dy <= 1; ++dy){
            for(int dx = -1; dx <= 1; ++dx){
                if((dx != 0) && (dy != 0) || (dx == 0) && (dy == 0)){
                    continue;
                }
                if(grid.isValid(x + dx, y + dy)){
                    neighbors.add(new Step(grid.getNode(x + dx, y + dy), x + dx, y + dy));
                }
            }
        }
        return neighbors;
    }

    @Override
    public List<Step> getNeighbors(IGrid grid, Step step) {
        return getNeighbors(grid, step.getX(), step.getY());
    }
    //public SimpleNeighbors(){}
}
