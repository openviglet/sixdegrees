package com.viglet.sixdegrees;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SixPages {

	@GetMapping("/")
	public String homePage(HttpServletRequest request, HttpServletResponse response) {
		return "login";
	}
}
