package ExceptionsJava.Homework3.base.interfaces;

import base.exceptions.GetDataException;

import java.io.IOException;

public interface IGetData {
    public String getData() throws IOException;
}