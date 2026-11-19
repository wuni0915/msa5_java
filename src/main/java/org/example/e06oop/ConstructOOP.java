package org.example.e06oop;

public class ConstructOOP {
    private String name;
    private int age;
    //생성자 (constructor)메소드
    //클래스를 인스턴스화 할 때 최초 1회만 실행 되는 메소드
    //주로 객체의 초기화 또는 인스턴스 생성 시, 실행 되어야 할 작업을 위해 사용
    //기본 생성자: 개발자가 생성자를 별도로 정의하지 않으면 자동으로 생성 되는 생성자
    //생성자 메소드가 있어야 메모리에 올리는 작업을 시작한다. 없으면 안함.
    //생성자 메소드도 오버로딩이 가능
    //직접 생성자를 하나라도 만들면 기본 생성자는 자동으로 안 만들어져요
    //기본 생성자: 개발자가 생성자를 별도로 정의하지 않으면 자동으로 생성 되는 생성
    public ConstructOOP(){
        this("무명", 20);
    }


    //커스텀 생성자:
    public ConstructOOP(String name){
        this.name = name ;
        //this- 창조 변수/ 나 자신을 선택, 클래스 자기자신 (제일 큰 중괄호 안에서)/ 필드의 네임을 뜻함
        // = name 은 파라미터의 네임을 가져옴
    }
    public ConstructOOP(String name, int age){
        this(name);
        this.age = age;
        // this.name = name;
    }
    //밖에서 호출해올때 골라 가져올수 있도록 모든 경우의 수를 적어놓고
    //받아와야할 값을 반드시 지정해놔야 함. 없으면 에러가 뜬다.
}
