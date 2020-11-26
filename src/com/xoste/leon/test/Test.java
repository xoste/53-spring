package com.xoste.leon.test;

import com.xoste.leon.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = applicationContext.getBean("peo2", People.class);
        System.out.println(people);
        System.out.println("---------------------------------------");

        // 可以获取到spring管理了几个对象
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
