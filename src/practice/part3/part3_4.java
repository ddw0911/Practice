package practice.part3;

public class part3_4 {
    public static void main(String[] args) {
        part3_4 exam = new part3_4();
        exam.isAgeTwenties(19);
        exam.isAgeTwenties(25);
    }

    public boolean isAgeTwenties(int age) {
        boolean isTwenties = false;
        //아래 빈칸을 채워 코드를 완성하세요.
        if (
                age >= 20 && age <= 29
        ) {
            isTwenties = true;
        } else {
            isTwenties = false;
        }
        return isTwenties;
    }
}
