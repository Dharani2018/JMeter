package com.dp.test;

public class Hello1{
	final int a=23;
	 int b=23;
	 float c=5.2f;
	 
		/*
		 * byte d=(byte)b; String e="kiran"; boolean k= b!=c & c>a;
		 */
	
	 public void diff() {
	  
	   if (a>b) {System.out.println(a-b);}
		
	  else if(b>a) { System.out.println(b-a); } 
		 
	  else {System.out.println("a and b are equal");}
    }

}
   class Hello extends Hello1{
    
    	
	 public static void main(String[] args) 
    { 

        System.out.println("Welcome to java world"); 

        Hello1 h = new Hello1();
        h.diff();

  
    } 
}