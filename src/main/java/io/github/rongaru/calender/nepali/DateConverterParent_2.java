package io.github.rongaru.calender.nepali;

abstract class DateConverterParent_2 extends DateConverterParent_1 {

	protected static final Integer[][] TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER = new Integer[ 100 ][ 12 ];

	static {
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 0 ] = new Integer[] { 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 1 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 2 ] = new Integer[] { 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 3 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 4 ] = new Integer[] { 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 5 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 6 ] = new Integer[] { 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 7 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 8 ] = new Integer[] { 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 9 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 10 ] = new Integer[] { 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 11 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 12 ] = new Integer[] { 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 13 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 14 ] = new Integer[] { 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 15 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 16 ] = new Integer[] { 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 17 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 18 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 19 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 20 ] = new Integer[] { 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 21 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 22 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 23 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 24 ] = new Integer[] { 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 25 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 26 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 27 ] = new Integer[] { 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 28 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 29 ] = new Integer[] { 31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 30 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 31 ] = new Integer[] { 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 32 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 33 ] = new Integer[] { 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 34 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 35 ] = new Integer[] { 30, 32, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 36 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 37 ] = new Integer[] { 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 38 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 39 ] = new Integer[] { 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 40 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 41 ] = new Integer[] { 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 42 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 43 ] = new Integer[] { 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 44 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 45 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 46 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 47 ] = new Integer[] { 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 48 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 49 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 50 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 51 ] = new Integer[] { 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 52 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 53 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 54 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 55 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 56 ] = new Integer[] { 31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 57 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 58 ] = new Integer[] { 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 59 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 60 ] = new Integer[] { 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 61 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 62 ] = new Integer[] { 31, 31, 31, 32, 31, 31, 29, 30, 29, 30, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 63 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 64 ] = new Integer[] { 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 65 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 66 ] = new Integer[] { 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 67 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 68 ] = new Integer[] { 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 69 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 70 ] = new Integer[] { 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 71 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 72 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 73 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 74 ] = new Integer[] { 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 75 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 76 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 77 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 78 ] = new Integer[] { 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 79 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 80 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 81 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 82 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 83 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 84 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 85 ] = new Integer[] { 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 86 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 87 ] = new Integer[] { 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 88 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 89 ] = new Integer[] { 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 90 ] = new Integer[] { 31, 31, 32, 32, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 91 ] = new Integer[] { 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 92 ] = new Integer[] { 30, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 93 ] = new Integer[] { 31, 31, 31, 32, 31, 31, 29, 30, 29, 30, 29, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 94 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 95 ] = new Integer[] { 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 96 ] = new Integer[] { 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 97 ] = new Integer[] { 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 98 ] = new Integer[] { 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30 };
		TOTAL_DAYS_IN_MONTH_OF_YEAR_OF_NEPALI_CALENDER[ 99 ] = new Integer[] { 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30 };
	}

}
