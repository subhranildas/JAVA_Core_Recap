package basic;

public class Operators {

	public static void main(String[] args) {
		
		int a=10,b=34;
		//arithmetic operator
		System.out.println("addition: " + (a+b));
		System.out.println("subtraction: " + (b-a));
		System.out.println("multiplication: " + (a*b));
		System.out.println("division: " + (b/a));
		System.out.println("modulus: " + (b%a));
		
		//relational operator
		System.out.println(a>b);	//greater than
		System.out.println(a<b);	//less than
		System.out.println(a>=b);	//greater than or equal
		System.out.println(a<=b);	//less than or equal
		System.out.println(a==b);	//equals
		System.out.println(a!=b);	//not equals
		
		//unary operator
		System.out.println(a++);	//post increment
		System.out.println(++a);	//pre increment
		System.out.println(b--);	//post decrement
		System.out.println(--b);	//pre decrement
		
		//logical operator
		System.out.println(a>10 && b<30);	//and
		System.out.println(a==10 || b<30);	//or
		
		//bitwise operator
		System.out.println(a & b);	//AND
		System.out.println(a | b);	//OR
		System.out.println(a ^ b);	//EXOR
		
		//ternary operator
		int c = (b>a)?0:1;			//if b>a then assign 0 else 1
		System.out.println(c);
		
		//assignment operator
		a+=b;
		System.out.println(a);
		a-=b;
		System.out.println(a);
		a*=b;
		System.out.println(a);
		a/=b;
		System.out.println(a);
		//similarly we can also use %= , &= , |= , ^= , >>= , <<= .
		
		

	}

}
