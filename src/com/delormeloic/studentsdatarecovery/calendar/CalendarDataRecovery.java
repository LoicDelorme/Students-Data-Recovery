package com.delormeloic.studentsdatarecovery.calendar;

import java.util.ArrayList;
import java.util.List;

import com.delormeloic.studentsdatarecovery.calendar.events.Event;
import com.delormeloic.studentsdatarecovery.calendar.exceptions.RecoveryEventsDataException;

/**
 * This class represents a calendar data recovery.
 *
 * @author DELORME Loïc
 * @since 1.0.0
 */
public abstract class CalendarDataRecovery
{
	/**
	 * The events.
	 */
	protected List<Event> events;

	/**
	 * Create a calendar data recovery.
	 */
	public CalendarDataRecovery()
	{
		this.events = new ArrayList<Event>();
	}

	/**
	 * Recover events data.
	 * 
	 * @throws RecoveryEventsDataException
	 *             If it's impossible to recover events data.
	 */
	public abstract void recoverEventsData() throws RecoveryEventsDataException;

	/**
	 * Get the events.
	 * 
	 * @return The events.
	 */
	public List<Event> getEvents()
	{
		return this.events;
	}
}