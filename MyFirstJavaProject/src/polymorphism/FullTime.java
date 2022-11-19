package polymorphism;

public class FullTime extends Employee {
	
	//Si añadimos "final" al metodo salary en employee no se puede utilizar el keyword Override
	
	@Override
	int salary() {
		return base + 20000;
	}
	
	void myMthod() {
		
	}
	
	 static String designation () {
		 return "full time";
	 }


}
