package Classes;

import Heuristics.TaxicabHeu;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static double getResult(String grid, String race) {
        /* Создаём пустую карту 4 на 4 */
        TileMap map = new TileMap(4, 4);

        /* Приводим "код" карты к iterable виду*/
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(grid.split("")));

        /* Используем класс TileFiller для заполнения карты объектами типа Tile по списку**/
        TileFiller.fillGrid(map, strList);


        CoasGetterTablebased table = new CoasGetterTablebased(ReadBin.read("src/main/resources/tileSpeed.bin"));

        AstarPathFinder pathFinder =
                new AstarPathFinder(new SimpleNeighbors(),
                map, table, new TaxicabHeu());
        SimpleMover<String> mover = new SimpleMover<String>(race);
        return pathFinder.findPath(mover, 0, 0, 3, 3).getCost();
    }
}