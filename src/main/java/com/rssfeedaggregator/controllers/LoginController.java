package com.rssfeedaggregator.controllers;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.NewCookie;
//import javax.ws.rs.core.Response;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.rssfeedaggregator.api.FeedAPI;
//import com.rssfeedaggregator.api.UserAPI;
//import com.rssfeedaggregator.entities.User;
//
//@Controller
public class LoginController {

//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public ModelAndView getLoginForm(Model model) {
//		return new ModelAndView("login", "user", new User());
//	}
//
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String loginSubmit(@ModelAttribute("user") User user,
//			BindingResult result, ModelMap model, HttpServletRequest request,
//			HttpServletResponse response, RedirectAttributes rattrs) {
//		if (result.hasErrors()) {
//			return "error";
//		}
//
//		Response res = UserAPI.login(user);
//
//		if (res.getStatus() != 200)
//			return "error";
//		user = res.readEntity(User.class);
//
//		request.getSession().setAttribute("apiCookies",
//				res.getCookies().get("JSESSIONID"));
//
//		user = FeedAPI.getFeeds((NewCookie) request.getSession().getAttribute(
//				"apiCookies"));
//
//		rattrs.addFlashAttribute("user", user);
//
//		return "redirect:/main";
//	}
}
