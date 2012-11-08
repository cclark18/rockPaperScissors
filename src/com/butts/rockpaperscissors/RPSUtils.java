package com.butts.rockpaperscissors;

public class RPSUtils {
	public static String getWinner(String androidChoice, String userChoice) {
		String user = "You";
		String android = "Android";
		if (userChoice.equals(androidChoice)){
			return "Nobody";
		} else if (userChoice.equals("rock") && androidChoice.equals("paper")){
			return android;
		} else if (userChoice.equals("scissors") && androidChoice.equals("paper")){
			return user;
		} else if (userChoice.equals("paper") && androidChoice.equals("rock")){
			return user;
		} else if (userChoice.equals("scissors") && androidChoice.equals("rock")){
			return android;
		} else if (userChoice.equals("rock") && androidChoice.equals("scissors")){
			return user;
		} else if (userChoice.equals("paper") && androidChoice.equals("scissors")){
			return android;
		} else {
			return "error";
		}
	}
}
