import Classes.Solution;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;


public class pathFindingTest {
    @Test
    void humanPath_1(){

        Assertions.assertEquals(10.0, Solution.getResult("STWSWTPPTPTTPWPP", "Human"));
    }
    @Test
    void swamperPath_1(){
        Assertions.assertEquals(15.0, Solution.getResult("STWSWTPPTPTTPWPP", "Swamper"));
    }
    @Test
    void woodmanPath_1(){
        Assertions.assertEquals(12.0, Solution.getResult("STWSWTPPTPTTPWPP", "Woodman"));
    }

    @Test
    void humanPath_2(){
        Assertions.assertEquals(6.0, Solution.getResult("PPPPSSSPSSSPSSSP", "Human"));
    }
    @Test
    void humanPath_3(){
        Assertions.assertEquals(6.0, Solution.getResult("PPPSSSPPSSSPSSSP", "Human"));
    }
    @Test
    void humanPath_4(){
        Assertions.assertEquals(6.0, Solution.getResult("PPSSSPPSSSPPSSSP", "Human"));
    }
    @Test
    void humanPath_5(){
        Assertions.assertEquals(6.0, Solution.getResult("PPSSSPPPSSSPSSSP", "Human"));
    }
    @Test
    void humanPath_6(){
        Assertions.assertEquals(6.0, Solution.getResult("PPSSSPSSSPPPSSSP", "Human"));
    }
    @Test
    void humanPath7(){
        Assertions.assertEquals(6.0, Solution.getResult("PPSSSPSSSPSPSPPP", "Human"));
    }


}
