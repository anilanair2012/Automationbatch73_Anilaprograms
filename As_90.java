package basicPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class As_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Object>s1=new HashSet<Object>();
s1.add("Anila");
s1.add(81);
Set<Object>s2=new HashSet<Object>();
s2.addAll(s1);
System.out.println(s2);
System.out.println(s1.size());
System.out.println(s1.isEmpty());
System.out.println(s2.containsAll(s1));
System.out.println(s2.contains(81));
Iterator<Object>i1=s1.iterator();
while(i1.hasNext()) {
	System.out.println(i1.next());
}
	}
}
