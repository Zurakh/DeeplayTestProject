package Classes;

import Interfaces.IGrid;
import Interfaces.INode;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;

public class TileMap implements IGrid {

    public int getHeightInNodes(){
        return height;
    }

    public int getWidthInNodes(){
        return width;
    }
    public INode getNode(int x, int y){
        return tiles.get(y).get(x);
    }
    public void setNode(int x, int y, INode node){
        tiles.get(y).set(x, node);
    }

    @Override
    public boolean isValid(int x, int y) {
        return 0 <= x && x < this.getWidthInNodes()
        && 0 <= y && y < this.getHeightInNodes();
    }

    public TileMap(int height, int width){
        this.height = height;
        this.width = width;
        tiles = new ArrayList<ArrayList<INode>>();
        for (int i = 0; i < height; ++i) {
            ArrayList<INode> row = new ArrayList<INode>(Collections.nCopies(width, null));
            this.tiles.add(row);
        }
    }
    private final int  height;
    private final int width;
    private ArrayList<ArrayList<INode>> tiles;
}
