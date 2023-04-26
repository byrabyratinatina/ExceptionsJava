package ExceptionsJava.Homework3.base.exeptions;

public class IncorrectSexValuesException extends RuntimeException{
    public IncorrectSexValuesException() {
        super("Неверное значение пола!");
    }
}