package basicPrograms;
 interface I1
 {
 void display(); 
 }

abstract class ac implements I1
{
abstract void add();
}

public class AS_53 extends ac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AS_53 as53=new AS_53();
		as53.add();
		as53.display();
	}

	@Override
	public void display() {
	System.out.println("Display");
		
	}

	@Override
	void add() {
		System.out.println("Add");
		// TODO Auto-generated method stub
		
	}

	
		
	}


