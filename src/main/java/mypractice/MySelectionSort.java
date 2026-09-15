package mypractice;

import java.util.Arrays;
import java.util.Scanner;

public class MySelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数组的大小：");
        int size = input.nextInt();
        if (size <= 0) {
            System.out.println("数组大小必须大于 0！");
            return;
        }
        int[] arr = new int[size];
        System.out.println("请输入数组的元素：");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        System.out.println("排序前：" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int minIndex = findMinIndex(arr, i);
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println("排序后：" + Arrays.toString(arr));
    }

    private static int findMinIndex(int[] arr, int i) {
        int a = arr[i];
        int b = i;
        for (int j = i; j < arr.length; j++) {
            if (arr[j] < a) {
                b = j;
                a = arr[j];
            }
        }
        return b;
    }
}
