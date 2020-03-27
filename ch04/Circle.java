package ch04;

public class Circle {
	private int radius;
	private String name;

	public Circle() {}
	
	
	public void setRadius(int radius) {
		this.radius = radius;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
