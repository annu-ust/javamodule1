package javaenum;

public enum DayOfWeek {
 MONDAY("Monday"),
 TUESDAY("Tuesday"),
 WEDNESDAY("Wednesday"),
 THURSDAY("Thursday"),
 FRIDAY("Friday"),
 SATURDAY("Saturday"),
SUNDAY("Sunday");
	
	private final String name;
	
	 DayOfWeek(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	public String getName() {
	   return name;}
}
