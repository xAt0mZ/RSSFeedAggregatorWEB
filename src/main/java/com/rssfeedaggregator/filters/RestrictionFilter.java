package com.rssfeedaggregator.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RestrictionFilter implements Filter {

	public void init(FilterConfig config) throws ServletException {
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;

		HttpSession session = request.getSession();
		String path = request.getRequestURI().substring(
				request.getContextPath().length());
		if (!path.endsWith("/login") && !path.startsWith("/inc")
				&& !path.endsWith("/logout")
				&& session.getAttribute("apiCookies") == null) {
			response.sendRedirect(request.getContextPath() + "/login");
		} else
			chain.doFilter(request, response);
	}

	public void destroy() {
	}
}