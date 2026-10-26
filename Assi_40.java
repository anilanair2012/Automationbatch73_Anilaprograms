package basicPrograms;

public class Assi_40 extends Assignment_41{
	int a=2;int b=7;
	void sum()
	{
		int add=a+b;
		System.out.println(add);
		
	}
	static void dif()
	{
		Assi_40 as40=new Assi_40();
		int sub=as40.b-as40.a;
		System.out.println(sub);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assi_40 as40=new Assi_40();
dif();
as40.sum();
	}

}
