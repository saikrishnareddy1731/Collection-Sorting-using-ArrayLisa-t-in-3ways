package ibm1.in;
import java.lang.Comparable;
public class Data implements Comparable<Data>
{
 int num1;
 
 public Data(int num1) 
 {
		super();
		this.num1=num1;
	}

public int getNum1() {
	return num1;
}

public void setNum1(int num1) {
	this.num1 = num1;
}
   

	@Override
	public int compareTo(Data o) 
	{
		if(num1 < o.num1)
			return 1;
		if(num1>o.num1)
			return -1;
		else
		return 0;
	}

	@Override
	public String toString()
	{
		return String.valueOf(num1);
	}

	
}
