package practice.part3;

public class part3_3 {
    public static void main(String[] args) {
        part3_3 exam = new part3_3();
        exam.isAgeDiscountable(15);
        exam.isAgeDiscountable(27);
    }
    public boolean isAgeDiscountable(int age) {
        boolean isDiscount = false;
        // 아래 빈칸을 채워 코드를 완성하세요.
        if(
                age >= 90 || age <= 19
        ) {
            isDiscount = true;
        }
        else {
            isDiscount = false;
        }
        return isDiscount;
    }

}
