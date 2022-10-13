package com.xyz.d9_abstract_template;

public abstract class Student {
    /*
    声明模板方法
    第一段和最后一段相同
     */
    public final void write() {
        // final 防止重写模板方法
        System.out.println("\t\t\t\t我的爸爸");
        System.out.println("你的爸爸是啥样,来说说");
        // 正文(每个子类都要写,每个子类情况不一样)
        // 因此,把正文定义成抽象方法
        System.out.println(writeMain());
        System.out.println("很好");
    }

    public abstract String writeMain();
}
