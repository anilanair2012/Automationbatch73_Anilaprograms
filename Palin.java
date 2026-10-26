package basicPrograms;

public class Palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="madam";
String output="";
for(int i=s1.length()-1;i>=0;i--)
{
char s2=s1.charAt(i);
output=output+s2;
}
if(s1.equals(output))
{
	System.out.println("palin");
}
else
{
	System.out.println("not pain");
}
	}

}
