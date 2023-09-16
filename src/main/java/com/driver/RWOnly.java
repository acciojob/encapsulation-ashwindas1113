package com.driver;

public class RWOnly {
    private String name;
    String getter(){
        return this.name;
    }
    void setter(String input){
        this.name = input;
    }
}
