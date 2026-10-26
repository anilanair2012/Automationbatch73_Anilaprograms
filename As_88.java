package basicPrograms;
class Parent2
{
	void add()
	{
		
	}
}
public class As_88 extends Parent2{
void sub()
{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent2 p1=(Parent2)new As_88();//upcasting

As_88 as1=(As_88)p1;//downcasting
as1.add();
as1.sub();
//as1.notifyAll();//object class property
	}

}
