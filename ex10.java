mport java.util.*;

import java.lang.*;

import java.util.Scanner.*;

public class ex10 {



	    public static void main(String args[])

	    {

	      Scanner input=new Scanner(System.in);

	        int r,h,h2,pi=22/7;

	        double surface,volume;

	        System.out.println("enter the radius");

	        r=input.nextInt();

	        System.out.println("enter the height");

	        h=input.nextInt();

	        System.out.println("enter h2");

	            h2=input.nextInt();

	        surface  = pi * r * (r + Math.sqrt(r*r + h*h2)); 

	volume = 1 / 3 * pi * r*r *h ;

	        System.out.println("surface area is:"+surface+"vol is:"+volume);

	 



	    }

}

	
