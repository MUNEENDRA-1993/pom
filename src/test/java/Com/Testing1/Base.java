package Com.Testing1;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("this is my base class");
		 
		 int x=add(25,35);
		 System.out.println(x);
		 int z=sum(45, 25);
		 System.out.println(z);

	}
	
	   public static int add(int a, int b) {
		    return a+b;
		   
	   }
	   public static int sum(int x, int y) {
		   return x+y;
	   }

}
