package com.rssfeedaggregator.entities;

import java.util.List;

import jersey.repackaged.com.google.common.collect.Lists;

public class Feed {

	public String url;
	public String title;
	public String link;
	public String description;
	public String language;
	public String copyright;
	public String pubDate;

	public List<FeedMessage> messages = Lists.newArrayList();

	public Feed() {

	}


}
