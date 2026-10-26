package basicPrograms;
class New_46
{
	New_46()
	{
	System.out.println("second")	;
	}
	static void add()
	{
		System.out.println("normal method")	;	
	}
}
public class Assignment_46 extends New_46 {
	Assignment_46()
	{
	System.out.println("first");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment_46 as46= new Assignment_46();
as46.New_46();
add();


	}

}
