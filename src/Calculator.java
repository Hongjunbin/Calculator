import java.util.ArrayList;

public class Calculator {

    private final ArrayList<Integer> list;

    public Calculator(ArrayList<Integer> list){
        this.list = list;
    }

    public void setList(int calculatedResult) {
        this.list.add(calculatedResult);
    }

    public ArrayList<Integer> getList() {
        return this.list;
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