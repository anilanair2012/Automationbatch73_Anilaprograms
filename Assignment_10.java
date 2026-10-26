package basicPrograms;

public class Assignment_10 {

	static void add()
	{
		System.out.println("static method overloading");
	}
	static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	void sub(int c,int d)
	{
		int dif=c-d;
	}
	void sub()
	{
		System.out.println("non static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_10 as10=new Assignment_10();
		as10.add();
		as10.sub();
	}

}
