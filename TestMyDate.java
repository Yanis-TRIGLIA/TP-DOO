public class TestMyDate {
	public static void main(String[] args) {
		MyDate d1 = new MyDate(999, 12, 31);
		System.out.println(d1);  
		System.out.println(d1.nextDay()); // Tuesday 28 Feb 2012
		System.out.println(d1.nextMonth()); 
		System.out.println(d1.nextYear()); // Wednesday 29 Feb 2012
		/*
		 * System.out.println(d1.nextDay()); // Thursday 1
		 * System.out.println(d1.nextMonth()); // Sunday 1 Apr 2012
		 * System.out.println(d1.nextYear()); // Monday 1 Apr 2013
		 */


		// MyDate d4 = new MyDate(2099, 11, 31); // Invalid year, month, or day!
		// MyDate d5 = new MyDate(2011, 2, 29);  // Invalid year, month, or day!
	}
}
