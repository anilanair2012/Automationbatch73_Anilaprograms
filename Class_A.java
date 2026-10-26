package basicPrograms;

class Class_B extends Class_C
{
	Class_B(int a,int b){
		super();
	System.out.println("second constructor");	
	}
}
class Class_C
{
Class_C()
{
System.out.println("first");
}
}

public class Class_A extends Class_B {
	Class_A()
	{
	super(4,5)	;
	System.out.println("third");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Class_A();

	}

}
