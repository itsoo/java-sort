package algorithm.sort;

import java.util.Random;

public class Sort {

    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println("排序前: " + arrayToString(arr));
        long startTime = System.currentTimeMillis();
        // 冒泡排序
//        Bubble.sort(arr);
        // 堆排序
//        Heap.sort(arr);
        // 插入排序
//        Insertion.sort(arr);
        // 归并排序
        Merge.sort(arr);
        // 快速排序
//        Quick.sortByStack(arr);
//        Quick.sort(arr, 0, arr.length - 1);
//        Quick.sortThreeWay(arr, 0, arr.length - 1);
        // 基数排序
//        Radix.sort(arr);
        // 选择排序
//        Selection.sort(arr);
        // 希尔排序
//        Shell.sort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("排序后: " + arrayToString(arr));
        System.out.println((endTime - startTime) + "ms");
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sbr = new StringBuilder(16);
        for (int i : arr) {
            sbr.append(i).append(" ");
        }
        return sbr.toString();
    }
}
