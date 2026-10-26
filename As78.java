package basicPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class As78 {

	public static void main(String[] args) {
ArrayList<Integer>a1=new ArrayList<Integer>();
a1.add(4);

a1.add(6);
a1.add(2,3);
a1.add(8);
a1.add(14);
//Collections.sort(a1);
System.out.println(a1);
ArrayList<Integer>a2=new ArrayList<Integer>();
a2.addAll(a1);
System.out.println(a2);
boolean b1=a2.contains(3);
System.out.println(b1);
boolean  b2=a2.containsAll(a1);
System.out.println(b2);
a2.remove(3);
System.out.println(a2);
a2.removeAll(a1);
System.out.println(a2);
a1.clear();
System.out.println(a1);
boolean b3=a1.isEmpty();
System.out.println(b3);
}}
