package org.example.e06oop.inheritance;

public class Animal {
    protected String name;
    protected String residence;

    public Animal(String name, String residence){
        this.name = name;
        this.residence = residence;
        System.out.println("동물 생성자");
    }
    public String breath(){
        return String.format("%s이/가 숨을 쉽니다.", this.name);

    }
    public String living(){
        return String.format("%s이/가 %s에서 삽니다.", this.name, this.residence);
    }
    //공통된 부분만 추상화를 통해 묶어왔다.
    //final
}
