package org.arpit.java2blog;

public class CountryInitDestroy {

    String countryName;

    public String getCountryName(){
        return countryName;
    }

    public void setCountryName(String countryName){
        this.countryName = countryName;
    }

    public void init()
    {
        System.out.println("In init block of countryInitDestroy");
    }

    public void destroy()
    {
        System.out.println("In destroy block of countryInitDestroy");
    }
}
