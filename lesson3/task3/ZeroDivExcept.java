package lesson3.task3;

public class ZeroDivExcept extends ArithmeticException{

    ZeroDivExcept (String msg) {
        super(msg);
        
    }

    public char[] getMessage(String string) {
        return null;
    }

    public void Div(int a, int b) throws ZeroDivExcept {
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("----------");
            // System.out.println(e.getMessage());
            throw new ZeroDivExcept("Деление на ноль");
        }
    }

}
