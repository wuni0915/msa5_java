package org.example.e06oop.polymophis;

public class PolymophismMain {
    public static void main(String[] args) {
        Whale whale1 = new Whale();
        Mammal whale2 = new Whale();
        //부모 타입으로 작성 가능 - 다형성의 가장 기초
        Monkey monkey1 = new Monkey();
        Mammal monkey2 = new Monkey();

        Mammal[] arr = new Mammal[5];
        arr[0] = new Whale();
        arr[1] = new Monkey();
        //배열로 비슷한 기능을 하는것들을 묶고싶을때.
        //마머라는 특징을 가진 애들을 다 모으고 싶은것.

        //---------------------
        // 업캐스팅: 자식 클래스가 부모 클래스 타입으로 캐스팅 되는 것.
        // 캐스팅:형변환, 즉 어떤 값이나 객체를 다른 타입으로 바꿔서 취급
        // -부모 클래스로 캐스팅 되면 자식 클래스에 있는 멤버에는 접근이 불가능
        Mammal upCasting1 = new Whale();
        // upCasting1.swimming(); 자식클래스의 swimming()접근 안됨

        // 다운 캐스팅: 업캐스팅한 인스턴스를 다시 본인의 데이터 타입으로 캐스팅 하는것.
        Whale downCasting1 = (Whale) upCasting1;
        downCasting1.swimming();
        //바꾸고 싶은 타입을 소괄호 후 변수 적기
        //Whale이라는 형태로 캐스팅을 하겠다.

        char a = '1';
        int b = (int) a;

        // Mammal mammal1 = new Mammal();
        // Whale whale3 = (Whale)mammal1;

    }
}
