import java.util.ArrayList;

public class Calculator {

    public static final double PI = 3.14;
    // 절대 변하지 않는 수 => 상수 즉, PI(파이)는 3.141592...으로 변하지 않는 수 이다.
    private final ArrayList<Double> circle;

    private final ArrayList<Integer> list;

    public Calculator(ArrayList<Double> circle, ArrayList<Integer> list){
        this.circle = circle;
        this.list = list;
    }

    public void setList(int calculatedResult) {
        this.list.add(calculatedResult);
    }

    public ArrayList<Integer> getList() {
        return this.list;
    }

    public void removeResult() {
        this.list.remove(0);
    }

    /* 원의 넓이를 구하는 메서드 선언*/
    public double calculateCircleArea(int radius) {
        /* 원의 넓이 계산 구현 */
        return PI * (radius * radius);
    }
    /* 원의 넓이 저장 필드 Getter, Setter, 조회 메서드 구현 */
    public void setCircle(double circle) {
        this.circle.add(circle);
    }

    public ArrayList<Double> getCircle() {
        return circle;
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