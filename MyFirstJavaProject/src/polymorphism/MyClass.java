package polymorphism;

public class MyClass {

	public static void main(String[] args) {
		
		// Tenemos distintos outputs para una misma variable eso es porque java se fija en el tipo de objeto, no en el nombre de la variable
		
		Employee e = new FullTime();
		System.out.println("Full time employee is: "+e.salary());
		
		
		
		FullTime f = new FullTime();
		f.myMthod();
		
		e = new Contractor();
		System.out.println("Contractor salary is: "+e.salary());
		
		System.out.println(Employee.designation());
		System.out.println(FullTime.designation());
		System.out.println(Contractor.designation());
		
		//Overloading
		
		MyOverLoadingClass myOverLoadingClass = new MyOverLoadingClass();
		myOverLoadingClass.myMethod(5);
		myOverLoadingClass.myMethod("My string");
		myOverLoadingClass.myMethod("My string ", 6);
		

	}

}
