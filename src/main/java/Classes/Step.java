package Classes;

import Interfaces.INode;
import org.w3c.dom.Node;

public class Step<T> implements Comparable<Step>{
    private INode<T> node;
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public INode getNode() {
        return node;
    }

    public int getY() {
        return y;
    }
    public void setCost(double cost){
        node.setCost(cost);
    }

    public void setRealCost(double cost){node.setRealCost(cost);}

    public double getRealCost(){
        return node.getRealCost();
    }
    public double getCost(){
        return node.getCost();
    }



    public Step(INode node, int x, int y){
        this.node = node;
        this.x = x;
        this.y = y;
    }
    public void setCameFrom(Step prev){
        node.setCameFrom(prev);
    }
    public T getKey(){
        return node.getKey();
    }

    @Override
    public int compareTo(Step stp) {
        return (int)(node.getCost() - stp.getCost());
    }

    public boolean isVisited() {
        return node.isVisited();
    }

    public void setVisited() {
        this.node.setVisited();
    }

}
