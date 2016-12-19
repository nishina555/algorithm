package java_code;
import java.util.Scanner;

/**
 * Created by nishina on 2016/12/17.
 */
public class EuclidGcd {
    public static void main(String[] args) {
        System.out.println("数値を入力して下さい。");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x > y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
        System.out.println("最大公約数は" + euclidGcd(x, y) + "です");


    }

    /* ====================================================================== */
    // 例：
    // 147 と 105 の最大公約数は 21
    // これを解いていく方法としては、
    // 147 % 105 = 1 あまり 42
    // 105 % 42 = 2 あまり 21
    // 42 % 21 = 2 あまり 0
    // よって、21が最大公約数となる。
    // http://qiita.com/Liberty/items/d616943ef8cc744f322d
    /* ====================================================================== */
    private static int euclidGcd(int x, int y) {

        if(y == 0) {
            return x;
        } else {
            return euclidGcd(y, x % y);
        }
    }

}
