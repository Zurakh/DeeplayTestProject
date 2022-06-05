package Classes;

import Interfaces.INode;

public class Tile <T>  implements INode {
    public T getKey() {
        return key;
    }

    public double getCost() {
        return cost;
    }


    public void setCost(double cost) {
        this.cost = cost;
    }


    @Override
    public Step getCameFrom() {
        return cameFrom;
    }

    @Override
    public void setCameFrom(Step prev) {
        cameFrom = prev;
    }

    public Tile(T content){
        this.key = content;
        cost = Double.POSITIVE_INFINITY;
        this.isVisited = false;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited() {
        this.isVisited = true;
    }

    public double getRealCost() {
        return realCost;
    }

    @Override
    public void setRealCost(double cost) {
        this.realCost = cost;
    }

    private boolean isVisited;
    private final T key;
    private double cost;

    private double realCost;
    private Step cameFrom;
}
