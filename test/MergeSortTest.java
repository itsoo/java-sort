import java.util.Arrays;

public class MergeSortTest {

    public static void main(String[] args) {
        int[] arrays = {9, 2, 5, 1, 3, 2, 9, 5, 2, 1, 8};

        System.out.println(Arrays.toString(arrays));

        mergeSort(arrays, 0, arrays.length - 1);

        System.out.println(Arrays.toString(arrays));
    }

    /**
     * 归并排序
     *
     * @param arrays
     * @param L      指向数组第一个元素
     * @param R      指向数组最后一个元素
     */
    public static void mergeSort(int[] arrays, int L, int R) {
        // 出口
        if (L >= R) {
            return;
        }
        // 计算中间值
        int M = (L + R) / 2;

        // 递归
        mergeSort(arrays, L, M);
        mergeSort(arrays, M + 1, R);

        // 合并
        merge(arrays, L, M + 1, R);
    }

    /**
     * 合并数组
     *
     * @param arrays
     * @param L      指向数组第一个元素
     * @param M      指向数组分隔的元素
     * @param R      指向数组最后的元素
     */
    public static void merge(int[] arrays, int L, int M, int R) {
        // 左边数组
        int[] leftArray = Arrays.copyOfRange(arrays, L, M);

        // 右边数组
        int[] rightArray = Arrays.copyOfRange(arrays, M, R + 1);

        int i = 0, j = 0, k = L;

        for (; i < leftArray.length && j < rightArray.length; k++) {
            // 小的元素放入数组中
            if (leftArray[i] < rightArray[j]) {
                arrays[k] = leftArray[i];
                i++;
            } else {
                arrays[k] = rightArray[j];
                j++;
            }
        }

        // 将左边剩下的数组 appendTo 大数组中
        for (; i < leftArray.length; i++) {
            arrays[k] = leftArray[i];
            k++;
        }

        // 将右边剩下的数组 appendTo 大数组中
        for (; j < rightArray.length; j++) {
            arrays[k] = rightArray[j];
            k++;
        }
    }
}
