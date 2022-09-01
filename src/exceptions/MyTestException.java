package exceptions;

public class MyTestException extends Exception{
    public MyTestException(){

    }
    public MyTestException(String description){
        super(description);
    }
}
