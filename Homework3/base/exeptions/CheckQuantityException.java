package ExceptionsJava.Homework3.base.exeptions;

public class CheckQuantityException extends RuntimeException{
    public CheckQuantityException() {
        super("Неверное количество элиментов в введенных данных!");
    }
    
}
