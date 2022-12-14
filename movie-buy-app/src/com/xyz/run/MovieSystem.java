package com.xyz.run;

import ch.qos.logback.core.hook.DelayingShutdownHook;
import com.xyz.bean.Business;
import com.xyz.bean.Customer;
import com.xyz.bean.Movie;
import com.xyz.bean.User;
import org.slf4j.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class MovieSystem {
    /*
    定义系统的数据容器用户存储数据
    1. 存储很多用户(客户对象,商家对象)
     */
    public static final List<User> All_USERS = new ArrayList<>();

    /*
    2.存储系统全部商家和其排片信息(键值对)
     */
    public static final Map<Business, List<Movie>> All_MOVIES = new HashMap<>();
    public static final Scanner SYS_SC = new Scanner(System.in);
    // 定义一个静态的User类型的变量记录当前登录成功的用户对象
    public static User loginUser;
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public static final Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class");

    /*
    3.准备一些测试数据
     */
    static {
        Customer c = new Customer();
        c.setLoginName("zyf888");
        c.setPassWord("123456");
        c.setUserName("黑马刘德华");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("110110");
        All_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("gzl888");
        c1.setPassWord("123456");
        c1.setUserName("黑马关之琳");
        c1.setSex('女');
        c1.setMoney(2000);
        c1.setPhone("111111");
        All_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassWord("123456");
        b.setUserName("黑马包租公");
        b.setMoney(0);
        b.setSex('男');
        b.setPhone("110110");
        b.setAddress("火星6号2B二层");
        b.setShopName("甜甜圈国际影城");
        All_USERS.add(b);
        // 注意商家一定要加入到店铺排片信息中去
        List<Movie> movies = new ArrayList<>();
        All_MOVIES.put(b, movies);


        Business b2 = new Business();
        b2.setLoginName("baozugong888");
        b2.setPassWord("123456");
        b2.setUserName("黑马包租公");
        b2.setMoney(0);
        b2.setSex('男');
        b2.setPhone("110110");
        b2.setAddress("火星6号2B二层");
        b2.setShopName("甜甜圈国际影城");
        All_USERS.add(b2);
        List<Movie> movies2 = new ArrayList<>();
        All_MOVIES.put(b2, movies2);

        Business b3 = new Business();
        b3.setLoginName("baozupo888");
        b3.setPassWord("123456");
        b3.setUserName("黑马包租婆");
        b3.setMoney(0);
        b3.setSex('女');
        b3.setPhone("110110");
        b3.setAddress("火星8号4B五层");
        b3.setShopName("巧克力国际影城");
        All_USERS.add(b3);
        List<Movie> movies3 = new ArrayList<>();
        All_MOVIES.put(b3, movies3);

    }

    /*
    首页展示
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("黑马电影首页");
            System.out.println("1.登陆");
            System.out.println("2.用户注册");
            System.out.println("3.商家注册");

            System.out.println("请输入操作命令:");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    // 登陆
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("命令有误,请确认!");
            }
        }

    }

    /**
     *
     */
    private static void login() {
        while (true) {
            System.out.println("请输入登录名称");
            String loginName = SYS_SC.nextLine();
            System.out.println("请您输入登陆密码:");
            String passWord = SYS_SC.nextLine();


            // 1.根据登陆名称查询用户对象
            User u = getUserByLoginName(loginName);
            // 2.判断用户对象是否存在,存在说明登录名称正确了
            if (u != null) {
                // 3.比对密码是否正确
                if (u.getPassWord().equals(passWord)) {
                    // 登录成功了
                    loginUser = u; // 记住登录成功的用户
                    LOGGER.info(u.getUserName() + "登录了系统");
                    //判断是用户登录还是商家登录
                    if (u instanceof Customer) {
                        // 用户
                        showCustomerMain();
                    } else {
                        showBusinessMain();
                    }
                    return;
                } else {
                    System.out.println("密码不正确");
                }
            } else {
                System.out.println("登录名称错误,请确认!");
            }
        }
    }

    /**
     * 商家操作界面
     */

    private static void showBusinessMain() {
        while (true) {
            System.out.println("=====================黑马电影商家界面=======================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士") + "您好,请选择商家操作的功能");
            System.out.println("1.展示详情");
            System.out.println("2.上架电影");
            System.out.println("3.下架电影");
            System.out.println("4.修改电影");
            System.out.println("5.退出");
            System.out.println("请输入您要操作的命令");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    // 展示全部信息
                    showBusinessInfos();
                    break;
                case "2":
                    // 上架电影信息
                    addMovies();
                    break;
                case "3":
                    // 下架电影信息
                    deleteMovies();
                    break;
                case "4":
                    // 修改电影信息
                    updateMovies();
                    break;
                case "5":
                    System.out.println(loginUser.getUserName() + "您好,您成功退出了系统!");
                    return; //结束方法
                default:
                    System.out.println("不存在该命令!");
                    break;
            }
        }
    }

    /**
     * 影片修改功能
     */

    private static void updateMovies() {
        System.out.println("=====================修改电影============================");
        Business business = (Business) loginUser;
        List<Movie> movies = All_MOVIES.get(business); // 拿到影片信息
        if (movies.size() == 0) {
            System.out.println("当前无影片可以修改");
            return;
        } else {

        }
        // 让用户输入需要修改的电影名称
        System.out.println("请输入需要修改的电影名称");
        String movieName = SYS_SC.nextLine();

        // 去查询有没有这个影片对象
        Movie movie = getMovieByName(movieName);
        if (movie != null) {
            // 修改
            System.out.println("请输入修改后的片名");
            String name = SYS_SC.nextLine();
            System.out.println("请输入修改后的主演");
            String actor = SYS_SC.nextLine();
            System.out.println("请输入修改后的时长");
            String time = SYS_SC.nextLine();
            System.out.println("请输入修改后的票价");
            String price = SYS_SC.nextLine();
            System.out.println("请输入修改后的票数");
            String totalNumber = SYS_SC.nextLine();
            while (true) {
                try {
                    System.out.println("请输入修改后的影片放映时间");
                    String stime = SYS_SC.nextLine();
                    movie.setName(name);
                    movie.setActor(actor);
                    movie.setPrice(Double.valueOf(price));
                    movie.setTime(Double.valueOf(time));
                    movie.setNumber(Integer.valueOf(totalNumber));
                    movie.setStartTime(sdf.parse(stime));
                    System.out.println("恭喜您,成功修改了该影片了!");
                    showBusinessInfos();
                    return; // 直接退出
                } catch (ParseException e) {
                    e.printStackTrace();
                    LOGGER.info("时间解析出错");
                }
            }
        } else {
            System.out.println("您的店铺没有上架该影片!");
            System.out.println("请问继续修改吗? y/n");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "y":
                    deleteMovies();
                    break;
                default:
                    System.out.println("好的!");
                    return;
            }
        }
    }

    /**
     * 展示当前登录的商家的全部信息
     */
    private static void showBusinessInfos() {
        // 根据商家对象,作为Map集合的键 提取对应的值就是排片信息: Map<Business,List<Movie>>ALL_MOVIES
        System.out.println("==================商家详情界面=================");
        LOGGER.info(loginUser.getUserName() + "商家,正在看自己的详情");
        Business business = (Business) loginUser;
        System.out.println(business.getShopName() + "\t\t电话" + business.getPhone() + "\t\t地址" + business.getAddress() + "\t\t余额" + business.getMoney());
        List<Movie> movies = All_MOVIES.get(business); // 拿到影片信息
        if (movies.size() > 0) {
            System.out.println("片名\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t\t" + movie.getActor() + "\t\t" + movie.getTime() + "\t\t" + movie.getScore() + "\t\t"
                        + movie.getPrice() + "\t\t" + movie.getNumber() + "\t\t" + sdf.format(movie.getStartTime()));
            }
        } else {
            System.out.println("您的店铺当前无片可播!");
        }

    }

    /**
     * 影片下架功能
     */
    private static void deleteMovies() {
        System.out.println("=====================下架电影============================");
        Business business = (Business) loginUser;
        List<Movie> movies = All_MOVIES.get(business); // 拿到影片信息
        if (movies.size() == 0) {
            System.out.println("当前无影片可以下架");
            return;
        } else {
            // 让用户输入需要下架的电影名称
            System.out.println("请输入需要下架的电影名称");
            String movieName = SYS_SC.nextLine();

            // 去查询有没有这个影片对象
            Movie movie = getMovieByName(movieName);
            if (movie != null) {
                // 下架
                movies.remove(movie);
                System.out.println("您当前店铺已经成功下架:" + movie.getName());
            } else {
                System.out.println("您的店铺没有上架该影片");
                System.out.println("请问继续下架吗? y/n");
                String command = SYS_SC.nextLine();
                switch (command) {
                    case "y":
                        deleteMovies();
                        break;
                    default:
                        System.out.println("好的!");
                        return;
                }
            }
        }

    }

    /*
    去查询当前商家的排片
     */
    public static Movie getMovieByName(String movieName) {
        Business business = (Business) loginUser;
        List<Movie> movies = All_MOVIES.get(business); // 拿到影片信息
        for (Movie movie : movies) {
            if (movie.getName().contains(movieName)) {
                // 模糊匹配
                return movie;
            }
        }
        return null;
    }

    /**
     * 商家进行电影上架
     */
    private static void addMovies() {
        System.out.println("=====================上架电影============================");
        Business business = (Business) loginUser;
        System.out.println(business.getShopName() + "\t\t电话" + business.getPhone() + "\t\t地址" + business.getAddress());
        List<Movie> movies = All_MOVIES.get(business); // 拿到影片信息

        System.out.println("请输入新片名");
        String name = SYS_SC.nextLine();
        System.out.println("请输入主演");
        String actor = SYS_SC.nextLine();
        System.out.println("请输入时长");
        String time = SYS_SC.nextLine();
        System.out.println("请输入票价");
        String price = SYS_SC.nextLine();
        System.out.println("请输入票数");
        String totalNumber = SYS_SC.nextLine();
        while (true) {
            try {
                System.out.println("请输入影片放映时间");
                String stime = SYS_SC.nextLine();
                Movie movie = new Movie(name, actor, Double.valueOf(time), Double.valueOf(price), Integer.valueOf(totalNumber),
                        sdf.parse(stime));
                movies.add(movie);
                System.out.println("成功上架了:" + movie.getName());
                return; // 直接退出
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.info("时间解析出错");
            }
        }

    }


    /**
     * 客户操作界面
     */
    private static void showCustomerMain() {
        while (true) {
            System.out.println("=====================黑马电影用户界面=======================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士") + "您好,请选择用户操作的功能" + "\t余额:"
                    + loginUser.getMoney());
            System.out.println("1.展示全部影片信息功能");
            System.out.println("2.根据电影名称查询电影信息");
            System.out.println("3.评分功能");
            System.out.println("4.购票功能");
            System.out.println("5.退出系统");
            System.out.println("请输入您要操作的命令");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    // 展示全部排片信息
                    showAllMovies();
                    break;
                case "2":
                    // 查询电影信息
                    break;
                case "3":
                    // 评分功能

                    break;
                case "4":
                    // 购票功能
                    buyMovie();
                    break;
                case "5":
                    return; //结束方法
                default:
                    System.out.println("不存在该命令!");
                    break;
            }
        }
    }

    /**
     * 用户购票功能: 展示全部商家和其排片信息
     */
    private static void buyMovie() {
        showAllMovies();
        System.out.println("==================用户购票功能==================");
        while (true) {
            System.out.println("请您输入需要买票的门店:");
            String shopName = SYS_SC.nextLine();
            // 1.查询是否存在该商家
            Business business = getBusinessByShopName(shopName);
            if (business == null) {
                System.out.println("对不起,没有该店铺!请确认");
            } else {
                // 2.此商家全部的排片
                List<Movie> movies = All_MOVIES.get(business);
                // 3.判断是否存在上映的电影
                if (movies.size() > 0) {
                    // 4.开始进行选片购买
                    while (true) {
                        System.out.println("请您输入要购买的电影名称:");
                        String movieName = SYS_SC.nextLine();
                        // 去当前商家下,查询该电影对象
                        Movie movie = getMovieByShopName(business, movieName);
                        if (movie != null) {
                            // 开始购买
                            while (true) {
                                System.out.println("请输入要购买的电影票数:");
                                String number = SYS_SC.nextLine();
                                int buyNumber = Integer.valueOf(number);
                                // 判断电影是否购票
                                if (movie.getNumber() >= buyNumber) {
                                    // 可以购买
                                    // 当前需要花费的金额
                                    double money = BigDecimal.valueOf(movie.getPrice()).multiply(BigDecimal.valueOf(buyNumber)).doubleValue();
                                    if (loginUser.getMoney() >= money) {
                                        // 可以买票了
                                        System.out.println("您成功购买了" + movie.getName() + buyNumber + "张票!总金额是:" + money);
                                        // 更新自己的金额 更新商家的金额
                                        loginUser.setMoney(loginUser.getMoney() - money);
                                        business.setMoney(business.getMoney() + money);
                                        movie.setNumber(movie.getNumber() - buyNumber);
                                        return;

                                    } else {
                                        // 钱不够
                                        System.out.println("是否继续买票?y/n");
                                        String command = SYS_SC.nextLine();
                                        switch (command) {
                                            case "y":
                                                break;
                                            default:
                                                System.out.println("好的!");
                                                return;
                                        }
                                    }
                                } else {
                                    // 票数不够
                                    System.out.println("您当前最多可以购买:" + movie.getNumber());
                                    System.out.println("是否继续买票?y/n");
                                    String command = SYS_SC.nextLine();
                                    switch (command) {
                                        case "y":
                                            break;
                                        default:
                                            System.out.println("好的!");
                                            return;
                                    }
                                }
                            }
                        } else {
                            System.out.println("电影名称不对!");
                        }
                    }
                } else {
                    System.out.println("该电影院关门了~~~");
                    System.out.println("是否继续买片?y/n");
                    String command = SYS_SC.nextLine();
                    switch (command) {
                        case "y":
                            break;
                        default:
                            System.out.println("好的!");
                            return;
                    }
                }
            }
        }
    }

    public static Movie getMovieByShopName(Business business, String name) {
        List<Movie> movies = All_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().contains(name)) {
                return movie;
            }
        }
        return null;
    }

    /***
     * 根据商家店铺名称查询商家对象
     * @return
     */
    public static Business getBusinessByShopName(String shopName) {
        Set<Business> businesses = All_MOVIES.keySet();
        for (Business business : businesses) {
            if (business.getShopName().equals(shopName)) {
                return business;
            }
        }
        return null;
    }

    /**
     * 展示全部商家和其排片信息
     */
    private static void showAllMovies() {
        System.out.println("展示全部影片信息");
        All_MOVIES.forEach((business, movies) -> {
            System.out.println(business.getShopName() + "\t\t电话" + business.getPhone() + "\t\t地址" + business.getAddress());
            System.out.println("\t\t\t片名\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println("\t\t\t" + movie.getName() + "\t\t\t" + movie.getActor() + "\t\t" + movie.getTime() + "\t\t" + movie.getScore() + "\t\t"
                        + movie.getPrice() + "\t\t" + movie.getNumber() + "\t\t" + sdf.format(movie.getStartTime()));
            }
        });
    }

    public static User getUserByLoginName(String loginName) {
        for (User user : All_USERS) {
            // 判断这个用户的登陆名称是否是我们想要的
            if (user.getLoginName().equals(loginName)) {
                return user;
            }
        }
        return null;
    }
}
