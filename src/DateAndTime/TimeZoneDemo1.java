package DateAndTime;

//A ZonedDateTime is always immutable and the time component is stored to nanosecond precision.

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class TimeZoneDemo1 {
	public static void main(String[] args) {
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		List<String> zoneList = new ArrayList<>(allZoneIds);

		Collections.sort(zoneList);
		for (String zoneId : zoneList) {
			System.out.println(zoneId);
		}
		// alternatively, you can use this line of code to
		// print a sorted list of zone ids
		// ZoneId.getAvailableZoneIds().stream().sorted().
		//        forEach(System.out::println);
		ZonedDateTime parisTime =
				ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime kievTime=ZonedDateTime.now(ZoneId.of("Europe/Kiev"));
		System.out.println(parisTime);
		System.out.println(kievTime);
	}
}