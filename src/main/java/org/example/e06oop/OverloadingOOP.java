package org.example.e06oop;

public class OverloadingOOP {
    public static int add(int a){
        return a + 1;
    }
    public static int add(int a , int b){
        return a + b;
    }
//     파라미터 개수가 달라서 서로 다른거임. 시그니쳐부분만 다르면 오버로딩 됨. 리턴타입은 아무거나 해도
    // 상관없음
}
