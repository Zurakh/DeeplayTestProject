package Interfaces;

import Classes.Step;

public interface IPath {
    public double getLength();
    public Step getStep(int index);
    public void appendStep(Step step);

    public double getCost();
}
