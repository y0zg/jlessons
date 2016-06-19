package DateAndTime;


import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo1 {
	public static void main(String[] args) {
		LocalDate dateA = LocalDate.of(1985, 10, 23);
		LocalDate dateB = LocalDate.now();
		Period period = Period.between(dateA, dateB);
		System.out.printf("Between %s and %s"
						+ " there are %d years, %d months"
						+ " and %d days%n", dateA, dateB,
				period.getYears(),
				period.getMonths(),
				period.getDays());
	}
}