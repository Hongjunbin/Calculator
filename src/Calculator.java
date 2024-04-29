import java.util.ArrayList;

public class Calculator {

    public static final double PI = 3.14;
    // 절대 변하지 않는 수 => 상수 즉, PI(파이)는 3.141592...으로 변하지 않는 수 이다.

    protected final ArrayList<Double> list;

    public Calculator(ArrayList<Double> list){
        this.list = list;
    }

    public int calculate(char sign, int num1, int num2) throws CalculaotrException {

        int result = 0;

        switch(sign) {
            case '+' : result = num1 + num2; break;
            case '-' : result = num1 - num2; break;
            case '*' : result = num1 * num2; break;
            case '/' : if(num2 == 0) {
                throw new CalculaotrException("0을 나눌순 없습니다.");
            } else {
                result = num1 / num2;
            } break;
            default : throw new CalculaotrException("잘못된 기호가 들어왔습니다.");
        }
        return result;
    }
}