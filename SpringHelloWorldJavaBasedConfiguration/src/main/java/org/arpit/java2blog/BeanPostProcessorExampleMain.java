package org.arpit.java2blog;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorExampleMain {

    public static void main(String[] args){

        AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContextBeanPP.xml");
        CountryBeanPostProcessor country = (CountryBeanPostProcessor) appContext.getBean("country");
        System.out.println("Country Name: "+country.getCountryName());
        appContext.registerShutdownHook();
    }
}
