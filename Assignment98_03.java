package basicPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment98_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set s1=new HashSet();
s1.add(80);
s1.add(90);
s1.add(70);
s1.add(60);

List l1=new ArrayList(s1);
l1.add(80);
System.out.println(l1);
	}

}
