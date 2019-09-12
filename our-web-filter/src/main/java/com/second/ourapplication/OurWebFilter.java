package com.second.ourapplication;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/not-Welcome")
public class OurWebFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filter is initialized");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filter is invoked");
		chain.doFilter(request, response);

	}

	public void destroy() {
		System.out.println("Filter is being destroyed");
	}

}