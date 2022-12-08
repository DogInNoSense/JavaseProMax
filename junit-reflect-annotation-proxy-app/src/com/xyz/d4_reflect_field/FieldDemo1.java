package com.xyz.d4_reflect_field;

import org.junit.Test;

import java.lang.reflect.Field;

public class FieldDemo1 {
    @Test
    public void getDeclaredFields() {
        Class c = Student.class;
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "===>" + field.getType());
        }
    }

    @Test
    public void getDeclaredField() throws Exception {
        Class c = Student.class;
        Field f = c.getDeclaredField("age");
        System.out.println(f.getName() + "===>" + f.getType());


    }

    @Test
    public void setField() throws Exception {
        Class c = Student.class;
        Field ageF = c.getDeclaredField("age");
        // 暴力打开权限
        ageF.setAccessible(true);


        // 赋值
        Student s = new Student();
        ageF.set(s, 18); // s.setAge(18)
        System.out.println(s);

        // 取值
        int age = (int)ageF.get(s);
        System.out.println(age);
    }
}
