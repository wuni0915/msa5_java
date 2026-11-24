package org.example.e06oop.inheritance;

public class Whale extends Animal {
    //필드(Field):이 클래스가 가지고 있는 변수
    // public String name = "고래"; //인스턴스 변수
    // public static int age = 20; // 클래스 변수
    //인스턴스를 생성하지 않더라도 대문자 웨일에 . 하면 접근이 가능함.
    //인스턴스를 생성하지 않더라도 스태틱은 미리 올려논다.
    //모든 객체를 스태틱으로 하지 않는 이유 용량때문에.
    //여기저기서 사용될 가능성이 높은 애는 스태틱으로 해놓음.


    //이 변수가 특정 클래스 안에서 선언이 됨 > 인스턴스 변수
    //whale이라는 클래스를 인스턴스화 해야지 사용할 수 있는거기 때문에? 보충 필요
    //메소드(Method)
    // public void swimmimg(){
    //     System.out.println("고래가 헤엄칩니다.");
    //
    // }


    //선언만 해둔 상태
    // public Whale (String name, String residence){
    //     super(name, residence);
    // }
    // //클래스 안에 소속된 함수를 메서드라고 한다.
    // public String swimming(){
    //     return String.format("%s이/가 헤엄칩니다", super.name);
    // }
    public Whale(String name, String residence) {
        super(name, residence);
    }

    public String swimming() {
        return String.format("%s이/가 헤엄칩니다.", this.name);
    }
}
