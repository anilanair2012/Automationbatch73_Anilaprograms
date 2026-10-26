package basicPrograms;

public class Test {
 int a;
static int b=30;
void add()
{
int sum=a+10;
System.out.println(sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int a=5;
 //sum=Test.a+Test.b;
		sum=a+b;
		System.out.println(sum);
		Test t1=new Test();
		t1.add();
	}

}
