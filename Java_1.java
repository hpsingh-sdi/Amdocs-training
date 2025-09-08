package amdocs_pkg;

public class Shape {
	
	int a,b;
	float r;
	float area;
	
	public Shape() {
		System.out.println("General Shape");
		area = 0;
	}
	public Shape(int a) {	//square
		area = a*a;
	}
	public Shape(int a, int b) {	// rectangle
		area = a*b;
	}
	public Shape(float r) {	// circle
		area = 3.14f*r*r;
	}
	
	public void getSquare() {
		System.out.println("Area of Sqaure is : "+ area);
	}
	public void getRect() {
		System.out.println("Area of Rectangle is : "+ area);
	}
	public void getCircle() {
		System.out.println("Area of Circle is : "+ area);
	}
	
	public float rhombusArea(float d1, float d2) {
		return d1*d2/2;
	}
	
	public int triangleArea(int b, int h) {
		return b*h/2;
	}

	public static void main(String Args[]) {
		Shape sq = new Shape(2);
		sq.getSquare();
		Shape rect = new Shape(2,3);
		rect.getRect();
		Shape circle = new Shape(2.1f);
		circle.getCircle();
	}
}
