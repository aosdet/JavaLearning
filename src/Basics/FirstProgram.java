package Basics;

public class FirstProgram {
	
	
 	String var = "Sofa"; 	
 	String var1 = "TV";
	
	public void cooking() { //method
		
		String var2 = "pan";		
		System.out.println(var2);		
		System.out.println("Cooking");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("welcome to automation");		
		FirstProgram obj = new FirstProgram();		
	obj.cooking();
				
		System.out.println(obj.var);
 
	}

}
