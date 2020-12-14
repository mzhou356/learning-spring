package org.arpit.java2blog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredAnnotationInSpringMain {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContextAnnotation.xml");

        CountryAnnotation countryObj = (CountryAnnotation) appContext.getBean("CountryBean");
        String countryName = countryObj.getCountryName();
        Capital capital = countryObj.getCapital();
        String capitalName = capital.getCapitalName();
        System.out.println(capitalName + " is capital of " + countryName);

    }
}
