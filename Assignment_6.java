package basicPrograms;

public class Assignment_6 {
	Assignment_6()
	{
		System.out.println("non para constructor");
	}
	static void add()
	{
		System.out.println("non para static method");
	}
	void sub()
	{
		System.out.println("non para nonstatic method");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add();
Assignment_6 as1=new Assignment_6();
as1.sub();
	}

}
