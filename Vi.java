package basicPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Vi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Object,Object> m1=new HashMap<Object,Object>();
m1.put("Anila", 20);
m1.put("Anla", 200);
m1.put("ila", 290);
m1.put("nila", 270);
m1.put("Ana", 230);
Set<Object>s1=m1.keySet();
//System.out.println(s1);

for (Object s4:m1.keySet())
{
	System.out.println(s4);
}

for(Object s5:m1.values())
{
	System.out.println(s5);
}

for(Entry<Object,Object>s6:m1.entrySet()) {
	System.out.println(s6);
}
Collection<Object> c1= m1.values();
System.out.println(c1);
Set<Entry<Object,Object>> s3=m1.entrySet();
System.out.println(s3);
	}

}
