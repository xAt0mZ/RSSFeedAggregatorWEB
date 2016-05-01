package com.rssfeedaggregator.entities;

import java.util.List;

import jersey.repackaged.com.google.common.collect.Lists;

public class Folder {

	public String title;
	public List<Feed> feeds = Lists.newArrayList();

	public Folder() {

	}
}
