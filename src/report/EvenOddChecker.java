package report;

import java.util.Scanner;
import java.util.InputMismatchException;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("정수를 입력하세요>>");
            // 정수가 아닌 값이 들어오면 InputMismatchException 발생
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
        } catch (InputMismatchException e) {
            // 사용자가 "twenty"처럼 숫자가 아닌 문자열을 입력한 경우 실행
            System.out.println("수를 입력하지 않아 프로그램 종료합니다.");
        } finally {
            // 예외 발생 여부와 상관없이 항상 실행되어 자원을 반납함
            scanner.close();
        }
    }
}