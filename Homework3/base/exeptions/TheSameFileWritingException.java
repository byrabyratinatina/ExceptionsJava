package ExceptionsJava.Homework3.base.exeptions;

import java.io.IOException;

public class TheSameFileWritingException extends IOException {
    public TheSameFileWritingException(String message) {
        super("Файл не найден: " + message);
    }
}