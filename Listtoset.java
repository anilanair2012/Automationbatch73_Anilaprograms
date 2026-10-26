package basicPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Listtoset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>l1=new ArrayList<String>();

l1.add("Anila");
l1.add("Anla");
l1.add("Ala");
l1.add("Anila");

Set<Integer>s1=new HashSet(l1);
System.out.println(s1);
	}

}
