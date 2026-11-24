package org.example.e12stream;

import java.util.ArrayList;
import java.util.List;

public class MainStream {
    //자바의 예약어(키워드)는 클래스명뿐 아니라 변수명, 메서드명, 패키지명 등 모든 식별자로 쓸 수 없어요. 컴파일 에러가 나요.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //int는 안돼서 integer한거임
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);
//List (인터페이스): "이런 메서드들이 있어야 해"라는 약속만 정의해요. (add, get 등의 틀)
// ArrayList (클래스): 그 약속을 실제로 구현했어요. 내부적으로 배열을 관리하면서 add하면 배열에 넣고, 꽉 차면 자동으로 늘리는 코드가 들어 있어요.

        List<Integer> copyList = new ArrayList<>();
        list.forEach((i)->{
            //i는 리스트에서 하나씩 꺼내온 요소임
            copyList.add(i+3);
        });
        System.out.println(copyList);

        // List<Whale> whaleList = new ArrayList<>();
        // whaleList.add(new Whale("핑크고래", "바다"));
        //new는 객체를 실제로 메모리에 만들어 달라는 키워드예요. Whale은 설계도(클래스)일 뿐이라, new를 붙여야 그 설계도로 만든 실제 고래 한 마리(인스턴스)가 생겨요.
        //그 참조를 add()가 받아서 리스트에 담는 거예요. 위 코드는 이렇게 풀어 쓴 것과 같아요.
        //
        // Whale w = new Whale("핑크고래", "바다");  // 객체 생성
        // whaleList.add(w);                         // 리스트에 추가

        List<Integer> result1 = list.stream()
        //어레이 객체가 스트림타입으로 바뀜
        //실제로 하고 싶은 처리 적기
            .map((i)->
                i + 3
                //중괄호를 빼면 "식 하나"가 돼요. 이때는 그 식의 결과가 자동으로 반환값이 돼서 return을 쓰면 오히려 에러예요.
            )
            .toList();
        System.out.println(result1);

        //짝수의 개수를 구해주세요.
        int cnt = 0;
        for(int i =0; i < list.size(); i ++){
            if(list.get(i) % 2 == 0){
                cnt++;
                System.out.println(cnt);
            }
        }

        long result2 = list.stream()
            .filter((i) -> i % 2 == 0)
            .count();
        System.out.println(result2);
        //여기서 i는 사이즈가 아닌 값의 크기임 값 % 2 해서 짝수 인거만 통과가 된것/
    }
}
