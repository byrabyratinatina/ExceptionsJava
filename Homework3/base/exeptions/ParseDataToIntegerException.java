package ExceptionsJava.Homework3.base.exeptions;

public class ParseDataToIntegerException extends NumberFormatException{
    public ParseDataToIntegerException(String s) {
        super("Не удалось преобразовать строку в целое число!: " + s);
    }
}