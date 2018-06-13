package com.talos.javatraining.lesson8;



import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;


public class MainImpl implements Main
{

	@Override
	public Instant getInstant(String dateTime)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		TemporalAccessor time = formatter.parse(dateTime);
		LocalDateTime localDateTime = LocalDateTime.from(time);
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime,ZoneId.systemDefault());
		return Instant.from(zonedDateTime).plusSeconds(1).minusSeconds(600);
	}

	@Override
	public Duration getDuration(Instant a, Instant b)
	{
		Duration duration = Duration.between(a,b);
		return duration.plusDays(1).minusHours(4);
	}

	@Override
	public String getHumanReadableDate(LocalDateTime localDateTime)
	{
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDateTime = localDateTime.plusHours(3);
		LocalDate localDate = localDateTime.toLocalDate();
		localDate = localDate.withMonth(Month.JULY.getValue());

		TemporalAdjuster SET_YEAR = w -> {
			LocalDate result = (LocalDate) w;
			while (result.getYear() % 2 == 0) {
				result = result.plusYears(1);
			}
			return result;
		};

		localDate = localDate.with(SET_YEAR);

		return dateTimeFormatter.format(localDate);

	}

	@Override
	public LocalDateTime getLocalDateTime(String dateTime)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ssmmHHddMMyyyy");

		TemporalAccessor temporalAccessor = formatter.parse(dateTime);

		TemporalAdjuster SET_MONTH = w -> {
			LocalDateTime result = (LocalDateTime) w;
			while (result.getMonth().getValue() % 2 != 0) {
				result = result.plusMonths(1);
			}
			return result;
		};

		LocalDateTime localDateTime = LocalDateTime.from(temporalAccessor).with(SET_MONTH);

		return localDateTime.plusSeconds(localDateTime.getSecond());

	}

	@Override
	public Period calculateNewPeriod(Period period)
	{
		return period.plusMonths(5).plusDays(6).minus(Period.ofWeeks(2));
	}

	@Override
	public LocalDate toLocalDate(Year year, MonthDay monthDay)
	{
		year = year.plusYears(3);

		int day = (int) Math.floor(monthDay.getDayOfMonth() / 5);

		if(day == 0)
			day = 1;
		else
			day *= 5;

		monthDay = monthDay.withDayOfMonth(day);

		return monthDay.atYear(year.getValue());

	}

	@Override
	public LocalDateTime toLocalDateTime(YearMonth yearMonth, int dayOfMonth, LocalTime time)
	{
		time = time.withSecond(0).minusMinutes(37);
		return time.atDate(yearMonth.atDay(dayOfMonth).plusDays(3));
	}

	@Override
	public TemporalAdjuster createTemporalAdjusterNextMonday()
	{
		TemporalAdjuster NEXT_MONDAY = w -> {
			LocalDate result = (LocalDate) w;
			do {
				result = result.plusDays(1);
			} while (result.getDayOfWeek() != DayOfWeek.MONDAY);
			return result;
		};
		return NEXT_MONDAY;
	}

	@Override
	public TemporalAdjuster createTemporalAdjusterNextFebruaryFirst()
	{
		TemporalAdjuster NEXT_FEBRUARY_FIRST = w -> {
			LocalDate result = (LocalDate) w;
			do {
				result = result.plusMonths(1);
				if (result.getMonth() == Month.FEBRUARY)
					result = result.withDayOfMonth(1);
			} while (result.getMonth() != Month.FEBRUARY);
			return result;
		};
		return NEXT_FEBRUARY_FIRST;
	}

	@Override
	public String adjustDateTime(String localDateTime, TemporalAdjuster adjuster)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		TemporalAccessor temporalAccessor = formatter.parse(localDateTime);

		LocalDateTime dateTime = LocalDateTime.from(temporalAccessor).with(adjuster);

		return dateTime.toString();

	}

	@Override
	public String processZonedDateTime(String zonedDateTime)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
		TemporalAccessor temporalAccessor = formatter.parse(zonedDateTime);
		ZonedDateTime zonedDate = ZonedDateTime.from(temporalAccessor);
		zonedDate = zonedDate.withZoneSameInstant(ZoneId.of("UTC")).plusHours(1);

		zonedDate = zonedDate.withMinute((int)Math.floor(zonedDate.getMinute()/15) * 15);

		return zonedDate.format(DateTimeFormatter.RFC_1123_DATE_TIME);


	}
}
