package report;

import java.util.Scanner;
import java.util.InputMismatchException;

public class RainbowArrayApp {
	public static void main(String[] args) {
		char[] rainbow = { '빨', '주', '노', '초', '파', '남', '보' };
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("정수를 입력하세요>>");
			try {
				int index = scanner.nextInt();

				if (index < 0 || index > 6) {
					System.out.println("프로그램을 종료합니다..");
					break;
				}

				System.out.println(rainbow[index]);

			} catch (InputMismatchException e) {

				System.out.println("경고! 정수를 입력하지 않았습니다.");
				scanner.next();
			}
		}

		scanner.close();
	}
}