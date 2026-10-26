package basicPrograms;

import java.util.HashSet;
import java.util.Set;

public class As_95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Object>s1=new  HashSet<Object>();
s1.add(98);
s1.add(100);
s1.add(111);
s1.add(300);
s1.add(300);
System.out.println(s1);
Set<Object>s2=new  HashSet<Object>();
s2.addAll(s1);
System.out.println(s2);
s2.remove(s1);
s1.clear();

	}

}
