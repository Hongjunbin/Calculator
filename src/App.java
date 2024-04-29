import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator c = new Calculator(new ArrayList<Double>(), new ArrayList<Integer>());

        Scanner sc = new Scanner(System.in);

        boolean turnOnOff = true;

        while(turnOnOff) {
            System.out.println("1. 사칙연산 하기");
            System.out.println("2. 원의넓이 구하기");
            String check = sc.nextLine();

            if(check.equals("1")) {
                System.out.print("첫 번째 숫자를 입력하세요:");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요:");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);
                sc.nextLine();
                try {
                    // 계산된 값 setter주입 메서드 안에서 직접 add메서드 호출 후 주입.
                    c.setList(c.calculate(operator, num1, num2));
                } catch(CalculaotrException e) {
                    System.out.println(e.getMessage());
                }

                System.out.println(c.getList());
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                if(sc.nextLine().equals("remove")){
                    c.removeResult();
                }

                System.out.println(c.getList());
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

                turnOnOff = !sc.nextLine().equals("exit");
            } else if(check.equals("2")) {
                System.out.println("반지름을 입력해주세요.");
                int radius = Integer.parseInt(sc.nextLine());
                c.setCircle(c.calculateCircleArea(radius));
                System.out.println("원의 넓이 결과 : " + c.getCircle());
            } else {
                System.out.println("잘못 입력했습니다. 다시 선택해주세요.");
            }

        }
    }
}