package com.xyz.d10_proxy2;

public interface UserService {
    String login(String loginName, String passWord);

    void deleteUser();

    String selectUsers();
}
