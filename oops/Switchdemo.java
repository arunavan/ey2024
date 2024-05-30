package com.ey.oops;

enum DAYS {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class Switchdemo {
	
	static String getDay(String d) {
	
		return  switch (d) {
        case "Monday"-> "Week day- day1 ";
        case "Tuesday"-> "Week day";
        case "Wednesday"->"Week day";
        case "Thursday"->"Week day";
        case "Friday"->"Week day";
        case "Saturday"-> "Weekend";
        case "Sunday"-> "Weekend";
        default->"Unknown";
    };
	}

	public static void main(String[] args) {
		
		int digit=0;
		switch (digit) {
		case 0: { System.out.println("Zero");break;}
		case 1: { System.out.println("One");break;}
		case 9:  { System.out.println("Nine");break;}
		default :   System.out.println("worng digit");
		}
		String color="red";
		switch (color)
		{
		case "red": { System.out.println("stop");break; }
		case "orange": { System.out.println("wait");break;}
		case "green": { System.out.println("go");break;}
		
		default : System.out.println("No action");
		}
		
		System.out.println(getDay("Sunday"));
		
		
		
		DAYS days = DAYS.WEDNESDAY;
		switch (days) {
		    case MONDAY:
		        System.out.println("Weekdays");
		        break;
		    case TUESDAY:
		        System.out.println("Weekdays");
		        break;
		    case WEDNESDAY:
		        System.out.println("Weekdays");
		        break;
		    case THURSDAY:
		        System.out.println("Weekdays");
		        break;
		    case FRIDAY:
		        System.out.println("Weekdays");
		        break;
		    case SATURDAY:
		        System.out.println("Weekends");
		        break;
		    case SUNDAY:
		        System.out.println("Weekends- holiday-joliday");
		        break;
		    default:
		        System.out.println("Unknown");
		}
	}
}
