public class MyTime {
	// private instance variable, not accessible from outside this class
	public static int hour;
	public static int minute;
	public static int second;

	public MyTime (int hour ,int minute , int second) { 
		this.hour = hour;
		this.minute = minute;
		this.second = second;

	}
	public void setTime(int newhour ,int newminute , int newsecond) {
		hour = newhour;
		minute = newminute;
		second = newsecond;
	}
	public int getHour() {
		return hour ; 
	}
	public int getMinute() {
		return minute ; 
	}
	public int getSecond() {
		return second ; 
	}
	public void setHour(int newhour) {
		hour = newhour;
	}
	public void setMinute(int newminute ) {
		minute = newminute;
	}
	public void setSecond(int newsecond) {
		second = newsecond;
	}
	public String toString() {
		return hour  + ":" + minute + ":" + second ;
	}
	public MyTime NextSecond () {
		if(this.second == 59) {
			second = 0;

		}
	}
		public MyTime NextMinute () {
			if(this.second == 59) {
				++minute;
			}
				else if (this.minute == 59)
					minute = 0;

			
		}
			public MyTime NextHour () {
				if(this.second == 59 && this.minute == 59) {
					++hour;

				}
				else if (this.hour == 23)
					hour = 0;
			}



		}





