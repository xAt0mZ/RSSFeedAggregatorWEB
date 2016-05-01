package com.rssfeedaggregator.api;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import com.rssfeedaggregator.entities.User;

public class UserAPI extends GenericAPI {

	public static User login(User user) {
		return client
				.target(baseUrl)
				.path("user/login")
				.request(MediaType.APPLICATION_JSON)
				.post(Entity.entity(user, MediaType.APPLICATION_JSON),
						User.class);
	}

	public static User register(User user) {
		return client
				.target(baseUrl)
				.path("user/register")
				.request(MediaType.APPLICATION_JSON)
				.post(Entity.entity(user, MediaType.APPLICATION_JSON),
						User.class);
	}

	public static User update(User user) {
		return client
				.target(baseUrl)
				.path("user")
				.request(MediaType.APPLICATION_JSON)
				.put(Entity.entity(user, MediaType.APPLICATION_JSON),
						User.class);
	}

}
