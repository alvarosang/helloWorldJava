package encap;

public class MyPrivateClass {
	
	private String str = "My String";
	
	//Para acceder a la variable privada desde otra clase hay que hacer lo siguiente
	
	public String getStr() {
		return str;
		
	}
	
	public void setStr(String str) {
		this.str=str;
	}
	
	private void myMethod() {
		System.out.println("My mthod");
		
	}

}
