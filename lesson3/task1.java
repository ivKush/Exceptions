package lesson3;

import java.io.IOException;

// Создать метод doSomething(), который может быть источником
// одного из типов checked exceptions (тело метода прописывать не обязательно).
// Вызовите этот метод из Main и обработайте в нем исключение, которое вызвал метод doSomething().

public class task1 {
    
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception e) {
            System.out.println("Error IOException" + e);
        } 
    }

    static void doSomething() throws IOException {
        throw new IOException();
    }
}
