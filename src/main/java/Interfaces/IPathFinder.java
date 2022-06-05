package Interfaces;

import Classes.Step;

public interface IPathFinder<T, K, P, L, M> {
    public IPath findPath(IMover<T> mover, int sx, int sy, int tx, int ty);
    public IPath findPath(IMover<T> mover, Step<K> start, Step<K> target);
}
