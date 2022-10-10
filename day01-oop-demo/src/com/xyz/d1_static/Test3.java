package com.xyz.d1_static;

public class Test3 {
    /*
    静态成员
     */
    public static int onlineMember = 10;

    public static void test2() {
        System.out.println("==test2==");
    }

    /*
    实例成员
     */
    private String name;

    private void run() {
        System.out.println(name + "跑的快");
    }

    // 3.静态方法中不允许出现this关键字
    public static void test3() {
//        System.out.println(this); // this只能代表当前对象,静态方法可以不用对象调用
    }

    // 2.实例方法可以访问静态成员,也可以访问实例成员
    public void go() {
        System.out.println(onlineMember);
        System.out.println(Test3.onlineMember);
        test2();
        System.out.println(name);
        System.out.println(this);
        run();
    }

    // 1.静态方法只能访问静态成员,不能直接访问实例成员
    public static void test() {
        System.out.println(onlineMember);
        System.out.println(Test3.onlineMember);
        test2();
        Test3 t = new Test3();
        System.out.println(t.name); // 间接访问
//        System.out.println(name); // 不能直接访问实例成员
    }

    public static void main(String[] args) {
        // 目标:理解static 访问相关的语法
    }


}
