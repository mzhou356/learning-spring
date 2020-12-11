package org.arpit.java2blog;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAutowiringByNameMain {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContextAutowireByName.xml");

        CountryTwo countryObj = (CountryTwo) appContext.getBean("country");
//        System.out.println(countryObj.output());
        String countryName = countryObj.getCountryName();
        String capitalName = countryObj.getCapital().getCapitalName();
        System.out.println(capitalName + " is capital of " + countryName);
    }
}

