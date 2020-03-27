package ch04;

import java.util.Scanner;

class Rectangle {
	private int width;
	private int height;
	int setHeight;
	int setWidth;
	
	
	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return width*height;
	}
}

public class RectApp {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); //객체생성
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> ");
		rect.setWidth (scanner.nextInt());
		rect.setHeight (scanner.nextInt());
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close(); //stream을 닫는다.
	}

}
