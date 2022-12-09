package com.xyz.d10_proxy2;

public class UserServiceImpl implements UserService {


    @Override
    public String login(String loginName, String passWord) {
        String rs = "登陆名和密码错误";
        if ("admin".equals(loginName) && "123456".equals(passWord)) {
            rs = "登陆成功";
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public void deleteUser() {
        long startTime = System.currentTimeMillis();

        try {
            System.out.println("您正在删除用户中...");
            Thread.sleep(2500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String selectUsers() {

        String rs = "查询了10000个用户数";

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
