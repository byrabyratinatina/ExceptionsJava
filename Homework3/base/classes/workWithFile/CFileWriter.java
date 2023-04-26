package ExceptionsJava.Homework3.base.classes.workWithFile;

import base.abstractClasses.AFileWriter;
import base.exceptions.FileCreateException;
import base.exceptions.MyFileCreateException;
import base.exceptions.TheSameFileWritingException;

import java.io.FileWriter;
import java.io.IOException;

public class CFileWriterextends AFileWriter {
    private final String folderPath;

    /**
     * Записывает информацию о пользователе в файл. Если файл с именем равен фамилии, то записывает в него.
     * Если не равен, то создаст новый файл, с именем как фамилия, и запишет инфо туда.
     * @param fileCreator - Создает новый файл
     * @param findTheSameFileName - Ищет файлы в директории с именем равным фамилии
     * @param folderPath - путь к директории с файлами
     */
    public CFileWriter(CFileCreator fileCreator, CFindTheSameFileName findTheSameFileName, String folderPath) {
        super.fileCreator = fileCreator;
        super.findTheSameFileName = findTheSameFileName;
        this.folderPath = folderPath;
    }

    @Override
    public boolean writeToFile(String[] infoToWrite) throws TheSameFileWritingException, MyFileCreateException {
        String path = this.folderPath + infoToWrite[0] + ".txt";

        if(findTheSameFileName.findTheSameFileName(infoToWrite[0], this.folderPath)){
            System.out.println("Найдена таже фамилия");
            try {
                super.fileWriter = new FileWriter(path, true);
                super.fileWriter.write(infoToWrite[1]+"\n");
                super.fileWriter.close();
                System.out.println("Данные записаны");
            }catch (IOException e){
                throw new TheSameFileWritingException(e.getMessage());
            }
        }else {
            try {
                fileCreator.createFile(path);
                System.out.println("Создан новый файл");
            } catch (FileCreateException e) {
                throw new MyFileCreateException(e.getMessage());
            }
            try {
                super.fileWriter = new FileWriter(path, true);
                super.fileWriter.write(infoToWrite[1]+"\n");
                super.fileWriter.close();
                System.out.println("Данные записаны");
            }catch (IOException e){
                throw new TheSameFileWritingException(e.getMessage());
            }
        }
        return true;
    }
}
