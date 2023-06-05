package compratordemo1;

import java.util.Comparator;

public class CompareDemo implements Comparator<Teacher> {

	@Override
	public int compare(Teacher t1, Teacher t2) {
		
		return t1.getId()==t2.getId()?0:t1.getId()>t2.getId()?-1:1 ;// +1 and -1 position change it will decide inc and dec order...
	}

	

}
        