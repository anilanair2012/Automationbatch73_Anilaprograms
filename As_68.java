package basicPrograms;

import java.util.Arrays;

public class As_68 {
static int countofalpha=0;
static int countofdigit=0;
static int countofwhite=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="kv no 2*";
char[]a1=s.toCharArray();
//Arrays.toString(a1);
for(int i=0;i<a1.length;i++)
{
	if(Character.isAlphabetic(a1[i])) {
		countofalpha++;
	}
	else if(Character.isDigit(a1[i]))
	{
		countofdigit++;
	}
	else if(Character.isWhitespace(a1[i]))
	{
		countofwhite++;
	}
}
System.out.println(+countofalpha);
System.out.println(+countofdigit);
System.out.println(+countofwhite);
System.out.println(a1.length-(countofalpha+countofdigit+countofwhite));
	}

}
