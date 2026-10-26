package basicPrograms;

import java.util.Arrays;

public class As69_ana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="ear";
String s2="aoe";

if(s1.length()!=s2.length())
{
System.out.println("Cannot be anagram");	
}
else 
{
	char[]c1=s1.toCharArray();
	char[]c2=s2.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	Arrays.toString(c1);
	Arrays.toString(c2);
	if(Arrays.equals(c1,c2))
	{
		System.out.println("Anagram");
		
	}
	else
	{
		System.out.println("not Anagram");
	}
	

}
	}

}
