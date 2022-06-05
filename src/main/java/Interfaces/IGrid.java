package Interfaces;

public interface IGrid {
    public int getHeightInNodes();
    public int getWidthInNodes();
    public INode getNode(int x, int y);
    public void setNode(int x, int y, INode node);
    public boolean isValid(int x, int y);
}
