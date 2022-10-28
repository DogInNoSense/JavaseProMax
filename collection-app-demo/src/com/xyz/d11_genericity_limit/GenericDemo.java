package com.xyz.d11_genericity_limit;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<BWM> bwms = new ArrayList<>();
        bwms.add(new BWM());
        bwms.add(new BWM());
        bwms.add(new BWM());
        bwms.add(new BWM());
        go(bwms);

        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(bwms);
    }

    /*
    所有车比赛
     */

    public static void go(ArrayList<? extends Car> cars) {

    }
}

class BENZ extends Car {

}

class BWM extends Car {

}

// 父类
class Car {

}
