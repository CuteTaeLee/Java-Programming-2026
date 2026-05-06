package report;

import java.util.Scanner;

public class ScoreSearchApp {
	public static void main(String[] args) {
		// 이름과 점수 배열 초기화
		String[] nameArray = { "박채원", "옥지윤", "김민서", "성주연" };
		int[] scoreArray = { 88, 91, 99, 95 };

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("이름>>");
			String name = scanner.next();

			// "그만" 입력 시 루프 종료
			if (name.equals("그만")) break;
			
			int index = -1; // 이름을 찾았는지 확인하기 위한 인덱스 변수

			// 배열을 순회하며 입력한 이름이 있는지 검색
			for (int i = 0; i < nameArray.length; i++) {
				if (nameArray[i].equals(name)) {
					index = i; // 이름을 찾으면 해당 인덱스 저장
					break;
				}
			}

			// 검색 결과 출력
			if (index != -1) {
				System.out.println(name + "의 점수는 " + scoreArray[index]);
			} else {
				System.out.println(name + "은 없는 사람입니다.");
			}
		}

		scanner.close();
	}
}