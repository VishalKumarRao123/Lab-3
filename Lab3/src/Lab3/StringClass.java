package Lab3;
public class StringClass {

	public static void main(String[] args) {
		String str1 = new String("vishal");
		char ch = str1.charAt(4);
		System.out.println(str1);
		System.out.println("Character at Index 4 is : "+ch);
		String str2 = new String("Vishal");
		int res = str1.compareTo(str2);
		if(res==0)
			  System.out.println("Both are Equals");
		else if(res<0)
			   System.out.println("Both are in Dictonary order");
		else
			System.out.println("opposite to Dictonary order");
        System.out.println("After Concatination of both strings : "+str1.concat(str2));
	if(str1.equals(str2))
		  System.out.println("Both String are Equals ");
	else
		System.out.println("Not Equals");
	if(str1.equalsIgnoreCase(str2))
		 System.out.println("some letter case are not same but Both String are Equals ");
	else
		 System.out.println("Not Equals ");
	System.out.println("Length of "+ str1 + " is "+str1.length());
	System.out.println("Length of "+ str2 + " is "+str2.length());
	
	System.out.println("After replacing 'l' with 'p' in"+str1+" new String is "+str1.replace('l', 'p'));
	System.out.println("Substring in "+str1+" from index 2 to 5 is-->"+str1.substring(2,6)+"");
	}

}