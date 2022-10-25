package com.xyz.d3_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("赵敏");
        lists.add("小昭");
        lists.add("素素");
        lists.add("灭绝");
        System.out.println(lists);

        for (String ele : lists) {
            System.out.println(ele);
        }

        double[] scores = {100, 99.5, 59.5};
        for (double score : scores) {
            System.out.println(score);
//            if (score == 59.5) {
//                score = 100;
//            }
            // 修改不了 改的是变量 数组没有影响
        }
    }
}
