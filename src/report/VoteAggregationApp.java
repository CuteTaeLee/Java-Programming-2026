package report;

import java.util.Scanner;

public class VoteAggregationApp {
	public static void main(String[] args) {
		String[] candidates = { "최지유", "박소정", "최소연" };
		int[] voteCounts = { 0, 0, 0 };

		Scanner scanner = new Scanner(System.in);

		System.out.println("과대표 출마자:최지유 박소정 최소연 입니다. 집계된 투표수를 입력합니다.");

		while (true) {
			System.out.print(">>");
			String name = scanner.next();

			if (name.equals("그만")) {
				break;
			}
			int index = -1;
			for (int i = 0; i < candidates.length; i++) {
				if (candidates[i].equals(name)) {
					index = i;
					break;
				}
			}

			if (index != -1) {
				int score = scanner.nextInt();
				voteCounts[index] += score;
			} else {

				scanner.nextInt();
				System.out.println(name + "는 없는 출마자입니다. 다시 입력하세요");
			}
		}

		int maxVotes = -1;
		int winnerIndex = 0;

		for (int i = 0; i < candidates.length; i++) {
			System.out.print(candidates[i] + ":" + voteCounts[i] + "개");
			if (i < candidates.length - 1)
				System.out.print(", ");
			if (voteCounts[i] > maxVotes) {
				maxVotes = voteCounts[i];
				winnerIndex = i;
			}
		}

		System.out.println(", 과대표는 " + candidates[winnerIndex] + "로 결정되었습니다.");

		scanner.close();
	}
}
