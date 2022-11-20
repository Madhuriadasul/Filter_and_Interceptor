package com;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class FilterInitilization implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filter operation");

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

		System.out.println("initilizational method in filter...");
		Filter.super.init(filterConfig);

	}

	@Override
	public void destroy() {
		System.out.println("destroy method in filter...");
		Filter.super.destroy();
	}
}
