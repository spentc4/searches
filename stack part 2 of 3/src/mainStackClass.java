import java.util.Stack;

public class mainStackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<bike> bikes = new Stack<bike>();
		int[] a = new int[]{1};
		bike bike1 = new bike(1,1,1,a);
		bikes.add(bike1);
		int[] b = new int[]{1};
		bike bike2 = new bike(2,2,2,b);
		bikes.add(bike2);
		int[] c = new int[]{1};
		bike bike3 = new bike(3,3,3,c);
		bikes.add(bike3);
		
		System.out.println(SequentialSearch.contains(a,1));
		System.out.println(SequentialSearch.contains(b,2));
		System.out.println(SequentialSearch.contains(c,3));

		
		
		
		Stack<mountainBike> mBike = new Stack<mountainBike>();	
		mountainBike mb1 = new mountainBike(1,1,1,1,a);
		mBike.add(mb1);
		mountainBike mb2 = new mountainBike(2,2,2,2,b);
		mBike.add(mb2);
		mountainBike mb3 = new mountainBike(3,3,3,3,c);
		mBike.add(mb3);
		//adding to subclass class inheritance
		//mBike.add((mountainBike) bike1);
	
	}

}
