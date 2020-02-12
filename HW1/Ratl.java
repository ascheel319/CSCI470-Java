public class Ratl
{
	private int valueNum;
	private int valueDenom;
	private int visibleNum;
	private int visibleDenom;

	// no-arg constructor
	// creates a Ratl with value 0/1
	public Ratl()
	{
		valueNum = 0;
		valueDenom = 1;
	}
	// two-int constructor
	// creates a Ratl with value num/denom
	public Ratl(int num, int denom)
	{
		valueNum = num;
		valueDenom = denom;
	}
	// Ratl constructor
	// builds a new Ratl with the same values as its input
	public Ratl(Ratl a)
	{
		valueNum = a.valueNum;
		valueDenom = a.valueDenom;
	}
	// getters
	public int getNum()
	{
		return valueNum;
	}
	public int getDenom()
	{
		return valueDenom;
	}
/*	public int getVisNum()
	{
		return visibleNum;
	}
	public int getVisDenom()
	{
		return visbileDenom;
	}
*/
	// setters
	public void setNum(int num)
	{
		valueNum = num;
	}
	public void setDenom(int denom)
	{
		valueDenom = denom;
	}
/*	public void setVisNum(int num)
	{

	}
	public void setVisDenom(int denom)
	{

	}
*/
	// convert to string
	@Override
	public String toString()
	{
		return valueNum + "/" + valueDenom;
	}

	// reduce
	// reduces a Ratl to the canonical form described above
	// uses the gcd function
	public void reduce()
	{
		//maybe?
		gcd(valueNum, valueDenom);
	}

	// static gcd
	public static int gcd(int a, int b)
	{
		int gcd = 0;
		for(int i = 1; i <= a; i++)
		{
			if(Math.abs(a) % i == 0 && Math.abs(b) % i == 0)
			{
				gcd = i;
			}
		}
		return gcd;
	}

	// static negate
	// given a/b, returns -a/b
	public static Ratl negate(Ratl a)
	{
		//not sure if this will work or not
		a.valueNum = a.valueNum * -1;
	}

	// static invert
	// given a/b, returns b/a
	public static Ratl invert(Ratl a)
	{
		//untested
		int temp;
		temp = a.valueNum;
		a.valueNum = a.valueDenom;
		a.valueDenom = temp;
	}

	// add
	// adds b to the Ratl it is called with
	public void add(Ratl b)
	{
		for(int i = 1; i < 100; i++)
		{
			if(valueNum * i == b.valueNum * )
		}
		//maybe?
		valueNum = valueNum + b.valueNum;
		//valueDenom = valueDenom + b.valueDenom;
	}

	// sub
	// implemented with add and negate
	public void sub(Ratl b)
	{
		
	}

	// mult
	public void mult(Ratl b)
	{
		
	}

	// div
	// implemented with mult and inverse
	public void div(Ratl b)
	{
		
	}

	// static add
	public static Ratl add(Ratl a, Ratl b)
	{
		
	}

	// static sub
	public static Ratl sub(Ratl a, Ratl b)
	{
		
	}

	// static mult
	public static Ratl mult(Ratl a, Ratl b)
	{
		
	}

	// static div
	public static Ratl div(Ratl a, Ratl b)
	{
		
	}

	// member ident
	public boolean ident(Ratl a)
	{
		
	}

	// member equiv
	public boolean equiv(Ratl a)
	{
		
	}

	// static ident
	public static boolean ident(Ratl a, Ratl b)
	{
		
	}

	// static equiv
	public static boolean equiv(Ratl a, Ratl b)
	{
		if(a.valueNum == b.valueNum && a.valueDenom == b.valueDenom)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	// debugPrint
	// builds a string from the fields of a Ratl object as follows:
	// num value 3 denom value 5 num visible 6 denom visible 10
	// you might find Integer.toString() useful
	public String debugPrint()
	{
		
	}


}
