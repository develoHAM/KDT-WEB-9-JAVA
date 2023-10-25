package java_class;

public class Rectangle {

	private int width;
	private int height;
	// 실습 3
	private static int count = 0;
	
	// Constructor Overloading: 각 매개변수에 맞는 여러 생성자들을 구현하는 것
	
	// 실습 1
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 실습 2
	public Rectangle(int width) {
		this.width = width;
		// 실습 3
		count++;
	}
	
	// 실습 3
	public static int getCount() {
		return count;
	}
	
	
	// ------------------------------------------
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int area() {
		return this.width * this.height;
	}

}
