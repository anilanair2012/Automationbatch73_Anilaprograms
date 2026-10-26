package basicPrograms;

public class Assignment_8 {
	static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void add()
	{
		System.out.println("method overloading");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add(4,7);
add();
	}

}
