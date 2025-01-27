package Basics;

public class FirstClass {

	String name = "aashu Onlyy";
	int age = 34;
	boolean married = true;
	int income = 10000;

	public void working() {

		System.out.println("working in Accenture");
	}

	public void home() {

		System.out.println("staying in flat");

	}

	public void eating() {
		System.out.println("eating veg food");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass obj = new FirstClass();		
		obj.eating();
		System.out.println(obj.married);
		
	}

}
