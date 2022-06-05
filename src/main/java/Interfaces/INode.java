package Interfaces;

import Classes.Step;

public interface INode<T>  {
    public double getCost();

    public void setCost(double cost);

    public Step getCameFrom();
    public void setCameFrom(Step prev);

    public T getKey();

    public boolean isVisited();

    public void setVisited();

    public double getRealCost();

    public void setRealCost(double cost);
}
