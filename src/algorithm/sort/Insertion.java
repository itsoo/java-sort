package algorithm.sort;

/**
 * 插入排序
 */
public class Insertion {

    /**
     * 通过交换进行插入排序
     *
     * @param a
     */
    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }

    /**
     * 通过将较大的元素都向右移动而不总是交换两个元素，这样访问数组的次数就能减半
     *
     * @param a
     */
    public static void sort2(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int num = a[i + 1];
            for (int j = 0; j <= i; j++) {
                if (num < a[j]) {
                    for (int m = i; m >= j; m--) {
                        a[m + 1] = a[m];
                    }
                    a[j] = num;
                    break;
                }
            }
        }
    }
}
