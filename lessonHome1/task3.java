package lessonHome1;

import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b) {
        int[] c;
        try {
            if (a.length != b.length)
                throw new Exception("Массивы разной длины");
            c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] / b[i];
            }
            return c;
        } catch (Exception e) {
            // System.out.println(e.getMessage());
            c = new int[] { 0 };
            return c;
        }
    }
}

    
public class task3 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            a = new int[] { 12, 8, 16 };
            b = new int[] { 4, 2, 4 };
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}
