public class day {
	private String day;
	private String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	private int dayindex (String day) {
		for(int i=0; i<days.length; i++) {
			if(days[i]==this.day) {
			return i;
			}
		}
		return -1;
	}

	public day(String day) {
		super();
		this.day = day;
	}

	public String getday() {
		return day;
	}

	public void setday(String day) {
		this.day = day;
	}

	public String nextDay() {
		String message = "error";
		int dayidx = dayindex(this.day);
		if (dayidx<6) {
			message = days[dayidx+1];
		} else if (dayidx>5) {
			message = days[dayidx%6];
			}
		if (dayidx==-1) {message = "Invalid day.";}

		return message;
	}
	public String previousDay() {
		String message = "error";
		int dayidx = dayindex(this.day);
		if (dayidx<=0) {
			message = days[Math.abs((dayidx+6)%7)];
		}
		if (dayidx>0) {
			message = days[((dayidx-1)%7)];
		}
	return message;
	}
	public String calculateDay(int addorless) {
		String message = "error";
		int dayidx = dayindex(this.day);
		if (addorless>=0) {
			message = days[((dayidx+addorless)%7)];
		}
		if (addorless<0) {
			message = days[Math.abs((((dayidx+addorless)+7)%7))];
		}
	
	return message;
	}

	public String toString() {
		return day;
	}
}
