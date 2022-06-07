package Classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*Класс, который читает информацию о стоимости перемещения из бинарников*/
public class ReadBin {
    public static Object read(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            return ois.readObject();

        } catch (IOException | ClassNotFoundException | ClassCastException  e) {
            throw new RuntimeException(e);
        }
    }
}
