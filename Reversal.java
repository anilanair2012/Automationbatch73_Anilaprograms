package basicPrograms;

public class Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="malayalam";
String output="";
for(int i=a.length()-1;i>=0;i--)
{
	char c1=a.charAt(i);
	output=output+c1;
}
System.out.println(output);
	
if(a.equals(output)) {
	System.out.println("Psalin");
	
}
else {
	System.out.println("notPsalin");
}
}
}