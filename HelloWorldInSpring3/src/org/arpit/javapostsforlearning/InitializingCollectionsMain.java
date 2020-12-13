package org.arpit.javapostsforlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitializingCollectionsMain {

    public static void main(String[] args){
        ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContextInitializeCollections.xml");
        CountryInitCollections countryObj = (CountryInitCollections) appContext.getBean("CountryBean");
        countryObj.printListOfStates();
    }
}
