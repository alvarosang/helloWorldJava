package encap;

public class MyClass {

	public static void main(String[] args) {
		MyPrivateClass myPrivateClass = new MyPrivateClass();
		myPrivateClass.setStr("Updated my string");
		System.out.println(myPrivateClass.getStr() );

	}

}
