package com.rssfeedaggregator.entities;

import java.util.List;

import jersey.repackaged.com.google.common.collect.Lists;

public class User {

	public String email;
	public String password;

	public List<Folder> folders = Lists.newArrayList();

	public User() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Folder> getFolders() {
		return folders;
	}

	public void setFolders(List<Folder> folders) {
		this.folders = folders;
	}

}
