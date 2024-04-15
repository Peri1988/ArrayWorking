import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

/*
TODO Пока сортировку из класса MyArray убираем
TODO Рассмотреть работу с Comparable и с Comparator на примере ArrayList, объяснить чем они отличаются
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

        try {
            array.findByValue(500);
        } catch (MyArrayException e) {
            System.out.println("Вывод ошибки: " +  e.getMessage());
        }
        System.out.println(array.toString());
        array.accessByIndex(4);
        System.out.println(array.toString());

      //  array.sortArray();
        System.out.println(array.toString());
        MyArray<Car> carArrray = new MyArray();

        Car car = new Car(200, 100000, "Жигули");
        Car car1 = new Car(250, 5000000, "Мерседес");
        carArrray.add(car);
        carArrray.add(car1);
       // System.out.println(carArrray);


      //  System.out.println(carArrray);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car1);
       // Collections.sort(cars);
        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getCost() - o2.getCost();
            }
        };
        cars.sort(comparator);
        System.out.println(cars);

        try {
            carArrray.findByValue(new Car(120, 300000, "БМВ"));
        } catch (MyArrayException e) {
            System.out.println("Вывод ошибки: " +  e.getMessage());
        }


    }
}