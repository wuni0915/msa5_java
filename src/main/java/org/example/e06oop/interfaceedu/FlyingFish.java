package org.example.e06oop.interfaceedu;

class FlyingFish extends Fish implements Swim, Flight {
    FlyingFish() {
        super("날치", "바다");
    }

    @Override
    String residence() {
        return String.format("%s이/가 %s에 삽니다.", this.name, this.residence);
    }

    @Override
    public String swimming() {
        return String.format("%s이/가 수영을 합니다.", this.name);
    }

    @Override
    public String flying() {
        System.out.println(Flight.infoMsg);
        return String.format("%s이/가 날아갑니다.", this.name);
    }
}