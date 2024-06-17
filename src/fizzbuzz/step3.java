package fizzbuzz;

public class step3 {

	public class Main {
	    public static void main(String[] args) {    	
	    pr();	    
	}
	        	
	public  static void pr() {    		
	        int y = 0;
	        for (int x = 30; x>0;x--){              
	        	if (x % 3 == 0 && x % 5 == 0) {
	                System.out.println("FizzBuzz");
	        	}else if(x%3==0) {
	        		System.out.println("fizz");
	        	}else if(x%5==0) {
	        		System.out.println("buzz");
	        	}else{
	        		if(y!=0) {
	        		 System.out.println(x+"("+y+")" );}
	        		else {
	        			System.out.println(x);
	        		}
	        		 y=x;
	        		}
	        	}	        	
	        }       
	               
	    }	
}




