package org.example.e06oop.inheritance;

public class FlyingFish extends Animal {
   //부모거를 상속받는 관계로 만들어준다 extends Animal

   public FlyingFish(String name, String residence){
      super(name, residence);
      System.out.println("날치 생성자");
      //자식에서 부모한테 접근하는 지시자.
      //부모인스턴스를 먼저 생성 한 후 자식이 호출하는것이다.
   }
   //클래스 안에 소속된 함수를 메서드라고 한다.
   public String flying(){
      // return String.format("%s이/가 날아갑니다", this.name) 여기서 this를 쓸수없음
      return String.format("%s이/가 날아갑니다",super.name);
   }
   //오버 라이딩(over riding): 부모에게서 상속받은 메소드를 재정의 하여 사용
   @Override
   public String living(){
      return "수정했다.";
   }
   //어노테이션이라고 함 많은 기능을 어노테이션으로 만들어둔다.
   //부모와의 메소드명, 파라미터명, 리턴 타입 일치해야한다.
}

//상속관계
//추상화를 통해 얻고자 하는것 코드 중복의 제거
//재사용을 위해 추상화를 하면 안됨.