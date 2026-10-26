package basicPrograms;

public class Assignment_7 {
	
	Assignment_7 (int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	static void sub(int c,int d)
	{
		int e=c-d;
		System.out.println(e);
	}
	void mul(int a1,int b1 )
	{
		int c1=a1*b1;
		System.out.println(c1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_7 as7=new Assignment_7(2,3);
		as7.mul(5, 10);
		sub(5,3);
	}

}
