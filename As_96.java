package basicPrograms;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class As_96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Vector<Object>v1=new  Vector<Object>();
		v1.addElement("Thai");
		v1.addElement("Akhil");
		v1.addElement("Vichu");
		Vector<Object>v2=new  Vector<Object>();
		v2.addAll(v1);
		v2.remove(1);
		System.out.println(v2);
Enumeration e=v1.elements();
while(e.hasMoreElements())
{
	System.out.println(e.nextElement());
}
	}

}
