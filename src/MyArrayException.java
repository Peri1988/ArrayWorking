public class MyArrayException extends Exception{

    public MyArrayException(String title){
        super(title);
        System.err.println("Произошла ошибка " + title);

    }
}
