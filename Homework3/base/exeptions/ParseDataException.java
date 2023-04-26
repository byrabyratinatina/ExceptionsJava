package ExceptionsJava.Homework3.base.exeptions;

public class ParseDataException extends RuntimeException{
    public ParseDataException(String message) {
        super("Исключение в цикле, во время статистического анализа: " + message);
    }
}
