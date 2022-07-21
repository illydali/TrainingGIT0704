package com.demo.basics;

import javax.management.loading.PrivateClassLoader;

public class EnumEx {
	public static void main(String[] args) {
		DaysInAWeek beautifulDaysInAWeek = DaysInAWeek.SATURDAY;
		System.out.println(beautifulDaysInAWeek);
		switch(beautifulDaysInAWeek) {
		case SATURDAY:
		System.err.println("It's a beautiful " + beautifulDaysInAWeek);
		}
		
		for(DaysInAWeek day : DaysInAWeek.values()) {
			System.out.println(day);
		}
		int option = 1;
	   for(Menu menuOption : Menu.values() ) {
		   System.err.println(option + ". " +  menuOption.getMenuOption());
		   option++;
	   }
	}
}

enum DaysInAWeek {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
}

enum Menu {
//	constants with values
	DISPLAY_FLIGHT("Display the Flight Details"), BOOK_FLIGHT("Book a flight"), CANCEL_FLIGHT("Cancel Flight");
	// instance variable
	private String menuOption;
	// constructor initializes instance variable
	Menu(String pMenuOption){
		menuOption = pMenuOption;
	}
	public String getMenuOption() {
		return menuOption;
	}
}
//cannot extend
// enum MyDaysInAWeek extends DaysInAWeek{
//	 HAPPYDAY,
//	 TERRIFICDAY,
//	 TUESDAY,
//	 WEDNESDAY,
//	 THRUSDAY,
//	 FRIDAY,
//	 SATURDAY
//	}

interface TestInterface {

}

// can implement interface
enum MyDaysInAWeek implements TestInterface {
	HAPPYDAY, TERRIFICDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
}