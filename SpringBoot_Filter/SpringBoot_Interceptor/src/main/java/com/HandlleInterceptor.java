package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class HandlleInterceptor implements HandlerInterceptor {

	@Override // pre
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("pre handler method of interceptor ");
		return true;
	}

	@Override // post
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("post handler method of interceptor ");
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override // after
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("after completion handler method of interceptor ");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
}
