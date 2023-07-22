package lessonHome3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckData extends Human {

    public int checkLenths(String[] arg) {
        if (arg.length < 6)
            return -1;
        if (arg.length > 6)
            return 1;
        return 0;
    }

    public void checkUserData() {
        
        try {
            System.out.println(gethuman().toString());
            System.out.println(human.toString());
            DateFormat df = new SimpleDateFormat("dd.mm.yyyy");
            Date date = df.parse(human[3]);
            System.out.println(human[4]);
            if (human[4].length() != 11) throw new RuntimeException("Телефон указан не верно");
            if (human[5] != "f" || human[5] != "m") throw new RuntimeException("Пол указан не верно");
        } catch (ParseException e) {
            System.out.println("Проверьте формат даты");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так, попробуйте ещё");
        }
    }
}
