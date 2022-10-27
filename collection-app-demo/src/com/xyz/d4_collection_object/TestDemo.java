package com.xyz.d4_collection_object;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo {
    public static void main(String[] args) {
        // 1.定义一个电影类
        // 2.定义一个集合存储3部电影对象
        // 3.遍历集合的每个电影对象

        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("肖申克的救赎", 9.9, "actor1"));
        movies.add(new Movie("美丽心灵", 9.9, "actor2"));
        movies.add(new Movie("星际穿越", 9.9, "actor3"));

        System.out.println(movies);

        // 遍历
        for (Movie movie : movies) {
            System.out.println("片名:" + movie.getName());
            System.out.println("得分:" + movie.getScore());
            System.out.println("主演:" + movie.getActor());
        }
    }
}
