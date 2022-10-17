package com.xyz.d9_api_object;

import java.util.Objects;

public class Student { //extends object
    private String name;
    private char sex;
    private int age;

    public Student() {
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Student{name = " + name + ",sex=" + sex
//                + ",age=" + age + "}";
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    /*
    重写equals
     */

    /**
     * @Override public boolean equals(Object obj) {
     * // 1.判断obj是不是学生类型
     * if (obj instanceof Student) {
     * //            // 2.判断两个对象的内容是否一样
     * Student s2 = (Student) obj;
     * //            if (this.name.equals(s2.name) && this.age == s2.age && this.sex == s2.sex) {
     * //                return true;
     * //            } else {
     * //                return false;
     * //            }
     * return  this.name.equals(s2.name) && this.age == s2.age && this.sex == s2.sex;
     * } else {
     * return false;
     * }
     * }
     */


    @Override
    public boolean equals(Object o) {
        // 1.判断是不是同一个对象
        if (this == o) return true;
        // 2.如果o是null 返回false 如果o不是学生类型 返回false
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age);
    }
}

