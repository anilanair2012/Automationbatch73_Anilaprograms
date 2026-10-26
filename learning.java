package basicPrograms;

public class learning {
	int a=6;int b=9;
	void add()
	{
	int sum=a+b;
	System.out.println(sum);
	}
	
	void sub()
	{
		add();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		learning l1=new learning ();
		l1.add();
		l1.sub();
	}

}
