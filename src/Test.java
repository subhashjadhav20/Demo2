import java.util.Scanner;

public class Test {
	 public static void main (String[]args) {
  
	/*	 Scanner scanner=new Scanner (System.in);
	  System.out.println("Enter the Number");
	  int a=scanner.nextInt();
	  System.out.println ("Enter the Number");
	   int b= scanner.nextInt();
	   System.out.println(a+""+b);
  int c;
	   for (int i=1;i<=10;i++) {
		  c=a+b;
 System.out.println(c);
     a=b;
     b=c;
  }/*/
		// direct value
		 int a=0;
		 int b=1;
		 System.out.println(a+""+b);
		 int c;
		 for(int i=1;i<=10;i++) {
		 c=a+b;
		 System.out.println(c);
		 a=b;
		 b=c;
		 }
}
}