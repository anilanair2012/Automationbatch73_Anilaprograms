package basicPrograms;
interface I3
{
void sub();	
}
public interface I2 extends I3{
void mul();
}
class c1 implements I2
{

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}
public static void main(String[]args)	
{
	c1 c=new c1();
	c.sub();
	c.mul();
	
}
}