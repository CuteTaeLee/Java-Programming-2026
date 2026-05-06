package report;

import java.util.Scanner;
import java.util.Random;

public class UpDownGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		while (true) {
			int target = random.nextInt(100);
			int min = 0;
			int max = 99;
			int count = 1;
			int guess;

			System.out.println("컴퓨터가 숫자를 결정하였습니다. 맞추어 보세요.");

			while (true) {
				System.out.println(min + "-" + max);
				System.out.print(count + ">>");

				if (!scanner.hasNextInt()) {
					System.out.println("숫자를 입력해주세요.");
					scanner.next();
					continue;
				}

				guess = scanner.nextInt();

				if (guess == target) {
					System.out.println("맞았습니다.");
					break;
				} else if (guess < target) {
					System.out.println("더 높게");
					if (guess > min)
						min = guess;
				} else {
					System.out.println("더 낮게");
					if (guess < max)
						max = guess;
				}
				count++;
			}

			System.out.print("다시하시겠습니까(y/n)>>");
			String retry = scanner.next();
			if (retry.equalsIgnoreCase("n")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		scanner.close();
	}
}