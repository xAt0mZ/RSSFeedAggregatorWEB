package com.rssfeedaggregator.api;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import com.rssfeedaggregator.entities.User;

public class UserAPI {

	public static Response login(User user) {
		 Response res = APIHelper.getTarget().path("user/login")
		 .request(MediaType.APPLICATION_JSON)
		 .post(Entity.entity(user, MediaType.APPLICATION_JSON));

		 return res;

//		return APIHelper
//				.getTarget()
//				.path("user/login")
//				.request(MediaType.APPLICATION_JSON)
//				.post(Entity.entity(user, MediaType.APPLICATION_JSON),
//						User.class);
	}

	public static User register(User user) {

		return APIHelper
				.getTarget()
				.path("user/register")
				.request(MediaType.APPLICATION_JSON)
				.post(Entity.entity(user, MediaType.APPLICATION_JSON),
						User.class);
	}

	public static User update(User user) {
		return APIHelper
				.getTarget()
				.path("user")
				.request(MediaType.APPLICATION_JSON)
				.put(Entity.entity(user, MediaType.APPLICATION_JSON),
						User.class);
	}

}
