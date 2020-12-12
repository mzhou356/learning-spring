package org.arpit.javapostsforlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopesInSpringMain {

    public static void main(String[] args){
        System.out.println("Test spring bean scope with default singleton scope type:");
        ApplicationContext appContext1 = new ClassPathXmlApplicationContext("ApplicationContextSingletonScope.xml");

        // Notice country1 and country 2 are the same instance in singleton scope
        CountryBeanScope country1 = (CountryBeanScope) appContext1.getBean("countryBeanScope");
        country1.setCountryName("India");
        CountryBeanScope country2 = (CountryBeanScope) appContext1.getBean("countryBeanScope");
        System.out.println("Country Name for country1: "+country1.getCountryName());
        System.out.println("Country Name for country2: "+country2.getCountryName());


        System.out.println("Test spring bean scope with prototype scope type: ");
        ApplicationContext appContext2 = new ClassPathXmlApplicationContext("ApplicationContextPrototype.xml");

        // Notice country1 and country 2 are the difference instances in prototype scope
        CountryBeanScope country3 = (CountryBeanScope) appContext2.getBean("countryBeanScope");
        country3.setCountryName("India");
        CountryBeanScope country4 = (CountryBeanScope) appContext2.getBean("countryBeanScope");
        System.out.println("Country Name for country3: "+country3.getCountryName());
        System.out.println("Country Name for country4: "+country4.getCountryName());
    }
}
