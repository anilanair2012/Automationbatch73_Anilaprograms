package basicPrograms;
class Parent{
	Parent(int a,int b)
	{
		System.out.println("parent const");			
	}}
public class Assignmnt_47 extends Parent {


Assignmnt_47()
{
	super(4,5);
System.out.println("child const");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignmnt_47();	
	}

}
