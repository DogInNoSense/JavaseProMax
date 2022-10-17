package com.xyz.d9_api_object;

/*
 掌握 object 类中 toString的使用
 */
public class Test1 {
    public static void main(String[] args) {
        Student s = new Student("周熊", '男', 19);
//        String rs = s.toString();
//        System.out.println(rs);  // com.xyz.d9_api_object.Student@4eec7777
        System.out.println(s); // com.xyz.d9_api_object.Student@4eec7777 默认toString可以省略
        // 重写toString
        System.out.println(s);
    }
}
