package report;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 정수10개를 저장할 배열, 합계를 저장할 변수생성
		int[] intArray = new int[10];
		int sum = 0;

		System.out.print(">>");
		// 10개의 정수 입력받기
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}
		// 3의 배수 출력 및 합산
		System.out.print("3의 배수는. . . ");
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] % 3 == 0) { //
				System.out.print(intArray[i] + " ");
				sum += intArray[i];
			}
		}
		// 합계 출력
		System.out.println(); // 줄바꿈
		System.out.println("3의 배수의 합은. . . " + sum);

		scanner.close();
	}
}
