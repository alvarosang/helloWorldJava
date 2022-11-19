package test;

public class MyClass {
	
	//fields - parameters - variables - int,float,double, boolean ,string
	//constructors
	//methods
	
	//Se pueden inicializar las variables así o con el método initialize (Ver abajo linea 25)
	//Si quieres un valor final se escribe final delante
	//static final int i = 10
	//int i = 5;
	static int i = 6;
	int e = 6;
	String str = "Hello world";
	
	public MyClass() {
		
		//i = 6;
		
	}
	
	public MyClass(int i) {
		
		this.i = i;
	}

	public static void main(String[] args) {
		
		//MyClass myClass = new MyClass(7);
		MyClass myClass = new MyClass();
		//Esta cogiendo el valor de dentro del argumento MyClass en vez del primer constructor
		
		//myClass.initialize();
		//System.out.println(myClass.i);
		//System.out.println(myClass.e);
		System.out.println(MyConstants.LONG_WAIT);
		System.out.println(i);
		System.out.println(EnumConstants.SUNDAY);
		myClass.stringCheck();

	}
	
	public void stringCheck() {
		
		str = str.concat(" !! ");
		System.out.println(str);
		str = str.toUpperCase();
		System.out.println(str);
//		str = str.substring(6);
//		System.out.println(str);
		str = str.substring(6,11);
		System.out.println(str);
		boolean flag = str.equalsIgnoreCase("WORLD");
		System.out.println(flag);
		
		str = "5";
		int i = Integer.parseInt(str);
		System.out.println(i);
		
		
	}
	
	public static void initialize() {
		
		// TODO No me funciona inicializar la variable con este metodo
		int i = 5;
		
		System.out.println("I am in initialize method");
	}
	

}
