package basicPrograms;

public class Assignment29 {
static int a=100;
int b=200;
void add()
{
	int sum=a+b;
	System.out.println(sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment29 as29=new Assignment29();
		as29.add();
		int c=as29.b=20;
		Assignment29.a=23;
		int sum=a+c;
		System.out.println(sum);
		as29.add();
	}

}
