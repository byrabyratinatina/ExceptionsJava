package ExceptionsJava.Homework3.base.abstractClasses;

import base.interfaces.ICreateFile;

import java.io.File;

public abstract class AFileCreator implements ICreateFile {
    protected File file;
}