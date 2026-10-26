package basicPrograms;
class Aw
{
private int age=10;

public void setAge(int age)
{
	 this.age=age;
}

public int getAge()
{
	return age;
}
}

public class Enca extends Aw{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enca ec=new Enca ();
		ec.setAge(20);
		System.out.println(ec.getAge());
	}

}
