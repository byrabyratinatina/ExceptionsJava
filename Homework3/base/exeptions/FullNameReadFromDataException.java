package ExceptionsJava.Homework3.base.exeptions;

public class FullNameReadFromDataException extends IndexOutOfBoundsException{
    public FullNameReadFromDataException(String s) {
        super("Исключение полного имени при разборе: " + s);
    }
    
}
