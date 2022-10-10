package com.xyz.d1_static;

public class Student {
    /*
    实例成员变量: 无static修饰,属于对象
     */
    private String name;

    /*
    静态成员方法: 有staic修饰,归属于类,可以被共享访问,用类名或者对象名 都可以访问
     */
    public static int getMax(int age1, int age2) {
        return age1 > age2 ? age1 : age2;
    }

    public static void main(String[] args) {
        // 1.类名.静态成员方法
        System.out.println(Student.getMax(10, 32));
        // 同一个类中,访问静态方法,类名可以省略不写.
        System.out.println(getMax(10, 32));
//        study(); // 报错
        // 2.对象.实例方法
        Student s = new Student();
        s.name = "猪八戒";
        s.study();

        // 3.对象.静态方法(不推荐)
        System.out.println(s.getMax(10, 32));


    }

    /*
       实例方法: 属于对象的 只能用对象触发访问
        */
    public void study() {
        System.out.println(name + "在好好学习,天天向上");
    }


}
