
public class RatlTest
{
  public static void main(String[] args) 
    {
      Ratl a = new Ratl(3, 5);
      Ratl b = new Ratl(7, 11);
      Ratl st = new Ratl(6, 10);
      Ratl aa = new Ratl(3, 5);
      Boolean x;
      System.out.printf("%n");

      System.out.printf("fields of a:  %s%n", a.debugPrint());
      System.out.printf("fields of b:  %s%n", b.debugPrint());
      System.out.printf("fields of st: %s%n%n", st.debugPrint());      
      
      x = (a == a);
      System.out.printf("%-32s%b%n", "3/5 == the same 3/5", x);

      x = (a == aa);
      System.out.printf("%-32s%b%n", "3/5 == a different 3/5", x);
      
      x = a.equals(a);
      System.out.printf("%-32s%b%n", "3/5 .equals the same 3/5", x);

      x = a.equals(aa);
      System.out.printf("%-32s%b%n", "3/5 .equals a different 3/5", x);
      System.out.printf("%n");

      // static test fns

      System.out.printf("static:%n");
      x = Ratl.ident(a, a);
      System.out.printf("%-32s%b%n", "3/5 is ident to the same 3/5", x);

      x = Ratl.ident(a, aa);
      System.out.printf("%-32s%b%n", "3/5 is ident to a different 3/5", x);

      x = Ratl.ident(a, st);
      System.out.printf("%-32s%b%n%n", "3/5 is ident to 6/10", x);

      x = Ratl.equiv(a, a);
      System.out.printf("%-32s%b%n", "3/5 is equiv to the same 3/5", x);

      x = Ratl.equiv(a, aa);
      System.out.printf("%-32s%b%n", "3/5 is equiv to a different 3/5", x);

      x = Ratl.equiv(a, st);
      System.out.printf("%-32s%b%n%n", "3/5 is equiv to 6/10", x);

      // member test fns

      System.out.printf("member%n");
      x = a.ident(a);
      System.out.printf("%-32s%b%n", "3/5 is ident to the same 3/5", x);

      x = a.ident(aa);
      System.out.printf("%-32s%b%n", "3/5 is ident to a different 3/5", x);

      x = a.ident(a, st);
      System.out.printf("%-32s%b%n%n", "3/5 is ident to 6/10", x);

      x = a.equiv(a);
      System.out.printf("%-32s%b%n", "3/5 is equiv to the same 3/5", x);

      x = a.equiv(aa);
      System.out.printf("%-32s%b%n", "3/5 is equiv to a different 3/5", x);

      x = a.equiv(st);
      System.out.printf("%-32s%b%n%n", "3/5 is equiv to 6/10", x);

      // add
      
      Ratl c;
      c = Ratl.add(a, b);
      System.out.printf("static: %s + %s = %s%n", a, b, c);

      Ratl d = new Ratl(a);
      d.add(b);
      System.out.printf("member: %s + %s = %s%n%n", a, b, d);

      // add with reduction
      
      a = new Ratl(3, 6);
      b = new Ratl(14, 14);
      c = Ratl.add(a, b);

      System.out.printf("static: %s + %s = %s%n", a, b, c);
      
      d = new Ratl(a);
      d.add(b);
      System.out.printf("member: %s + %s = %s%n%n", a, b, d);

      // subtract
      
      c = Ratl.sub(new Ratl(3, 5), new Ratl(7, 11));
      System.out.printf("static: 3/5 - 7/11 = %s%n", c);

      c = new Ratl(3, 5);
      c.sub(new Ratl(7, 11));
      System.out.printf("member: 3/5 - 7/11 = %s%n%n", c);

      // multiply
      
      c = Ratl.mult(new Ratl(3, 6), new Ratl(7, 11));
      System.out.printf("static: 3/6 * 7/11 = %s%n", c);

      c = Ratl.mult(new Ratl(7, 11), new Ratl(3, 6));
      System.out.printf("static: 7/11 * 3/6 = %s%n%n", c);

      // divide
      
      c = Ratl.div(new Ratl(7, 11), new Ratl(7, 11));
      System.out.printf("static: 7/11 / 7/11 = %s%n", c);

      c = Ratl.div(new Ratl(14, 11), new Ratl(7, 11));
      System.out.printf("static: 14/11 / 7/11 = %s%n", c);


      System.out.printf("%n");
      testGCD(6, 10);
      testGCD(6, 6);
      testGCD(10, 6);
      testGCD(6, 12);
      testGCD(6, 16);
      testGCD(3, 5);
      System.out.printf("%n");

   } // end main

  public static void testGCD(int a, int b)
    {
	System.out.printf("gcd of %d and %d is %d%n", a, b,
			  Ratl.gcd(a, b));
	return;
    }

} // end class RatlTest
