package lesson3.task3;

import java.io.FileNotFoundException;

public class NotFoundFile extends FileNotFoundException {

    public NotFoundFile(String msg) {
        super(msg + " - такого файла не найдено");
    }
}
