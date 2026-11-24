package org.example.e10collection;


import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(10);
        //업캐스팅해서 받은거임 그걸 다시 다운캐스팅할때...먼가 쉬움. 형변화 할 때 구현체의 교체가 쉽다.
        //일반적으로 업캐스팅해서 씀
        list1.add(1);
        list1.add(2);
        list1.add(3);
        //순차적으로 값이 들어감

        System.out.println(list1.get(0));
        System.out.println(list1.size());

        list1.forEach((i)->{
            System.out.println(i);
            //왕따식문법ㅋㅋ 람다식?
        });
    }
    //사이즈 - 요소의 값이 비어있지 않은 만큼의 양. 요소 넣을때마다 사이즈 증가함.
    //캐파시티는 얼만큼 만들었다를 알려줌.
}
