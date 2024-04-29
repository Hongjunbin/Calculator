import java.util.ArrayList;

public class CircleCalculator extends Calculator {

    public CircleCalculator(ArrayList<Double> list) {
        super(list);
    }

    /* 원의 넓이를 구하는 메서드 선언*/
    public double calculateCircleArea(int radius) {
        /* 원의 넓이 계산 구현 */
        return PI * (radius * radius);
    }
    /* 원의 넓이 저장 필드 Getter, Setter, 조회 메서드 구현 */
    public void setCircle(double circle) {
        this.list.add(circle);
    }

    public ArrayList<Double> getCircle() {
        return list;
    }

}
