import java.util.ArrayList;
import java.util.Collections;

/*
Создаем свой класс для работы с массивом(cвоя реализация классса ArrayList)
Задачи для класса
1) Добавление элементов
2) Удаление элементов
3) Доступ по индексу
4) Сортировка элементов
5) Поиск по значению
6) Возможность указать размер массива
7) Динамическое расширение массива
8) Удаление массива
9) Стирание массива
10) Вывод массива на консоль
11) Массив должен работать с любым типом данных
 */
public class Main {
    public static void main(String[] args) {

        MyArray array = new MyArray();

        array.add(1);
        array.out();
        System.out.println(array.toString());
        array.add(2);
        array.out();
        System.out.println(array.toString());
        for (int i = 0; i < 15; i++) {
            array.add(i);
            array.out();
        }
        array.deleteByEnd();
        array.out();
        System.out.println(array.toString());
        array.add(7);
        array.out();
        System.out.println(array.toString());

        array.eraseByEnd();
        array.out();
        System.out.println(array.toString());
        array.add(9);
        array.out();
        System.out.println(array.toString());
        array.findByValue(5);
        System.out.println(array.toString());
        array.accessByIndex(4);
        System.out.println(array.toString());

      //  array.sortArray();
        System.out.println(array.toString());
        MyArray carArrray

    }
}