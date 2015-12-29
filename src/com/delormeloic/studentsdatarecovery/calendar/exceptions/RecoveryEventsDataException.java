package com.delormeloic.studentsdatarecovery.calendar.exceptions;

/**
 * This exception is thrown if it's impossible to recover events data.
 *
 * @author DELORME Loïc
 * @since 1.0.0
 */
public class RecoveryEventsDataException extends Exception
{
	/**
	 * The serial UID.
	 */
	private static final long serialVersionUID = 822851849035487709L;

	/**
	 * Create a recovery events data exception.
	 */
	public RecoveryEventsDataException()
	{
		super();
	}

	/**
	 * Create a recovery events data exception.
	 * 
	 * @param message
	 *            The message to display.
	 */
	public RecoveryEventsDataException(String message)
	{
		super(message);
	}
}