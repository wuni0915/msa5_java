package org.example.e01datatype;

public class E01DataType {
    public void execute(){
        boolean bool = true;
        bool = false;
        System.out.println(bool);
        System.out.println(bool);
        //시스템이라는 객체에 아웃이라는 프로퍼티에
        System.out.printf("현재 변수 bool의 값은 %s", bool);
        //문자열로 넣는 형태

        //변수 선언
        int age;
        //값을 대입 안한 상태는 저장공간만 만든것.
        age = 1;
        age = 'a';
        //아스키코드로 동작해서 인트형에 문자형도 가능은 하나 지양한다.
        //변수 선언 및 초기화
        char ch = 'a';
        String str = "abc";

        //상수 : 변경 불가능-콘스트같은것.
        final String USER_NAME = "길동이";
        // USER_NAME = "sad";

        // Underscore 표기법
        int num = 1_020_304_010;

        //두 변수의 값을 스와핑 해보자.
        int swap1 = 1;
        int swap2 = 2;

        int swap;

        swap = swap1;
        swap1 = swap2;
        swap2 = swap;

        // 데이터 타입

        boolean bool2 = true;

        byte bt = -128;  // -128 ~ 127까지임 넘어가면 인트 넣으려고한다라고 에러뜸
        short sh = 32767;
        int integer = 2147483647;
        long longer = 2147483648L; //L필수 안넣으면 불안전.

        double db = 3.141592;
        float ft = 3.141592F; // float 타입은 F필수

        char ch1 = 'g';
    }
}
