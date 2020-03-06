package ibm1.in;

import java.util.Comparator;

public class DataComparator implements Comparator<Data>
{

	@Override
	public int compare(Data o1, Data o2) {
		if(o1.num1<o2.num1)
			return 1;
		if(o1.num1>o2.num1)
			return -1;
		else
		return 0;
	}
	

}
