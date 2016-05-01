package com.rssfeedaggregator.entities;

import java.util.List;

import jersey.repackaged.com.google.common.collect.Lists;

public class User {

	public String email;
	public String password;

	public List<Folder> folders = Lists.newArrayList();

	public User() {
	}

}
