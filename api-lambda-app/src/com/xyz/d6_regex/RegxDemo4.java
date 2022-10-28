package com.xyz.d6_regex;

public class RegxDemo4 {
    public static void main(String[] args) {
        // 按照正则表达式分割字符串,返回一个字符串数组
        String name = "小王werwed小刘wqeq小狗";
        String name1 = "丁学东、丁薛祥、万立骏、习近平、马兴瑞、马晓伟、王宁、王凯（河南）、" +
                "王凯（解放军）、王勇、王浩、王强、王鹏、王毅、王小洪、王广华、王仁华、王文全、王文涛、王予波、王正谱、王东明、王伟中、王志军、王秀斌、王沪宁、" +
                "王君正、王忠林、王受文、王春宁、王莉霞（女，蒙古族）、王晓晖、王祥喜、王清宪、王蒙徽、巨乾生、毛伟明、尹力、尹弘、巴特尔（蒙古族）、" +
                "艾尔肯·吐尼亚孜（维吾尔族）、石泰峰、叶建春、冯飞、曲青山、任振鹤（土家族）、庄荣文、刘宁、刘伟、刘小明、刘发庆、刘青松、刘国中、刘金国、刘建超" +
                "、刘俊臣、刘振立、刘海星、齐玉、许勤、许昆林、许学强、孙金龙、孙绍骋、阴和俊、严金海（藏族）、李屹、李伟、李希" +
                "、李强、李干杰、李小新（女）、李凤彪、李书磊、李玉超、李乐成、李邑飞、李尚福、李国英、李炳军、李桥铭、李晓红、李鸿忠、杨诚、杨志亮" +
                "、杨学军、肖捷、肖培、吴汉圣、吴亚男、吴政隆、吴晓军、何卫东、何立峰、何宏军、邹加怡（女）、应勇、汪海江、沈春耀、沈晓" +
                "明、沈跃跃（女）、怀进鹏、张工、张军（最高检）、张林、张又侠、张升民、张玉卓、张庆伟、张红兵、张宏森、张雨浦（回族）、张国" +
                "清、陆昊、陆治原、陈刚、陈旭（女）、陈一新、陈小江、陈文清、陈吉宁、陈敏尔、努尔兰·阿不都满金（哈萨克族）、" +
                "苗华、林武、林向阳、易会满、易炼红、罗文、金壮龙、金湘军、周强、周乃翔、周祖翼、郑栅洁、郑新聪、孟凡利、孟祥锋、赵" +
                "龙、赵刚、赵一德、赵乐际、赵晓哲、郝鹏、胡中明、胡玉亭、胡昌升、胡和平、胡春华、胡衡华、钟绍军、信长星、侯凯、侯建国、俞庆" +
                "江、俞建华、贺荣（女）、贺军科、秦刚、秦树桐、袁华智、袁家军、铁凝（女）、倪虹、倪岳峰、徐麟、徐西盛、徐忠波、徐起零、徐德清、殷勇、" +
                "高翔、高志丹、郭普校、唐仁健、唐登杰、黄铭、黄强、黄守宏、黄坤明、黄建发、黄晓薇（女）、龚正、常丁求、庹震、梁言顺、梁惠玲（女）、谌贻琴（女，白族）、董军、韩俊、韩文秀、景俊海、程丽华（女）、傅华、童建明、谢春涛、蓝天立（壮族）、蓝" +
                "佛安、楼阳生、雷凡培、慎海雄、蔡奇、蔡剑江、裴金佳、潘岳";
        String arrs[] = name.split("\\w+"); //加号代表至少出现一位以上
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }

        String name2 = name.replaceAll("\\w+", "  ");
        System.out.println(name2);

        String name3 = name1.replaceAll("、", " ");
        System.out.println(name3);
    }
}