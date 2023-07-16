package lessonHome1;

public class task1 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }

    public static class Answer {

        public static void arrayOutOfBoundsException() {
            int[] array = new int[7];
            System.out.println(array[8]);
        }

        public static void divisionByZero() {
            int num = 5;
            System.out.println(num / 0);

        }

        public static void numberFormatException() {
            String elem = "five";
            Integer.parseInt(elem);

        }
    }

}

