import java.util.*;

	import java.lang.*;

	import java.util.Scanner.*;

public class ex12 {

	  public static void main(String args[])  {

		int n1=0,n2=1,n3,i,n;

	        Scanner input=new Scanner(System.in);

	        System.out.println("enter the number");

	        n=input.nextInt();

	 System.out.print(n1+" "+n2);//printing 0 and 1    

	    

	 for(i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already printed    

	 {    

	  n3=n1+n2;    

	  System.out.print(" "+n3);    

	  n1=n2;    

	  n2=n3;    

	 }    

	  

	}

}

© 2018 GitHub, Inc.
Terms
Privacy
Security
Status
Help
 
