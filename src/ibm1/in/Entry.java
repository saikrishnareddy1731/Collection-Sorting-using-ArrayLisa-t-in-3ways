package ibm1.in;

import java.util.Set;
import java.util.TreeSet;

public class Entry {
	public static void main(String []args)
	{
		//if u want to add directly u can use here only
		//Set<Data> set=new TreeSet<>(); 
		//set.add(1);
		
		
		//ii.one way to call this
		//Set<Data> set=new TreeSet<>(); 
		
		//iii.another way is
		Set<Data> set=new TreeSet<>(new DataComparator()); 
		set.add(new Data(7));
		set.add(new Data(1));
		set.add(new Data(6));
		set.add(new Data(4));
		set.add(new Data(14));
		System.out.println(set);
				
	}

}
