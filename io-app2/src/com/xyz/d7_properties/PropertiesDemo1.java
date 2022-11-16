package com.xyz.d7_properties;

import java.io.FileWriter;
import java.util.Map;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) throws Exception {
        // 需求:使用Properties把键值对信息存入到属性文件中去
        Properties properties = new Properties();
        properties.put("admin", "123456");
        properties.put("dlei", "003197");
        properties.put("heima", "itcast");

        System.out.println(properties);

/**
 * 参数1: 保存管道 字符输出流管道
 * 参数2: 保存心得
 */
        properties.store(new FileWriter("io-app2/src/users.properties"),"");


    }
}
