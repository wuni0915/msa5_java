package org.example.e06oop.e07exception;

import java.io.FileWriter;
import java.io.IOException;

public class E07exception {
    //예외: 우리가 수습할 수 있는 다소 미약한 오류들
    public static void main(String[] args) {
        try{
            System.out.println("트라이 시작");

            throw new Exception("아아아아아 에러");
            // double result = 10/ 0;

            // System.out.println("트라이 끝");
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException 발생");
            //if문처럼 동작
            //알티메틱 익셉션이 이미 익셉션에 잡혀서 사용이 되었다. - 순서 중요
        }
        catch(Exception e){
            // catch(Exception e) 익셉션은 데이터 타입임 근데 10/0예외 오류가 담긴게아니다.
            //다형성을 이용한것 익셉션 아래에 있는 모든 객체?들을 다형성을 이용해 받아온것임.
            //알티메틱 익셉션의 부모 런타입 익셉션의 부모 익셉션
            System.out.println("캐치 시작");
            System.out.println(e.getMessage());
            System.out.println("캐치 끝");

        } finally {
            System.out.println("파이널리");

        }

        //Try with Resource
        //내 컴퓨터 저장영역에 저장된 파일에 접근하는 처리
        //JVM안이 아니라 그 범위를 벗어나서 작업해야되는것.
        //외부와 연결하는 처리 - 리소스 처리
        FileWriter file = null ;
        //그래서 이걸 트라이문 밖에다 해둔거임

        try {
            //파일을 쓰기 모드로 불러오기 파라미터로 넘겨준것을 넘겨서 쓰기 모드로 ...어쩌고
            file = new FileWriter("text.txt");
            file.write("안녕 자바!");
            //트라이문이라는 블록레벨 안에서 작성됨/
        } catch (IOException e){
            e.printStackTrace();

        } finally {
            try{
                // 사전에 if를 넣어 널인지 아닌지 확인해야됨
                if(file != null){
            file.close();

                }

            } catch (IOException e){
                e.printStackTrace();
            }
            //메인이라는 로컬스코프 안에서 파이널리에서도
            //파이널리는 블록레벨 밖이라 접근이....


        }
        try(FileWriter file1 = new FileWriter("text.txt")){
            file1.write("안녕안녕!");

        } catch (IOException e) {
            e.printStackTrace();
            //기본적으로 리소스 처리를 위한 전용 문법
            //이 문 하나가 다 해줌
        }
    }
}
