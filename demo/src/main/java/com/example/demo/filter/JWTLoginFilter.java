package com.example.demo.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.demo.members.AccountCredentials;
import com.example.demo.security.TokenAuthenticationService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JWTLoginFilter extends AbstractAuthenticationProcessingFilter{

	public JWTLoginFilter(String url,AuthenticationManager manager) {
		super(new AntPathRequestMatcher(url));
		setAuthenticationManager(manager);
	}
	
	@Override
	public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res)
			throws AuthenticationException, IOException, ServletException {
		AccountCredentials accountCredentials = new ObjectMapper().readValue(req.getInputStream(),AccountCredentials.class);
		return getAuthenticationManager().authenticate(new UsernamePasswordAuthenticationToken(accountCredentials.getUsername(), accountCredentials.getPassword()));
	}
	
	@Override
	protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res, FilterChain chain,
			Authentication auth) throws IOException, ServletException {
		TokenAuthenticationService.addAuthentication(res, auth);
	}
}
