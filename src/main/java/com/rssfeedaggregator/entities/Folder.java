package com.rssfeedaggregator.entities;

import java.util.List;

import jersey.repackaged.com.google.common.collect.Lists;

public class Folder {

	public String title;
	public List<Feed> feeds = Lists.newArrayList();

	public Folder() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Feed> getFeeds() {
		return feeds;
	}

	public void setFeeds(List<Feed> feeds) {
		this.feeds = feeds;
	}
}
