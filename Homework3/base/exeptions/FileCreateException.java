package ExceptionsJava.Homework3.base.exeptions;
import java.io.IOException;

public class FileCreateException extends IOException {
    public FileCreateException(String message) {
        super("Файл не создан: " + message);
    }
}