package org.example.e03if;

public class e03if {
    public static void main(String[] args) {
        int score = 101;
        String notice = "";
        String errorNotice = "";
        //트루슬리 패턴/ 파슬리 패턴 파슬리;)
        if( score >= 0 && score <= 100 ){
            if(score >= 60 && score < 70 ){
                notice = "D";
            }
            else if (score >= 70 && score < 80) {
                notice = "C";
            } else if (score >= 80 && score < 90) {
                notice = "B";
            } else if (score >= 90 && score < 100) {
                notice = "A";
            } else if (score == 100) {
                notice = "A+";
            } else {
                notice = "F"; }
            System.out.printf( "당신의 점수는 %d점 입니다. <%s>", score, notice);
        } else {
            if (score < 0 || score > 100){
                errorNotice = "유효한 점수가 아닙니다.";
                System.out.printf(errorNotice);
            }

            //switch 문

            int num = 1;

            switch(num) {
                case 1:
                    System.out.println("1등");
                    break;
                    //num에 1 여부에 따라 다음으로 넘어갈지 안갈지 알수있다.
                case 2:
                    System.out.println("2등");
                    break;
                case 3:
                    System.out.println("3등");
                    break;
                default:
                    System.out.println("등수외");
                    break;
                    //브레이크가 없으면 후속 처리들 쭈욱 해버린다.
            }
        }
    }
}
// IF로 만들어주세요.
// 성적
// 범위 :
//		100   : A+
//		90이상 100미만 : A
//		80이상 90미만 : B
//		70이상 80미만 : C
//		60이상 70미만 : D
//		60미만: F

//출력 문구 : "당신의 점수는 XXX점 입니다. <등급>"
// 0 ~ 100의 숫자가 아닐 경우 오동작한다.
//해당 현상을 아래처럼 수정하시오.
// 0~100의 숫자가 아닐경우, "유효한 점수가 아닙니다." 출력
// 그외 패턴은 기존과 동일