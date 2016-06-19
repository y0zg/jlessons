package DateAndTime;
//
//As a more complex example, the code in Listing 13.7 shows a bus travel time calculator.
//		It has one method, calculateTravelTime, which takes a departure ZonedDateTime and an arrival ZonedDateTime.
//		The code calls the calculateTravelTime method twice. Both times the bus departs from Denver,
//		Colorado at 8 in the morning Denver time and arrives in Toronto at 8 in the next morning Toronto time.
//		The first time the bus leaves on March 8, 2014 and the second time it leaves on March 18, 2014.

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TravelTimeCalculator {

	public Duration calculateTravelTime(
			ZonedDateTime departure, ZonedDateTime arrival) {
		return Duration.between(departure, arrival);
	}

	public static void main(String[] args) {
		TravelTimeCalculator calculator =
				new TravelTimeCalculator();
		ZonedDateTime departure1 = ZonedDateTime.of(
				LocalDateTime.of(2014, Month.MARCH, 8,
						8, 0),
				ZoneId.of("Europe/Kiev"));
		ZonedDateTime arrival1 = ZonedDateTime.of(
				LocalDateTime.of(2014, Month.MARCH, 9,
						8, 0),
				ZoneId.of("Europe/Berlin"));
		Duration travelTime1 = calculator
				.calculateTravelTime(departure1, arrival1);
		System.out.println("Travel time 1: "
				+ travelTime1.toHours() + " hours");

		ZonedDateTime departure2 = ZonedDateTime.of(
				LocalDateTime.of(2014, Month.MARCH, 18,
						8, 0),
				ZoneId.of("Europe/Kiev"));
		ZonedDateTime arrival2 = ZonedDateTime.of(
				LocalDateTime.of(2014, Month.MARCH, 19,
						8, 0),
				ZoneId.of("Europe/London"));
		Duration travelTime2 = calculator
				.calculateTravelTime(departure2, arrival2);
		System.out.println("Travel time 2: "
				+ travelTime2.toHours() + " hours");
	}
}