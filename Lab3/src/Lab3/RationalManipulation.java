package Lab3;
import java.util.Scanner;

public class RationalManipulation {
	public static int gcd(int a,int b){
		 if(a==0)
		   return b;
		 if(b==0)
		    return a;
		 if(b%a==0)
		    return a;
		 return gcd(b,a%b);
		}
	public static void reductioninLowestForm(int nr1,int dr1) {
   	 int hcf = gcd(nr1,dr1);
   	 System.out.println("After Simplifying the ration number : "+nr1+"/"+dr1+" ---> "+nr1/hcf+"/"+dr1/hcf);
    }
     public static void add(int nr1,int dr1,int nr2,int dr2,int lcm) {
    	 int sum=0;
    	 sum=sum+nr1*(lcm/dr1);
    	 sum=sum+nr2*(lcm/dr2);
    	 System.out.print(nr1+"/"+dr1+" + "+ nr2+"/"+dr2+" = ");
    	 reductioninLowestForm(sum,lcm);
     }
     public static void subtract(int nr1,int dr1,int nr2,int dr2,int lcm) {
    	 int sum=0;
    	 sum = nr1*(lcm/dr1);
    	 sum=sum - nr2*(lcm/dr2);
    	 System.out.print(nr1+"/"+dr1+" - "+ nr2+"/"+dr2+" = ");
    	 reductioninLowestForm(sum,lcm);
     }
     public static void  mult(int nr1,int dr1,int nr2,int dr2) {
    	 System.out.print(nr1+"/"+dr1+" * "+ nr2+"/"+dr2+" = ");
    	 reductioninLowestForm(nr1*nr2,dr1*dr2);
     }
     public static void  division(int nr1,int dr1,int nr2,int dr2) {
    	 System.out.print(nr1+"/"+dr1+" / "+ nr2+"/"+dr2+" = ");
    	 reductioninLowestForm(nr1*dr2,dr1*nr2);
     }
     public static void  reciprocal(int nr1,int dr1,int nr2,int dr2) {
    	 System.out.println("reciprocal of "+nr1+"/"+dr1+" and "+ nr2+"/"+dr2+" is  "+dr1+"/"+nr1+" and "+ dr2+"/"+nr2+" respectively");
     }
     public static void isEqual(int nr1,int dr1,int nr2,int dr2) {
    	 int hcf = gcd(nr1,dr1);
    	 nr1 = nr1/hcf;
    	 dr1 = dr1/hcf;
    	  hcf = gcd(nr2,dr2);
    	 nr2 = nr2/hcf;
    	 dr2 = dr2/hcf;
    	 if(nr1==nr2&&dr1==dr2)
    		  System.out.println("Both Are equal ");
    	 else
    		 System.out.println("Not Equal");
     }
	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		int nr1,nr2,dr1,dr2;
		System.out.print("Enter Numerator of First Rational Number : ");
		nr1  = sc.nextInt();
		System.out.print("Enter Numerator of First Rational Number : ");
		dr1  = sc.nextInt();
		System.out.print("Enter Numerator of First Rational Number : ");
		nr2  = sc.nextInt();
		System.out.print("Enter Numerator of First Rational Number : ");
		dr2  = sc.nextInt();
	    System.out.println(nr1+"/"+dr1+" and "+ nr2+"/"+dr2);
	    int hcf = gcd(dr1,dr2);
   	    int lcm =  (dr1*dr2)/hcf;
	    add(nr1,dr1,nr2,dr2,lcm);
	    subtract(nr1,dr1,nr2,dr2,lcm);
	    mult(nr1,dr1,nr2,dr2);
	    division(nr1,dr1,nr2,dr2);
	    reciprocal(nr1,dr1,nr2,dr2);
	    reductioninLowestForm(nr1,dr1);
	    reductioninLowestForm(nr2,dr2);
	    isEqual(nr1,dr1,nr2,dr2);
	}

}