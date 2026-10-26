package basicPrograms;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int a=1/0;
	System.out.println(a);
}
catch(ArithmeticException a1)
{
	System.out.println("never put 1/0");
	
}
finally
{
	System.out.println("exception handling");	
}
	}

}
