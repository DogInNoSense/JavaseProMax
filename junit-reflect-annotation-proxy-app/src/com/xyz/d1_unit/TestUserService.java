package com.xyz.d1_unit;


import org.junit.*;


public class TestUserService {
    // 修饰实例方法
    // 每个测试方法之前测试一次
    @Before
    public void before() {
        System.out.println("before执行一次");
    }

    // 每个测试方法之后执行一次
    @After
    public void after() {
        System.out.println("after执行一次");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass执行一次");
    }

    // 每个测试方法之后执行一次
    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass执行一次");
    }


    /**
     * 测试方法
     * 1. 必须是公开的 无参数 无返回值的方法
     * 2. Test方法必须使用@Test注解标记
     */
    @Test
    public void testLoginName() {
        UserService userService = new UserService();
        String rs = userService.loginName("admin", "123456");
        // 进行预期结果的正确性测试
        Assert.assertEquals("您的功能业务可能出现问题", "登录成功", rs);
    }

    @Test
    public void testSelectNames() {
        UserService userService = new UserService();
        userService.selectNames();
    }
}
