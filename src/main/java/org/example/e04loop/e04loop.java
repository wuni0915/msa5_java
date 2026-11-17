package org.example.e04loop;

public class e04loop {
    public static void main(String[] args) {
        //for(초기값; 조건; 증감연산)
        //루프 돌때마다 증감연산에 따라 돈다.
        for(int i = 0; i < 5; i++){
            System.out.println(i);
//            0, 1, 2 각각 개행해서 나온다.
//            for(int i = 0; i < 5; i--) <- 무한순환이라 제자리임.
        }
        for(int i = 0; i < 2; i++){
            System.out.println(i);
            for(int z = 0; z < 5; z++){
                System.out.print(z);
            }
            System.out.println();
        }
        for(int i = 0; i < 2; i++){
//            System.out.println(i);
            for(int z = 0; z < 5; z++){
                System.out.printf("i값: %d, z값: %d%n", i, z);
            }
        }
        int cnt = 0;
        while(cnt < 5){
            System.out.println("test");
            ++cnt;
            cnt++;
        }
        // 구구단 2~9단을 출력
        // 예시)
        // ** 2단 **
        // 2 X 1 = 2
        // 2 X 2 = 4
        // ...
        // ** 3단 **
        // 3 X 1 = 3
        // 3 X 2 = 6
        // ...
        // 9 X 8 = 72
        // 9 X 9 = 81
        for(int i = 1; i < 9; i++){
            System.out.println();
            for(int z = 1; z < 9; z++){
                System.out.println();
            }
        }

    }
}
