package basicPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="MalayalaM";
String output="";
for(int i=input.length()-1;i>=0;i--)
{
	char c1=input.charAt(i);
	output=output+c1;
	
}
if(input.equals(output))
{
	System.out.println("Palindrome");
	
}
else
{
	System.out.println("Not palinlindrom");
}
	}

}
