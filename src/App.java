import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator c = new Calculator(new ArrayList<Integer>());

        int result = 0;
        try {
            result = c.calculate('/', 123,0);
        } catch(CalculaotrException e) {
            System.out.println(e.getMessage());
        }
    }
}