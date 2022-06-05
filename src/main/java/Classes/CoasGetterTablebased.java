package Classes;

import Interfaces.ICostTable;
import Interfaces.IMover;
import com.google.common.collect.Table;

public class CoasGetterTablebased implements ICostTable<String, String>  {
    private final Table<String, String, Double> tileSpeedTable;

    @Override
    public double getCoast(IMover<String> mover, Step<String> step) {
        String movkey = mover.getKey();
        String stepkey = step.getKey();
        Number content = tileSpeedTable.get(movkey, stepkey);
        return content.doubleValue();
    }
    public CoasGetterTablebased(Object obj){
        tileSpeedTable = (Table<String, String, Double>)obj;
    }
}
