package ExceptionsJava.Homework3.base.exeptions;

public class BirthdayFormatException extends RuntimeException{
    public BirthdayFormatException() {
        super("Не верный формат дня рождения!");
    }
    
}
