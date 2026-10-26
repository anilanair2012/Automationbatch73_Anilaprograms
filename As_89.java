package basicPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class As_89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Object>l1=new ArrayList<Object>();
l1.add("English");
l1.add(40);
Iterator<Object>i1=l1.iterator();
while(i1.hasNext())
{
	System.out.println(i1.next());
}
ListIterator<Object>li=l1.listIterator();
while(li.hasNext())
{
	li.next();
	
}
while(li.hasPrevious())
{
	System.out.println(li.previous());
}
	}

}
