package com.xyz.d13_interface_jdk8;

public interface SportManInter {
    /* 默认方法(实例方法)
    必须default修饰,默认public修饰
    默认方法,接口不能创建对象,这个方法只能过继给了实现类,由实现类的对象调用
     */
    default void run() {
        go();
        System.out.println("跑的快");
    }

    /*
    2. 静态方法
    必须static修饰 默认public修饰
     */
    static void inAddr() {
        System.out.println("学习java新增语法");
    }
    /*
    3. 私有方法
    JDK 1.9开始支持
    必须在接口内部才能访问
    */

    private void go() {
        System.out.println("开始跑");
    }
}


class PingPongMan implements SportManInter {

}

class Test {
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run();


        SportManInter.inAddr();
    }
}