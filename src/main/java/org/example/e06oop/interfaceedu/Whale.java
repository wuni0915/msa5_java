package org.example.e06oop.interfaceedu;

class Whale extends Mammal implements Swim{
    Whale(){
        super("고래", "바다");

    }
    @Override
    public String residence(){
        return String.format("%s이/가 %s에 삽니다.", super.name, super.residence);
    }
    public String swimming(){
        return String.format("%s이/가 헤엄칩니다.", this.name);
    }
}
