package com.xyz.d12_this;

public class Student {
    private String name;
    private String schoolName;

    public Student() {
    }

    /*
    如果学生不填写学校,默认这个对象是黑马
     */
    public Student(String name) {
        // 借用本类兄弟构造器
        // 没有super() this super必须放在第一行
        this(name, "黑马程序员");
    }

    public Student(String name, String schoolName) {
//        super(); // 必须先初始化父类 再初始化自己
        this.name = name;
        this.schoolName = schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }
}
