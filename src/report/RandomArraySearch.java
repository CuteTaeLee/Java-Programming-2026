package report;

public class RandomArraySearch {
	public static void main(String[] args) {
		// 정수10개를 저장할 배열 생성
		int[] intArray = new int[10];
		
		// 1. 랜덤 정수 생성 및 배열 저장(출력 포함)
		System.out.print("10개의 정수는. . . ");
		
		for (int i = 0; i < intArray.length; i++) {
			// 1~100 사이의 랜덤 정수 생성
			intArray[i] = (int) (Math.random() * 100 + 1);
			System.out.print(intArray[i] + " ");
		}
		
		System.out.println(); // 줄바꿈
		
		// 2. 배열에서50보다 큰 정수들만 골라 출력
		System.out.print("50보다 큰 정수는. . . ");
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > 50) {
				System.out.print(intArray[i] + " ");
			}
		}
	}
}