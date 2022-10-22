package com.xyz.d7_arrays;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        // Arrays类的常用api
        int arr[] = {10, 2, 55, 23, 24, 100};
        System.out.println(arr);
        String rs = Arrays.toString(arr);
        // 返回数组内容的API
        System.out.println(rs);

        // 排序的API
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 二分搜索技术(前提数组必须排序)
        int index = Arrays.binarySearch(arr, 55);
        int index1 = Arrays.binarySearch(arr, 56);
        System.out.println(index);
        System.out.println(index1); // 返回应该插入的位置的负值-1

        // 数组没有排序 找不到
        int arr2[] = {12, 36, 34, 25, 13, 24, 234, 100};
        System.out.println(Arrays.binarySearch(arr2, 36));

    }


}
