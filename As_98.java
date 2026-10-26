

package basicPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class As_98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,20,20,30,40};
Set<Object>s1=new HashSet<Object>();
for(int i=0;i<arr1.length;i++)
{
	if(s1.add(arr1[i])==false)
	{
		System.out.println(arr1[i]);
	}
		
}
Set<Object> s2=new LinkedHashSet<Object>();

s2.addAll(s1);
System.out.println(s2);
}
}