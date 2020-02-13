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

		visibleNum = 0;
		visibleDenom = 1;
	}
	// two-int constructor
	// creates a Ratl with value num/denom
	public Ratl(int num, int denom)
	{
		valueNum = num;
		valueDenom = denom;

		visibleNum = num;
		visibleDenom = denom;
	}
	// Ratl constructor
	// builds a new Ratl with the same values as its input
	public Ratl(Ratl a)
	{
		valueNum = a.valueNum;
		valueDenom = a.valueDenom;

		visibleNum = a.visibleNum;
                visibleDenom = a.visibleDenom;
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
	// setters
	public void setNum(int num)
	{
		valueNum = num;
		visibleNum = num;
	}
	public void setDenom(int denom)
	{
		valueDenom = denom;
		visibleDenom = denom;
	}
	// convert to string
	@Override
	public String toString()
	{
		return visibleNum + "/" + visibleDenom;
	}

	// reduce
	// reduces a Ratl to the canonical form described above
	// uses the gcd function
	public void reduce()
	{
		int greatestCommonDivisior = gcd(valueNum, valueDenom);
		setNum(valueNum / greatestCommonDivisior);
		setDenom(valueDenom / greatestCommonDivisior);
	}

	// static gcd
	public static int gcd(int a, int b)
	{
		int gcd = 1;
		for(int i = 1; i <= a*b; i++)
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
		a.valueNum = a.valueNum * -1;
		return a;
	}

	// static invert
	// given a/b, returns b/a
	public static Ratl invert(Ratl a)
	{
		int temp;
		temp = a.valueNum;
		a.valueNum = a.valueDenom;
		a.valueDenom = temp;
		return a;
	}

	// add
	// adds b to the Ratl it is called with
	public int[] gcm(Ratl b)
	{
		int[] arrOne = new int[50];
                int[] arrTwo = new int[50];
		int[] ans = new int[2];

                for(int i = 0; i < arrOne.length - 1; i++)
                {
                        arrOne[i] = valueDenom * i;
                }

                for(int i = 0; i < arrTwo.length - 1; i++)
                {
                        arrTwo[i] = b.valueDenom * i;
                }

                //finding a common multiple
                int aMultiple = 100;//large number so that it at least goes once
                int bMultiple = 100;
		boolean changed = false;

                for(int i = 1; i <= arrOne.length - 1; i++)
                {
                        for(int j = 1; j <= arrTwo.length - 1; j++)
                        {
                               if(arrOne[i] == arrTwo[j] && (changed == false))
                                {
//					System.out.println(arrOne[i] + "==" + arrTwo[j]);
                                        ans[0] = i;//a
                                        ans[1] = j;//b
					changed = true;
                                }
                        }
                }
//			for(int i = 0; i < 2; i++)
//				System.out.print("ans[" + i + "]: " + ans[i] + "\n");
//System.out.print("");
		return ans;
	}

	public void add(Ratl b)
	{
		//a = 0
		//b = 1
		int[] multiples = new int[2];
		multiples = gcm(b);

		//getting them to the same base
		valueNum = valueNum * multiples[0];
		valueDenom = valueDenom * multiples[0];
		b.valueNum = b.valueNum * multiples[1];
		b.valueDenom = b.valueDenom * multiples[1];

		//actually add them
		setNum(valueNum + b.valueNum);
		setDenom(valueDenom);

		//call reduce
		reduce();
	}

	// sub
	// implemented with add and negate
	public void sub(Ratl b)
	{
/*		int[] multiples = new int[2];
		multiples = gcm(b);

		//getting them to the same base
		valueNum = valueNum * multiples[0];
		valueDenom = valueDenom * multiples[0];
		b.valueNum = b.valueNum * multiples[1];
		b.valueDenom = b.valueDenom * multiples[1];

		//actually subtract them
		setNum(valueNum - b.valueNum);
		setDenom(valueDenom);

		//call reduce
		reduce();
*/
		b.setNum(negate(b.getNum()));
		add(b);
	}

	// mult
/*	public void mult(Ratl b)
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
*/
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
		String output = "num value " + valueNum + " denom value " + valueDenom + " num visible " + visibleNum + " denom visible " + visibleDenom;
		return output;
	}


}
