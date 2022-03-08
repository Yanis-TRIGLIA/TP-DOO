public class MyDate { 
	// private instance variable, not accessible from outside this class
	private static int year;
	public static int month;
	public static int day;
	public static final String[] MONTHS = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	public static final String[] DAYS = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	public static final int [] DAYINMONTHS = {31,28,31,30,31,30,31,31,30,31,30,31};

	public boolean  isLeapYear (int year) {

		if (year%4 == 0 && year% 100 != 0 || year%400 == 0) {

			return true ; 

		}
		return false;	 

	}
	public static boolean isValidDate (int year,int month , int day) {

		if (year>=1 && year<=9999) {
			if(	month>1 && month<12 ) {
				if ( day>1 && day<31 ) {

					return true ; 

				}
			}
		}
		//if(|| day<28 || day<29 || day<30 || day<31) {



		//}
		return false;	 

	}
	public static String getDayOfweek (int year ,int month ,int day) {

		return DAYS [day];

	}
	public MyDate(int year,int month , int day) { 
		this.year = year;
		this.month = month;
		this.day = day;

	}
	public void setDate(int year ,int month ,int day) {

		if (isValidDate (year,month,day)) {

			MyDate.year = year;
			MyDate.month = month;
			MyDate.day = day;

		}

		System.out.println ("Is Invalid Date");



	}

	public static int getYear() {
		return year;
	}

	public static void setYear(int newyear) {
		MyDate.year = newyear;
	}

	public static int getMonth() {
		return month;
	}

	public static void setMonth(int newmonth) {
		MyDate.month = newmonth;
	}

	public static int getDay() {
		return day;
	}

	public static void setDay(int newday) {
		MyDate.day = newday;
	}


	public MyDate nextDay () {
		if (year>=1 && year<=9999) {
			if(	month>1 && month<12 ) {
				if (DAYINMONTHS[getMonth()] == getDay()) {
				++day;

			}
		}
		}
	
	return this;

}


public MyDate nextMonth () {
	if (year>=1 && year<=9999) {
		if(	month>1 && month<12 ) {

			++month;
		}
	}
	return this;

}


public MyDate nextYear() {
	if ( year>=1 && year<=9999) {

		year++;

	}
	return this;

}
public MyDate previousDay() {
	--this.day;
	if (getDay() == 1) {

		setDay(DAYINMONTHS [getMonth()] -1) ;

	}
	return new MyDate(year,month,day);
}
public MyDate previousMonth () {
	--this.month;
	if (month == 1) {
		setDay(31);	
		setMonth(12) ;	
	}
	return new MyDate(year,month,day);

}
public MyDate previousYear() {
	--this.year;
	if (getDay() == 1  && getYear() == 1) {
		setDay(31);	
		setMonth(12) ;	
	}
	return new MyDate(year,month,day);

}
public String toString() {
	return day + "/ "+ " " + month +"/ "+" " + year;
}







}
