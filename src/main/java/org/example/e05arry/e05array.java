package org.example.e05arry;

import java.util.Arrays;

public class e05array {
    public static void main(String[] args) {
        int[] arr = new int[3]; //길이 3의 인트 배열을 생성 및 초기화
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
//        arr[3] = 3; //배열의 인덱스가 범위를 넘었다고 뜸 원래 길이 이상을 넘을수 없다.

        int[] arr2 = {1, 2, 3};
        //길이 3의 인트배열을 생성해 초기화하면서 각 배열의 값까지 넣어주는방식 한줄 단축.
        System.out.println(Arrays.toString(arr)); //배열 내부 보는법 어레이 객체를 아규먼트로 전달해줌

        //배열의 복사 대입연산자는 그 안에 들어가있는 실제 값을 받는거(배열이 있는 주소값)
        int[] originArr = {1, 5, 9};
        int[] copyArr = originArr;
        //copyArr를 변경하면 originArr도 변경되는 불상사 발생
        copyArr[0] =999;
        //레퍼런스타입의 복사관련 문제, 주소값 복사 = 얕은 복사
        //오리진을 그대로 유지하면서 카피본으로 뭔갈 하고싶을때 복사를 하는거임.
        //근데 기존 얕은 복사는 안되기 때문에 깊은 복사를 하는거임 (json활용)

        //System.arraycopy() <-메소드/ 이용해서 깊은 복사
        int[] originArrSystem = {1, 2, 3};
        int[] copyArrSystem = new int [originArrSystem.length * 2];
        //배열의 길이를 반환
        System.arraycopy(
                originArrSystem,
                0,
                copyArrSystem,
                0,
                originArrSystem.length
        );
        copyArrSystem[0] = 999;
        //소스코드 = 원본코드 또는 근본 코드
        // Arrays.copyof() 이용해서 깊은 복사
        int[] originArrArrays = {1, 2, 3};
        int[] copyArrArrays = new int [originArrArrays.length * 2];
        copyArrArrays = Arrays.copyOf(originArrArrays, originArrArrays.length);
        //두개만 주면 새로운 배열을 반환한다.
        //오리진을 보호하기 위한 목적 딱 하나로만 쓰인다. 무조건 원본과 똑같은 형태로만 깊은 복사
        copyArrArrays[0] = 999; //999, 2, 3

        //직접 구현해보자
        int[] originFor = {1, 2, 3};
        int[] copyFor = new int[originFor.length * 2];
        for (int i = 0; i < originFor.length; i ++){
            copyFor[i] = originFor[i];
        }
        int idx = 0;
        for(int val : originFor){
            //인덱스 번호 못가져옴, 길이만 가져옴 향상된 포문.
            copyFor[idx] = val;
            idx++;
        }
        //다차원 배열 : 배열안에 배열
        int[][] multiArr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(multiArr[1][1]);

                //1번 인덱스에서 1번인덱스
        //배열의 API
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 2, 3};
        //배열의 길이
        System.out.println(arr3.length);

        //배열이 같은지 비교
        System.out.println(Arrays.equals(arr3, arr4));

        //다차원배열이 같은지 보려면 equals로는 안됨 다른 방안
        // Arrays.deepEquals(arr1, arr2): 다차원 배열의 비교
        int[][] deepArr1 = {{1,2,3}, {4,5,6}};
        int[][] deepArr2 = {{1,2,3}, {4,5,7}};
        System.out.println(Arrays.deepEquals(deepArr1, deepArr2));

        //Arrays.sort(arr) : 배열의 정렬 / 원본을 수정함
        int[] sortArr = {43, 6, 7, 8, 4, 34, 2};
        Arrays.sort(sortArr);
        System.out.println(Arrays.toString(sortArr));
    }
}
