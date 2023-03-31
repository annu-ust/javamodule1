package javaenum;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfWeek today=DayOfWeek.SATURDAY;
	
  System.out.println("today is "+today.getName());
  
  switch(today) {
  case MONDAY:System.out.println(" week starts");
                break;
  case TUESDAY:System.out.println(" second day");
               break;
  case WEDNESDAY:System.out.println(" 2 more days for week end");
                  break;
  case THURSDAY:System.out.println(" wait for tommarrow");
                break;
  case FRIDAY:System.out.println(" time to get rid off ");
              break;
  case SATURDAY:System.out.println("holiday!!!!!!!!!");
                break;
  case SUNDAY:System.out.println(" sunday holiday......!");
              break;
              
  }
	}

}
