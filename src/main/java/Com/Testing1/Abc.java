package Com.Testing1;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my abc class");
		
		compare("Testing","Test");

	}
	
	public static void compare(String a,String b) {
		if(a.equalsIgnoreCase(b)) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
	}

}
