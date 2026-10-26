package basicPrograms;
abstract class C1//C1 is the abstract class
{
	abstract void add();//abstract method
	void sub()//concrete method
	{
		
	}
}
public class Assignment_52 extends C1{//concrete class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_52 as52=new Assignment_52();
		as52.add();
	}

	@Override
	void add() {
		int a=4;int b=9;
		int sum= a+ b;
		System.out.println(sum);
		
		
	}

}
