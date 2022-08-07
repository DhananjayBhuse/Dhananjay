package methodoverridding;

public class methodoverriding extends methodoverload {

	int a=100;
	
   void abc () {    // no argument method 
		System.out.println("hello world");
	}
	void abc (int a) { // parametric method 
		System.out.println("My Roll no is " + a);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverriding M=new methodoverriding();
		M.abc();
		M.abc(10);
		
	}

}
