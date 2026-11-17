package org.example.e02operator;

public class e02operator {
    public static void main(String[] args){
        //void 이 자리는 리턴타입 자리다.
        //대입 연산자
        int num1 = 2;
        int num2 = 5;

        //산술 연산자
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 / num2);
        System.out.println(num1 + num2);
        System.out.println(num1 % num2);

        //산술 대입 연산자
        int num3 = 1;
        num3 = num3 +3;
        num3 += 3;
        num3 -= 3;
        num3 /= 3;
        num3 *= 3;
        num3 %= 3;

        //증감 연산자
        int num5 = 0;
        ++num5;
        System.out.println(num5++); //후위증감연산자 0이 먼저 찍히고 이후 num5가 1로 변화
        System.out.println(++num5); //전위증감연산자/ 1로 변화된거에 미리 계산 후 2가 출력
        //후속처리를 먼저 하고 연산을 하느냐 마느냐의 차이임.

        //비교연산자
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 == num2); //자바는 ==두개뿐임
        System.out.println(num1 != num2);

        //문자열의 비교
        String str1 = "str1";
        String str2 = "str1";
        String str3 = new String("str1");
//        str3은 주소값이 다름/ 전혀 다른 새로운 객체를 생성한것.
//        System.out.println(str1 == str2);
        System.out.println(str3 == str1); // 주소값이 달라서 false가 나온것.이거 다시 보기.

        //string pool 과 변수선언 메모리 별도 관리.
        System.out.println(str1.equals(str3));
        //문자열 비교할때는 반드시 equals 메소드 사용하기/ 실제로 가지고 있는 값들끼리 비교함.
        //인스턴스끼리 비교는 주소끼리 비교한단거다

        //논리 연산자
        int num10 = 0;
        int num11 = 2;
        System.out.println(num10 > 0 && num11 <= 11);
        System.out.println(num10 > 0 || num11 <= 11);
        System.out.println(!(num10 > 0));

        //삼합 연산자: true or false 딱 두 패턴으로만 나올때 삼합연산자를 쓸수있음
        String result = num1 > 2 ? "num1 크다" : "num1이 작다";
    }
}
