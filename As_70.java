package basicPrograms;

import java.util.Arrays;

public class As_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="My name is Ram";

String s1[]=s.split(" ");
System.out.println(Arrays.toString(s1));

for(int i=0;i<s1.length;i++)
{
	char[]c1=s1[i].toCharArray();
	System.out.println(Arrays.toString(c1));
}
	
	
}



	}


