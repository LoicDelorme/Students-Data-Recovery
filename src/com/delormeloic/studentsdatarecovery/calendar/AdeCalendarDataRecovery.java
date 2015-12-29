package com.delormeloic.studentsdatarecovery.calendar;

import java.net.MalformedURLException;

import com.delormeloic.studentsdatarecovery.calendar.events.EventsParser;
import com.delormeloic.studentsdatarecovery.calendar.events.IcsEventsParser;

/**
 * This class represents an ADE calendar data recovery.
 *
 * @author DELORME Loïc
 * @since 1.0.0
 */
public class AdeCalendarDataRecovery extends OnlineCalendarDataRecovery
{
	/**
	 * The ICS events parser.
	 */
	private static final EventsParser ICS_EVENTS_PARSER = new IcsEventsParser();

	/**
	 * Create an ADE calendar data recovery.
	 * 
	 * @param url
	 *            The URL.
	 * @throws MalformedURLException
	 *             If the URL is malformed.
	 */
	public AdeCalendarDataRecovery(String url) throws MalformedURLException
	{
		super(url, ICS_EVENTS_PARSER);
	}
}