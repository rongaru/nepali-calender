package io.github.rongaru.calender.nepali;

import java.util.Date;

import io.github.rongaru.calender.utility.DateUtils;

public class DateConverter extends DateConverterParent_3 {

	protected void runIfTrue( boolean run, Runnable runnable ) {
		if ( run ) {
			runnable.run( );
		}
	}

	public String convertToEquivalentNepaliDateString( Date date ) {
		long difference = DateUtils.getDifferenceInDays( REFERENCE_FOR_ENGLISH_DATE, date );
		for ( int i = 0; i < difference; i++ ) {
			incrementDayOfMonth( );
			runIfTrue( DAY_OF_MONTH == 2, this::calculateTotalDaysInMonthOfYearOfNepaliCalender );
			runIfTrue( DAY_OF_MONTH > DAYS_IN_MONTH, this::resetDayOfMonthAndIncrementMonthOfYear );
			runIfTrue( MONTH_OF_YEAR > 12, this::resetMonthOfYearAndIncrementYearOfNepaliCalender );
		}
		return String.format( "%d-%02d-%02d", YEAR_OF_NEPALI_CALENDER, MONTH_OF_YEAR, DAY_OF_MONTH );
	}

}
