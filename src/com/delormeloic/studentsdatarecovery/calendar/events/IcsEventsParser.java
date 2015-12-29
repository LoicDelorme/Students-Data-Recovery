package com.delormeloic.studentsdatarecovery.calendar.events;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class represents
 *
 * @author DELORME Loïc
 * @since 1.0.0
 */
public class IcsEventsParser extends EventsParser
{
	/**
	 * The ICS pattern for extracting data.
	 */
	private static final Pattern ICS_PATTERN = Pattern.compile("DTSTAMP:(.*?)DTSTART:(.*?)DTEND:(.*?)SUMMARY:(.*?)LOCATION:(.*?)DESCRIPTION:(.*?)UID:(.*?)CREATED:(.*?)LAST-MODIFIED:(.*?)SEQUENCE:(.*?)END:VEVENT");

	/**
	 * The date time formatter.
	 */
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'");

	/**
	 * The begin vevent tag.
	 */
	private static final String BEGIN_VEVENT_TAG = "BEGIN:VEVENT";

	/**
	 * @see com.delormeloic.studentsdatarecovery.calendar.events.EventsParser#parseEvents(java.lang.String)
	 */
	@Override
	public List<Event> parseEvents(String eventsToParse)
	{
		final List<Event> parsedEvents = new ArrayList<Event>();

		LocalDateTime beginEvent;
		LocalDateTime endEvent;
		String summary;
		String location;
		String description;
		Matcher matcher;

		for (String currentVevent : eventsToParse.split(BEGIN_VEVENT_TAG))
		{
			matcher = ICS_PATTERN.matcher(currentVevent);

			if (matcher.find())
			{
				beginEvent = LocalDateTime.parse(matcher.group(2), DATE_TIME_FORMATTER);
				endEvent = LocalDateTime.parse(matcher.group(3), DATE_TIME_FORMATTER);
				summary = matcher.group(4);
				location = matcher.group(5);
				description = matcher.group(6);

				parsedEvents.add(new Event(beginEvent, endEvent, summary, location, description));
			}
		}

		return parsedEvents;
	}
}