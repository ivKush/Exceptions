package lessonHome3;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Func {

    public String[] inData() {
        
        System.out.println( "Введите через пробел данные: ФИО(через пробел) дата рождения (dd,mm,yyyy) номер телефона (11 знаков) пол (f или m)" );
        Scanner scan = new Scanner(System.in);
        String[] humanData = scan.nextLine().split(" ");
        scan.close();
        return humanData;
    }

    public int checkLenths(String[] arg) {
        if (arg.length < 6)
            return -1;
        if (arg.length > 6)
            return 1;
        return 0;
    }

    public void checkUserData(String[] arg) {
        
        try {
            DateFormat df = new SimpleDateFormat("dd.mm.yyyy");
            Date date = df.parse(arg[3]);
            if (arg[4].length() != 11) throw new RuntimeException("Телефон указан не верно");
            if (arg[5].equals("f") || arg[5].equals("m")) throw new RuntimeException("Пол указан не верно");
        } catch (ParseException e) {
            System.out.println("Проверьте формат даты");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так, попробуйте ещё");
        }

    }

    public void recHuman(String[] arg) throws IOException {
        // byte[] nameFile = arg[0].getBytes();
        try (FileOutputStream file = new FileOutputStream("lesson_home3\\" + arg[0].getBytes()  + ".txt")) {
            for (String el : arg) {
                byte[] value = el.getBytes();
                file.write(value, 0, value.length);
            }
        } 
    }
}