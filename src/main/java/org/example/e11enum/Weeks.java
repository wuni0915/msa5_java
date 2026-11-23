package org.example.e11enum;

public enum Weeks {
    // Enum: 상수의 집합을 편리하게 선언하고 사용하기 위해서 만든 객체
    MONDAY("월요일", 1),
    TUESDAY("화요일", 2),
    WEDNESDAY("수요일", 3),
    THURSDAY("목요일", 4),
    FRIDAY("금요일", 5),
    SATURDAY("토요일", 6),
    SUNDAY("일요일", 7);
    //각각 위크스라는 별개의 인스턴스로 만들어진다.
    //생성자 메서드 호출할 때 값 넣어주기
    // 내부적으로 0부터 넘버가 부여됨 <-오디너리티라함/ 데이터 관계와 상관없이 무조건 작성 순서로만 부여됨.

    private final String KrDay;
    private final int dayNum;
    //private로 해야 값이 변경이 안됨.
    //Getter 메서드
    private Weeks(String KrDay, int dayNum){
        this.KrDay = KrDay;
        this.dayNum = dayNum;

    }

    public String getKrDay() {
        return KrDay;
    }

    public int getDayNum() {
        return dayNum;
    }
};

// public class Weeks {
//     //객체 지향적으로 다루기 위해.
//     public static final String MONDAY = "월요일";
//     public static final String TUESDAY = "화요일";
//
//     public static String convertKrToEn(String day){
//         switch (day){
//             case Weeks.MONDAY:
//                 return "MONDAY";
//             case Weeks.TUESDAY:
//                 return "TUESDAY";
//             default:
//                 return "";
//
//         }
//     }
//     //이렇게 하나하나 넣어줘야하는 문제점들이 발생 할 수 있다.
//
// }
