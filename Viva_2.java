package basicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Viva_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Collection<Integer>c1=new ArrayList<>(Arrays.asList(10,20,10,30));
List<Integer> c2=Arrays.asList(19,29,49,39);
System.out.println(c1);
System.out.println(c2);
int[]arr1= {10,20,30};
System.out.println(Collections.max(c1));
Collections.frequency(c1, 10);
Collections.sort(c2);
int index=Collections.binarySearch(c2,19);
}

}
