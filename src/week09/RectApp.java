package week09;

import java.util.Scanner;

class Rectangle {
	int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(int width) {
		this(width,2);
	}

	public Rectangle() {
		this(1,2);
	}

	/**
	 * 면적 가져오는 함수
	 * 
	 * @return 가로 * 세로
	 */
	public int getArea() {
		return width * height;
	}

}

public class RectApp {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적은" + rect.getArea());
		scanner.close();

	}

}
