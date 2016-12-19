package java_code;
import java.util.Scanner;

/**
 * Created by nishina on 2016/12/15.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("数値を入力して下さい。");
        Scanner scan = new Scanner(System.in);
        int searchKey = scan.nextInt();
        if (searchKey > 10 || searchKey < 1) {
            System.out.println("1から11の間で入力してください");
            System.exit(0);
        }
        System.out.println("バイナリーサーチ開始");
        int position = binarySearch(searchKey, data);
        if (position == -1){
            System.out.println(searchKey + "は見つかりませんでした");
        } else {
            System.out.println(searchKey + "は" + position + "番目にあります");
        }

    }

    private static int binarySearch(int key, int[] data) {
        int pLeft = 0, pRight = data.length -1, center;
        while (pLeft <= pRight) {
            center = (pLeft + pRight) / 2;
            int centerKey = data[center];
            if (centerKey == key) {
                return center;
            }
            if ( centerKey < key) {
                pLeft = center + 1;
            } else {
                pRight = center - 1;
            }
        }
        return -1;
    }
}
