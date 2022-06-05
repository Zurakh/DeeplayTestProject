package Classes;

import Interfaces.IPath;

import java.util.ArrayList;

public class Path implements IPath {

    @Override
    public double getLength() {
        return lenght;
    }

    @Override
    public Step getStep(int index) {
        return path.get(index);
    }


    @Override
    public void appendStep(Step step) {
        path.add(step);
        ++lenght;
    }

    @Override
    public double getCost() {
        return path.get(0).getRealCost();
    }

    private ArrayList<Step> path = new ArrayList<>();
    private double lenght;
}
