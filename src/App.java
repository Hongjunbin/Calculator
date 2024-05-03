import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(new ArrayList<>());
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());

        Scanner sc = new Scanner(System.in);

        // 개선사항 : turnOnOff => resumable ( 변수 네이밍 수정 )
        boolean resumable = true;

        while(resumable) {
            System.out.println("1. 사칙연산 하기");
            System.out.println("2. 원의넓이 구하기");
            String check = sc.nextLine();

            // 개선사항 : 메서드로 분리해서 조건문 실행 가독성 상승
            if(check.equals("1")) {
                resumable = arithmeticCalculate(arithmeticCalculator, circleCalculator, sc);
            } else if(check.equals("2")) {
                resumable = circleCalculate(circleCalculator, sc);
            } else {
                System.out.println("잘못 입력했습니다. 다시 선택해주세요.");
            }
        }
    }

    public static boolean arithmeticCalculate(ArithmeticCalculator a, CircleCalculator c, Scanner sc) {

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0);
        sc.nextLine();
        try {
            // 계산된 값 setter주입 메서드 안에서 직접 add메서드 호출 후 주입.
            a.setList(c.calculate(operator, num1, num2));
        } catch(CalculaotrException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(a.getList());
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        if(sc.nextLine().equals("remove")){
            a.removeResult();
        }

        System.out.println(a.getList());
        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

        return !sc.nextLine().equals("exit");
    }

    public static boolean circleCalculate(CircleCalculator c, Scanner sc) {

        System.out.println("반지름을 입력해주세요.");
        int radius = Integer.parseInt(sc.nextLine());
        c.setCircle(c.calculateCircleArea(radius));

        System.out.println("현재 원의 넓이 결과 : " + c.calculateCircleArea(radius));

        System.out.println("원의 넓이 결과 전체조회 : " + c.getCircle());

        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

        return !sc.nextLine().equals("exit");
    }
}