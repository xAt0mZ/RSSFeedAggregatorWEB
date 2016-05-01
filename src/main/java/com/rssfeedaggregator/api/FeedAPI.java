package com.rssfeedaggregator.api;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.rssfeedaggregator.entities.Feed;

public class FeedAPI extends GenericAPI{
	public List<Feed> getFeeds() {
		return (List<Feed>)client
				.target(baseUrl)
				.path("feeds")
				.request(MediaType.APPLICATION_JSON)
				.get().getEntity();
	}
}
