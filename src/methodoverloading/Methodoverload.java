package methodoverloading;

public class Methodoverload {

	int a=100;
	
   void abc () {    // no argument method 
		System.out.println("hello world");
	}
	void abc (int a) { // parametric method 
		System.out.println("My Roll no is " + a);
	}
	
	void abc (String D) {//// parametric method 
		String name = " Dhananjay";
		System.out.println("My Name Is  " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverload  M=new Methodoverload ();
		M.abc();
		M.abc(100);
		M.abc("D");
	}

}
