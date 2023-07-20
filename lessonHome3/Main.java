package lessonHome3;

/*
// Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке,
// разделенные пробелом: Фамилия Имя Отчество, дата_рождения, номер_телефона, пол
// Форматы данных: фамилия, имя, отчество - строки дата_рождения - строка формата dd.mm.yyyy
// номер_телефона - целое без знаковое число без форматирования, пол - символ латиницей f или m.
// Критерии:
// Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым,
// вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше
// данных, чем требуется.
// Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
// Если форматы данных не совпадают,нужно бросить исключение, соответствующее типу проблемы. Можно
// использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано,
// пользователю выведено сообщение с информацией, что именно неверно.
// Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну
// строку должны записаться полученные данные, вида. 
 */

public class Main {
    public static void main(String[] args) {

        // Иванов Иван Иванович 01.01.2023 89184545455 m

        createHuman human = new createHuman();
        human.inData();
        CheckData data = new CheckData();

        try {
            if (data.checkLenths(human.gethuman()) == -1)
                throw new RuntimeException("Введенных данных меньше, чем требуется");
            if (data.checkLenths(human.gethuman()) == 1)
                throw new RuntimeException("Введенных данных больше, чем требуется");
            data.checkUserData();

        } catch (RuntimeException e) {
            e.getMessage();
        }
    }
}