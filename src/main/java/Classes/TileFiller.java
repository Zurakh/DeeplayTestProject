package Classes;

import Interfaces.IGrid;
import Interfaces.IGridFiller;

import java.util.Iterator;


/*Класс, который заполняет сетку пустымитайлами*/
public class TileFiller implements IGridFiller {


    public static void fillGrid(IGrid grid, Iterable codedMap) {
        Iterator it = codedMap.iterator();
        for(int i = 0; i < grid.getHeightInNodes() ; ++i) {
            for(int j = 0; j < grid.getWidthInNodes(); ++j){
                grid.setNode(i, j, new Tile(it.next()));
                if(!it.hasNext()){
                    break;
                }

            }
        }
    }
}
