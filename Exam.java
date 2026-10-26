package basicPrograms;

public class Exam {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count=0;
		int temp=0;
String s="n2";
char[]c1=s.toCharArray();
for(int i=0;i<c1.length;i++)
{
	Boolean b1=Character.isDigit(c1[i]);
	if(b1==true)
	{
	count++;	
	}
	else
	{
		temp++;
	}
	
}
System.out.println(count);
System.out.println(temp);
	}

}
