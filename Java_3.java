package amdocs_pkg;

class Products{
	int id = 78;
	String name = "Amul";
	void display() {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
	}
}

class A extends Products{
	int count = 50;
	String category = "butter";
	void display() {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("count : "+count);
		System.out.println("category : "+category);
	}
}

class subA extends A{
	int price = 30;
	int totalPrice = price * count;
	void display() {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("count : "+count);
		System.out.println("category : "+category);
		System.out.println("price : "+price);
	}
}

class B extends Products{
	int count = 90;
	String category = "Milk";
	void display() {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("count : "+count);
		System.out.println("category : "+category);
	}
}

class subB extends B{
	int price = 10;
	int totalPrice = count*price;
	void display() {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("count : "+count);
		System.out.println("category : "+category);
		System.out.println("price : "+price);
	}
}

class C extends Products{
	int count = 56;
	String category = "choco";
	void display() {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("count : "+count);
		System.out.println("category : "+category);
	}
}

public class Amul {
	public static void main(String args[]) {
		Products p;
		p = new A();
		p.display();
	}
}
