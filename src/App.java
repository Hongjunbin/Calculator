import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int number1 = sc.nextInt();
        System.out.println(number1);

        System.out.print("두 번째 숫자를 입력하세요: ");
        int number2 = sc.nextInt();
        sc.nextLine();
        System.out.println(number2);

    }
}
