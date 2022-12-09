package com.xyz.d10_proxy2;

public class Test {
    public static void main(String[] args) {
        UserService userService = ProxyUtil.getProxy(new UserServiceImpl());
        System.out.println(userService.login("admin", "123456"));
        System.out.println(userService.selectUsers());
        userService.deleteUser();
    }
}
