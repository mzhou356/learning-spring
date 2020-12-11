package org.arpit.javapostsforlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAutowiringByTypeMain {

    public static void main(String[] args){
        ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContextAutowireByType.xml");
        CountryAutowire countryObj = (CountryAutowire) appContext.getBean("country");
        String countryName = countryObj.getCountryName();
        String capitalName = countryObj.getCapital().getCapitalName();
        System.out.println(capitalName+" is capital of "+countryName);
    }
}
