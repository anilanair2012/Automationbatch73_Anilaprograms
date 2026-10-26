package basicPrograms;

import java.util.Arrays;

public class As66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []s1=new int[2];
int s2[]=new int[2];
s1[0]=8;
s1[1]=9;
for(int i=0,j=s1.length-1;i<s1.length;i++,j--)
{
	s2[j]=s1[i];
}
System.out.println(Arrays.toString(s2));
	}

}
