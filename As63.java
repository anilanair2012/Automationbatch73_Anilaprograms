package basicPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class As63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);
int i1=s1.nextInt();
int a1[]=new int[i1];

for(int i=0;i<i1;i++)
{
a1[i]=s1.nextInt();
}
System.out.println(Arrays.toString(a1));
s1.close();
	}

}
