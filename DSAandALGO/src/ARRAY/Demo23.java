package ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo23 {

	public static void main(String[] args) {
		
		List<String> l=Arrays.asList("salim","Nadeem","Hasan","Rehan","Sadab Khan");
//		
//		Stream<String> s=l.stream();
//		Stream<String> s1=s.filter(x->x.length()<6);
//		s1.forEach(x->System.out.println(x));
		
	List<String> list=l.stream().filter(y->y.length()>6).collect(Collectors.toList());
	System.out.println(list.toString());
	}
     
	}


