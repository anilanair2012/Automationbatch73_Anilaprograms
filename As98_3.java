package basicPrograms;

import java.util.Map.Entry;
//import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class As98_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> l1=new ArrayList<>(Arrays.asList(10,20,30,40));
System.out.println(Collections.max(l1));
System.out.println(Collections.min(l1));
boolean b1=l1.isEmpty();
System.out.println(b1);
int count=l1.size();
System.out.println(count);
System.out.println(l1.contains(40));
List<Integer> l2=new ArrayList<>(Arrays.asList(14,25,35,45));

l1.addAll(l2);
System.out.println(l1);

Set<Object> s1=new HashSet<Object>();
s1.add(90);
s1.add(9);
s1.add(80);
s1.add(10);
Iterator i1=s1.iterator();
while(i1.hasNext()) {
	System.out.println(i1.next());
}

Map<String,Integer> m1=new HashMap<String,Integer>();

m1.put("Ani", 90);
m1.put("Anju", 98);
for(Entry<String,Integer>s3:m1.entrySet())
{
System.out.println(s3);	
}
	}

}
