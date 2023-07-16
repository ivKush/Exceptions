package lesson1;

public class Task1 {
    public static void main(String[] args) {

        Integer[] array = new Integer[8];
        System.out.println(arrayLength(array, 12));   

    }
    
    public static int arrayLength(Integer[] arr, int num) {
        if (arr == null) return -3;
        if (arr.length < 10) return -1;
        return arr.length;
    }

}
