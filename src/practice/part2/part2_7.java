package practice.part2;

public class part2_7 {
    public boolean[] calculate(int a, int b) {
        //변수 a와 b는 int형 변수입니다. 각각 어떤 값을 가지고 있는지는 비교해 보기 전에는 모릅니다.
        //a와 b가 주어져 있다고 가정하고 아래 지시에 따라 문제를 풀어 보세요.

        //a가 b보다 큰 지 비교한 결과(true 또는 false)를 c에 저장하세요.
        boolean c = a > b;


        //a와 b가 같은지 비교한 결과를 d에 저장하세요.
        boolean d = a == b;


        //a와 b가 다른지 비교한 결과를 e에 저장하세요.
        boolean e = a != b;


        //이 아래 코드는 결과 테스트를 위한 코드입니다.
        boolean ret[] = {c, d, e};
        return ret;
    }

    public static void main(String[] args) {
        // Math.random() = 0.0~ 1.0 사이 임의 숫자를 double 타입으로 리턴하는 메서드
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        new part2_7().calculate(a, b);
    }
}
