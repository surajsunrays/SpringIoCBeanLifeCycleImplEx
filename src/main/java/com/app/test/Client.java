package com.app.test;

import com.app.bean.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Test t = (Test) context.getBean("t");
        t.save(2019,"Sunrays123","sunrays@1234.gmail.com");
    }
}
