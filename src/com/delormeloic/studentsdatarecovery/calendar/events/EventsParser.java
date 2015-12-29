package com.delormeloic.studentsdatarecovery.calendar.events;

import java.util.List;

/**
 * This class represents an events parser.
 *
 * @author DELORME Loïc
 * @since 1.0.0
 */
public abstract class EventsParser
{
	/**
	 * Parse events.
	 * 
	 * @param eventsToParse
	 *            The events to parse.
	 * @return A list of parsed events.
	 */
	public abstract List<Event> parseEvents(String eventsToParse);
}