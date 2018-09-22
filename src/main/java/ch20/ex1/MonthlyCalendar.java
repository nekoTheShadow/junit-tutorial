package ch20.ex1;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class MonthlyCalendar {
	private LocalDate cal;
	
	public static MonthlyCalendar from(LocalDate cal) {
		return new MonthlyCalendar(cal);
	}
	
	public static MonthlyCalendar today() {
		return new MonthlyCalendar(LocalDate.now());
	}
	
	public int getRemainingDays() {
		int lastDay = cal.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
		return lastDay - cal.getDayOfMonth();
	}
	
	private MonthlyCalendar(LocalDate cal) {
		this.cal = cal;
	}
}
