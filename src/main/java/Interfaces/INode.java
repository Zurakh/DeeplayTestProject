package Interfaces;

import Classes.Step;


/* Узел/клетка/тайл нужны для алгоритмов поиска пути, поэтому и хранят
* информацию нужную для алгоритмов информацию(стоимость достижения и проч.)*/
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
