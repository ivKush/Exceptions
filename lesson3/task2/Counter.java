package lesson3.task2;

import java.io.IOException;

public class Counter implements AutoCloseable {
    
    Integer count;

    public void add() throws IOException {
        if (count == null) throw new IOException("Поток закрыт");
        this.count ++;
    }

    public void close() {
        this.count = null;
    }

    public boolean checkOut() {
        if (this.count == null) return true;
        return false;
    }

    public Integer getCount() {
        return count;
    }
}
