package test;

public class MyClass2 {
	
	
	
	//int i = 0;
	
	enum myChar{
		
		A,
		B
	}

	public static void main(String[] args) {
		MyClass2 myClass2 = new MyClass2();
		myClass2.ifElseCheck();
		myClass2.forLoopCheck();
		myClass2.forEachLoopCheck();
		myClass2.whileLoopCheck();
		myClass2.switchCheck();

	}
	
	public void ifElseCheck() {
		boolean flag1 = false;
		String str = "myStr";
		
		if(str.equalsIgnoreCase("myStr")|| flag1) {
			// & significa YES ; || significa OR
			System.out.println("I am in if");
			
		} else {
			System.out.println("I am in else");
			
		}
		
	}
	
	public void forLoopCheck() {
		
		for (int i = 0 ; i< 5 ; i++) {
			System.out.println("i is " + i);
			if(i ==3) {
				break;
				//continue;
			}
		}
		
	}
	
	public void forEachLoopCheck() {
		String[] myArray = {"a","b","c"};
		
		for(String str : myArray) {
			System.out.println(str);
			if(str.equalsIgnoreCase("b")) {
				break;
			}
		}
		
	}
	
	public void whileLoopCheck() {
		int e = 5;
		
		while(e>0) {
			System.out.println("e is " + e);
			e--;
			if (e==3) {
				break;
			}
		}
		
	}
	
	public void switchCheck() {
		String str1 = "c";
		myChar nowChar = myChar.A;
		
		switch(str1) {
			case "A":
				System.out.println(str1);
				break;
			case "B":
				System.out.println(str1);
				break;
			default:
				System.out.println(str1);
		
		}
	}
	

}
