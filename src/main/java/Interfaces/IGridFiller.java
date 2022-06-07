package Interfaces;

/* Интерфейс описывает классы, которые заполняют сетки клеток, использую нечто итерируемое
* (Массив строк или символов, например)*/
public interface IGridFiller {
    public static void fillGrid(IGrid grid, Iterable codedMap){};
}
