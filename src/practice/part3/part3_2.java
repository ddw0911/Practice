package practice.part3;

public class part3_2 {
    public static void main(String[] args) {
        part3_2 exam = new part3_2();
        exam.conditionTest(6);
        exam.conditionTest(8);
    }
    public int conditionTest(int value){
        // 변수 value가 선언되어 있다고 가정하고 아래에 코드를 작성하세요.
        int ret = 0;
        if( value % 3 == 0 ){
            ret = 3;
            // 이 아래 줄에 else 구문을 추가해서 코드를 완성하세요.
        } else if (value % 4 == 0) {
            ret = 4;
        }

        // 결과 체크를 위한 코드입니다.
        return ret;
    }
}
