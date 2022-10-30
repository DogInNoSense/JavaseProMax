package d4_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// 斗地主游戏

public class GameDemo {
    /*
    1. 定义一个静态的集合存储54张牌对象
     */
    public static List<Card> allCards = new ArrayList<>();

    /*
    2. 定义静态代码块初始化牌数据
     */
    static {
        // 3.定义点数,个数确定,类型确定,使用数组
        String sizes[] = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        // 4.定义花色
        String colors[] = {"♦", "♥", "♣", "♠"};
        // 5.组合点数花色
        int index = 0; // 记录牌的实际大小
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                // 封装成一个牌对象
                Card c = new Card(sizes[i], colors[j], index);
                // 存入到集合容器中去
                allCards.add(c);
                index++;

            }
        }
        // 8.大小王存入到集合对象中去
        Card c1 = new Card("", "🃏", ++index);
        Card c2 = new Card("", "🃏", ++index);
        Collections.addAll(allCards, c1, c2);
        System.out.println("新牌:" + allCards);
    }

    public static void main(String[] args) {
        // 9.洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后:" + allCards);

        // 10.发牌(定义3个玩家,每个玩家的牌也是一个集合容器)
        List<Card> gamer1 = new ArrayList<>();
        List<Card> gamer2 = new ArrayList<>();
        List<Card> gamer3 = new ArrayList<>();

        // 11.发牌
//        allCards = [10♥, 6♣, 3♦, A♦, J♣...]
        for (int i = 0; i < allCards.size() - 3; i++) {
            // 先拿到当前牌对象
            Card c = allCards.get(i);
            if (i % 3 == 0) {
                gamer1.add(c);
            } else if (i % 3 == 1) {
                gamer2.add(c);
            } else if (i % 3 == 2) {
                gamer3.add(c);
            }
        }

        // 12.拿到最后三张底牌(把最后三张牌截取成一个子集合)
        List<Card> lasThreeCards = allCards.subList(allCards.size() - 3, allCards.size()); // 包前不包后

        // 13.给玩家的牌排序(大到小)
        // 调用collections的sort方法
        sortCards(gamer1);
        sortCards(gamer2);
        sortCards(gamer3);

        // 14.输出玩家的牌
        System.out.println("gamer1的牌是:" + gamer1);
        System.out.println("gamer2的牌是:" + gamer2);
        System.out.println("gamer3的牌是:" + gamer3);


    }

    /**
     * 给牌排序
     *
     * @param cards
     */
    private static void sortCards(List<Card> cards) {
        // 给牌排序
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getIndex() - o1.getIndex();
            }
        });
    }
}
