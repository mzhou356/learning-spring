package org.arpit.java2blog;

public class Country {
    String countryName;
    Capital capital;

    public Country(String countryName, Capital capital) {
        this.countryName = countryName;
        this.capital = capital;
    }
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName){
        this.countryName = countryName;
    }

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital){
        this.capital = capital;
    }

}
