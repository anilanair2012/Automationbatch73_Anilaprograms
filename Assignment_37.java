package basicPrograms;

import java.util.Scanner;

public class Assignment_37 {
	static int a=2;
	static int b=3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);

int value=s1.nextInt();
switch (value)
{
case 1:

	int sum=Assignment_37 .a+Assignment_37 .b;
	System.out.println(sum);
	break;
case 2:

	int dif=Assignment_37 .b-Assignment_37 .a;
	System.out.println(dif);
	break;
case 3:

	int mul=Assignment_37 .a*Assignment_37 .b;
	System.out.println(mul);
	break;
case 4:

	double div=Assignment_37 .b/Assignment_37 .a;
	System.out.println(div);
	break;
default:
	System.out.println("Invalid");
}
	
	}

}
