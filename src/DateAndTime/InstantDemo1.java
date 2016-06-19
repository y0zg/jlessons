package DateAndTime;


import java.time.Duration;
import java.time.Instant;

public class InstantDemo1 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		for (int i=0;i<1000;i++){
			Integer I=i;
			System.out.println(I);
		}
		Instant end = Instant.now();
		System.out.println(Duration.between(start, end).toMillis()+" ms");
	}
}
