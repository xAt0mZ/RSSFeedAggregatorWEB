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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public List<FeedMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<FeedMessage> messages) {
		this.messages = messages;
	}
	
	


}
