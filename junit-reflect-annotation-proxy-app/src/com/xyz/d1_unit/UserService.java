package com.xyz.d1_unit;

public class UserService {
    public String loginName(String loginName, String passWord) {
        if ("admin".equals(loginName) && "123456".equals(passWord)) {
            return "登录成功";
        } else {
            return "用户名或密码错误";
        }
    }

    public void selectNames() {
        System.out.println(10 / 0);
        System.out.println("查询全部名称成功");
    }
}
