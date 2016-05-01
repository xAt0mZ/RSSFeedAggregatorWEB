package com.rssfeedaggregator.api;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.NewCookie;

import com.rssfeedaggregator.entities.User;

public class FeedAPI {

	public static User getFeeds(NewCookie o) {
		return APIHelper.getTarget().path("feeds")
				.request(MediaType.APPLICATION_JSON)
				.cookie(o.getName(), o.getValue()).get(User.class);
	}
}
