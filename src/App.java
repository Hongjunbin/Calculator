import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator c = new Calculator(new ArrayList<Integer>());

        Scanner sc = new Scanner(System.in);

        boolean turnOnOff = true;

        while(turnOnOff) {
            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            sc.nextLine();
            try {
                int result = c.calculate(operator, num1, num2);
                System.out.println(result);
            } catch(CalculaotrException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

            turnOnOff = !sc.nextLine().equals("exit");
        }
    }
}