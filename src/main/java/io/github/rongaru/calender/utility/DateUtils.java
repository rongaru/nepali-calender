package io.github.rongaru.calender.utility;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import io.github.rongaru.calender.nepali.DateConverter;

public class DateUtils {

	public static LocalDate convertToLocalDate( Date date ) {
		Instant instant = date.toInstant( );
		ZoneId zoneId = ZoneId.systemDefault( );
		return instant.atZone( zoneId ).toLocalDate( );
	}

	public static LocalDateTime convertToLocalDateTime( Date date ) {
		Instant instant = date.toInstant( );
		ZoneId zoneId = ZoneId.systemDefault( );
		return instant.atZone( zoneId ).toLocalDateTime( );
	}

	public static Date createDate( int year, int month, int date ) {
		Calendar calendar = createCalendar( year, month, date );
		return calendar.getTime( );
	}

	public static Calendar createCalendar( int year, int month, int date ) {
		Calendar calendar = Calendar.getInstance( );
		calendar.set( Calendar.MONTH, month - 1 );
		calendar.set( Calendar.YEAR, year );
		calendar.set( Calendar.DATE, date );
		return calendar;
	}

	public static Date createDate( int year, int month, int date, int hour, int minute, int second ) {
		Calendar calendar = createCalendar( year, month, date );
		calendar.set( Calendar.SECOND, second );
		calendar.set( Calendar.MINUTE, minute );
		calendar.set( Calendar.HOUR, hour );
		return calendar.getTime( );
	}

	public static Date createDate( int year, int month, int date, int hour, int minute, int second, int millisecond ) {
		Calendar calendar = createCalendar( year, month, date );
		calendar.set( Calendar.MILLISECOND, millisecond );
		calendar.set( Calendar.SECOND, second );
		calendar.set( Calendar.MINUTE, minute );
		calendar.set( Calendar.HOUR, hour );
		return calendar.getTime( );
	}

	public static long getDifferenceInDays( Date date1, Date date2 ) {
		LocalDate localDate1 = convertToLocalDate( date1 );
		LocalDate localDate2 = convertToLocalDate( date2 );
		return getDifferenceInDays( localDate1, localDate2 );
	}

	public static long getDifferenceInDays( LocalDate date1, LocalDate date2 ) {
		return ChronoUnit.DAYS.between( date1, date2 );
	}

	public static String convertToEquivalentNepaliDateString( Date date ) {
		DateConverter converter = new DateConverter( );
		return converter.convertToEquivalentNepaliDateString( date );
	}

}
