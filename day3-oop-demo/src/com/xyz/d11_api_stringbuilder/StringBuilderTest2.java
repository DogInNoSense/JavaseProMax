package com.xyz.d11_api_stringbuilder;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        int arr1[] = null;
        System.out.println(toString(arr1));


        int arr2[] = {10, 11, 13, 14};
        System.out.println(toString(arr2));

        int arr3[] = {};
        System.out.println(toString(arr3));
    }

    /*
    1.定义方法接受任意整型数组,返回数组内容格式 (拼接字符串)
     */
    public static String toString(int arr[]) {
        // 2.拼接内容
        if (arr != null) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "" : ", ");
            }
            sb.append("]");
            return sb.toString();
        } else {
            return "[]"; //
        }
    }
}
