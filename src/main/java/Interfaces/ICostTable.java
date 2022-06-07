package Interfaces;

import Classes.Step;

/* Интерфейс, на основе которогом будут строиться классы, хранящие информацию о том
* с какой скоростью разные расы перемещаются по клеткам*/
public interface ICostTable<T, K> {
    public double getCoast (IMover<T> mover, Step<K> step);
}
