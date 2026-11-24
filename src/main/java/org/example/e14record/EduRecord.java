package org.example.e14record;


public record EduRecord(
        String name,
        int age
        //생성자와 getter 알아서 생성함.
        //레코드는 옆에 소괄호가 붙음
        //필드를 소괄호에 정의
){
}
// public class EduRecord {
//     private final String name;
//     private final int age;
//     //외부로부터 생성자를 전달 받은 값으로 초기화 하기때문에 바로 이꼴 선언 안함
//
//     public EduRecord(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
//
//     public String getName() {
//         return name;
//     }
//     //get + 필드명
//
//     //필드가 30개있다 그러면 게터도 30개되고 그럼...
//
//     public int getAge() {
//         return age;
//     }
// }
