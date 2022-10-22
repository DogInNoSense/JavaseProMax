package com.xyz.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    // 自定义比较器
    public static void main(String[] args) {
        // 1.Arrays的sort方法对于有值特性的数组是默认升序排序
        int ages[] = {34, 12, 42, 23};
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        // 2.需求:降序排序
        Integer ages1[] = {34, 12, 42, 23};
        Arrays.sort(ages1, new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 比较规则
//                if (o1 < o2) {
//                    return 1;
//                } else if (o1 > o2) {
//                    return -1;
//                }
//                return 0;
                return o2 - o1; // 降序 负值降序 正值升序
            }
        });
        System.out.println(Arrays.toString(ages1));
        System.out.println("--------------------------");
        Student[] students = new Student[3];
        students[0] = new Student("吴磊", 23, 179.6);
        students[1] = new Student("谢磊", 18, 185.0);
        students[2] = new Student("张磊", 19, 173.2);
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 制定比较规则
//                return o1.getAge() - o2.getAge(); // 按照年龄升序排序
                return Double.compare(o1.getHeight(), o2.getHeight()); // 比较浮点型
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
