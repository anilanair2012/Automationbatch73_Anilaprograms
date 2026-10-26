package basicPrograms;

import java.util.ArrayList;
import java.util.List;

public class As_94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Object> l1=new ArrayList<Object>();
l1.add("Anila");
l1.add("Nachu");
l1.add("thai");
List<Object> l2=new ArrayList<Object>();
l2.addAll(l1);
System.out.println(l2);
l1.remove(0);
l1.remove("thai");
System.out.println(l1);
l2.removeAll(l1);
System.out.println(l2);

l1.get(0);
l1.clear();
System.out.println(l1);
	}

}
