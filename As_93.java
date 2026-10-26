package basicPrograms;

import java.util.HashMap;
import java.util.Map;

public class As_93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer> m1=new HashMap<String,Integer>();
m1.put("Anila",123);
m1.put("Anil",123);
m1.put("Ani",122);
m1.put("An",133);
Map<String,Integer> m2=new HashMap<String,Integer>();
m2.putAll(m1);
System.out.println(m2);
m2.replace("An", 143);

m2.putIfAbsent("Anju", 124);
System.out.println(m2);
boolean b1=m2.isEmpty();
m2.clear();
System.out.println(m2);
m1.size();
System.out.println(m1);
m1.remove("Anila");
System.out.println(m1);
}
}
