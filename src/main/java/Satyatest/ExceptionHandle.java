package Satyatest;

public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		class Example {
		    public void main(String[] args) {
		        try 
		        {
		            int result = 10 / 0; // This will throw ArithmeticException
		        } 
		        catch (ArithmeticException e) {
		            System.out.println("Error: Division by zero");
		            
		      }
		        
		        finally 
		        {
		            System.out.println("This block always executes");
		            
		            
		        }
		    }
		}

	}

}
