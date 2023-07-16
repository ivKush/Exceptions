package lessonHome2;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class task4 {
    public static void main(String[] args) throws Exception  {

        String el;
        Scanner scan = new Scanner(System.in);
        el = scan.nextLine();
        emptyString(el);
        scan.close();

    }

    private static String emptyString(String arg) throws Exception {
        if (arg == "")
            throw new Exception("Пустые строки вводить нельзя");
        return arg;
    }

}
