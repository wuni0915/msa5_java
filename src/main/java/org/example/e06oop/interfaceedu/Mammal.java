package org.example.e06oop.interfaceedu;

abstract public class Mammal {
    protected  String name;
    protected String residence;

    public Mammal(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }


    public abstract String residence();

    public String birth(){
        return String.format("%s이/가 출산합니다.", this.name);
    }
}
