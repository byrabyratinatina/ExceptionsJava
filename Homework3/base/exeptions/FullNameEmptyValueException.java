package ExceptionsJava.Homework3.base.exeptions;

public class FullNameEmptyValueException extends RuntimeException{
    public FullNameEmptyValueException() {
        super("Одно или несколько значении в полном имени пусты!");
    }
}