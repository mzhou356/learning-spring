package org.arpit.java2blog;

import org.arpit.java2blog.Capital;

public class CountryTwo {
    String countryName;
    Capital capital;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName){
        this.countryName = countryName;
    }

    public Capital getCapital() {
        return capital;
    }

    public String output(){
        return getCountryName()+"'s capital is "+capital.getCapitalName();
    }

    public void setCapital(Capital capital){
        this.capital = capital;
    }

}
