package compratordemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<Teacher> list=new ArrayList<Teacher>();
		list.add(new Teacher(11,"salim","cse",37000.00));
		list.add(new Teacher(2,"nadeem","ec",36000.00));
		list.add(new Teacher(3,"hasan","me",39000.00));
		list.add(new Teacher(4,"rehan","ce",33000.00));
		list.add(new Teacher(5,"adil","ce",399000.00));
		list.add(new Teacher(6,"imran","cse",37000.00));
		list.add(new Teacher(7,"sufiyan","ec",57000.00));
		list.add(new Teacher(8,"adnan","bsc",87000.00));
		list.add(new Teacher(10,"suleman","cse",97000.00));
		list.add(new Teacher(9,"kamran","msc",31000.00));
		list.add(new Teacher(1,"zishan","cse",22000.00));

		
		for(Teacher t:list) {
			System.out.println(t);
			System.out.println("---------------------------------------------------------");
		}
		System.out.println("===============After Comprator Apply=============================");
		Collections.sort(list,new CompareDemo());
		for(Teacher t:list) {
			System.out.println(t);
			System.out.println("---------------------------------------------------------");
		}
		
		
	}

}
