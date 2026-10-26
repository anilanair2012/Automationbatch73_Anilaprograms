package basicPrograms;


class Class_y extends Class_z
{
Class_y()
{
	System.out.println("first super");
}
}

class Class_z
{
Class_z()

{
	System.out.println("second super");		
}
}
public class Class_x extends Class_y {
Class_x()
{
this(2,3);	
System.out.println("second const");

}
Class_x(int a,int b)
{
System.out.println("first const)");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Class_x();
	}

}
