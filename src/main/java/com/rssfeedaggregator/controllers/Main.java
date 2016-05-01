package com.rssfeedaggregator.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.NewCookie;

import com.rssfeedaggregator.api.FeedAPI;
import com.rssfeedaggregator.entities.Feed;
import com.rssfeedaggregator.entities.Folder;
import com.rssfeedaggregator.entities.User;
import com.rssfeedaggregator.forms.ConnexionForm;

public class Main extends HttpServlet {
	public static final String VUE = "/WEB-INF/main.jsp";

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = FeedAPI.getFeeds((NewCookie) request.getSession()
				.getAttribute("apiCookies"));
		request.getSession().setAttribute("user", user);
		String param = request.getParameter("rss");
		if (user != null && !user.folders.isEmpty()) {
			if (param != null && !param.isEmpty()) {
				for (Folder folder : user.folders) {
					if (folder.feeds != null && !folder.feeds.isEmpty())
						for (Feed feed : folder.feeds) {
							if (feed.url.equals(param))
								request.setAttribute("feed", feed);
						}
				}
			} else {
				Folder folder = user.folders.get(0);
				if (!folder.feeds.isEmpty()) {
					Feed feed = folder.feeds.get(0);
					request.setAttribute("feed", feed);
				}
			}
		}
		this.getServletContext().getRequestDispatcher(VUE)
				.forward(request, response);
	}
}
