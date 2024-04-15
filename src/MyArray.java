/**
 * Класс реализующий алгоритм массива
 * @author Peri
 * @data 08.04.2024
 * @version 1
 */
public class MyArray {

    private Object[] array;        // Массив, с которым работаем. TODO Переделать на универсальный код
    private int size;          // Текущий размер массива
    private int pointer = 0;   // Указатель(индекс) на текущий свободный элемент

    /**
     * Конструктор, который создает массив без параметров, с размером по умолчанию
     */
    public MyArray(){

        size = 10;
        array = new Object [ size];
    }



    /**
     * Конструтор, который создает массив с заданной длиной
     * @param size размер массива
     */
    public MyArray(int size) {
        this.size = size;
        array = new Object[size];
    }

    public Object[] getArray() {
        return array;
    }

    public Object getSize() {
        return size;
    }

    public Object getPointer() {
        return pointer;
    }

    /**
     * Метод для добавления элемента в массив
     * @param value добавляемое значение
     */
    public void add( Object value){

        if(pointer == size){
         increaseMemory();
        }

        array[pointer] = value;     // Записываем значение по индексу
        pointer++;                  // Увеличиваем значение индекса - указываем на слудюущий элемент
    }

    public void deleteByEnd(){

        pointer--;
    }
    public void eraseByEnd(){
        array [pointer-1]=0;
        pointer--;
    }

    public void deleteByIndex(int index){          // TODO Предусмотреть некорректный ввод данных
        if( index < 0 || index > size && index == (int)index){
            System.out.println("Введите число от 0 до 15");
        }
        for (int i = index; i < pointer-1; i++)  {
            array[i] =  array[i + 1];
        }
    }

    public void accessByIndex(int index){
        if( index < 0 || index > size && index == (int)index){
            System.out.println("Введите число от 0 до 15");
        }
        for (int i = index; i ==index; i++) {
            Object value = array[i];
            System.out.println(value);
        }
    }

    public void findByValue(int value){ // Принимает значение в зависимости от типа массива
        for (int i = 0; i < array.length; i++) {
            if( i == value){
                System.out.println(value);
            }
        }
    }

 /*   public void sortArray(){
        boolean swapped = true;
        Object j = 0;
        Object tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }

  */

    private void increaseMemory() {
        size = 2*size;
        Object[]temp = array;     // Запоминаем ссылку на старый массив
        array = new Object[size];  // Увеличиваем память для рабочего массива
        copyOldArray(temp);     // Вызываем метод для копирования старых значений массива
    }

    private void copyOldArray(Object[] temp) {
        for (int i = 0; i < temp.length; i++) {
            array[i] = temp[i];
        }
    }


    public void out(){
        System.out.println("Содержимое памяти: ");
        String str = "{";
        for (int i = 0; i < size; i++) {
            str += " " + array[i] + " ";
        }
        str += "}";
        System.out.println(str);
    }

    @Override
    public String toString() {
        String str = "{";
        for (int i = 0; i < pointer; i++) {
            str += " " + array[i] + " ";
        }
        str += "}";
        return str;
    }
}
