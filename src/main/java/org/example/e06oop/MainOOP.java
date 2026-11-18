package org.example.e06oop;
//해당 클래스가 위치 하고 있는 주소
public class MainOOP {
    public static void main(String[] args) {
        //굉장히 특수한 메소드. 시작 지점이 메인 메소드(최초 호출 당하는 애)
        //jvm에서 이 메인 메소드를 호출
        Whale whale = new Whale();
//        메모리상에 whale이라는 함수를 올림 메모리에 올라와야 접근이 가능/ 생성자 메소드 호출
        FlyingFish flyingFish = new FlyingFish();
        System.out.println(whale.name);
        //접근 방법
//        int[] intArr = new int[3];
        //사용할 준비가 된거를 "인스턴스 화"라고 함
        whale.swimmimg();
        System.out.println(whale.age);
        whale.name = "돌고래";

        //접근 제어 지시자/ 캡슐화
        AccessModifier accessModifier = new AccessModifier();
        // accessModifier.

    // overloading
        //메소드의 시그니처가 다르거나, 동일한 이름을 가지는 메소드를 중복하여 정의
        System.out.println();
        System.out.println(OverloadingOOP.add(1));
        System.out.println(OverloadingOOP.add(1, 2));
    }
}
