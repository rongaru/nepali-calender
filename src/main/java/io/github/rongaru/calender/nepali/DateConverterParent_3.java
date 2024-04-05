package io.github.rongaru.calender.nepali;

abstract class DateConverterParent_3 extends DateConverterParent_2 {

	protected void incrementDayOfMonth( ) {
		DAY_OF_MONTH++;
	}

	protected void resetDayOfMonthAndIncrementMonthOfYear( ) {
		DAY_OF_MONTH = 1;
		MONTH_OF_YEAR++;
	}

	protected void resetMonthOfYearAndIncrementYearOfNepaliCalender( ) {
		MONTH_OF_YEAR = 1;
		YEAR_OF_NEPALI_CALENDER++;
	}

	protected void calculateTotalDaysInMonthOfYearOfNepaliCalender( ) {
		DAYS_IN_MONTH = TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ YEAR_OF_NEPALI_CALENDER - 2000 ][ MONTH_OF_YEAR - 1 ];
	}

}
