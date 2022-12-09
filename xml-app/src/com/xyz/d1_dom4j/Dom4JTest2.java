package com.xyz.d1_dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Dom4JTest2 {
    public static void main(String[] args) throws Exception {
        // 解析xml中的数据成为一个List集合对象


        SAXReader saxReader = new SAXReader();

        Document document = saxReader.read(Dom4JTest2.class.getResourceAsStream("/Contacts.xml"));

        Element root = document.getRootElement();
        List<Element> contactEles = root.elements("contact");

        List<Contact> contacts = new ArrayList<>();

        for (Element contactEle : contactEles) {
            Contact contact = new Contact();
            contact.setId(Integer.valueOf(contactEle.attributeValue("id")));
            contact.setVip(Boolean.valueOf(contactEle.attributeValue("vip")));
            contact.setName(contactEle.elementTextTrim("name"));
            contact.setGender(contactEle.elementTextTrim("gender").charAt(0));
            contact.setEmail(contactEle.elementText("email"));


            contacts.add(contact);

        }

        for (Contact contact : contacts) {
            System.out.println(contact);
        }

    }
}
