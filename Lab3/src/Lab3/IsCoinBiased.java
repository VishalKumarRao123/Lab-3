package Lab3;

import java.util.Random;
class Coin{
	public  void checkcoin() {
	 Random coin =  new Random();
	 //i will assume number 0 as head
	  int head=0;
	 for(int i=0;i<500;i++) {
		 int res = coin.nextInt(2);
		 System.out.print(res);
		 if(res==0)
			  head++;
	 }
	 System.out.println();
	 System.out.println("Head :"+head+"  Tail :"+(500-head));
	if(head==250)
		System.out.println("Coin is Not Biased !");
	else
		System.out.println("Coin is Biased");}
}
public class IsCoinBiased {
     public static void main(String[] args) {
    	 Coin coinobj = new Coin();
    	 coinobj.checkcoin();
     };
     
}