package com.xyz.d1_dom4j;


import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import javax.print.Doc;
import java.io.File;
import java.io.InputStream;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.List;

/**
 * 导入dom4j框架
 * 准备XML文件
 */
public class Dom4JHelloWorldDemo1 {
    @Test
    public void parseXMLData() throws Exception {
        // 1.创建一个Dom4j的解析器对象,代表了整个dom4j框架
        SAXReader saxReader = new SAXReader();
        // 2.把XML文件加载到内存中成为一个Document文档对象
//        Document document = saxReader.read(new File(""));  // 需要通过模块名去定位
        InputStream is = Dom4JHelloWorldDemo1.class.getResourceAsStream("/contacts.xml");
        Document document = saxReader.read(is);

        // 3.获取根元素对象
        Element root = document.getRootElement();
        System.out.println(root.getName());


        // 4.拿根元素下的全部子元素对象

        List<Element> sonEles = root.elements("contact");
        for (Element sonEle : sonEles) {
            System.out.println(sonEle.getName());
        }


        // 拿某个子元素
        Element userEle = root.element("user");
        System.out.println(userEle.getName());

        // 默认提取第一个子元素对象
        Element contact = root.element("contact");
        // 获取子元素文本
        System.out.println(contact.elementText("name"));
        // 去掉前后空格
        System.out.println(contact.elementTextTrim("name"));


        // 根据元素获取属性值
        Attribute idAttr = contact.attribute("id");
        System.out.println(idAttr.getName() + "-->" + idAttr.getValue());
        // 直接提取属性值
        System.out.println(contact.attributeValue("id"));
        System.out.println(contact.attributeValue("vip"));

        // 获取当前元素下的子元素对象
        Element email = contact.element("email");
        System.out.println(email.getText());


        //
    }
}
