package com.delormeloic.studentsdatarecovery.calendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import com.delormeloic.studentsdatarecovery.calendar.events.EventsParser;
import com.delormeloic.studentsdatarecovery.calendar.exceptions.RecoveryEventsDataException;

/**
 * This class represents an online calendar data recovery.
 *
 * @author DELORME Loïc
 * @since 1.0.0
 */
public class OnlineCalendarDataRecovery extends CalendarDataRecovery
{
	/**
	 * The URL.
	 */
	private final URL url;

	/**
	 * The events parser.
	 */
	private final EventsParser eventsParser;

	/**
	 * Create an online calendar data recovery.
	 * 
	 * @param url
	 *            The URL.
	 * @param eventsParser
	 *            The events parser.
	 * @throws MalformedURLException
	 *             If the URL is malformed.
	 */
	public OnlineCalendarDataRecovery(String url, EventsParser eventsParser) throws MalformedURLException
	{
		super();
		this.url = new URL(url);
		this.eventsParser = eventsParser;
	}

	/**
	 * @see com.delormeloic.studentsdatarecovery.calendar.CalendarDataRecovery#recoverEventsData()
	 */
	@Override
	public void recoverEventsData() throws RecoveryEventsDataException
	{
		try
		{
			final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.url.openConnection().getInputStream()));
			final StringBuilder data = new StringBuilder();

			String currentLine;
			while ((currentLine = bufferedReader.readLine()) != null)
			{
				data.append(currentLine);
			}

			this.events = this.eventsParser.parseEvents(data.toString());
		}
		catch (IOException e)
		{
			throw new RecoveryEventsDataException(e.getMessage());
		}
	}
}