package org.arpit.java2blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class CountryAnnotation {

    String countryName;

    @Autowired
    @Qualifier("capitalA")
    Capital capital;

    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public Capital getCapital() {
        return capital;
    }

    @Required
    public void setCapital(Capital capital){
        this.capital = capital;
    }
}


