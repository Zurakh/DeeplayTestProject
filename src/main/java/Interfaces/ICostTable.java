package Interfaces;

import Classes.Step;

public interface ICostTable<T, K> {
    public double getCoast (IMover<T> mover, Step<K> step);
}
