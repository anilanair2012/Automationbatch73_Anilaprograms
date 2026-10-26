package basicPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class As_98_maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> c1=new ArrayList<Integer>();
c1.add(90);
c1.add(80);
c1.add(70);
c1.add(60);
c1.add(50);
Integer max= Collections.max(c1);
System.out.println(max);
Integer min=Collections.min(c1);
System.out.println(min);
Collections.sort(c1);
	}

}
