package lessonHome3;

import java.util.Scanner;

public class CreateHuman extends Human {
    
    public void inData() {
        
        System.out.println( "Введите через пробел данные: Ф И О дата рождения (dd,mm,yyyy) номер телефона (11 знаков) пол (f или m)" );
        Scanner scan = new Scanner(System.in);
        // String[] human = scan.nextLine().split(" ");
        sethuman(scan.nextLine().split(" "));
        scan.close();
        
        // return gethuman();
    }
    
}
