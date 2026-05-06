package report;

import java.util.Scanner;
import java.util.Random;

public class MultiplicationQuiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int failCount = 0; // 틀린 횟수를 저장할 변수

		System.out.println("***** 구구단을 맞추는 퀴즈입니다. *****");

		while (failCount < 3) {
			// 1~9 사이의 랜덤한 숫자 두 개 생성
			int num1 = random.nextInt(9) + 1;
			int num2 = random.nextInt(9) + 1;
			int answer = num1 * num2; // 실제 정답

			System.out.print(num1 + "x" + num2 + "=");

			// 사용자의 입력이 정수인지 확인
			if (scanner.hasNextInt()) {
				int userAnswer = scanner.nextInt();

				if (userAnswer == answer) {
					System.out.println("정답입니다. 잘했습니다.");
				} else {
					failCount++; // 틀린 횟수 증가
					if (failCount < 3) {
						System.out.println(failCount + "번 틀렸습니다. 분발하세요.");
					} else {
						System.out.println(failCount + "번 틀렸습니다. 퀴즈 종료합니다.");
					}
				}
			} else {
				// 숫자가 아닌 값이 입력된 경우 처리
				System.out.println("숫자를 입력해야 합니다.");
				scanner.next(); // 버퍼 비우기
			}
		}

		scanner.close();
	}
}
