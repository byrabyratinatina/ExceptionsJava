package ExceptionsJava.Homework3.base.exeptions;

public class CheckSexException extends RuntimeException{
    public CheckSexException() {
        super("Значение пол пусто!");
    }
    
}
