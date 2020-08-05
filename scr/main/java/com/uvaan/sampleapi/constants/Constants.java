package com.uvaan.sampleapi.constants;

public interface Constants {

	public static final String STATUS_ACTIVE = "ACTIVE";
	public static final String STATUS_INACTIVE = "INACTIVE";

	public static final String SMSSENDERCODE_PATTERN = "^[A-Z]{6}";
	public static final String MOBILE_PATTERN = "\\d{10}";
	public static final String MOBILE_NUM_LENGTH = "^[0-9]{6,14}$";
	public static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public static final String PASSWORD_PATTERN = "^[a-zA-Z][a-zA-Z0-9@#$*%.!]{6,20}$";
	public static final String BAD_REQUEST_ERROR_CD = "400";
	

	public static final String COUNTRY_NAME = "^[a-zA-Z][a-zA-Z]{3,20}$";

	public static final int MAX_RESULTS_PER_PAGE = 10;
	public static final int STARTING_OFFSET = 0;
	public static final String SUCCESS = "success";
	public static final int FAILURE_CODE = 600;

	public static final String DATE_FORMAT = "dd-MM-yyyy";
	public static final String MONTH_YEAR = "MMM yyyy";
	public static final String DATABASE_DB_FORAMT = "yyyy-MM-dd";

	public static final int PAST_INDENT = 1; // past dates - Gred out
	public static final int FUTRURE_INDENT = 2; // Future dates - Available - Green
	public static final int FULL_INDENT = 3; // FULL Red-
	public static final int NOT_AVAILABLIE_INDENT = 4;// BLocked - Blue
	public static final int TO_DAY_INDENT = 5; // TODAY - orange

}
