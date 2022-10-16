package com.xyz.d7_innerclass;

public class Test {
    /*
   了解局部内部类的语法(了解)
     */
    public static void main(String[] args) {
        class Cat {
            private String name;

            public static int onlineNumber = 100;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public static int getOnlineNumber() {
                return onlineNumber;
            }

            public static void setOnlineNumber(int onlineNumber) {
                Cat.onlineNumber = onlineNumber;
            }
        }
        Cat c = new Cat();
        c.setName("叮当猫");
    }
}
