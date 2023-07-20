package lesson3.task3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    1. Создайте класс исключения, который будет выбрасываться при делениина 0. 
    Исключение должно отображать понятное для пользователя сообщение
    об ошибке.
    2. Создайте класс исключений, которое будет возникать при обращении к
    пустому элементу в массиве ссылочного типа. Исключение должно
    отображать понятное для пользователя сообщение об ошибке.
    3. Создайте класс исключения, которое будет возникать при попытке открыть
    не существующий файл. Исключение должно отображать понятное для
    пользователя сообщение об ошибке.
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Задание 1.
        // ZeroDivExcept div = new ZeroDivExcept(null);
        // div.Div(2, 0);

        // Задание 2.
        // throw new EmptyExcept(4);

        // Задание 3.
        try {
            FileReader file = new FileReader("/Test");
        } catch (FileNotFoundException e) {
            throw new NotFoundFile("/Test");
        }
    }

}
