package org.example.e06oop;

import org.example.e06oop.inheritance.FlyingFish;
import org.example.e06oop.inheritance.Whale;

//해당 클래스가 위치 하고 있는 주소
public class MainOOP {
    public static void main(String[] args) {
        //굉장히 특수한 메소드. 시작 지점이 메인 메소드(최초 호출 당하는 애)
        //jvm에서 이 메인 메소드를 호출
//         Whale whale = new Whale();
// //        메모리상에 whale이라는 함수를 올림 메모리에 올라와야 접근이 가능/ 생성자 메소드 호출
//         FlyingFish flyingFish = new FlyingFish();
//         System.out.println(whale.name);
//         //접근 방법
// //        int[] intArr = new int[3];
//         //사용할 준비가 된거를 "인스턴스 화"라고 함
//         whale.swimmimg();
//         System.out.println(whale.age);
//         whale.name = "돌고래";

        //접근 제어 지시자/ 캡슐화
        AccessModifier accessModifier = new AccessModifier();
        // accessModifier.

    // overloading
        //메소드의 시그니처가 다르거나, 동일한 이름을 가지는 메소드를 중복하여 정의
        System.out.println();
        System.out.println(OverloadingOOP.add(1));
        System.out.println(OverloadingOOP.add(1, 2));
        //---------------------------
        //상속

        FlyingFish flyingFish = new FlyingFish("날치", "바다");
        //생성자 처리 다 하고 인스턴스 사용 가능
        //부모를 먼저 올림 그러고 자식의 생성자 처리 그러고 자식 인스턴스 만들고 자식 인스턴스가 부모 인스턴스
        //참조하는 형식
        System.out.println(flyingFish.breath());
        System.out.println(flyingFish.flying());
        System.out.println(flyingFish.living());

        Whale whale = new Whale("고래", "바다");
        System.out.println(whale.breath());
        System.out.println(whale.swimming());
        System.out.println(whale.living());
    }





}
