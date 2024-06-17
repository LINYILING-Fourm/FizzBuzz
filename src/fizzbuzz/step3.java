package fizzbuzz;

public class step3 {

	public class Main {
	    public static void main(String[] args) {
	        
	    	
	        
	        for (int x = 1; x<31;x++){
	        	if (x % 3 == 0 && x % 5 == 0) {
	                System.out.println("Fizz,Buzz");
	        	}else if(x%3==0) {
	        		System.out.println("fizz ");
	        	}else if(x%5==0) {
	        		System.out.println("buzz ");
	        	}else{
	        		 System.out.println(x );
	        	}
	        	
	        }       
	               
	    }
	     
	}
	
}
