package org.example.e13methodrefernce;

import java.util.Arrays;
import java.util.List;

public class MainMethodReference {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "둘리", "또치");

        //람다식을 이용해서 출력
        list.forEach((name) -> System.out.println(name));

        //Method reference
        list.forEach(System.out::println);
    }
}
