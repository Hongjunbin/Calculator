import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int number1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int number2 = sc.nextInt();
        sc.nextLine();

        System.out.print("사칙연산 기호를 입력하세요: ");
        String sign = sc.nextLine();
        System.out.println(sign.charAt(0));

        int result = 0;
        if(sign.equals("+")){
            result = number1 + number2;
        } else if(sign.equals("-")) {
            result = number1 - number2;
        } else if(sign.equals("*")) {
            result = number1 * number2;
        } else if(sign.equals("/")) {
            if(number2 != 0) {
                result = number1 / number2;
            } else {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
        }
        System.out.println("결과 : " + result);
    }
}