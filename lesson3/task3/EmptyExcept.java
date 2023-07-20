package lesson3.task3;

public class EmptyExcept extends NullPointerException {
    
    public EmptyExcept(int index) {
        super("индекс " + index + " = пустой индекс");
    }
}
