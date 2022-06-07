package Interfaces;

import Classes.Step;

/*Интерфейс пути. */
public interface IPath {
    public double getLength();
    public Step getStep(int index);
    public void appendStep(Step step);

    public double getCost();
}
