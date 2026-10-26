package basicPrograms;

public class As_77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hello world";
StringBuffer s1=new StringBuffer("First");

StringBuilder s2=new StringBuilder("second word");
s1.insert(0, 'f');
s2.delete(0, 6);
System.out.println(s1);
System.out.println(s2);
	}

}
