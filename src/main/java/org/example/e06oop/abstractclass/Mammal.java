package org.example.e06oop.abstractclass;

public abstract class Mammal {
    protected String name;
    protected String residence;

    public String breath(){
        return String.format("%s이/가 숨을 쉽니다.", this.name);
    }

    //추상 메소드(앱스트랙트): 상속 관계에서 자식 클래스에게 특정 기능을 반드시 구현하도록 강제하는 메소드.
    public abstract String living ();
    //구현구가 없는 상태가 추상 메소드임 선언문만 존재

}
