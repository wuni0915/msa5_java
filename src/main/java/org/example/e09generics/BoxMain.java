package org.example.e09generics;
        //모든 데이터 타입에 대응하는 박스를 다 만들어야함 데이터 타입의 수 만큼.
        //다만 만들어지는 클래스가 늘어남이 무궁함  여기서 제네릭스 개념 등장

public class BoxMain {
    public static void main(String[] args) {
        Box<int[]> boxIntArr = new Box<>(new int[4]);
        Box<String[]> boxStringArr = new Box<>(new String[3]);
        // boxStringArr.arr
        // Box<int>;
        //타입 아규먼트는 프라이미티브 타입 지정 금지임. int의 레퍼런스의 타입
        Box<Integer> boxInt = new Box<>(1);
        //제네릭스는 인스턴스 할 떄 정해진다. 뭔가 인스턴스에서 더 나아간 느낌이네
        //달라지는 것: Box 클래스 하나로 여러 타입을 담되, 어떤 타입을 담는지 컴파일러가 알게 됨
        System.out.println(boxIntArr);
        System.out.println(boxStringArr);
        //후입 선출~
        Integer a = 1;
        //인테저라는 클래스를 wrapper클래스라고 함
        //wrapper안에 있는 원래형태를 꺼내는걸 언박싱이라함
        int b = a;
        //이거 참조형아닌가.? 주소값이 바뀐게 아니고 자료값 위에 박스로 감싼거라?
        //autoCasting
        // BoxRestrict<Tv> boxRestrict1 = new BoxRestrict<>();
        // BoxRestrict<Mobile> boxRestrict2 = new BoxRestrict<>();
        // BoxRestrict<Novel> boxRestrict3 = new BoxRestrict<>();
    }
}
