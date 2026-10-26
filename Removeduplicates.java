package basicPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> l1=Arrays.asList(10,20,10,30,40);
Set<Integer> s1=new LinkedHashSet<Integer>(l1);
System.out.println(s1);
	}

}
