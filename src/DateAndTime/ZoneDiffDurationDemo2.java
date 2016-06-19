package DateAndTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDiffDurationDemo2 {

	public static void main(String[] args) {
		ZonedDateTime zdt1 = ZonedDateTime.of(
				LocalDateTime.of(2015, Month.JANUARY, 1,
						8, 0),
				ZoneId.of("Europe/Kiev"));
		ZonedDateTime zdt2 = ZonedDateTime.of(
				LocalDateTime.of(2015, Month.JANUARY, 1,
						8, 0),
				ZoneId.of("Europe/Berlin"));
		Duration duration = Duration.between(zdt1, zdt2);
		System.out.printf("There are %d hours and %d minutes.%n",
				duration.toHours(),
				duration.toMinutes() % 60);
	}
}