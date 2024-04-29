import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(ArrayList<Double> list) {
        super(list);
    }

    public void setList(int calculatedResult) {
        this.list.add((double) calculatedResult);
    }

    public ArrayList<Double> getList() {
        return this.list;
    }

    public void removeResult() {
        this.list.remove(0);
    }
}
