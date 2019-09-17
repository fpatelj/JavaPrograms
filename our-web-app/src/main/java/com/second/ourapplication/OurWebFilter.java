package com.second.ourapplication;

import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/not-Welcome")
public class OurWebFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("filter is initialized");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("filter is invoked");
		chain.doFilter(request, response);
		
	}

	@Override
	public void destroy() {
		System.out.println("filter is being destroyed");
		
	}

}
