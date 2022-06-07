package Classes;

import Interfaces.IMover;

/*Класс ничего не хранит, кроме клююча. Пэтому он и 'Simple'*/
public class SimpleMover<T> implements IMover<T> {
    @Override
    public T getKey() {
        return key;
    }
    public SimpleMover(T key){
        this.key = key;
    }
    private final T key;
}
