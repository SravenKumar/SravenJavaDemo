package sraven.demo;

import java.util.RandomAccess;

public class App1 {

	static DayOfTheWeek today;

	public static void main(String[] args) {

		System.out.println(App1.today);
		
		today = DayOfTheWeek.TUESDAY;
		
		
		
		// asdf 
		
		System.out.println(App1.today);

		
		
		
	}

}

//package deloitte.demo.day04;
//
//public class App {
//	
//	static String today;
//
//
//	public static void main(String[] args) {
//		
//		
//		System.out.println(App.today);
//		
//		App.today = "Friday";
//		
//		System.out.println(App.today);
//
//
//		App.today = "Boilday"; // X 
//		
//		System.out.println(App.today);
//	}
//
//}