package Practice1.Practice1;

public class SwpaNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		
		System.out.println("before swap a is "+a);
		System.out.println("before swap b is "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swap a is "+a);
		System.out.println("after swap b is "+b);

	}

}
