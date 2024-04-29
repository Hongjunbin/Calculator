import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int[] resultArr = new int[3];
        int lastIdx = resultArr.length-1;
        int count = 0;

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

            // 결과에 해당하는 값을 배열에 넣어주는 로직
            if(count <= lastIdx){ // if조건 : indexOutOfBound 방지
                resultArr[count] = result; // 현재 count에 맞는 값 삽입.
                // 배열의 길이만큼 값이 다 차면 if문 수행 x
            }
            // 배열의 길이만큼 값이 다 차면 그 이후의 값을 밀어서 넣어주는 로직
            if(count > lastIdx){ // 배열의 길이 이상 넘어갈 시 수행하는 로직
                // 배열의 길이 -1이 되어있는 마지막 index의 위치값을 통해 
                // 마지막 index를 제외한 나머지 index에 접근
                for(int i = 0; i < lastIdx; i++) {
                    // 한칸씩 밀어주는 로직(index로 접근)
                    resultArr[i] = resultArr[i + 1];
                }
                // 지속적으로 저장되는 값을 마지막 인덱스에 저장.
                resultArr[lastIdx] = result;
            }

            for(int item : resultArr) {
                System.out.print("["+item+"]");
            }
            count++; // 배열에 값이 저장되는 횟수
            System.out.println("더 계산하시겠습니까? (exit입력 시 종료)");
            turnOnOff = !sc.nextLine().equals("exit");
        }

    }
}