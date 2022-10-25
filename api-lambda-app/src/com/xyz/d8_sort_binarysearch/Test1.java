package com.xyz.d8_sort_binarysearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        // 1.定义数组
        int arr[] = {5, 1, 3, 2};

        // 2.定义一个循环控制几轮
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
