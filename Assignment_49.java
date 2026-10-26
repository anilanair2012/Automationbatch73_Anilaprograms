package basicPrograms;
class Parent1
{
	void login()
	{
		System.out.println("login using mobilenumber");
	}
}

public class Assignment_49 extends Parent1 {
	void login()
	{
		super.login();
		System.out.println("login using emailid");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_49  as49=new Assignment_49 ();
		as49.login();
	}

}
