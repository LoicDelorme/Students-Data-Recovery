package com.delormeloic.studentsdatarecovery.calendar.helpers;

import java.time.LocalDate;

/**
 * This class represents an ADE URL generator.
 *
 * @author DELORME Loïc
 * @since 1.0.0
 */
public class AdeUrlGenerator
{
	/**
	 * Generate an URL.
	 * 
	 * @param baseUrl
	 *            The base URL.
	 * @param resources
	 *            The resources.
	 * @param projectId
	 *            The project ID.
	 * @param calendarType
	 *            The calendar type.
	 * @param beginDate
	 *            The begin date.
	 * @param endDate
	 *            The end date.
	 * @return The generated URL.
	 */
	public static String generateUrl(String baseUrl, String[] resources, String projectId, String calendarType, LocalDate beginDate, LocalDate endDate)
	{
		final StringBuilder generatedUrl = new StringBuilder();
		generatedUrl.append(baseUrl);
		generatedUrl.append("resources=");
		generatedUrl.append((resources.length > 1 ? String.join(",", resources) : resources[0]));
		generatedUrl.append("&projectId=");
		generatedUrl.append(projectId);
		generatedUrl.append("&calType=");
		generatedUrl.append(calendarType);
		generatedUrl.append("&firstDate=");
		generatedUrl.append(beginDate.toString());
		generatedUrl.append("&lastDate=");
		generatedUrl.append(endDate.toString());

		return generatedUrl.toString();
	}
}