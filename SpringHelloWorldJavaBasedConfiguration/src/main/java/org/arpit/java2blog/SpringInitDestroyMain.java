package org.arpit.java2blog;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInitDestroyMain {

    public static void main(String[] args){

        AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContextInitDestroy.xml");

        CountryInitDestroy countryObj = (CountryInitDestroy) appContext.getBean("countryInitDestroy");
        System.out.println("Country name: "+countryObj.getCountryName());
        appContext.registerShutdownHook();

        AbstractApplicationContext appContextDefault = new ClassPathXmlApplicationContext("ApplicationContextInitDestroyDefault.xml");

        CountryInitDestroy countryObjDefault = (CountryInitDestroy) appContextDefault.getBean("countryInitDestroy");
        System.out.println("Country name: "+countryObjDefault.getCountryName());
        appContextDefault.registerShutdownHook();
    }
}
