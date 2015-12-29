package com.delormeloic.studentsdatarecovery.calendar;

import java.net.MalformedURLException;
import java.time.LocalDate;

import com.delormeloic.studentsdatarecovery.calendar.helpers.AdeUrlGenerator;

/**
 * This class represents a Claude Bernard University ADE calendar data recovery.
 *
 * @author DELORME Loïc
 * @since 1.0.0
 */
public class ClaudeBernardUniversityAdeCalendarDataRecovery extends AdeCalendarDataRecovery
{
	/**
	 * The Claude Bernard University ADE base URL.
	 */
	public final static String CLAUDE_BERNARD_UNIVERSITY_ADE_BASE_URL = "http://adelb.univ-lyon1.fr/jsp/custom/modules/plannings/anonymous_cal.jsp?";

	/**
	 * The Claude Bernard University project ID.
	 */
	public static final String CLAUDE_BERNARD_UNIVERSITY_PROJECT_ID = "1";

	/**
	 * The Claude Bernard University calendar type.
	 */
	public final static String CLAUDE_BERNARD_UNIVERSITY_CALENDAR_TYPE = "ical";

	/**
	 * Create a Claude Bernard University ADE calendar data recovery.
	 * 
	 * @param beginDate
	 *            The date on which data begins to be recovered.
	 * @param endDate
	 *            The date on which data stops to be recovered.
	 * @param resources
	 *            The resources.
	 * @throws MalformedURLException
	 *             If the URL is malformed.
	 */
	public ClaudeBernardUniversityAdeCalendarDataRecovery(LocalDate beginDate, LocalDate endDate, String... resources) throws MalformedURLException
	{
		super(AdeUrlGenerator.generateUrl(CLAUDE_BERNARD_UNIVERSITY_ADE_BASE_URL, resources, CLAUDE_BERNARD_UNIVERSITY_PROJECT_ID, CLAUDE_BERNARD_UNIVERSITY_CALENDAR_TYPE, beginDate, endDate));
	}
}