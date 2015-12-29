package com.delormeloic.studentsdatarecovery.calendar.events;

import java.time.LocalDateTime;

/**
 * This class represents an event.
 *
 * @author DELORME Loïc
 * @since 1.0.0
 */
public class Event implements Comparable<Event>
{
	/**
	 * The date on which the event begins.
	 */
	private final LocalDateTime beginEvent;

	/**
	 * The date on which the event ends.
	 */
	private final LocalDateTime endEvent;

	/**
	 * The summary of the event.
	 */
	private final String summary;

	/**
	 * The location of the event.
	 */
	private final String location;

	/**
	 * The description of the event.
	 */
	private final String description;

	/**
	 * Create an event.
	 * 
	 * @param beginEvent
	 *            The date on which the event begins.
	 * @param endEvent
	 *            The date on which the event ends.
	 * @param summary
	 *            The summary of the event.
	 * @param location
	 *            The location of the event.
	 * @param description
	 *            The description of the event.
	 */
	public Event(LocalDateTime beginEvent, LocalDateTime endEvent, String summary, String location, String description)
	{
		this.beginEvent = beginEvent;
		this.endEvent = endEvent;
		this.summary = summary;
		this.location = location;
		this.description = description;
	}

	/**
	 * Get the date on which the event begins.
	 * 
	 * @return The date on which the event begins.
	 */
	public LocalDateTime getBeginEvent()
	{
		return this.beginEvent;
	}

	/**
	 * Get the date on which the event ends.
	 * 
	 * @return The date on which the event ends.
	 */
	public LocalDateTime getEndEvent()
	{
		return this.endEvent;
	}

	/**
	 * Get the summary.
	 * 
	 * @return The summary.
	 */
	public String getSummary()
	{
		return this.summary;
	}

	/**
	 * Get the location.
	 * 
	 * @return The location.
	 */
	public String getLocation()
	{
		return this.location;
	}

	/**
	 * Get the description.
	 * 
	 * @return The description.
	 */
	public String getDescription()
	{
		return this.description;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		final StringBuilder stringRepresentation = new StringBuilder();
		stringRepresentation.append("Event [beginEvent=");
		stringRepresentation.append(this.beginEvent.toString());
		stringRepresentation.append(", endEvent=");
		stringRepresentation.append(this.endEvent.toString());
		stringRepresentation.append(", summary=");
		stringRepresentation.append(this.summary);
		stringRepresentation.append(", location=");
		stringRepresentation.append(this.location);
		stringRepresentation.append(", description=");
		stringRepresentation.append(this.description);
		stringRepresentation.append("]");

		return stringRepresentation.toString();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		return (this.beginEvent.hashCode() + this.endEvent.hashCode() + this.summary.hashCode() + this.location.hashCode() + this.description.hashCode());
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object object)
	{
		if (this == object)
		{
			return true;
		}

		if (object == null)
		{
			return false;
		}

		if (!(object instanceof Event))
		{
			return false;
		}

		final Event event = (Event) object;

		if (!this.beginEvent.equals(event.beginEvent))
		{
			return false;
		}

		if (!this.endEvent.equals(event.endEvent))
		{
			return false;
		}

		if (!this.summary.equals(event.summary))
		{
			return false;
		}

		if (!this.location.equals(event.location))
		{
			return false;
		}

		if (!this.description.equals(event.description))
		{
			return false;
		}

		return true;
	}

	/**
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Event event)
	{
		return this.beginEvent.compareTo(event.beginEvent);
	}
}