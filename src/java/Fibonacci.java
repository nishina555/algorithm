package java;
/**
 * Created by nishina on 2016/12/15.
 */
public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(i + "番目のフィボナッチ数列は" + fibonacci(i) + "です");
        }
    }
    private static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
}
