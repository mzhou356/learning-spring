package org.arpit.javapostsforlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Spring3HelloWorldMain {
    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("Spring3HelloWorld.xml");

        Spring3HelloWorld myBean = (Spring3HelloWorld) beanFactory.getBean("Spring3HelloWorldBean");

        myBean.printHello();
    }
}
