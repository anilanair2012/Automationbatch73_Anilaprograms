package basicPrograms;

//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class As_92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer> m1=new HashMap<String,Integer>();
m1.put("Anil", 123);
m1.put("Ani", 122);
m1.put("An", 121);
m1.put("A", 124);
for(String s1:m1.keySet())
{
	System.out.println(s1);
}

for(Integer s2:m1.values())
{
	System.out.println(s2);
}
for(Entry<String,Integer>s3:m1.entrySet())
{
	System.out.println(s3);	
}
Iterator<Entry<String,Integer>>s5=m1.entrySet().iterator();
while(s5.hasNext()) {
	Entry<String,Integer>e1=s5.next();
	System.out.println(e1);
}
	}

}
