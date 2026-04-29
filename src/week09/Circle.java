package week09;

/**
 * 클래스(Class): 객체를 만들기 위한 설계도
 */
public class Circle {

	// 필드(Field): 객체의 속성
	int radius;
	String name;

	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}

	/**
	 * 메소드(Method): 객체의 행위(반지름을 이용해 면적 계산)
	 * 
	 * @return 원의 면적 (3.14 * r^2)
	 */
	public double getArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		// 1. 객체 생성: 클래스라는 설계도를 바탕으로 메모리에 실제 객체(인스턴스)를 만듦
		Circle pizza = new Circle(10, "인생피자");

//        // 2. 필드 값 할당: 레퍼런스 변수(pizza)를 통해 객체 멤버에 접근
//        pizza.radius = 10;				
//        pizza.name = "인생피자";

		// 3. 메소드 호출: 객체의 기능을 실행
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

		// 또 다른 객체 생성 (동일한 설계도로 만든 별개의 존재)
		Circle donut = new Circle(10, "인생피자");

		System.out.println(donut.name + "의 면적은 " + donut.getArea());

		Circle anony = new Circle(20, "아무개");
		anony.name = "아무개";

		System.out.println(anony.name + "의 면적 : " + anony.getArea());

	}
}