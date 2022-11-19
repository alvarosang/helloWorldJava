package test;

public class MySuperClass {
	
	String superStr = "super class String";
	
	
	
	public MySuperClass(String constructorStr) {
		System.out.println("super class constructor ");
		//super();
		System.out.println(constructorStr );
	}
	
	public void superClassMethod() {
		
		System.out.println("Super class method");
	}

	public static void main(String[] args) {
		

	}

}
