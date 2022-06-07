package Classes;

import Interfaces.*;

import java.util.PriorityQueue;

/*Данный класс ищёт и составляет путь на основе алгоритма A**/
public class AstarPathFinder implements IPathFinder {

    @Override
    public IPath findPath(IMover mover, int sx, int sy, int tx, int ty) {
        return findPath(mover, new Step(grid.getNode(sx, sy), sx, sy ),
                new Step(grid.getNode(tx, ty), tx, ty));

    }
    @Override
    public IPath findPath(IMover mover, Step start, Step target) {
        PriorityQueue<Step> front = new PriorityQueue<Step>();

        start.setCost(0);
        start.setRealCost(0);
        start.setCameFrom(null);
        front.add(start);
        Step current = start;
        Path path = new Path();

        while (!front.isEmpty()){
            current = front.poll();
            if(current == target){
                break;
            }
            for (Step next : neighbourGetter.getNeighbors(grid, current)) {
                if(next.isVisited()){
                    continue;
                }
                double realCost = current.getRealCost() + coastTable.getCoast(mover, next);
                double heuCost = current.getCost() + coastTable.getCoast(mover, next) + heu.solve(next, target);
                if(next.getCost() == Double.POSITIVE_INFINITY
                || heuCost < next.getCost()){
                    next.setCost(heuCost);
                    next.setRealCost(realCost);
                    next.setCameFrom(current);
                }
                front.add(next);
            }

            current.setVisited();
        }
        for(Step cur = target; cur != null; cur = cur.getNode().getCameFrom()){
            path.appendStep(cur);
        }
        return path;
    }
    public AstarPathFinder(INeighbourGetter neighbourGetter,
                           IGrid grid,
                           ICostTable coastTable,
                           IHeuristic heu){
        this.neighbourGetter = neighbourGetter;
        this.grid = grid;
        this.coastTable = coastTable;
        this.heu = heu;
    }
    private final INeighbourGetter neighbourGetter;
    private final IGrid grid;
    private final ICostTable coastTable;

    private final IHeuristic heu;


}
