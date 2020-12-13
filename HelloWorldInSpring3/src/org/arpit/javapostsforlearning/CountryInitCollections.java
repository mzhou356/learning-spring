package org.arpit.javapostsforlearning;

import java.util.List;

public class CountryInitCollections {
    String countryName;
    List<String> listOfStates;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List getListOfStates() {
        return listOfStates;
    }

    public void setListOfStates(List listOfStates) {
        this.listOfStates = listOfStates;
    }

    public void printListOfStates()
    {
        System.out.println("Some of states in USA are:");
        for(String state:listOfStates)
        {
            System.out.println(state);
        }
    }
}
