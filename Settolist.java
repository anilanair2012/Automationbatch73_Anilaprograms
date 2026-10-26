package basicPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Settolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Set<Integer>s1=new HashSet<Integer>();
	s1.add(90);
	s1.add(90);
	s1.add(91);
	s1.add(93);
	List<Integer>l1=new ArrayList(s1);
	
	l1.add(91);
	System.out.println(l1);
	}
}
