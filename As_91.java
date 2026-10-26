package basicPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class As_91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Collection<Object>c1=new ArrayList<Object>();
c1.add(14);
c1.add(30);
c1.add(90);
Collection<Object>
c2=new ArrayList<Object>();
c2.addAll(c1);
System.out.println(c2);
System.out.println(c2.size());
System.out.println(c2.isEmpty());
System.out.println(c1.contains(90));
System.out.println(c2.containsAll(c1));
Iterator<Object>i1=c1.iterator();
while(i1.hasNext()) {
	System.out.println(i1.next());
}
	}

}
