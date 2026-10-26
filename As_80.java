package basicPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class As_80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>a1=new ArrayList<Integer>();
a1.add(4);
a1.add(10);
a1.add(5);
a1.add(8);
Iterator<Integer>i1=a1.iterator();
while(i1.hasNext())
{
	System.out.println(i1.next());
	
}
ListIterator<Integer>l1=a1.listIterator();
while(l1.hasNext()) {
	System.out.println(l1.next());
}
while(l1.hasPrevious())
{
	System.out.println(l1.previous());
}}}
