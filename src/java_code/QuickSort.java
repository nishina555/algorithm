package java_code;
import java.util.Random;

/**
 * Created by nishina on 2016/12/15.
 */
public class QuickSort {
    public static void quickSort(int[] array, int left, int right) {
        //pivotより左に小さい値を渡し、右に大きい値を渡す作業をする
        //左右からpivotに向かって振り分けが迫ってくるイメージ
        // currightとcurleftの順序が入れ替わる(=左右からの攻めが終わる。)時に、左右でクイックソートを再帰させる
        int curleft = left;
        int curright = right;
        int pivot = array[(curleft + curright) / 2];


        // 左右からの攻めが交じり合うまで続ける
        do {
            // pivotより大きい値(右に渡すもの)を左から探していく
            while (array[curleft] < pivot) {
                curleft++;
            }

            //上の逆のことをやっている
            while (array[curright] > pivot) {;
                curright--;
            }

            // まだpivotがある中央まで攻めきれていない状態
            if (curleft <= curright) {
                // 交換してpivotより左は小さい値、右は大きい値がくるようにする
                swap (array, curleft++, curright--);
            }
        } while (curleft <= curright);

        // 分割後にさらにソートをする列が存在する場合
        if (left < curright) {
            quickSort(array, left, curright);
        }

        // 分割後にさらにソートをする列が存在する場合
        if (curleft < right) {
            quickSort(array, curleft, right);
        }
    }

    private static void swap (int[] array, int idx1, int idx2) {
        int tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }

    public static void main(String[] args) {
        int max = 20;
        int[] array = new int[max];
        Random rnd = new Random();
        for (int i = 0; i < max; i++) {
            array[i] = rnd.nextInt(1000);
        }
        System.out.println("クイックソートを始めます");

        System.out.println("ソート前の値を横にずらっと並べます");
        int j = 0;
        //拡張for文で配列をなめる
        for (int val : array) {
            j++;
            if (j != array.length) {
                System.out.print(val + ",");
            } else {
                System.out.println(val);
            }

        }
        long start = System.currentTimeMillis();
        quickSort(array, 0, max -1);
        long end = System.currentTimeMillis();
        System.out.println("ソート後の値を横にずらっと並べます");
        //インデックスを使ったfor文
        for (int k=0; k < array.length; k++) {
            System.out.print(array[k]);
            if (k != array.length - 1) {
                System.out.print(",");
            } else {
                System.out.println();
            }
        }
        //数が少ない場合はlong t1 = System.nanoTime();を使った方がいい
        System.out.println("かかった時間は・・・:" + (end - start) + "ミリ秒");
    }
}