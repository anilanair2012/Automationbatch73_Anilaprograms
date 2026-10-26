package basicPrograms;

import java.util.Arrays;

public class As_73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a1="https www.com";
boolean b1=a1.matches("https(.*)");
System.out.println(b1);
String[] s1=a1.split(" ");
System.out.println(Arrays.toString(s1));
String s3=a1.replace("https","http");

System.out.println(s3);
	}

}
