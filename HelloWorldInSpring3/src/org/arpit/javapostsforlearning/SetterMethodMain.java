package org.arpit.javapostsforlearning;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SetterMethodMain {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Country countryObj = (Country) appContext.getBean("CountryBean");
        String countryName = countryObj.getCountryName();
        String capitalName = countryObj.getCapital().getCapitalName();
        System.out.println(capitalName + " is capital of " + countryName);
    }
}
