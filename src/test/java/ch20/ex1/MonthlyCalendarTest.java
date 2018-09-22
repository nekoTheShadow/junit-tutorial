package ch20.ex1;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MonthlyCalendarTest {

	@Test
	@DisplayName("現在時刻が2012-01-31の場合、0を返す")
	void return0From20120131() {
		assertThat(MonthlyCalendar.from(LocalDate.of(2012, 1, 31)).getRemainingDays()).isEqualTo(0);
	}

	@Test
	@DisplayName("現在時刻が2012-01-30の場合、1を返す")
	void return1From20120130() {
		assertThat(MonthlyCalendar.from(LocalDate.of(2012, 1, 30)).getRemainingDays()).isEqualTo(1);
	}

	@Test
	@DisplayName("現在時刻が2012-02-01の場合、28を返す")
	void return28From20120201() {
		assertThat(MonthlyCalendar.from(LocalDate.of(2012, 2, 1)).getRemainingDays()).isEqualTo(28);
	}
}
