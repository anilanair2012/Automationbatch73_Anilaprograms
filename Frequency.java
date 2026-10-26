package basicPrograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer> m1=new HashMap<String,Integer>();
m1.put("Anila",90);
m1.put("Ani",90);
m1.put("nila",80);
m1.put("Annju",70);
Collections.frequency(m1, 90);
	}

}
