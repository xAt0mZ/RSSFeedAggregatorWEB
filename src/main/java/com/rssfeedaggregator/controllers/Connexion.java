package com.rssfeedaggregator.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

import com.rssfeedaggregator.api.FeedAPI;
import com.rssfeedaggregator.api.UserAPI;
import com.rssfeedaggregator.entities.User;
import com.rssfeedaggregator.forms.ConnexionForm;

public class Connexion extends HttpServlet {

	private static final String VUE = "/WEB-INF/login.jsp";

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(VUE)
				.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ConnexionForm form = new ConnexionForm();
		User user = form.connecterUtilisateur(request);

		Response res = UserAPI.login(user);

		if (res.getStatus() == 200) {
			user = res.readEntity(User.class);
			request.getSession().setAttribute("apiCookies",
					res.getCookies().get("JSESSIONID"));
		} else
			response.sendRedirect("/WEB-INF/error.jsp");

		if (form.getErreurs().isEmpty()) {
			request.getSession().setAttribute("user", user);
			response.sendRedirect(request.getContextPath() + "/main");
		} else {
			request.getSession().setAttribute("user", null);

			request.setAttribute("form", form);
			request.setAttribute("user", user);

			this.getServletContext().getRequestDispatcher(VUE)
					.forward(request, response);
		}

	}
}
