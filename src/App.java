import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        boolean turnOnOff = true;
        while(turnOnOff){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int number1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int number2 = sc.nextInt();
            sc.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String sign = sc.nextLine();

            int result = 0;
            if(sign.charAt(0) == '+'){
                result = number1 + number2;
            } else if(sign.charAt(0) == '-') {
                result = number1 - number2;
            } else if(sign.charAt(0) == '*') {
                result = number1 * number2;
            } else if(sign.charAt(0) == '/') {
                if(number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
            }

            System.out.println("결과 : " + result);

            list.add(result);
            for(int item : list) {
                System.out.print("[" + item + "] ");
            }
            System.out.println();
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");

            if(sc.nextLine().equals("remove")) {
                list.remove(0);
                for(int item : list) {
                    System.out.print("[" + item + "] ");
                }
            }
            System.out.println();
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if(sc.nextLine().equals("inquiry")) {
                for(int item : list) {
                    System.out.print("[" + item + "] ");
                }
            }
            System.out.println();
            System.out.println("더 계산하시겠습니까? (exit입력 시 종료)");
            turnOnOff = !sc.nextLine().equals("exit");
        }
    }
}